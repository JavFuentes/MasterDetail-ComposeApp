package com.bootcamp.masterdetail_composeapp.ui.navigation

// Clase sellada (sealed class) que define todas las pantallas de la app.
// Cada objeto (object) representa una pantalla y tiene una propiedad "route" que indica su ruta.
sealed class AppScreens(val route: String){
    object SplashScreen:AppScreens("splash_screen")
    object MasterScreen:AppScreens("master_screen")
    object DetailScreen:AppScreens("detail_screen")
}
