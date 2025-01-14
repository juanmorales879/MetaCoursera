import java.security.KeyStore.TrustedCertificateEntry

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    println(name)
    //name = "Java" error
    // values cannot be reassigned
    var lastname = "Jose"
    println(lastname)
    lastname = "Juan"
    println(lastname)
    // variables can be reassigned
    var age: Int = 24
    // You can specify a type but its not necessary
    // If a variable contains a string type you cannot reassign an Int type to it
    var x: Any = "Hello"
    //x = 42
    //x = True

    // You can use any for a variable that can use any type
    val i2 = 10  // this number is of type int
    val i3 = 10L // this number is of type long
    val i4 = 2_143_345 // you can also declare longs using separators
    val i5 = 10.0 // type double
    val i6  = 3.14F //type float
    println(i2)
    println(i3)
    println(i4)

    //You can transform number types to others
    val i: Int = 10
    val l: Long = i.toLong()
    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()

    // Operations between different numbers types
    val a = 1 + 2L // the type of a is Long
    val b = 1 + 2.0 // the type of b is Double
    val c = 1.0F + 2 // the type of c is Float
    val d = 1.0F + 2.0 // the type of c is Double

    // Dividing two integers
    val xyz = 5
    val yxv = 2
    println(xyz/yxv) //2
    println(xyz.toDouble()/yxv) //2.5

    // Prefix (executed before the equation is evaluated) and postfix (executed after equation is evaluated)
    //Postfix
    var p = 5
    var pos = 6 + p++ // returns 11
    var final = 6 + p // returns 12
    println(pos)
    println(final)
    //Prefix
    var pre = 5
    var pre1 = 6 + ++pre // returns 12
    var final2 = 6 + pre // returns 12
    println(pre1)
    println(final2)

    //Exercises

    println(123 + 456 * 789) // returns 359907
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9) // returns 141
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9) // returns 839
    println(13530.0 / 1.23) // returns 11000.0

    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println(totalScore)
    println(averageScore)

    val boostMultiplier= 4
    val scoreBoost= totalScore * boostMultiplier
    val finalBoostedScore = totalScore+scoreBoost
    println(scoreBoost)
    println(finalBoostedScore)

    // Char
    val character : Char = 'A'
    val age1 = 70
    val mystring = "My age is $age"
    val chartostring = character.toString() // character to strings
    val stringlength = chartostring.length
    val strings = "Hello"
    val find = strings.startsWith("Hel")
    val find2 = strings.endsWith("llo")
    val firstchar = strings.first()
    val lastchar = strings.last()
    val equals = strings.equals("Hello") //returns true or false
    val upper = strings.uppercase()
    val lower = strings.lowercase()
    val subs = strings.substring(1)

    // Booleans
    var cooked: Boolean = true
    // AND
    println("A" == "A")
    print(true && true)  // true
    print(true && false)  // false
    print(false && true)  // false
    print(false && false)  // false
    // OR
    print(true || true)  // true
    print(true || false)  // true
    print(false || true)  // true
    print(false || false)  // false
    //NOT
    println(!true) // false
    println(!!true) // true
    println(!!!true) // false
    println(!!!!true) // true
    println(!!!!!true) // false




}