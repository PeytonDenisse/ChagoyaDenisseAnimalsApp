package com.example.chogoyadenisseanimalsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.example.chogoyadenisseanimalsapp.screens.AnimalDetailScreen
import com.example.chogoyadenisseanimalsapp.screens.AnimalsScreen
import com.example.chogoyadenisseanimalsapp.screens.HabitsDetailScreen
import com.example.chogoyadenisseanimalsapp.screens.HabitsScreen
import com.example.chogoyadenisseanimalsapp.ui.theme.ChogoyaDenisseAnimalsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ChogoyaDenisseAnimalsAppTheme {
                var selectedScreen by remember { mutableStateOf("animals") }
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF0D0D2B)),
                    contentColor = Color.Transparent,
                    containerColor = Color.Transparent,
                    bottomBar = {
                        NavigationBar(
                            containerColor = Color(0xFF0D0D2B).copy(alpha = 0.9f)
                        ) {
                            NavigationBarItem(
                                selected = selectedScreen == "animals",
                                onClick = {
                                    selectedScreen = "animals"
                                    navController.navigate("animals")
                                },
                                icon = {
                                    Icon(
                                        imageVector = Icons.Default.Home,
                                        contentDescription = "Animales",
                                        tint = Color.White,
                                        modifier = Modifier.size(30.dp)
                                    )
                                },
                                colors = NavigationBarItemDefaults.colors(
                                    indicatorColor = Color.White.copy(alpha = 0.2f)
                                )
                            )
                            NavigationBarItem(
                                selected = selectedScreen == "habits",
                                onClick = {
                                    selectedScreen = "habits"
                                    navController.navigate("habits")
                                },
                                icon = {
                                    Icon(
                                        imageVector = Icons.Default.List,
                                        contentDescription = "Hábitats",
                                        tint = Color.White,
                                        modifier = Modifier.size(30.dp)
                                    )
                                },
                                colors = NavigationBarItemDefaults.colors(
                                    indicatorColor = Color.White.copy(alpha = 0.2f)
                                )
                            )
                        }
                    }
                ) { innerPadding ->
                    NavHost(navController = navController, startDestination = "animals") {
                        composable(route = "animals") {
                            AnimalsScreen(innerPadding = innerPadding, navController = navController)
                        }
                        composable(route = "habits") {
                            HabitsScreen(innerPadding = innerPadding, navController = navController)
                        }
                        composable(route = "animal_detail/{id}") { backStackEntry ->
                            val id = backStackEntry.arguments?.getString("id") ?: ""
                            AnimalDetailScreen(id = id)
                        }
                        composable(
                            route = "environment_detail/{id}",
                            arguments = listOf(navArgument("id") { type = NavType.StringType })
                        ) { backStackEntry ->
                            val id = backStackEntry.arguments?.getString("id") ?: ""
                            HabitsDetailScreen(id = id)
                        }
                    }
                }
            }
        }
    }
}
