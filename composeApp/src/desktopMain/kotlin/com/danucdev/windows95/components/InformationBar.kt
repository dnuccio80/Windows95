package com.danucdev.windows95.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.selects.whileSelect
import org.jetbrains.compose.resources.vectorResource
import java.text.SimpleDateFormat
import java.util.Date

@Composable
fun InformationBar(){

    var currentTime by remember { mutableStateOf(SimpleDateFormat("hh:mm a").format(Date())) }

    LaunchedEffect(Unit) {
        while (true) {
            currentTime = SimpleDateFormat("hh:mm a").format(Date())
            delay(1000)
        }
    }

    Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp).fillMaxHeight().border(BorderStroke(1.5.dp, color = Color.Gray)), verticalAlignment = Alignment.CenterVertically){
        Text(currentTime, modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp))
    }
}