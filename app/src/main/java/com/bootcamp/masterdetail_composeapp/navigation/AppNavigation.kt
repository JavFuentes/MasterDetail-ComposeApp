package com.bootcamp.masterdetail_composeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bootcamp.masterdetail_composeapp.screens.DetailScreen
import com.bootcamp.masterdetail_composeapp.screens.MasterScreen
import com.bootcamp.masterdetail_composeapp.screens.SplashScreen


@Composable
fun AppNavigation() {

    // Creamos el NavController con el cual se realizará la navegación entre las pantallas.
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route) {

        // Definimos la pantalla inicial de nuestra app.
        composable(route = AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }

        // Definimos la pantalla master de nuestra app.
        composable(route = AppScreens.MasterScreen.route) {
            MasterScreen(navController)
        }

        // Definimos la pantalla de detalle de nuestra app.
        composable(route = AppScreens.DetailScreen.route) {
            DetailScreen(navController)
        }
    }
}

