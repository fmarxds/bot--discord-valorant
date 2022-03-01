package br.com.fmarxds.botdiscordvalorant.command.impl

import br.com.fmarxds.botdiscordvalorant.command.MessageCommand
import br.com.fmarxds.botdiscordvalorant.service.ValorantService
import dev.kord.core.entity.Message
import dev.kord.core.entity.ReactionEmoji

class StatusCompetitiveMessageCommandImpl(

    private val valorantService: ValorantService,

) : MessageCommand {

    override suspend fun commandName() = "comp"

    override suspend fun commandDescription() = "Retorna o status competitivo de um player. !v comp <player#tag>"

    override suspend fun execute(message: Message, argument: String) {

        val arguments = argument.split("#")

        val playerCompetitiveData = valorantService.playerCompetitiveData(arguments[0], arguments[1])

        val responseMessage = """
            ```
                 PLAYER: $argument
                   RANK: ${playerCompetitiveData.currentTierPatched}
                 PONTOS: ${playerCompetitiveData.rankingInTier}
            ULTIMO JOGO: ${playerCompetitiveData.mmrChangeToLastGame}
            ```
        """.trimIndent()

        message.channel.createMessage(responseMessage)

    }

}