package com.example.exaddfebrero.feature.seta.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "setas")
data class SetaEntity(
    @PrimaryKey val idSeta: String,
    val name: String,
    val familia: String,
    val descripcion: String,
    val foto: String,
    val latitud: Double,
    val longitud: Double,
    val encontrada: Boolean
)


