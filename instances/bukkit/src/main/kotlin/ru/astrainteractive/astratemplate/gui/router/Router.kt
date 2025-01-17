package ru.astrainteractive.astratemplate.gui.router

import org.bukkit.entity.Player

internal interface Router {
    sealed interface Route {
        data object Sample : Route
    }

    fun open(player: Player, route: Route)
}
