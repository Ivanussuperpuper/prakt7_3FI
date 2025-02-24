fun main() {
    try {
        val V = readLine()!!.toDouble()
        val U = readLine()!!.toDouble()
        val t1 = readLine()!!.toDouble()
        val t2 = readLine()!!.toDouble()
        val Lake = V * t1
        val River = (V - U) * t2
        val Distance = Lake + River
        when {
            U >= V -> println("Скорость течения не может быть больше или равна скорости лодки в стоячей воде.")
            else -> println("Общий пройденный путь: $Distance км")
        }
    }catch (ex:Exception)
    {
        println("Ошибка")
    }
}