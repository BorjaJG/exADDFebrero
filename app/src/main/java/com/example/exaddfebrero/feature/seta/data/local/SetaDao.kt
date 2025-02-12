package com.example.exaddfebrero.feature.seta.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.exaddfebrero.feature.seta.domain.Seta


@Dao
interface SetaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarSeta(seta: SetaEntity)

    @Query("SELECT * FROM setas")
    suspend fun obtenerTodasLasSetas(): List<Seta>

    @Query("SELECT * FROM setas WHERE idSeta = :setaId")
    suspend fun obtenerSetaPorId(setaId: String): Seta?

    @Update
    suspend fun actualizarSeta(seta: SetaEntity)

    @Delete
    suspend fun eliminarSeta(seta: SetaEntity)
}



