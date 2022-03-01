package br.com.fmarxds.botdiscordvalorant

import br.com.fmarxds.botdiscordvalorant.constant.MessageRegexConstant
import br.com.fmarxds.botdiscordvalorant.util.CommandHelper
import dev.kord.core.Kord
import dev.kord.core.event.message.MessageCreateEvent
import dev.kord.core.on


suspend fun main() {

    val botClient = Kord(System.getenv("bot_token"))

    botClient.on<MessageCreateEvent> {

        if (message.author == botClient.getSelf()) return@on

        val messageRegexMatcher = MessageRegexConstant.REGEX_PATTERN_MESSAGE.matcher(message.content)
        if (!messageRegexMatcher.matches()) return@on

        val command = CommandHelper.COMMANDS.find {
            it.commandName().equals(messageRegexMatcher.group(MessageRegexConstant.REGEX_GROUP_COMMAND), true)
        }

        command
            ?.execute(message, messageRegexMatcher.group(MessageRegexConstant.REGEX_GROUP_ARGUMENTS))
            ?: message.channel.createMessage("Comando não encontrado. Utilize '!v help' para listar os comands existentes")

    }

    botClient.login {
        println("Application up!")
    }

}
