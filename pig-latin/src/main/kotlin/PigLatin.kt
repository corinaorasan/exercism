object PigLatin {
    fun translate( phrase : String ) =
            phrase
                    .split(" ")
                    .map {
                        when {
                            listOf('a', 'e', 'i', 'o', 'u').contains(it.first())-> it + "ay"
                            listOf("yt", "xr").contains(it.take(2)) -> it + "ay"
                            else -> Unit
                        }
                    }.joinToString( separator = " ")
}