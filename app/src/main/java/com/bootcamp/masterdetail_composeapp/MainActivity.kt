package com.bootcamp.masterdetail_composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bootcamp.masterdetail_composeapp.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Establece el contenido de la actividad con el composable AppNavigation.
        setContent {
            AppNavigation()
        }
    }
}


