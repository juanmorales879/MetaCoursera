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

// Classes

class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
)

class Dog(val name: String) {
    var hunger = 62
}

fun feed(dog: Dog) {
    println("Feeding ${dog.name}")
    dog.hunger = 0
}

class Dog2(val name: String) {

    var hunger = 62

    fun feed2() {

        val currentDog: Dog2 = this

        println("Feeding ${currentDog.name}")

        currentDog.hunger = 0
    }
}

class User(var name: String) {

    fun changeName(name: String) {

        println("Changed name from ${this.name} to $name")

        this.name = name
    }
}



fun main() {
    val area:Double = triangleArea(2.0,3.0)
    println(area)
    ascendingTriangle(5)
    setName()
    printName()
    lower()

    val remigiuszFrost = Teacher(name = "Remigiusz", surname = "Frost", birthday = "23.07.1987", status = "ACTIVE")
    val biology1 = Subject(name = "Biology 1", teacher = remigiuszFrost, isObligatory = true)
    println(biology1.isObligatory) // true
    println(biology1.teacher.birthday) // 23.07.1987
    println(biology1.teacher.status) // ACTIVE

    val dog = Dog(name= "Rex")
    feed(dog) // Feeding Rex
    println(dog.hunger) // 0

    val Dog2 = Dog2("Rex")
    Dog2.feed2()

    val user = User("Alpha") // Changed name from Alpha to Beta
    user.changeName("Beta") // Beta
    println(user.name)


}

fun lower(){
    println("Lower")
}