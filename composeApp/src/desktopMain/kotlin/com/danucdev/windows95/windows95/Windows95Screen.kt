package com.danucdev.windows95.windows95

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.danucdev.windows95.components.BottomBarMenu
import com.danucdev.windows95.components.BottomBarSubMenu
import com.danucdev.windows95.components.WindowsBottomBar

@Composable
fun Windows95Screen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f))
        Box {
            Box(modifier = Modifier.align(Alignment.BottomCenter)) {
                WindowsBottomBar()
            }
            Box(modifier = Modifier.padding(bottom = 38.dp)) {
                Row {
                    BottomBarMenu()
                    Box(modifier = Modifier.offset { IntOffset(-8,0) }){
                        BottomBarSubMenu()
                    }
                }
            }
        }
    }
}