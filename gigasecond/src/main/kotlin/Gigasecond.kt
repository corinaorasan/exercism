import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(startDateTime: LocalDateTime) {

    constructor(myDate: LocalDate) : this(myDate.atStartOfDay())

    private val gigasecond = 1_000_000_000L
    val date: LocalDateTime = startDateTime.plusSeconds(gigasecond)

}
