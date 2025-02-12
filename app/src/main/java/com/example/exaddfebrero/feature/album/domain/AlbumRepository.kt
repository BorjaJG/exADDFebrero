package com.example.exaddfebrero.feature.album.domain

interface AlbumRepository {
    abstract fun saveAlbum(album: Album): Album?
}