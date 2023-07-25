package com.example.sprintmdulo5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sprintmdulo5.databinding.ItemLayoutBinding

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
    var productos = mutableListOf<ProductoTienda>()


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

    fun setData(productoTienda:  List<ProductoTienda>) {
        this.productos = productoTienda.toMutableList()

    }

    inner class ViewHolder (val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind (item: ProductoTienda) {
            binding.nametv.text = item.nombre
            binding.pricetv.text = item.precio.toString()
            Glide.with(binding.root).load(item.imgProductoUrl).into(binding.photoproductimg)

            binding.cvitem.setOnClickListener{
                val bundle = Bundle().apply {
                    putString("Nombre producto", item.nombre)
                    putInt("Precio producto", item.precio)
                    putString("descripción producto", item.descripcion)
                    putString("url imagen",item.imgProductoUrl)
                }
                Navigation.findNavController(binding.root).navigate(R.id.action_principalFragment_to_detalleFragment, bundle)
            }

        }

    }

}

