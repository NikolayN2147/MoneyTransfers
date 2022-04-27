
fun main() {
    val amount = 11000L
    var comission = amount * 0.0075
    if (comission < 35) comission = 35.0 else comission
    println("Комиссия за перевод: " + comission.toInt() + " руб. " + ((comission * 100) % 100).toInt() + " коп." )
}