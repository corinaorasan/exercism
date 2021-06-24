fun transcribeToRna(dna: String): String {
    var result = ""

    dna.toCharArray().forEach {
        when (it) {
            'G' -> result += 'C'
            'C' -> result += 'G'
            'T' -> result += 'A'
            'A' -> result += 'U'
        }
    }
    return result
}
