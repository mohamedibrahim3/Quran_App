package com.mada.quran_app.mvvm

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject


@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    suspend fun navigateAfterDelay(delayMillis: Long, onTimeout: () -> Unit){
        delay(delayMillis)
        onTimeout()
    }
}