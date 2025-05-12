package com.example.chogoyadenisseanimalsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun AnimalItemCard(
    name: String,
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(160.dp)
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen cuadrada y recortada
        AsyncImage(
            model = imageUrl,
            contentDescription = name,
            modifier = Modifier
                .size(160.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        // Caja blanca con nombre
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(16.dp))
                .padding(vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = name,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview(showBackground = false)
@Composable
fun AnimalItemCardPreview() {
    AnimalItemCard(
        name = "Nutria",
        imageUrl = "https://i.redd.it/04rwloagnx551.jpg"
    )
}
