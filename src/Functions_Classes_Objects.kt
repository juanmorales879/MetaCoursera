var name = ""

fun setName() {
     name = "Mike"
}

fun printName() {
    println(name)
}

fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars(i)
    }
}

fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

// Single expression functions
// fun triangleArea(width: Double, height: Double): Double = width * height / 2

fun main() {
    val area:Double = triangleArea(2.0,3.0)
    println(area)
    ascendingTriangle(5)
    setName()
    printName()
    lower()
}

fun lower(){
    println("Lower")
}