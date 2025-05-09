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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chogoyadenisseanimalsapp.ui.theme.ChogoyaDenisseAnimalsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChogoyaDenisseAnimalsAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                        .background(Color(0xFF0D0D2B)),
                    contentColor = Color.Transparent,
                    containerColor = Color.Transparent,

                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(
                                selected = true,
                                onClick = { },
                                icon = {
                                    Icon(
                                        imageVector = Icons.Default.Home,
                                        contentDescription = "Animal",
                                        tint = Color.White,
                                        modifier = Modifier.size(30.dp)
                                    )

                                }
                            )
                            NavigationBarItem(
                                selected = true,
                                onClick = { },
                                icon = {
                                    Icon(
                                        imageVector = Icons.Default.List,
                                        contentDescription = "Habits",
                                        tint = Color.White,
                                        modifier = Modifier.size(30.dp)
                                    )

                                }
                            )
                        }
                    }
                    ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChogoyaDenisseAnimalsAppTheme {
        Greeting("Android")
    }
}