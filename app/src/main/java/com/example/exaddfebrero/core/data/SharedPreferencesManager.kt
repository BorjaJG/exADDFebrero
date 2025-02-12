package com.example.exaddfebrero.core.data

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.example.exaddfebrero.core.domain.Coleccion

import com.google.gson.Gson


@Suppress("UNREACHABLE_CODE")
class SharedPreferencesManager(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("mi_prefs", Context.MODE_PRIVATE)
    private val gson = Gson()

    fun saveColecion(colecion: Coleccion) {
        val json = gson.toJson(colecion)
        sharedPreferences.edit().putString("Colecion_key", json).apply()
        Log.d("SharedPreferences", "Colección guardada: $json")
    }

    fun getColecion(): Coleccion? {
        val json = sharedPreferences.getString("Colecion_key", null)
        return json?.let { gson.fromJson(it, Coleccion::class.java) }
        Log.d("SharedPreferences", "Colección recuperada: $json")
    }

    fun clearColecion() {
        sharedPreferences.edit().remove("Colecion_key").apply()
    }
}





