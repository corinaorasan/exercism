object Pangram {

    fun isPangram(input: String): Boolean {
        val string = input.toLowerCase()
        return ('a'..'z').all { string.contains(it) }
    }
}

