class PhoneNumber(cleanNumber: CleanNumber) {

    var areaCode: String = cleanNumber.number.take(3)

    var exchangeCode: String  = cleanNumber.number.substring(3, 5)

    var subscriberNumber: String = cleanNumber.number.takeLast(4)

    var number = areaCode + exchangeCode + subscriberNumber

}

