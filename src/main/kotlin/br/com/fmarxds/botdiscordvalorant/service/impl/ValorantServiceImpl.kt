package br.com.fmarxds.botdiscordvalorant.service.impl

import br.com.fmarxds.botdiscordvalorant.dto.CompetitivePlayerStatusDTO
import br.com.fmarxds.botdiscordvalorant.dto.ValorantResponseDTO
import br.com.fmarxds.botdiscordvalorant.service.ValorantService
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class ValorantServiceImpl(

    private val httpClient: HttpClient,
    private val valorantHost: String = "https://api.henrikdev.xyz/valorant",

    ) : ValorantService {

    override suspend fun playerCompetitiveData(playerName: String, playerTag: String): CompetitivePlayerStatusDTO {

        val request = httpClient.get<HttpResponse>("${valorantHost}/v1/mmr/br/${playerName}/${playerTag}")
        val response = request.receive<ValorantResponseDTO<CompetitivePlayerStatusDTO>>()

        return response.data

    }

}