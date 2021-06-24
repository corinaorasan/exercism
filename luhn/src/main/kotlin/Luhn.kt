object Luhn {
    fun isValid(candidate: String): Boolean {
        return if (candidate.length != 1) {
            val noSpaces = candidate.filterNot { it.isWhitespace() }
            if (noSpaces.all { it.isDigit() } && noSpaces.length > 1) {
                val reversed = noSpaces.map { it.toString().toInt() }.reversed()
                val doubleOddDigits = reversed.mapIndexed { index, it ->
                    if (index % 2 == 1)
                        (it * 2).let { if (it > 9) it - 9 else it }
                    else
                        it
                }
                val digitsSum = doubleOddDigits.sum()
                digitsSum % 10 == 0
            } else false

        } else false
    }
}

