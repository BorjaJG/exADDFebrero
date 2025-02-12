package com.example.exaddfebrero.feature.album.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.exaddfebrero.feature.album.domain.Album


@Dao
interface AlbumEntity {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarAlbun(album: Album)

    @Query("SELECT * FROM setas")
    suspend fun obtenerTodasLasAlbum(): List<Album>

    @Query("SELECT * FROM setas WHERE idSeta = :idAlbum")
    suspend fun obtenerAlbumPorId(idAlbum: String): Album?

    @Update
    suspend fun actualizarAlbum(album: Album)

    @Delete
    suspend fun eliminarAlbum(album: Album)

}