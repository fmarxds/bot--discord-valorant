package br.com.fmarxds.botdiscordvalorant.command.impl

import br.com.fmarxds.botdiscordvalorant.command.MessageCommand
import br.com.fmarxds.botdiscordvalorant.util.CommandHelper
import dev.kord.core.entity.Message

class HelpMessageCommandImpl : MessageCommand {

    override suspend fun commandName() = "help"

    override suspend fun commandDescription() = "Lista os comandos disponíveis."

    override suspend fun execute(message: Message, argument: String) {

        val sb = StringBuilder()

        CommandHelper.COMMANDS.forEach {
            sb.append("> ${it.commandName()}: ${it.commandDescription()}\n")
        }

        message.channel.createMessage("Comandos dispníveis:\n$sb")

    }

}