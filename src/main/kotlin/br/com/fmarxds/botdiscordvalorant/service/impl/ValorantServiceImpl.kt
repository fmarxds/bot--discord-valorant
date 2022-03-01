package br.com.fmarxds.botdiscordvalorant.service.impl

import br.com.fmarxds.botdiscordvalorant.dto.CompetitivePlayerStatusDTO
import br.com.fmarxds.botdiscordvalorant.dto.ValorantResponseDTO
import br.com.fmarxds.botdiscordvalorant.service.ValorantService
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class ValorantServiceImpl(

    private val httpClient: HttpClient,

) : ValorantService {

    override suspend fun playerCompetitiveData(playerName: String, playerTag: String): CompetitivePlayerStatusDTO {

        val host = "https://api.henrikdev.xyz/valorant"

        val request = httpClient.get<HttpResponse>("${host}/v1/mmr/br/${playerName}/${playerTag}")

        val response = request.receive<ValorantResponseDTO<CompetitivePlayerStatusDTO>>()

        return response.data

    }

}