package br.com.fmarxds.botdiscordvalorant.command

import dev.kord.core.entity.Message

interface MessageCommand {

    suspend fun commandName(): String

    suspend fun commandDescription(): String

    suspend fun execute(message: Message, argument: String)

}