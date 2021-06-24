object Bob {
    fun hey(input: String): String {
        val trimmedInput = input.trim()
        return when {
            trimmedInput.isEmpty() -> "Fine. Be that way!"
            trimmedInput.endsWith("?") -> "Sure."
            trimmedInput.filter { it.isLetter() }.let { it.isNotEmpty() && it.none { it.isLowerCase() } }->"Whoa, chill out!"
            trimmedInput.filter { it.isLetter() }.let { it.isNotEmpty() && it.none { it.isLowerCase() } } && trimmedInput.endsWith("?") ->"Calm down, I know what I'm doing!"
            else-> "Whatever."
        }
    }
}
