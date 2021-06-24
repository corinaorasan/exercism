object Raindrops {

    fun convert(n: Int): String {
        var output = ""
        if(n%3==0) output += "Pling"
        if(n%5==0) output += "Plang"
        if(n%7==0) output += "Plong"
        return output.ifEmpty { n.toString() }
    }
}

