object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        return when (c.toUpperCase()) {
            'Q', 'Z' -> 10
            'J', 'X' -> 8
            'K' -> 5
            'F', 'H', 'V', 'W', 'Y' -> 4
            'B', 'C', 'M', 'P' -> 3
            'D', 'G' -> 2
            else -> 1
        }
    }

    fun scoreWord(word: String): Int {
        var score = 0
        word.map {
            score += scoreLetter(it)
        }
        return score
    }
}
