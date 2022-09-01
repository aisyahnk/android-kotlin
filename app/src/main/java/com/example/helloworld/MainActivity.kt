package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<hewan>().apply {
            add(hewan("ayam", R.drawable.ayam))
            add(hewan("bebek", R.drawable.bebek))
            add(hewan("domba", R.drawable.domba))
            add(hewan("kambing", R.drawable.kambing))
            add(hewan("sapi", R.drawable.sapi))
        }
    }
}