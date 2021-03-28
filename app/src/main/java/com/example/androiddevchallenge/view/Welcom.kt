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
package com.example.androiddevchallenge.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.pink900
import com.example.androiddevchallenge.ui.theme.white

@Composable
fun welcome(action: () -> Unit) {
    WelcomeBackground()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Image(
            painter = painterResource(id = R.drawable.ic_light_welcome_illos),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 48.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_light_logo),
            contentDescription = null
        )
        Text(
            text = "Beatiful home garden solutions",
            modifier = Modifier
                .padding(bottom = 40.dp)
                .height(32.dp)
        )
        Button(onClick = {/* Todo */}, modifier = Modifier.fillMaxWidth()) {
            Text("Create account")
        }
        TextButton(onClick = action, modifier = Modifier.padding(top = 24.dp)) {
            Text(text = "Log in",
            style = MaterialTheme.typography.button,
            color = if(MaterialTheme.colors.isLight) pink900 else white)
        }
    }
}

@Composable
fun WelcomeBackground() {

    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        color = MaterialTheme.colors.primary
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_light_welcome_bg),
            contentDescription = "bloom_bg",
            contentScale = ContentScale.Crop
        )
    }

}
