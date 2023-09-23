package ru.astrainteractive.astratemplate.event.events

import org.bukkit.event.EventHandler
import org.bukkit.event.HandlerList
import org.bukkit.event.block.BlockPlaceEvent
import ru.astrainteractive.astralibs.event.EventListener
import ru.astrainteractive.astratemplate.AstraTemplate
import ru.astrainteractive.astratemplate.event.di.EventModule

/**
 * Template event class
 * @see [MultipleEventsDSL]
 */
class TemplateEvent(
    module: EventModule
) : EventListener, EventModule by module {

    /**
     * Sample event which is called when Block is placed
     */
    @EventHandler
    public fun blockPlaceEvent(e: BlockPlaceEvent) {
        e.player.sendMessage(translation.custom.blockPlaced)
        return
    }

    /**
     * As said in EventHandler, every Event must have onDisable method, which disabling events
     * Here BlockPlaceEvent is unregistering
     * It's okay to not write anything here, since you call [HandlerList.unregister] in [AstraTemplate.onDisable]
     */
    public override fun onDisable() {
        super.onDisable()
        BlockPlaceEvent.getHandlerList().unregister(this)
    }
}
