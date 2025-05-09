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
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chogoyadenisseanimalsapp.screens.AnimalsScreen
import com.example.chogoyadenisseanimalsapp.screens.HabitsScreen
import com.example.chogoyadenisseanimalsapp.ui.theme.ChogoyaDenisseAnimalsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ChogoyaDenisseAnimalsAppTheme {
                var selectedScreen by remember {
                    mutableStateOf("animal")
                }
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
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
                                        contentDescription = "Animal",
                                        tint = Color.White,
                                        modifier = Modifier.size(30.dp)
                                    )

                                },
                                colors = NavigationBarItemDefaults.colors(indicatorColor = Color.White.copy(alpha = 0.2f))
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
                                        contentDescription = "Habits",
                                        tint = Color.White,
                                        modifier = Modifier.size(30.dp)
                                    )

                                },
                                colors = NavigationBarItemDefaults.colors(indicatorColor = Color.White.copy(alpha = 0.2f))
                            )
                        }
                    }
                    ) { innerPadding ->
                    NavHost(navController = navController, startDestination = "animals"){
                        composable(route = "animals") {
                            AnimalsScreen(innerPadding = innerPadding)
                        }
                        composable(route = "habits") {
                            HabitsScreen(innerPadding = innerPadding)
                        }
                    }
                }
            }
        }
    }
}

