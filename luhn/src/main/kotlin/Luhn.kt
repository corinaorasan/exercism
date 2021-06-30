object Luhn {
    fun isValid(candidate: String): Boolean {
        val noSpaces: String = candidate.filterNot { it.isWhitespace() }

        val lengthRule = { string: String -> string.isLengthGreaterThanOne() }
        val luhnRule = { string: String ->
            string.reversed()
                    .mapToInt()
                    .doubleAndSubtractAll()
                    .sum()
                    .isDivisibleByTen()
        }

        return listOf(digitsRule(), lengthRule, luhnRule).all {
            it(noSpaces)
        }
    }

    private fun digitsRule(): (String) -> Boolean = { string: String -> string.isAllDigits() }

    private fun Int.isDivisibleByTen() = this % 10 == 0

    private fun String.mapToInt(): List<Int> {
        return this.map { Character.getNumericValue(it) }
    }

    private fun Int.isOdd(): Boolean = this % 2 == 1

    private fun Int.doubleAndSubtract(): Int =
            (this * 2).let { if (it > 9) it - 9 else it }

    private fun List<Int>.doubleAndSubtractAll(): List<Int> =
            this.mapIndexed { index, digit ->
                if (index.isOdd())
                    digit.doubleAndSubtract()
                else
                    digit
            }

    private fun String.isAllDigits() = this.all { it.isDigit() }

    private fun String.isLengthGreaterThanOne() = this.length > 1
}









