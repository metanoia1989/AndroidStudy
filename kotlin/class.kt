open class MyParentClass {
    val x = 5
}

class MyChildClass: MyParentClass() 
{
    fun myFUnction()
    {
        println(x)
    }
}

fun main() {
    val myObj = MyChildClass() 
    myObj.myFUnction()
}