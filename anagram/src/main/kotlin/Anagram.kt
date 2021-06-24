class Anagram(private val word:String) {
    // TODO: implement proper constructor to complete the task

    fun match(anagrams: Collection<String>): Collection<String> {

      anagrams.filter {
          it.length==word.length
      }
              .filter { it.sortedChars()==word.sortedChars() }
        return anagrams
    }

    private fun String.sortedChars():List<Char> = this.toLowerCase().toCharArray().sorted()
}
