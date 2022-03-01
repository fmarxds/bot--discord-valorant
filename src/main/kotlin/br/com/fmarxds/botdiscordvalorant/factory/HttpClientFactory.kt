package br.com.fmarxds.botdiscordvalorant.factory

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*

class HttpClientFactory {

    fun newInstance(): HttpClient = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

}