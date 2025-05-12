package com.example.chogoyadenisseanimalsapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimalDetailScreen(id: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D0D2B))
            .padding(24.dp)
    ) {
        Text(
            text = "Detalle del Animal",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "ID del animal: $id",
            color = Color.White
        )
    }
}
