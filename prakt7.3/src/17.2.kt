fun main() {
    val x1 = readLine()!!.toDouble()
    val y1 = readLine()!!.toDouble()
    val x2 = readLine()!!.toDouble()
    val y2 = readLine()!!.toDouble()
    val x3 = readLine()!!.toDouble()
    val y3 = readLine()!!.toDouble()
    val x4 = readLine()!!.toDouble()
    val y4 = readLine()!!.toDouble()
    val minX = minOf(x1, x2, x3, x4)
    val maxX = maxOf(x1, x2, x3, x4)
    val minY = minOf(y1, y2, y3, y4)
    val maxY = maxOf(y1, y2, y3, y4)
    val totalArea = (maxX - minX) * (maxY - minY)
    var firstQuadrantArea = 0.0
    when {
            maxX <= 0 || maxY <= 0 -> firstQuadrantArea = 0.0
            minX >= 0 && minY >= 0 -> firstQuadrantArea = totalArea
        else -> {
            val intersectX = maxOf(0.0, minX)
            val intersectY = maxOf(0.0, minY)
            firstQuadrantArea = (maxX - intersectX) * (maxY - intersectY)
        }
    }
    println("Площадь всего прямоугольника: $totalArea")
    println("Площадь части прямоугольника в первой четверти: $firstQuadrantArea")
}