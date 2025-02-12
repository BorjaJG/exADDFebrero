package com.example.exaddfebrero

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exaddfebrero.core.data.SharedPreferencesManager
import com.example.exaddfebrero.core.domain.Coleccion
import com.example.exaddfebrero.feature.album.domain.Album
import com.example.exaddfebrero.feature.seta.domain.Seta

class MainActivity : AppCompatActivity() {
    private lateinit var prefs: SharedPreferencesManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        prefs = SharedPreferencesManager(this)
        val coleccion = Coleccion(
            listOf(
                Album(
                    "1", "Álbum 1",
                    listOf( // Lista de Setas
                        Seta(
                            "1", "Boletus", "Boletaceae", "Seta comestible",
                            "foto_url", "43.0", "4.0", true, "Amanitaceae",
                            "Amanitaceae"
                        ),
                        Seta(
                            "2", "Amanita", "Amanitaceae", "Seta venenosa",
                            "foto_url", "44.0", "5.0", true, "Amanitaceae",
                            "Amanitaceae"
                        )
                    )
                ),
                Album(
                    "2", "Álbum 2",
                    listOf( // Otra lista de Setas
                        Seta(
                            "3", "Russula", "", "",
                            "foto_url", "", "", false, "Amanitaceae",
                            "Amanitaceae"
                        )
                    )
                )
            )
        )

        prefs.saveColecion(coleccion)


        val savedCollection = prefs.getColecion()
        if (savedCollection != null) {
            for (album in savedCollection.listAlbum) {
                Log.d("MainActivity", "Álbum: ${album.name}")
                for (seta in album.listaSetas) {
                    Log.d("MainActivity", "Seta: ${seta.name}, Familia: ${seta.idSeta}")
                }
            }
        } else {
            Log.d("MainActivity", "No se encontró ninguna colección guardada.")
        }
    }


    }






