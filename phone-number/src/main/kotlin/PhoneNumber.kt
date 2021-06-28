class PhoneNumber(number: String) {
    val number = filterNumber(number)

    private fun filterNumber(number: String): String {
        val filteredNumber = number.filterNot { it.isWhitespace() }
                .filter { it.isDigit() }
                .removePrefix("1")

        if (filteredNumber.length == 10 && filteredNumber.first() > '1' && filteredNumber[3] > '1') {
            return filteredNumber
        } else throw IllegalArgumentException("Incorrect number")
    }
}
