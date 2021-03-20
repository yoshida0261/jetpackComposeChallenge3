package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.nav.Action
import com.example.androiddevchallenge.nav.Destinations.Home
import com.example.androiddevchallenge.nav.Destinations.Login
import com.example.androiddevchallenge.nav.Destinations.Welcome
import com.example.androiddevchallenge.ui.theme.NavComposeTheme
import com.example.androiddevchallenge.view.home
import com.example.androiddevchallenge.view.login
import com.example.androiddevchallenge.view.welcome

@Composable
fun navComposeApp() {
    val navController = rememberNavController()
    val actions = remember(navController) { Action(navController) }
    NavComposeTheme {
        NavHost(
            navController = navController,
            startDestination = Welcome
        ) {
            composable(Home) { home(action = actions.login) }
            composable(Login) { login(action = actions.welcome) }
            composable(Welcome) { welcome(action = actions.home) }
        }
    }
}