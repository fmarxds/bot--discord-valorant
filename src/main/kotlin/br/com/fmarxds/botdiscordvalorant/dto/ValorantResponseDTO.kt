package br.com.fmarxds.botdiscordvalorant.dto

@kotlinx.serialization.Serializable
data class ValorantResponseDTO<T>(

    val status: Int,
    val data: T,

)
