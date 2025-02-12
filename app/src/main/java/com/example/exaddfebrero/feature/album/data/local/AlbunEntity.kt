package com.example.exaddfebrero.feature.album.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.exaddfebrero.feature.seta.domain.Seta


@Entity(tableName = "album")
data class AlbunEntity(
    @PrimaryKey val idAlbum: String,
    val name: String,
    val listaSetas: List<Seta>
)


