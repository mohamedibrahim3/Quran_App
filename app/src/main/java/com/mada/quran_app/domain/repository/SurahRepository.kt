package com.mada.quran_app.domain.repository

import com.mada.quran_app.data.model.SurahEntity

interface SurahRepository {
    fun getSurahs(): List<SurahEntity>
}