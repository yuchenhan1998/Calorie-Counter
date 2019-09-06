 package com.example.caloriecounter

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_total_calories.*
import android.widget.Toast
 const val sign : Int = 15;

 class MainActivity : AppCompatActivity() {
    var total: Int = 0;
    var remain: Int = 0;
    var listView: ListView ?= null;
    var x: ArrayList<String> = ArrayList();
    var y: ArrayList<String> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //add total calories
        setContentView(R.layout.add_total_calories);

        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                var a: String? = null;
                a = editText.text.toString().trim();
                //check input
                if (a.length == 0 || a[0] == '0') {
                    Toast.makeText(this@MainActivity, "Please try again", Toast.LENGTH_LONG).show()
                } else {
                    var a: String = editText.text.toString();
                    remain = Integer.parseInt(a);
                    total = 0;
                    setContentView(R.layout.activity_main);

                    textView1.text = "Calories Remaining: " + a;
                    textView2.text = "Total Calories: " + total.toString();

                    Toast.makeText(this@MainActivity, "There is no added food.", Toast.LENGTH_LONG).show()
                    //set button listener for the add-food
                    addfood.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(v: View?) {
                            val intent = Intent(this@MainActivity, add::class.java);

                            startActivityForResult(intent, sign);
                        }
                    })
                    //set button listener for the shortcuts
                    reference.setOnClickListener(object : View.OnClickListener{
                        override fun onClick(v: View?) {
                            val intent = Intent(this@MainActivity, Creative::class.java);
                            startActivityForResult(intent, sign);
                        }
                })
            }
        }
    })
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
         super.onActivityResult(requestCode, resultCode, data)
         if (requestCode == sign)
         {
             if (resultCode == Activity.RESULT_OK)
             {
                 if(data!=null){
                    //process date coming from addfood activity
                     val addedName = data.getStringExtra("foodName")
                     val submitCal = Integer.parseInt(data.getStringExtra("foodCal"))

                     x.add(addedName) ;
                     y.add(data.getStringExtra("foodCal"));

                     total += submitCal
                     remain -= submitCal

                     textView1.text = "Calories Remaining: " + remain.toString()
                     textView2.text ="Total Calories: " + total.toString()

                     val name = ArrayList(x)
                     val number = ArrayList(y)

                     var display = arrayOfNulls<String>(name.size)

                     for(i in 0..name.size-1){
                         display[i] = "" + name.get(i) + " : " + number.get(i) + ""
                     }

                     val adapter = ArrayAdapter(this, R.layout.list, display)
                     val express : ListView = findViewById(R.id.foodsConsumedList)
                     express.setAdapter(adapter)

                     if(remain < 0){
                         textView1.setTextColor(Color.RED)
                     }

                     addfood.setOnClickListener(object: View.OnClickListener {
                         override fun onClick(view: View){
                             val intent : Intent = Intent(this@MainActivity, add::class.java)
                             startActivityForResult(intent,sign)
                         }
                     })
                 }

             }
         }
    }

     fun web(v: View)
     {
         val intent :Intent = Intent (Intent.ACTION_VIEW, Uri.parse("http://wustl.edu"));
         startActivity(intent);
     }

     fun phone(v: View)
     {
         val intent :Intent = Intent (Intent.ACTION_VIEW, Uri.parse("tel:3142035696"));
         startActivity(intent);
     }


 }
