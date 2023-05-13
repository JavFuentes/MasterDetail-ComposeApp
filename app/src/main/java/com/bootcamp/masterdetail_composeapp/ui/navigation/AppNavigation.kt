package com.bootcamp.masterdetail_composeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bootcamp.masterdetail_composeapp.ui.screens.DetailScreen
import com.bootcamp.masterdetail_composeapp.ui.screens.MasterScreen
import com.bootcamp.masterdetail_composeapp.ui.screens.SplashScreen
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {

    // Creamos el NavController con el cual se realizará la navegación entre las pantallas.
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route) {

        // Definimos la pantalla inicial de nuestra app.
        composable(route = AppScreens.SplashScreen.route) {
            AppScreens.SplashScreen(navController)
        }

        // Definimos la pantalla principal de nuestra app.
        composable(route = AppScreens.MasterScreen.route) {
            AppScreens.MasterScreen(navController)
        }

        // Definimos la pantalla de detalle de nuestra app.
        composable(route = AppScreens.DetailScreen.route) {
            AppScreens.DetailScreen(navController)
        }
    }
}

