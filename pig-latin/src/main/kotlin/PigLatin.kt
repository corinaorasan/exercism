object PigLatin {
    fun translate( phrase : String ) =
            phrase
                    .split(" ")
                    .map {
                        word ->
                        when {
                            word.first().isVowel() -> word + "ay"
                            listOf("yt", "xr").contains(word.take(2)) -> word + "ay"
                            else -> Unit
                        }
                    }.joinToString( separator = " ")
}

fun Char.isVowel() = listOf('a', 'e', 'i', 'o', 'u').contains(this)
