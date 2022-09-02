package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.helloworld.database.Diary
import com.example.helloworld.database.DiaryDb
import com.example.helloworld.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_DIARY_ID = "diaryId"
    }

    private val viewModel: DetailViewModel by lazy {
        val db = DiaryDb.getInstance(this)
        val factory = DetailViewModelFactory(db.dao)
        ViewModelProvider(this, factory)[DetailViewModel::class.java]
    }

    private lateinit var binding: ActivityDetailBinding
    private var selectedDiary: Diary? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra(KEY_DIARY_ID)) {
            supportActionBar?.title = getString(R.string.ubah_diary)
            val diaryId = intent.getIntExtra(KEY_DIARY_ID, 0)
            viewModel.getDiary(diaryId).observe(this) {
                selectedDiary = it
                if (it != null) updateUI(it)
            }
        }
        else {
            supportActionBar?.title = getString(R.string.tambah_activity)
        }
    }

    private fun updateUI(diary: Diary) {
        binding.judulEditText.setText(diary.judul)
        binding.diaryEditText.setText(diary.judul)
        invalidateMenu()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        if (selectedDiary == null) {
            val item = menu.findItem(R.id.menuHapus)
            item.isVisible = selectedDiary != null
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menuSimpan) {
            simpanDiary()
            return true
        }
        else if (item.itemId == R.id.menuHapus) {
            selectedDiary?.let { viewModel.deleteDiary(it) }
            finish()
            return true
        }
        return false
    }

    private fun hapusDiary() {
        val builder =  AlertDialog.Builder(this)
            .setMessage("Hapus diary?")
            .setPositiveButton("Hapus") { _, _ ->
                selectedDiary?.let { viewModel.deleteDiary(it) }
                finish()
            }
            .setNegativeButton("batal") { dialog, _ ->
                dialog.dismiss()
            }
        builder.create().show()
    }

    private fun simpanDiary() {
        val judul = binding.judulEditText.text.toString()
        if (TextUtils.isEmpty(judul)) {
            Toast.makeText(this, getString(R.string.judul_harus_diisi), Toast.LENGTH_LONG).show()
            return
        }

        val diary = binding.diaryEditText.text.toString()
        if (TextUtils.isEmpty(diary)) {
            Toast.makeText(this, getString(R.string.diary_harus_diisi), Toast.LENGTH_LONG).show()
            return
        }

        if (selectedDiary == null) {
            val data = Diary(judul = judul, diary = diary)
            viewModel.insertDiary(data)
        }else{
            selectedDiary?.let {
                it.judul = judul
                it.diary = diary
                viewModel.updateDiary(it)
            }
        }
        finish()

    }
}