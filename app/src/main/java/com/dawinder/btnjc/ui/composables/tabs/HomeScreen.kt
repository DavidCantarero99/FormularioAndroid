package com.dawinder.btnjc.ui.composables.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dawinder.btnjc.R
import com.dawinder.btnjc.ui.theme.md_theme_light_error
import com.dawinder.btnjc.ui.theme.typography

/**
 * Composable function that represents the home screen of the application.
 */
@Composable
fun HomeScreen() {
   /* Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = stringResource(id = R.string.home),
            style = typography.titleLarge,
            color = md_theme_light_error
        )
    }*/

    var nombre by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }
    var mensaje by remember { mutableStateOf("") }

    Column(
        modifier = Modifier

            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //Titulo
        Text(
            text = "Formulario agregado por CP101020",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        //Campo Nombre
        OutlinedTextField(
            value = nombre,
            onValueChange = {nombre=it},
            label = {Text("Nombre")},
            modifier = Modifier

                .padding(bottom = 8.dp)
        )

        //Campo Email
        OutlinedTextField(
            value = email ,
            onValueChange = {email  = it },
            label = { Text("Email") },
            modifier = Modifier

                .padding(bottom = 8.dp)
        )

        //Campo Telefono
        OutlinedTextField(
            value = telefono,
            onValueChange = { telefono = it},
            label = { Text("Teléfono")},
            modifier = Modifier

                .padding(bottom = 8.dp)
        )

        //Campo Mensaje
        OutlinedTextField(
            value = mensaje,
            onValueChange = { mensaje = it },
            label = {Text("Mensaje")},
            modifier = Modifier

                .padding(16.dp),
            minLines = 3,
            maxLines = 5
        )

        //Botón Enviar
        Button(
            onClick = {},
            modifier = Modifier

                .height(56.dp)
        ) {
            Text("Enviar")
        }
    }
}

@Preview(
    name = "Formulario Preview",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeTabPreview() {
    // Envolver el HomeTab en un MaterialTheme para tener el estilo correcto
    MaterialTheme {

            HomeScreen()

    }
}