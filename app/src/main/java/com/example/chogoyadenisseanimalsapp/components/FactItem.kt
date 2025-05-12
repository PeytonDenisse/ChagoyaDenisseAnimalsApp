package com.example.chogoyadenisseanimalsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex

@Composable
fun FactItem(
    title: String = "Dato curioso",
    description: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
    ) {
        // Contenedor rectangular (principal)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp) // para que el círculo sobresalga a la izquierda
                .background(
                    color = Color(0xFFFFE0CC),
                    shape = RoundedCornerShape(topStart = 30.dp, bottomStart = 30.dp)
                )
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .align(Alignment.CenterStart),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(24.dp)) // espacio para el círculo visualmente
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    fontSize = 14.sp,
                    color = Color(0xFFFF6F00)
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
            }
        }

        // Círculo que sobresale
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(Color(0xFFD3D3D3), CircleShape)
                .align(Alignment.CenterStart)
                .zIndex(1f), // para que quede encima
            contentAlignment = Alignment.Center
        ) {
            Text("🐾", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = false)
@Composable
fun FactItemPreview() {
    FactItem(
        title = "Dato curioso",
        description = "Los tigres tienen manchas blancas en sus orejas llamadas 'manchas oculares'."
    )
}
