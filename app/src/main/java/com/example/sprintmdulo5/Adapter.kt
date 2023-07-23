package com.example.sprintmdulo5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.sprintmdulo5.databinding.ItemLayoutBinding

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
    var productos = mutableListOf<Producto>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        var binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = productos[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return productos.size
    }

    fun setData (productosTienda: List<Producto>) {
        this.productos= productosTienda.toMutableList()
    }
    inner class ViewHolder (val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind (item: Producto) {
            binding.nametv.text = item.nombre
            binding.pricetv.text = item.precio.toString()
            binding.photoproductimg.load(item.imgProductoUrl)

        }

    }

}