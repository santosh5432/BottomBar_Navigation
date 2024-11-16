package com.learningroots.bottombar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.createGraph
import com.learningroots.bottombar.screens.CartScreen
import com.learningroots.bottombar.screens.HomeScreen
import com.learningroots.bottombar.screens.ProfileScreen
import com.learningroots.bottombar.screens.SettingScreen
import com.learningroots.bottombar.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->

        val graph =
            navController.createGraph(startDestination = Screen.Home.rout) {
                composable(route = Screen.Cart.rout) {
                    CartScreen()
                }
                composable(route = Screen.Setting.rout) {
                    SettingScreen()
                }
                composable(route = Screen.Home.rout) {
                    HomeScreen()
                }
                composable(route = Screen.Profile.rout) {
                    ProfileScreen()
                }
            }
        NavHost(
            navController = navController,
            graph = graph,
            modifier = Modifier.padding(innerPadding)
        )

    }
}

