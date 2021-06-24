object Isogram {

    fun isIsogram(input: String): Boolean {
        val map = input.map { it.toLowerCase().toInt() }
                .filter { it in 97..122 }
                .groupingBy { it }
                .eachCount()
        return map.size == map.values.sum()
    }
}
