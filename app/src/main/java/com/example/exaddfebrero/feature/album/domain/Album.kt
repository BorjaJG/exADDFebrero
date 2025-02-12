package com.example.exaddfebrero.feature.album.domain

import com.example.exaddfebrero.feature.seta.domain.Seta

class Album(
    val name: String,
    val idAlbum: String,
    val listaSetas: List<Seta>
)