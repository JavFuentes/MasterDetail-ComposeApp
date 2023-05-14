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
import com.bootcamp.masterdetail_composeapp.data.notes.NoteDao
import com.bootcamp.masterdetail_composeapp.data.notes.NoteDatabase


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
    val context = LocalContext.current
    val androidDeveloperIds = getAndroidDeveloperIds(context = context)

    LazyColumn {
        items(androidDeveloperIds){imageId ->
            Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = imageId),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(8.dp)
                    )
                    Text(text = "Android $imageId", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun getAndroidDeveloperIds(context: Context): List<Int> {
    // Crea una lista mutable que almacenará los IDs de los recursos de imágenes de androides.
    val androidDeveloperIds = mutableListOf<Int>()

    // Usa un bucle para iterar a través de los números de imagen de 1 a 25.
    for (i in 1..25) {

        // Crea el nombre de archivo de imagen a partir del número de imagen.
        val imageName = "android$i"

        // Obtiene el ID del recurso de imagen correspondiente al nombre de archivo de imagen utilizando el contexto.
        val resourceId = context.resources.getIdentifier(imageName, "drawable", context.packageName)

        // Agrega el ID del recurso de imagen a la lista mutable.
        androidDeveloperIds.add(resourceId)
    }
    // Devuelve la lista de IDs de recursos de imágenes de androides.
    return androidDeveloperIds
}

