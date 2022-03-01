package br.com.fmarxds.botdiscordvalorant.command.impl

import br.com.fmarxds.botdiscordvalorant.command.MessageCommand
import dev.kord.core.entity.Message

class PingPongMessageCommandImpl : MessageCommand {

    override suspend fun commandName() = "ping"

    override suspend fun commandDescription() = "Valida que o bot está online e respondendo."

    override suspend fun execute(message: Message, argument: String) {
        val messageChannel = message.channel
        messageChannel.createMessage("pong")
    }

}