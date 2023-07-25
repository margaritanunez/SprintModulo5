package com.example.sprintmdulo5

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sprintmdulo5.databinding.FragmentCarritoBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"
private const val ARG_PARAM4 = "param4"

/**
 * A simple [Fragment] subclass.
 * Use the [CarritoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CarritoFragment : Fragment() {
    private lateinit var preference: SharedPreferences
    private lateinit var binding: FragmentCarritoBinding
    private var gson = Gson()

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: Int? = null
    private var param3: String? = null
    private var param4: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("Nombre producto")
            param2 = it.getInt("Precio producto")
            Log.d("precio", param1!!)
            param3 = it.getString("descripción producto")
            param4 = it.getString("url imagen")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCarritoBinding.inflate(layoutInflater, container, false)
        preference =
            this.requireActivity().getSharedPreferences("dominar el mundo", Context.MODE_PRIVATE)
        val type: Type = object : TypeToken<MutableList<ProductoTienda?>?>() {}.type
        var datosPreference = preference.getString("lista carrito", null)
        var lista: MutableList<ProductoTienda> = gson.fromJson(datosPreference, type)
        lista.add(ProductoTienda(param1!!, param2!!, param3!!, param4!!))
        val adapterCarro = AdapterCarro()
        adapterCarro.setData(lista)
        binding.rvcarrito.adapter = adapterCarro

        var listaGson = gson.toJson(lista)

        preference.edit().clear().apply()
        preference.edit().putString("lista carrito", listaGson).apply()
        return binding.root
    }
}