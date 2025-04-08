package com.danucdev.windows95.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.danucdev.windows95.bottombarmenuitem.BottomBarMenuItem
import com.danucdev.windows95.ui.backgroundComponents

@Composable
fun BottomBarSubMenu() {

    val itemList = listOf(
        BottomBarMenuItem.Accessories,
        BottomBarMenuItem.StartUp,
        BottomBarMenuItem.MicrosoftExchange,
        BottomBarMenuItem.MsDos,
        BottomBarMenuItem.MicrosoftNetwork,
        BottomBarMenuItem.WindowsExplorer,
    )

    Box(
        modifier = Modifier.width(280.dp)
            .background(backgroundComponents).drawBehind {
                val whiteBorderStroke = 3f
                val darkBorderStroke = 2f
                val width = size.width
                val height = size.height

                drawLine(
                    color = Color.Black,
                    start = Offset(width, 0f),
                    end = Offset(width, height),
                    strokeWidth = darkBorderStroke
                )

                drawLine(
                    color = Color.Black,
                    start = Offset(0f, height),
                    end = Offset(width, height),
                    strokeWidth = darkBorderStroke
                )

                drawLine(
                    color = Color.White,
                    start = Offset(0f, 0f),
                    end = Offset(width, 0f),
                    strokeWidth = whiteBorderStroke
                )

                drawLine(
                    color = Color.White,
                    start = Offset(0f, 0f),
                    end = Offset(0f, height),
                    strokeWidth = whiteBorderStroke
                )
            }
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            itemList.forEach { item ->
                Box(modifier = Modifier.heightIn(min = 40.dp), contentAlignment = Alignment.Center) {
                    ItemBox(item, modifier = Modifier.fillMaxWidth(), iconSize = 24.dp)
                }
            }
        }
    }
}