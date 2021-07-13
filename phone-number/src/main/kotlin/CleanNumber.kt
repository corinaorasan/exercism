class CleanNumber(number: String) {
    val number = number.filterDigits()
            .removePrefixIfExists()

    private fun String.removePrefixIfExists(): String {
        return this.removePrefix("1")
    }

    private fun String.filterDigits(): String {
        return this.filter { it.isDigit() }
    }
}