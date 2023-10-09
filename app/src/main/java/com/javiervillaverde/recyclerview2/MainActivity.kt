package com.javiervillaverde.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.javiervillaverde.recyclerview2.databinding.ActivityMainBinding
import model.Ciudad

class MainActivity : AppCompatActivity() {
    private val ciudades = ArrayList<Ciudad>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Agrega ciudades a la lista
        ciudades.add(Ciudad("Madrid", "https://www.spain.info/.content/imagenes/cabeceras-grandes/madrid/calle-gran-via-madrid-s333961043.jpg"))
        ciudades.add(Ciudad("Barcelona", "https://media.traveler.es/photos/63838947050e0f92cd80c982/16:9/w_2560%2Cc_limit/GettyImages-1392907424.jpg"))
        ciudades.add(Ciudad("Valencia", "https://www.floresyplantas.net/wp-content/uploads/ciudad-de-valencia-y-su-rio-turia.jpg"))

        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 2)
            recyclerView.adapter = CiudadAdapter(ciudades)
        }
    }
}

