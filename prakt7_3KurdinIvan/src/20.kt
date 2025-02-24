fun main(){
    try{
    print("Введите внутрений радиус(r1):")
    val  r1 = readln()!!.toDouble()
    print("Введите внешний радиус(r2):")
    val  r2 = readln()!!.toDouble()
    val res = when{
        r1 == 1.0 || r2 == 1.0 -> "Ошибка"
        r1 < 0 || r2 < 0 -> "Ошибка"
        r1 >= r2 -> "Ошибка"
        else -> {
            val area = Math.PI * (r2 * r2 - r1 * r1)
            "Площадь кольца равна:$area"
        }
    }
    println(res)
    }catch (ex:Exception)
    {
        println("Ошибка")
    }
}