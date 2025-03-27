package org.example.project.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import atlasinventory.composeapp.generated.resources.Res
import atlasinventory.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var rememberMe by remember { mutableStateOf(false) }

    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painter = painterResource(Res.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .height(120.dp)
            )

            Text(
                "Bienvenido de nuevo",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                "Ingresa para continuar",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Usuario
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                placeholder = { Text("Nombre de usuario") },
                leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(50),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(0xFFF5F5F5),
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Contraseña
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                placeholder = { Text("Contraseña") },
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(50),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(0xFFF5F5F5),
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = rememberMe, onCheckedChange = { rememberMe = it })
                    Text("Recordarme")
                }

                TextButton(onClick = { /* TODO */ }) {
                    Text("¿Olvidaste tu contraseña?", color = Color.Black)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Botón principal
            Button(
                onClick = onLoginSuccess,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .shadow(8.dp, shape = RoundedCornerShape(50)),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
            ) {
                Text("Iniciar sesión", color = Color.White)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("¿No tienes cuenta? ")

                Text(
                    text = "Regístrate",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clickable { }
                )
            }
        }
    }
}
