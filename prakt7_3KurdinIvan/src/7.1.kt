import kotlin.math.sqrt

fun main() {
    try {
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()

        when {
            (a + b <= c) || (a + c <= b) || (b + c <= a) -> {
                println("Треугольник с такими сторонами не существует.")
            }
            a <= 0 || b <= 0 || c <= 0 -> {
                println("Сторона треугольника не может быть меньше или равна 0.")
            }
            else -> {
                val s = (a + b + c) / 2
                val area = sqrt(s * (s - a) * (s - b) * (s - c))
                println("Площадь треугольника по формуле Герона: $area")
            }
        }
    }catch (ex:Exception)
    {
        println("Ошибка")
    }
}