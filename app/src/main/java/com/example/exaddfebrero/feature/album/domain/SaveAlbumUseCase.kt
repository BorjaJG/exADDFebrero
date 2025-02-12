package com.example.exaddfebrero.feature.album.domain


class SaveAlbumUseCase(private val albumRepository: AlbumRepository) {

    fun execute(album: Album): Album? {
        return albumRepository.saveAlbum(album)
    }

}