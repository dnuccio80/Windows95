package com.danucdev.windows95.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.danucdev.windows95.bottombarmenuitem.BottomBarMenuItem
import org.jetbrains.compose.resources.painterResource
import windows95.composeapp.generated.resources.Res
import windows95.composeapp.generated.resources.ic_arrow

@Composable
fun ItemBox(item: BottomBarMenuItem, iconSize: Dp, modifier: Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painterResource(item.icon),
                modifier = Modifier.size(iconSize),
                contentDescription = "icon"
            )
            Text(item.title)
            if (item.hasSubMenu) {
                Spacer(modifier = Modifier.weight(1f))
                Icon(painterResource(Res.drawable.ic_arrow), modifier = Modifier.size(18.dp).padding(top = 4.dp), contentDescription = "arrow")
            }
        }
    }
}