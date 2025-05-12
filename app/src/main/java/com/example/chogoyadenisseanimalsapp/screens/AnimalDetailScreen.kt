package com.example.chogoyadenisseanimalsapp.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.chogoyadenisseanimalsapp.components.FactItem
import com.example.chogoyadenisseanimalsapp.models.Animal
import com.example.chogoyadenisseanimalsapp.services.AnimalService
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Composable
fun AnimalDetailScreen(id: String) {
    var animal by remember { mutableStateOf<Animal?>(null) }
    val scope = rememberCoroutineScope()
    val BASE_URL = "https://animals.juanfrausto.com/api/"

    LaunchedEffect(id) {
        scope.launch {
            try {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                val api = retrofit.create(AnimalService::class.java)
                animal = api.getAnimalById(id)
            } catch (e: Exception) {
                Log.e("AnimalDetailScreen", "Error al cargar animal", e)
            }
        }
    }

    animal?.let { animal ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = animal.image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(MaterialTheme.shapes.medium)
            )





            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.large,
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorito",
                            tint = Color.Red
                        )
                        Text(
                            text = animal.name,
                            fontSize = 26.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFF6F00),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )

                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = animal.description,
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        color = Color.DarkGray
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        "Galería",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color(0xFFFF6F00),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        items(animal.imageGallery) { img ->
                            AsyncImage(
                                model = img,
                                contentDescription = null,
                                modifier = Modifier
                                    .height(160.dp)
                                    .width(250.dp)
                                    .clip(MaterialTheme.shapes.medium),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        "Hechos curiosos",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color(0xFFFF6F00),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        animal.facts.forEach { fact ->
                            FactItem(description = fact)
                        }
                    }
                }
            }
        }
    }
}