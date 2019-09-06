package com.example.caloriecounter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_creative.*
import kotlinx.android.synthetic.main.add_food.*
import kotlinx.android.synthetic.main.creative.*

class Creative : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creative)
        setSupportActionBar(toolbar)

        apple.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View){

                    //store vlaues and navigate back to home screen
                    val itemName: String = "Apple"
                    val sum :Int = 95
                    val itemCal: String =sum.toString()
                    val intent : Intent = Intent()
                    intent.putExtra("foodName", itemName)
                    intent.putExtra("foodCal", itemCal)
                    setResult(Activity.RESULT_OK, intent);
                    finish();
            }
        })

        banana.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View){

                //store vlaues and navigate back to home screen
                val itemName: String = "Banana"
                val sum :Int = 105
                val itemCal: String =sum.toString()
                val intent : Intent = Intent()
                intent.putExtra("foodName", itemName)
                intent.putExtra("foodCal", itemCal)
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        })

        pear.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View){

                //store vlaues and navigate back to home screen
                val itemName: String = "Pear"
                val sum :Int = 102
                val itemCal: String =sum.toString()
                val intent : Intent = Intent()
                intent.putExtra("foodName", itemName)
                intent.putExtra("foodCal", itemCal)
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        })

        orange.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View){

                //store vlaues and navigate back to home screen
                val itemName: String = "Orange"
                val sum :Int = 62
                val itemCal: String =sum.toString()
                val intent : Intent = Intent()
                intent.putExtra("foodName", itemName)
                intent.putExtra("foodCal", itemCal)
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        })

        mocha.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View){

                //store vlaues and navigate back to home screen
                val itemName: String = "Mocha"
                val sum :Int = 187
                val itemCal: String =sum.toString()
                val intent : Intent = Intent()
                intent.putExtra("foodName", itemName)
                intent.putExtra("foodCal", itemCal)
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        })

    }

}
