package br.com.fmarxds.botdiscordvalorant.service

import br.com.fmarxds.botdiscordvalorant.dto.CompetitivePlayerStatusDTO

interface ValorantService {

    suspend fun playerCompetitiveData(playerName: String, playerTag: String): CompetitivePlayerStatusDTO

}