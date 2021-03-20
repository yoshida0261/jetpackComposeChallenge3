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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.nav.Destinations.Login
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.white150
import java.nio.file.Files.size


@Composable
fun login(action: () -> Unit) {

    Image(
        contentScale = ContentScale.FillBounds,
        painter = painterResource(R.drawable.ic_light_welcome_bg),
        contentDescription = "background"
    )
    Column(
        modifier = Modifier.padding(top = 72.dp)
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
        Button(onClick = action, modifier = Modifier.fillMaxWidth()) {
            Text("Create account")
        }
        Text(text = "Log in")


    }


}

@Preview
@Composable
fun LightPreview() {
    MyTheme {
        login {}
    }
}
