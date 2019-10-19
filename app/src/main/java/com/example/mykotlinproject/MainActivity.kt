package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nimEt = findViewById<EditText>(R.id.nimEt)
        val namaEt = findViewById<EditText>(R.id.namaEt)
        val nilaiEt = findViewById<EditText>(R.id.nilaiEt)

        val prosesBtn= findViewById<Button>(R.id.prosesBtn)

        prosesBtn.setOnClickListener{

            val nim = nimEt.text.toString()
            val nama = namaEt.text.toString()
            val nilai : Int = Integer.parseInt(nilaiEt.text.toString())

            val intent = Intent( this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("nim", nim)
            intent.putExtra("nama", nama)
            intent.putExtra("nilai", nilai)

            startActivity(intent)

        }
    }
}
