package com.bootcamp.masterdetail_composeapp.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


// Definición de la clase de datos para los desarrolladores.
data class Developer(val name: String, val avatarId: Int)

// Función para generar la lista de desarrolladores.
fun getAndroidDeveloperIds(context: Context): List<Developer> {
    // Crear una lista mutable para almacenar los desarrolladores.
    val androidDevelopers = mutableListOf<Developer>()

    // Crear una lista de nombres de desarrolladores.
    val developerNames = listOf(
        "Stiven Fonseca", "Sergio Alvarado", "Luis Zenteno", "Lautaro Alarcón",
        "Jose Mora", "David Toro", "Consuelo Magaña", "Beatriz Urzua",
        "Bárbara Carvajal", "Agustin Romero", "Javier Fuentes", "Leonardo Rojas",
        "Javiera Mutis", "Moises Segura"
    )

    // Iterar sobre los nombres de los desarrolladores.
    for (i in 1..developerNames.size) {
        // Crear el nombre de la imagen.
        val imageName = "android$i"

        // Obtener el ID del recurso para la imagen.
        val resourceId = context.resources.getIdentifier(imageName, "drawable", context.packageName)

        // Crear el objeto Developer y añadirlo a la lista.
        androidDevelopers.add(Developer(developerNames[i - 1], resourceId))
    }

    // Devolver la lista de desarrolladores.
    return androidDevelopers
}

@Composable
fun MasterScreen(navController: NavController) {
    // Crear una caja que ocupa todo el espacio disponible.
    Box(modifier = Modifier.fillMaxSize()) {
        // Llamar al contenido principal de la pantalla.
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController) {
    // Obtener el contexto actual.
    val context = LocalContext.current

    // Obtener la lista de desarrolladores.
    val androidDevelopers = getAndroidDeveloperIds(context = context)

    // Crear una columna perezosa.
    LazyColumn {
        // Crear un elemento para cada desarrollador.
        items(androidDevelopers) { developer ->
            // Crear una tarjeta para cada desarrollador.
            Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                // Crear una fila para cada tarjeta.
                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Mostrar la imagen del avatar del desarrollador.
                    Image(
                        painter = painterResource(id = developer.avatarId),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(8.dp)
                    )
                    // Mostrar el nombre del desarrollador.
                    Text(text = developer.name, modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}
