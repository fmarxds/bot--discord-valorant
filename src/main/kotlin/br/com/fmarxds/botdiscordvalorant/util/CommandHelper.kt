package br.com.fmarxds.botdiscordvalorant.util

import br.com.fmarxds.botdiscordvalorant.command.MessageCommand
import br.com.fmarxds.botdiscordvalorant.command.impl.HelpMessageCommandImpl
import br.com.fmarxds.botdiscordvalorant.command.impl.PingPongMessageCommandImpl

class CommandHelper private constructor() {

    companion object {

        val COMMANDS: List<MessageCommand> = listOf(
            HelpMessageCommandImpl(),
            PingPongMessageCommandImpl(),
        )

    }

}