object BeerSong {

    const val type1="No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
    const val type2="1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"

    fun verses(startBottles: Int, takeDown: Int): String {
        var result = ""
        if (startBottles == 0) {
            result += if (startBottles == takeDown && startBottles != takeDown) "\n$type1"
            else type1
        }
        if (startBottles == 1) result += type2
        if (startBottles > 1) {
            result += "$startBottles bottles of beer on the wall, $startBottles bottles of beer.\nTake one down and pass it around, ${startBottles - 1} bottle${if (startBottles - 1 > 1) "s" else ""} of beer on the wall.\n${if (startBottles > takeDown) "\n" else ""}"
        }
        println(result)

        return result
    }
}
