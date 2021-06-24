object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        var code = ""
        colors.filterIndexed { index, _ ->
            index < 2
        }
                .map {
                    code += when (it) {
                        Color.BLACK -> "0"
                        Color.BROWN -> "1"
                        Color.RED -> "2"
                        Color.ORANGE -> "3"
                        Color.YELLOW -> "4"
                        Color.GREEN -> "5"
                        Color.BLUE -> "6"
                        Color.VIOLET -> "7"
                        Color.GREY -> "8"
                        Color.WHITE -> "9"
                    }
                }
        return code.toInt()
    }
}
