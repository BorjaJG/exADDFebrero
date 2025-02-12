package com.example.exaddfebrero.feature.seta.domain

class SaveSetaUseCase(private val setaRepository: SetaRepository) {

    fun execute(seta: Seta): Seta? {
        return setaRepository.saveSeta(seta)
    }
}

