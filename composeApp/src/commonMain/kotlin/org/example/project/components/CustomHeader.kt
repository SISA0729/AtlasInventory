package org.example.project.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import atlasinventory.composeapp.generated.resources.Res
import atlasinventory.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource


@Composable
fun CustomHeader() {
    TopAppBar(
        backgroundColor = Color.White,
        elevation = 0.dp,
        title = {
            Image(
                painter = painterResource(Res.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.height(40.dp)
            )
        }
    )
}


