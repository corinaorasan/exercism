class PhoneNumber(number: String) {
    val number = showNumberWithoutPrefix(number)

    private fun String.cleanup(): String {
        return this.eliminateWhiteSpaces()
                .filterDigits()
                .removePrefixOne()
    }

    private fun showNumberWithoutPrefix(number: String): String {
        return if (number.cleanup()
                        .isValid()) number.cleanup() else throw IllegalArgumentException()
    }

    private fun String.isValid(): Boolean {

        val lengthRule = { string: String -> string.isLengthEqualTen() }

        val firstCharacterRule = { string: String -> string.isCharacterGreaterThanOne(0) }

        val fourthCharacterRule = { string: String -> string.isCharacterGreaterThanOne(3) }

        return listOf(firstCharacterRule, fourthCharacterRule, lengthRule).all {
            it(this)
        }
    }

    private fun String.removePrefixOne(): String {
        return this.removePrefix(AMERICAN_PREFIX)
    }

    private fun String.eliminateWhiteSpaces(): String {
        return this.filterNot { it.isWhitespace() }
    }

    private fun String.filterDigits(): String {
        return this.filter { it.isDigit() }
    }

    private fun String.isLengthEqualTen(): Boolean {
        return this.length == PHONE_NUMBER_LENGTH
    }

    private fun String.isCharacterGreaterThanOne(index: Int): Boolean {
        return this[index] > '1'
    }

    companion object {
        const val PHONE_NUMBER_LENGTH = 10
        const val AMERICAN_PREFIX = "1"
    }
}
