/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.androiddevchallenge.nav

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.nav.Destinations.Home
import com.example.androiddevchallenge.nav.Destinations.Login
import com.example.androiddevchallenge.nav.Destinations.Welcome

object Destinations {
    const val Home = "home"
    const val Login = "login"
    const val Welcome = "welcome"
    const val View3 = "view3"
}

class Action(navController: NavHostController) {
    val home: () -> Unit = { navController.navigate(Home) }
    val login: () -> Unit = { navController.navigate(Login) }
    val welcome: () -> Unit = { navController.navigate(Welcome) }
    val navigateBack: () -> Unit = { navController.popBackStack() }
}
