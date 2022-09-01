package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = MainAdapter(getData())
        binding.recyclerView.setHasFixedSize(true)
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