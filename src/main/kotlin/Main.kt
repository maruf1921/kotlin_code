fun main(args: Array<String>) {

    run myReturn@{

        do{
            print("enter the first number:")
            val firstNo : String = readln()!!

            if (firstNo=="exit"){
                return@myReturn
            }

            println("pleas enter your operator:")
            val operator : String = readLine()!!


            println("enter the second number:")
            val secondNo : String = readln()!!

            var res : Double = 0.0
            when (operator){

                "+" ->{
                    res = firstNo.toDouble()+ secondNo.toDouble()
                }
                "-" ->{
                    res = firstNo.toDouble() - secondNo.toDouble()
                }
                "*" ->{
                    res = firstNo.toDouble() * secondNo.toDouble()
                }
                "/" ->{
                    res = firstNo.toDouble() / secondNo.toDouble()
                }
                else ->{
                    println("operator error !")
                }

            }
            println("Result is: $res")
        }while(true)
    }

}