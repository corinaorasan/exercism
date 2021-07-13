class PhoneNumberValidator(phoneNumber: PhoneNumber) {

    private fun hasLengthEqualTen(phoneNumber: PhoneNumber): Boolean {
        return phoneNumber.number.length == 10
    }

    private fun hasValidAreaCode(phoneNumber: PhoneNumber): Boolean {
        return phoneNumber.areaCode.first() > '1'
    }

    private fun hasValidExchangeCode(phoneNumber: PhoneNumber): Boolean {
        return phoneNumber.exchangeCode.first() > '1'
    }
}