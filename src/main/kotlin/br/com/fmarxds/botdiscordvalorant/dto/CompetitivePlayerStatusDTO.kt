package br.com.fmarxds.botdiscordvalorant.dto

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class CompetitivePlayerStatusDTO(

    @SerialName("currenttier")
    val currentTier: Int,

    @SerialName("currenttierpatched")
    val currentTierPatched: String,

    @SerialName("ranking_in_tier")
    val rankingInTier: Int,

    @SerialName("mmr_change_to_last_game")
    val mmrChangeToLastGame: Int,

    @SerialName("elo")
    val elo: Int,

    @SerialName("name")
    val name: String,

    @SerialName("tag")
    val tag: String,

)
