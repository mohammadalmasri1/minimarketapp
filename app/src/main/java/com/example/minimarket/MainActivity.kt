package com.example.minimarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag="";
        val spVal : Spinner = findViewById(R.id.spin);
        val bt: Button = findViewById(R.id.bt);
        var tv :TextView = findViewById(R.id.price);

        var options = arrayOf("Snacks type","Candy","Chips","Choclate", "Juice","Cupcake");


        spVal.adapter =
            ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options);
        spVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2);
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }



        }
        bt.setOnClickListener{
            val x: Int =1;
            val y: Int =5;
            val z: Int =3;
            val d: Int =6;
            val k: Int =2;

            if(flag=="Candy"){
                tv.text= x.toString();

            }else if(flag=="Chips"){
                tv.text= y.toString();


            }else if(flag=="Choclate"){
                tv.text= z.toString();

            }else if (flag=="Juice"){
                tv.text= d.toString();

            }else if(flag=="Cupcake"){
                tv.text= k.toString();

            }else if (flag=="Snacks type"){
                tv.text ="please select" ;
            }
        }
    }
}
