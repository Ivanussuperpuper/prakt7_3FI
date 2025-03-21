fun main() {
    val k = readln().toInt()
    if (k < 100 || k > 999) {
        println("Введите трехзначное число")
        return
    }
    val a = k / 100
    val b = (k % 100) / 10
    val c = k % 10
    when {
        a == b && b == c -> println("Цифры образуют арифметическую прогрессию (равенство)")
        (b - a) == (c - b) -> println("Цифры образуют арифметическую прогрессию")
        else -> println("Цифры не образуют арифметическую прогрессию")
    }
}