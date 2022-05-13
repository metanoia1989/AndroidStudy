fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    cars[0] = "Opel"
    println(cars[0])
    println(cars.size)

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exists!")
    }


    for (x in cars) {
        println(x)
    }


    for (chars in 'a'..'x') {
        println(chars)
    }

    for (nums in 5..15) {
        println(nums)
    }
}