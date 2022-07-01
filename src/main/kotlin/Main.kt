fun main(args: Array<String>) {

    println("input should not be fraction")

    print("enter the first number:")
    val firstNo : String = readln()!!

    println("pleas enter your operator:")
    val operator : String = readLine()!!


    println("enter the second number:")
    val secondNo : String = readln()!!

    var res : Int = 0
    if (operator ==  "+"){
        res = firstNo.toInt() + secondNo.toInt()
    }
    else if (operator == "-" ){
        res = firstNo.toInt() - secondNo.toInt()
    }
    else if (operator == "*" ){
        res = firstNo.toInt() * secondNo.toInt()
    }
    else if (operator == "/" ){
        res = firstNo.toInt() / secondNo.toInt()
    }else {
        println("operator error !")
    }

  //  val res : Int = firstNo.toInt() - secondNo.toInt()

    println("Result is: $res")

}