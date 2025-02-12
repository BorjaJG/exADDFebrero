package com.example.exaddfebrero.feature.seta.domain

interface SetaRepository {

    abstract fun saveSeta(seta: Seta): Seta?

}