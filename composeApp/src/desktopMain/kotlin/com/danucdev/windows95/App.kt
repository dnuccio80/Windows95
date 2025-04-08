package com.danucdev.windows95

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.danucdev.windows95.splash.SplashScreen
import com.danucdev.windows95.ui.Windows95Typography
import com.danucdev.windows95.ui.backgroundColor
import com.danucdev.windows95.windows95.Windows95Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(typography = Windows95Typography()) {
        var initializing by rememberSaveable { mutableStateOf(false) }

        Box(modifier = Modifier.fillMaxSize().background(backgroundColor)) {
            if (initializing) {
                SplashScreen() { initializing = false }
            } else {
                Windows95Screen()
            }
        }
    }
}