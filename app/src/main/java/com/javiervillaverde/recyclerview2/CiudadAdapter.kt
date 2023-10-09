package com.javiervillaverde.recyclerview2

import com.javiervillaverde.recyclerview2.databinding.ViewCiudadBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import model.Ciudad

class CiudadAdapter(private val ciudades: List<Ciudad>) : RecyclerView.Adapter<CiudadAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ViewCiudadBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(ciudad: Ciudad) {
            with(binding) {

                nombreCiudad.text = ciudad.nombre
                Glide.with(itemView.context).load(ciudad.urlDeLaImagen).into(imagenCiudad)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewCiudadBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ciudades.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ciudades[position])
    }
}

