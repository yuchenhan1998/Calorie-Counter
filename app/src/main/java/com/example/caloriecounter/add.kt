package com.example.caloriecounter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.add_food.*
import java.sql.ResultSet

class add : AppCompatActivity() {
    var x : String = "";
    var y: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add)
        setSupportActionBar(toolbar)

        addFood.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View){
                var p = itemCalories.text.toString().trim()
                //Process Error
                if(itemName.text.toString().trim().length == 0 || p.length ==0
                    || p[0] == '0'){
                    Toast.makeText(this@add, "Please Try Again!", Toast.LENGTH_LONG).show()
                }
                else{
                    //store vlaues and navigate back to home screen
                    val itemName: String = itemName.text.toString()
                    val itemCal: String = itemCalories.text.toString()
                    val intent : Intent = Intent()
                    intent.putExtra("foodName", itemName)
                    intent.putExtra("foodCal", itemCal)
                    setResult(Activity.RESULT_OK, intent);
                    finish();
                }
            }
        })

    }

}
