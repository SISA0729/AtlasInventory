package org.example.project.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(bottom = 140.dp)
    ) {
        ImageCard(title = "INVENTARIO", onClick = {  })
        ImageCard(title = "TAREAS", onClick = {  })
        ImageCard(title = "COMUNICACIONES", onClick = {  })

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "App",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Aplicación para la gestión y seguimiento de inventario, diseñada para optimizar el control de productos, entradas y salidas en tiempo real.",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                Text(
                    text = "LEER MÁS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun ImageCard(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(2f)
            .clickable(onClick = onClick)
            .padding(horizontal = 0.dp),
        elevation = 0.dp
    ) {
        Box(modifier = Modifier.fillMaxSize()) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.4f))
            )
            Text(
                text = title,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}
