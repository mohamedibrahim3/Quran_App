package com.mada.quran_app.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mada.quran_app.R
import com.mada.quran_app.mvvm.SplashViewModel
import org.koin.viewmodel.getViewModelKey

@Composable
fun SplashScreen(
    viewModel: SplashViewModel = hiltViewModel(),
    onTimeout: () -> Unit
  ){
    LaunchedEffect(Unit) {
        viewModel.navigateAfterDelay(2000L){onTimeout()}
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.quran),
                contentDescription = "Splash Logo",
                modifier = Modifier.size(150.dp)
            )
    }
}