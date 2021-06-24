class Matrix(matrixAsString: String) {

    private val matrixResult = matrixAsString
            .lines()
            .map {
                it.split(" ")
                        .filterNot { it.isEmpty() }
                        .map { it.toInt() }
            }

    fun column(colNr: Int): List<Int> = matrixResult.map { it[colNr - 1] }

    fun row(rowNr: Int): List<Int> = matrixResult[rowNr - 1].map { it }
}