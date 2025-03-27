package org.example.project.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun CustomBottomNavBar(currentIndex: Int, onTabSelected: (Int) -> Unit) {
    Row(
        modifier = Modifier
            .widthIn(min = 432.dp)
            .height(64.dp)
            .shadow(12.dp, shape = RoundedCornerShape(40.dp))
            .background(Color.Black, shape = RoundedCornerShape(40.dp))
            .padding(horizontal = 32.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val items = listOf("Inicio", "Nosotros", "Servicios", "Otros")
        val icons = listOf(
            Icons.Filled.Home,
            Icons.Filled.Face,
            Icons.Filled.Build,
            Icons.Filled.MoreVert
        )

        items.forEachIndexed { index, label ->
            BottomNavItem(
                icon = icons[index],
                label = label,
                selected = index == currentIndex,
                onClick = { onTabSelected(index) }
            )
        }
    }
}

@Composable
fun BottomNavItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = if (selected) Color.White else Color.White.copy(alpha = 0.5f)
        )
        Text(
            text = label,
            color = if (selected) Color.White else Color.White.copy(alpha = 0.5f),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}
