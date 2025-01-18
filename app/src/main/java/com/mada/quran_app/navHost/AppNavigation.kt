package com.mada.quran_app.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mada.quran_app.MainActivity
import com.mada.quran_app.ui.quran.QuranScreen
import com.mada.quran_app.ui.splash.SplashScreen



@Composable
fun AppNavigation(){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen {
                navController.navigate("main"){
                    popUpTo("splash") { inclusive = true }
                }
            }
        }
        composable("main") {
            QuranScreen { surahNumber ->
                navController.navigate("ayah_count/$surahNumber")
            }
        }
        
    }
}