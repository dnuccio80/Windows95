package com.danucdev.windows95.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.danucdev.windows95.ui.backgroundComponents
import com.danucdev.windows95.ui.windowsBlue
import org.jetbrains.compose.resources.painterResource
import windows95.composeapp.generated.resources.Res
import windows95.composeapp.generated.resources.winlogo

@Composable
fun WindowsBottomBar() {

    Column(Modifier.fillMaxWidth()) {
        Box(modifier = Modifier.fillMaxWidth().height(2.dp).background(Color.White))
        Row(modifier = Modifier.fillMaxWidth().height(40.dp).background(backgroundComponents)) {
            WindowsButton(
                modifier = Modifier.padding(start = 8.dp, bottom = 4.dp, top = 4.dp).width(80.dp)
                    .fillMaxHeight(), onClick = {}) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(4.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.dp)
                    ) {
                        Image(
                            painterResource(Res.drawable.winlogo),
                            modifier = Modifier.size(36.dp),
                            contentDescription = "win logo"
                        )
                        Text("Start")
                    }
                }
            }
            Row(modifier = Modifier.weight(1f)) { }
            InformationBar()
        }
    }

}