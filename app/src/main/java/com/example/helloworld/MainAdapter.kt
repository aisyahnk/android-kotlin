package com.example.helloworld

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.databinding.ListItemBinding

class MainAdapter(private val data: List<hewan>) : RecyclerView.Adapter<MainAdapter.ViewHolder>(){

    class ViewHolder(private val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(Hewan: hewan) = with(binding){
            imageView.setImageResource(Hewan.gambarResId)
            textView.text = Hewan.nama
            textView2.text = Hewan.namaLatin

            root.setOnClickListener {
                val message = root.context.getString(R.string.x_diklik, Hewan.nama)
                Toast.makeText(root.context, message, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size
}