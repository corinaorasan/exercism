import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val inputToString = input.toString()
        val inputLength = inputToString.length
        val digitsSum = inputToString
                .filterNot { it.isWhitespace() }
                .map { Character.getNumericValue(it) }
                .map { it.toDouble().pow(inputLength).toInt() }
                .sum()
        return digitsSum.toString() == inputToString
    }

}
