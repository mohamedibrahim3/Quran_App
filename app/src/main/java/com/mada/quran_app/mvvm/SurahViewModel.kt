package com.mada.quran_app.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mada.quran_app.data.model.SurahEntity
import com.mada.quran_app.domain.useCase.GetSurahsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SurahViewModel @Inject constructor(
    private val getSurahsUseCase: GetSurahsUseCase
): ViewModel() {
    private val _surahs = MutableStateFlow<List<SurahEntity>>(emptyList())
    val surahs: StateFlow<List<SurahEntity>> = _surahs

    init {
        fetchSurahs()
    }
    private fun fetchSurahs() {
        viewModelScope.launch {
            _surahs.value = getSurahsUseCase()
        }
    }
}