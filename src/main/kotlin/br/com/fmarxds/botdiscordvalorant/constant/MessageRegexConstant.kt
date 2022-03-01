package br.com.fmarxds.botdiscordvalorant.constant

import java.util.regex.Pattern

class MessageRegexConstant private constructor() {

    companion object {

        val REGEX_PATTERN_MESSAGE: Pattern = Pattern.compile("(!v)\\s(\\w+)\\s?(.*)")
        const val REGEX_GROUP_FULL_MESSAGE: Int = 0
        const val REGEX_GROUP_COMMAND_PREFIX: Int = 1
        const val REGEX_GROUP_COMMAND: Int = 2
        const val REGEX_GROUP_ARGUMENTS: Int = 3

    }

}