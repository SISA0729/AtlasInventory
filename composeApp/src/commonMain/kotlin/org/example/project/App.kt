package org.example.project

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.example.project.components.CustomBottomNavBar
import org.example.project.components.CustomHeader
import org.example.project.screens.HomeScreen

@Composable
fun App() {
    var currentIndex by remember { mutableStateOf(0) }

    val screens = listOf<@Composable () -> Unit>(
        { HomeScreen() },
        { },
        { },
        { }
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { CustomHeader() },
            backgroundColor = Color.White,
            content = { padding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                ) {
                    screens[currentIndex]()
                }
            }
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 20.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            CustomBottomNavBar(
                currentIndex = currentIndex,
                onTabSelected = { currentIndex = it }
            )
        }
    }
}



