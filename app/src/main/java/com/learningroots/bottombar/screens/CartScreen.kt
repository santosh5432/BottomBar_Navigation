package com.learningroots.bottombar.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * Author: Santosh Yadav
 * Created on: 16-11-2024 12:43
 */

@Composable
fun CartScreen(){
    Box (modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Cart Screen",
            style = MaterialTheme.typography.headlineLarge
        )
    }

}