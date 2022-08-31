package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private var index = 0

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

        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        showData(data[0])

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            index++
            index = (index + 1) % data.size 
            showData(data[index])
        }
    }

    private fun showData(hewan: hewan) {
        imageView.setImageResource(hewan.gambarResId)
        textView.text = hewan.nama
    }
}