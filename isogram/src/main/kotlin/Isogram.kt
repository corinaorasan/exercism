object Isogram {

    fun isIsogram(input: String): Boolean {
        val map = input.map { it.toLowerCase() }
                .filter { it in 'a'..'z' }
                .groupingBy { it }
                .eachCount()
        return map.size == map.values.sum()
    }
}
