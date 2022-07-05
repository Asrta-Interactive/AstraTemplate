import com.astrainteractive.astralibs.AstraLibs
import com.astrainteractive.astralibs.registerTabCompleter
import com.astrainteractive.astralibs.withEntry
import com.astrainteractive.astratemplate.AstraTemplate
import com.astrainteractive.astratemplate.commands.*


/**
 * Command handler for your plugin
 * It's better to create different executors for different commands
 * @see Reload
 */
class CommandManager {
    /**
     * Here you should declare commands for your plugin
     *
     * Commands stored in plugin.yml
     *
     * etemp has TabCompleter
     */
    init {
        EmpireTabCompleter()
        Reload()
        AddCommand()
        Gui()
        Damage()
    }


}