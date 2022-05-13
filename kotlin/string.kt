var txt: String = "Hello"

fun main() {
    println(txt[0]); println(txt[1])
    println(txt.uppercase()) 
    println(txt.lowercase()) 
    println(txt.compareTo("hel"))
    println(txt.indexOf("hel"))
    println(txt.plus(" World"))

    var firstName = "Adam"
    var lastName = "Smith"
    println("My name is $firstName $lastName")
}