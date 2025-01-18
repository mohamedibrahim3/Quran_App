package com.mada.quran_app.domain.useCase

import com.mada.quran_app.data.model.SurahEntity
import com.mada.quran_app.domain.repository.SurahRepository
import javax.inject.Inject

class GetSurahsUseCase @Inject constructor(
    private val repository: SurahRepository
) {
    operator fun invoke(): List<SurahEntity> {
        return repository.getSurahs()
    }
}