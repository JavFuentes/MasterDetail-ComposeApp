package com.bootcamp.masterdetail_composeapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.bootcamp.masterdetail_composeapp.navigation.AppScreens

@Composable
fun MasterScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
            BodyContent(navController)

    }
}

@Composable
fun BodyContent(navController: NavController){

}