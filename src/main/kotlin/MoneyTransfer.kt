fun main() {
    print("Введите сумму: ")
    val amount = readLine()?.toUInt() ?: return
    if(amount > 35U){
        val result = amount * 75u / 100u
        println("Комиссия при переводе $amount рублей составит " + (result / 100u) + " рублей "
              + (result % 100u) + " копеек")
    }else{
        println("Ошибка.Минимальная сумма перевода должна быть 35 рублей")
    }
}