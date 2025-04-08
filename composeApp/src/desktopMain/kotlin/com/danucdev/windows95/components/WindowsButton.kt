package com.danucdev.windows95.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.danucdev.windows95.ui.backgroundComponents
import kotlinx.coroutines.awaitCancellation

@Composable
fun WindowsButton(
    modifier: Modifier,
    dotPadding: Dp = 0.dp,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    var isPressed by remember { mutableStateOf(false) }

    Box(modifier = modifier.background(backgroundComponents).drawBehind {
        val borderStroke = 1.5f
        val width = size.width
        val height = size.height

        drawLine(
            color = if (isPressed) Color.Black else Color.White,
            start = Offset(0f, 0f),
            end = Offset(0f, height),
            strokeWidth = borderStroke
        )

        drawLine(
            color = if (isPressed) Color.Black else Color.White,
            start = Offset(0f, 0f),
            end = Offset(width, 0f),
            strokeWidth = borderStroke

        )

        drawLine(
            color = if (isPressed) Color.DarkGray else Color.Black,
            start = Offset(0f, height),
            end = Offset(width, height),
            strokeWidth = borderStroke
        )

        drawLine(
            color = if (isPressed) Color.DarkGray else Color.Black,
            start = Offset(width, 0f),
            end = Offset(width, height),
            strokeWidth = borderStroke
        )

    }.pointerInput(Unit) {
        detectTapGestures(
            onPress = {
                isPressed = true
                tryAwaitRelease()
                onClick()
                isPressed = false
            }
        )
    }.padding(dotPadding)) {
        Box(modifier = Modifier.offset { if (isPressed) IntOffset(0, 1) else IntOffset.Zero }
            .drawBehind {
                if(isPressed && dotPadding > 0.dp){
                    drawRect(
                        color = Color.Black, style = Stroke(
                            width = 2f, pathEffect = PathEffect.dashPathEffect(
                                floatArrayOf(2f, 2f), phase = 0f
                            )
                        )
                    )
                }
            }) {
            content()
        }
    }

}