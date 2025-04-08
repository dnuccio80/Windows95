package com.danucdev.windows95.bottombarmenuitem

import androidx.annotation.DrawableRes
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import windows95.composeapp.generated.resources.Res
import windows95.composeapp.generated.resources.ic_documents
import windows95.composeapp.generated.resources.ic_exchange
import windows95.composeapp.generated.resources.ic_explorer
import windows95.composeapp.generated.resources.ic_find
import windows95.composeapp.generated.resources.ic_help
import windows95.composeapp.generated.resources.ic_msdos
import windows95.composeapp.generated.resources.ic_network
import windows95.composeapp.generated.resources.ic_programs
import windows95.composeapp.generated.resources.ic_run
import windows95.composeapp.generated.resources.ic_settings
import windows95.composeapp.generated.resources.ic_shutdown

sealed class BottomBarMenuItem(val title: String, val icon: DrawableResource, val hasSubMenu:Boolean = false) {
    data object Programs : BottomBarMenuItem("Programs", Res.drawable.ic_programs, hasSubMenu = true)
    data object Documents : BottomBarMenuItem("Documents", Res.drawable.ic_documents, hasSubMenu = true)
    data object Settings : BottomBarMenuItem("Settings", Res.drawable.ic_settings, hasSubMenu = true)
    data object Find : BottomBarMenuItem("Find", Res.drawable.ic_find, hasSubMenu = true)
    data object Help : BottomBarMenuItem("Help", Res.drawable.ic_help)
    data object Run : BottomBarMenuItem("Run...", Res.drawable.ic_run)
    data object Shutdown : BottomBarMenuItem("Shut down...", Res.drawable.ic_shutdown)
    data object Accessories : BottomBarMenuItem("Accessories", Res.drawable.ic_programs, hasSubMenu = true)
    data object StartUp : BottomBarMenuItem("StartUp", Res.drawable.ic_programs, hasSubMenu = true)
    data object MicrosoftExchange : BottomBarMenuItem("Microsoft Exchange", Res.drawable.ic_exchange)
    data object MsDos : BottomBarMenuItem("MS-DOS Prompt", Res.drawable.ic_msdos)
    data object MicrosoftNetwork : BottomBarMenuItem("The Microsoft Network", Res.drawable.ic_network)
    data object WindowsExplorer : BottomBarMenuItem("Windows Explorer", Res.drawable.ic_explorer)
}
