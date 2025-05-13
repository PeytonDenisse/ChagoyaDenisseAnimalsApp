package com.example.chogoyadenisseanimalsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
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
    Box(
        modifier = modifier
            .width(160.dp)
            .height(160.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Imagen redonda
            AsyncImage(
                model = imageUrl,
                contentDescription = name,
                modifier = Modifier
                    .size(110.dp)
                    .clip(RoundedCornerShape(50)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = name,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }

        // Ícono de favorito (decorativo)
        Icon(
            imageVector = Icons.Outlined.FavoriteBorder,
            contentDescription = "Favorito",
            tint = Color.Gray,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(20.dp)
        )
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
