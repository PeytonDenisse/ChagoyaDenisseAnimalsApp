package com.example.chogoyadenisseanimalsapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage

@Composable
fun AnimalMiniCard(
    name: String,
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFF6F61) // tono coral adaptado
        ),
        modifier = modifier
            .height(240.dp)
            .width(200.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(160.dp)
                    .padding(4.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = name,
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun AnimalMiniCardPreview() {
    AnimalMiniCard(
        name = "Delfín",
        imageUrl = "https://images.dolphinaris.com/images/2015/03/5-curiosidades-sobre-los-delfines-Dolphinaris.jpg"
    )
}
