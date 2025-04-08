package com.danucdev.windows95.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.danucdev.windows95.bottombarmenuitem.BottomBarMenuItem
import com.danucdev.windows95.ui.backgroundComponents
import org.jetbrains.compose.resources.painterResource
import windows95.composeapp.generated.resources.Res
import windows95.composeapp.generated.resources.ic_arrow

@Composable
fun BottomBarMenu() {

    val itemList = listOf(
        BottomBarMenuItem.Programs,
        BottomBarMenuItem.Documents,
        BottomBarMenuItem.Settings,
        BottomBarMenuItem.Find,
        BottomBarMenuItem.Help,
        BottomBarMenuItem.Run,
    )

    Box(
        modifier = Modifier.height(430.dp).width(270.dp).padding(start = 16.dp)
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
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
            itemList.forEach { item ->
                ItemBox(item, modifier = Modifier.fillMaxWidth().weight(1f), iconSize = 34.dp)
            }
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp)) {
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Gray,
                    thickness = 2.dp
                )
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.White,
                    thickness = 2.dp
                )
            }

            ItemBox(BottomBarMenuItem.Shutdown, modifier = Modifier.fillMaxWidth().weight(1f), iconSize = 34.dp)
        }
    }
}

