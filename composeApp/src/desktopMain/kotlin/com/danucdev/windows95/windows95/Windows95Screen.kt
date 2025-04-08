package com.danucdev.windows95.windows95

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.danucdev.windows95.components.WindowsBottomBar

@Composable
fun Windows95Screen() {

    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f))
        WindowsBottomBar()
    }




}