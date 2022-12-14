package com.example.contextprojesi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //toast ,alert
    //applicationContext ->app context
    //this,this@MainACtivity
        Toast.makeText(this,"nabıyon bea",Toast.LENGTH_LONG).show()
       // Toast.makeText(applicationContext,"nabıyon bea",Toast.LENGTH_LONG).show()
    }
    fun mesajGoster(view: View){
       val uyariMesaji=AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("sifre hataları")
        uyariMesaji.setMessage("sifreyi dogru gir!bastan denemek ister misiniz?")
        //Lambda Gösterimi
        uyariMesaji.setPositiveButton("evet",DialogInterface.OnClickListener{dialogInterface, i ->
            Toast.makeText(this,"bastan deniyorsunuz",Toast.LENGTH_LONG).show()
        })
        uyariMesaji.setNegativeButton("Hayir"){dialogInterface,i ->
            Toast.makeText(this,"hayiri sectin deneyemen",Toast.LENGTH_LONG).show()
        }
        uyariMesaji.show()
    }
}