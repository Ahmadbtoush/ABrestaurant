package com.example.ahmadbtoushassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.*

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.buttonB)
        val resultTV: TextView = findViewById(R.id.resultR)
        var flag: String = "Zinger Sandwich"
        val spinnerVal: Spinner = findViewById(R.id.spinnerS)
        var options = arrayOf("Zinger Sandwich", "Shawerma Sandwich")

        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        button.setOnClickListener() {

            if (flag == "Zinger Sandwich")
                resultTV.text = println("your order is $7 ").toString()
            else
                resultTV.text = println("your order is $8").toString()

        }
    }

}









