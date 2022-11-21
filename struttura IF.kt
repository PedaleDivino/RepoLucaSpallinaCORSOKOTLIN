import java.util.*
fun main(args: Array<String>) {
    println("ora ci sarà un IF")
    println("inserisci un numero")
    var a = readLine()!!.toInt()
    var b = 1
    //val Lettore = Scanner(System.in);
    if (a > b){
        println(a)
    }
    else {
        println("hai rotto il codice")
    }

    if  (a == 100) {

    }
    else if (a in 90 .. 99){
        if (a in 95 .. 99) {

            println("A")

        } else if (a in 90 .. 94){

            println("A-")

        }
    }

    else if (a in 80 .. 89){
        if (a in 85 .. 89) {

            println("B")

        } else if (a in 80 .. 84){

            println("B-")

        }
    }
    else if (a in 70 .. 79){
        if (a in 75 .. 79) {

            println("C")

        } else if (a in 70 .. 74){

            println("C-")

        }
    }
    else if (a in 60 .. 69){
        if (a in 65 .. 69) {

            println("D")

        } else if (a in 60 .. 64){

            println("D-")

        }
    }
    else if (a in 50 .. 59){
        print("non sufficiente")
    }
}