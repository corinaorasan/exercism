class Dna(val dna: String) {
    private val nucleotides = listOf('A', 'C', 'G', 'T')

    init {
        require(dna.all { it in nucleotides })
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            return nucleotides.map { nucleotide -> nucleotide to dna.count { it == nucleotide } }.toMap()
        }
}
