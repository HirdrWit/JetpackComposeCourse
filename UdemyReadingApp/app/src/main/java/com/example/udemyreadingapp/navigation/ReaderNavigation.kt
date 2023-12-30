package com.example.udemyreadingapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.udemyreadingapp.screen.SplashScreen
import com.example.udemyreadingapp.screen.details.DetailsScreen
import com.example.udemyreadingapp.screen.home.HomeScreen
import com.example.udemyreadingapp.screen.login.LoginScreen
import com.example.udemyreadingapp.screen.search.SearchScreen
import com.example.udemyreadingapp.screen.stats.StatScreen
import com.example.udemyreadingapp.screen.update.UpdateScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ReaderScreens.SplashScreen.name) {
        composable(ReaderScreens.SplashScreen.name) {
            SplashScreen(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }

        composable(ReaderScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(ReaderScreens.SearchScreen.name) {
            SearchScreen(navController = navController)
        }

        composable(ReaderScreens.DetailScreen.name) {
            DetailsScreen(navController = navController)
        }

        composable(ReaderScreens.UpdateScreen.name) {
            UpdateScreen(navController = navController)
        }

        composable(ReaderScreens.StatsScreen.name) {
            StatScreen(navController = navController)
        }
    }
}