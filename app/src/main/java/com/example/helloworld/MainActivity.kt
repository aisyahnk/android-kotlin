package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Jumlah Data: ${getData().size}")
    }
    private fun getData(): List<hewan> {
        return listOf(
            hewan("angsa","Cygnus olor", R.drawable.angsa),
            hewan("ayam","Gallus gallus", R.drawable.ayam),
            hewan("bebek", "Cairina moschata",R.drawable.bebek),
            hewan("domba","Ovis ammon", R.drawable.domba),
            hewan("kalkun","Meleagris gallopavo", R.drawable.kalkun),
            hewan("kambing", "Capricornis sumatrensis",R.drawable.kambing),
            hewan("kelinci","Oryctolagus cuniculus", R.drawable.kelinci),
            hewan("kerbau","Bubalus bubalis", R.drawable.kerbau),
            hewan("kuda","Equus caballus", R.drawable.kuda),
            hewan("sapi", "Bos taurus",R.drawable.sapi),
        )
    }
}