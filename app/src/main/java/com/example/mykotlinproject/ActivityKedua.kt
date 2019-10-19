package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        var intent = intent
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val nilai = intent.getIntExtra("nilai", 100)
        val ket :String
        if (nilai >=80){
            ket="A"
        }
        else if (nilai >=60){
            ket="B"
        }
        else if (nilai >=40){
            ket="C"
        }
        else if (nilai >=20){
            ket="D"
        }
        else {
            ket="E"
        }


        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "NIM : "+nim+"\nNama : "+nama+"\nNilai : "+nilai+"\nKeterangan : "+ket
    }
}
