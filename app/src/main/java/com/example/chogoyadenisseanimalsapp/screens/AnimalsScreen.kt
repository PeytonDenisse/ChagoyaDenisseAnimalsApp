package com.example.chogoyadenisseanimalsapp.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.chogoyadenisseanimalsapp.components.AnimalItemCard
import com.example.chogoyadenisseanimalsapp.models.Animal
import com.example.chogoyadenisseanimalsapp.services.AnimalService
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Composable
fun AnimalsScreen(innerPadding: PaddingValues, navController: NavHostController) {
    var animals by remember { mutableStateOf<List<Animal>>(emptyList()) }
    val scope = rememberCoroutineScope()
    val BASE_URL = "https://animals.juanfrausto.com/api/"

    LaunchedEffect(key1 = true) {
        scope.launch {
            try {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                val animalService = retrofit.create(AnimalService::class.java)
                animals = animalService.getAnimals()
            } catch (e: Exception) {
                Log.e("AnimalsScreen", "Error al cargar animales", e)
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color(0xFF0D0D2B))
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Animales",
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFDFD96),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar")
                Spacer(modifier = Modifier.width(4.dp))
                Text("Agregar")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Conoce a los animales más increíbles del mundo",
            color = Color.White.copy(alpha = 0.85f),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 100.dp)
        ) {
            items(animals) { animal ->
                AnimalItemCard(
                    name = animal.name,
                    imageUrl = animal.image,
                    modifier = Modifier.clickable {
                        navController.navigate("animal_detail/${animal.id}")
                    }
                )
            }
        }
    }
}

