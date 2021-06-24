import java.lang.IllegalArgumentException

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        return if (leftStrand.length != rightStrand.length)
            throw IllegalArgumentException("The strands must have equal length")
        else leftStrand.zip(rightStrand).count {
            it.first != it.second
        }
    }
}