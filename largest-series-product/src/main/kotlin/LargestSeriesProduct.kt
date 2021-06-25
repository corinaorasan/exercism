class Series(input: String) {
    private val numbers = input.map { it.toString().toLong() }

    fun getLargestProduct(span: Int): Long {
        if (span > numbers.size)
            throw IllegalArgumentException("Span greater than numbers")
        else if (numbers.isNullOrEmpty())
            return 1
    return numbers.toString().toLong()
}
}
