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
        ciudades.add(Ciudad("Madrid", "https://media.gettyimages.com/id/170131240/es/foto/skyline-of-madrid-with-metropolis-building-and-gra.jpg?s=612x612&w=gi&k=20&c=frPS4I4fdMJIPpb8XAOZPslXfDYsUXitdTPKI3WuRy8=", 40.416775, -3.703790))
        ciudades.add(Ciudad("Barcelona", "https://media.traveler.es/photos/63838947050e0f92cd80c982/16:9/w_2560%2Cc_limit/GettyImages-1392907424.jpg", 41.390205, 2.154007))
        ciudades.add(Ciudad("Valencia", "https://www.floresyplantas.net/wp-content/uploads/ciudad-de-valencia-y-su-rio-turia.jpg", 39.469907, -0.376288))
        ciudades.add(Ciudad("Sevilla", "https://urbansevilla.es/wp-content/uploads/2019/06/la-giralda-sevilla-airpano-1024x571.jpg", 37.389092, -5.984459))
        ciudades.add(Ciudad("Málaga", "https://depositphotos.com/es/photo/malaga-spain-cityscape-at-56137303.html", 36.721273, -4.421398))
        ciudades.add(Ciudad("Bilbao", "https://turismo.euskadi.eus/contenidos/d_destinos_turisticos/0000004981_d2_rec_turismo/es_4981/images/CT_cabecerabilbaoguggen.jpg", 43.263012, -2.935014))
        ciudades.add(Ciudad("Granada", "https://www.spain.info/export/sites/segtur/.content/images/galerias/alhambra/alhambra-granada-12569503-istock.jpg", 37.177336, -3.598557))
        ciudades.add(Ciudad("Córdoba", "https://phantom-elmundo.unidadeditorial.es/1b827ed7f8bcec82e6c46c60f5bd51dc/resize/746/f/webp/assets/multimedia/imagenes/2021/06/04/16228000019116.jpg", 37.888175, -4.779383))
        ciudades.add(Ciudad("Zaragoza", "https://a.cdn-hotels.com/gdcs/production124/d757/6a18cb71-ee85-4511-b55b-54c9482c57e7.jpg?impolicy=fcrop&w=1600&h=1066&q=medium", 41.648822, -0.889085))
        ciudades.add(Ciudad("Toledo", "https://www.guiarepsol.com/content/dam/repsol-guia/contenidos-imagenes/viajar/vamos-de-excursion/que-ver-toledo/gr-cms-media-featured_images-none-1c489cc1-bf59-4b9d-acec-875c41f2c4fb-01-puente-de-alcantara-vista-general.jpg.transform/rp-rendition-lg/image.jpg", 39.862832, -4.027323))
        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 2)
            recyclerView.adapter = CiudadAdapter(ciudades)
        }
    }
}

