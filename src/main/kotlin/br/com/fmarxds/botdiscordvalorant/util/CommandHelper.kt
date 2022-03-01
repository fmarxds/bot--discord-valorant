package br.com.fmarxds.botdiscordvalorant.util

import br.com.fmarxds.botdiscordvalorant.command.MessageCommand
import br.com.fmarxds.botdiscordvalorant.command.impl.HelpMessageCommandImpl
import br.com.fmarxds.botdiscordvalorant.command.impl.PingPongMessageCommandImpl
import br.com.fmarxds.botdiscordvalorant.command.impl.StatusCompetitiveMessageCommandImpl
import br.com.fmarxds.botdiscordvalorant.factory.HttpClientFactory
import br.com.fmarxds.botdiscordvalorant.service.impl.ValorantServiceImpl
import io.ktor.client.*

class CommandHelper private constructor() {

    companion object {

        val COMMANDS: List<MessageCommand> = listOf(
            HelpMessageCommandImpl(),
            PingPongMessageCommandImpl(),
            StatusCompetitiveMessageCommandImpl(ValorantServiceImpl(HttpClientFactory().newInstance())),
        )

    }

}