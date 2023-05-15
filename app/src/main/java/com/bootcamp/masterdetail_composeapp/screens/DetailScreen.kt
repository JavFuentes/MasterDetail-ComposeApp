package com.bootcamp.masterdetail_composeapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, developer: String?) {
    DetailContent(navController, developer)
}

@Composable
fun DetailContent(navController: NavController, developer: String?){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (developer != null) {
            Text(
                text = developer,
                style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
            )
        }
    }
}
