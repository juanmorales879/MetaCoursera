
// Interfaces & Polymorphism
interface Animal

class Dogs(val name: String) : Animal {
    fun retrieve(item: String) {
        println("Retrieving $item")
    }
}

class Cats(val name: String) : Animal

fun play(animal: Animal) {
    if (animal is Dogs) {
        animal.retrieve("stick")
    } else {
        println("I do not know how to play with this animal")
    }
}

// Open classes

open class Mammal {
    fun feedChildren() {}
}
class Doggy: Mammal() {
    fun fetchStick() {}
}

fun feed(mammal: Mammal) {
    mammal.feedChildren()
}

fun main() {
    play(Dogs("Rex")) // Retrieving stick
    play(Cats("Garfield")) // // I do not know how to play with this ani

    val dog = Doggy()
    dog.feedChildren()
    dog.fetchStick()
    feed(dog)

}