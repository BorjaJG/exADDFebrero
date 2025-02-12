package com.example.exaddfebrero.feature.seta.data.local

import com.example.exaddfebrero.feature.seta.domain.Seta
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SetaLocalRepository(private val setaDao: SetaDao) {

    // Insertar una nueva seta en la base de datos
    suspend fun insertarSeta(seta: SetaEntity) {
        withContext(Dispatchers.IO) {
            setaDao.insertarSeta(seta)
        }
    }

    // Obtener todas las setas almacenadas
    suspend fun obtenerTodasLasSetas(): List<Seta> {
        return withContext(Dispatchers.IO) {
            setaDao.obtenerTodasLasSetas()
        }
    }

    // Obtener una seta por su ID
    suspend fun obtenerSetaPorId(setaId: Int): Seta? {
        return withContext(Dispatchers.IO) {
            setaDao.obtenerSetaPorId(setaId.toString())
        }
    }

    // Actualizar una seta existente
    suspend fun actualizarSeta(seta: SetaEntity) {
        withContext(Dispatchers.IO) {
            setaDao.actualizarSeta(seta)
        }
    }

    // Eliminar una seta de la base de datos
    suspend fun eliminarSeta(seta: SetaEntity) {
        withContext(Dispatchers.IO) {
            setaDao.eliminarSeta(seta)
        }
    }
}