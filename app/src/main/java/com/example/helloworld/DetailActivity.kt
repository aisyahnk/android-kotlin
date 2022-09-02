package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import com.example.helloworld.database.Diary
import com.example.helloworld.database.DiaryDb
import com.example.helloworld.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val viewModel: DetailViewModel by lazy {
        val db = DiaryDb.getInstance(this)
        val factory = DetailViewModelFactory(db.dao)
        ViewModelProvider(this, factory)[DetailViewModel::class.java]
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menuSimpan) {
            insertDiary()
            return true
        }
        return false
    }

    private fun insertDiary() {
        val judul = binding.judulEditText.text.toString()
        val diary = binding.diaryEditText.text.toString()
        val data = Diary (judul = judul, diary = diary)
        viewModel.insertDiary(data)
        finish()
    }
}