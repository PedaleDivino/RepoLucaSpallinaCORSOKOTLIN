fun main(args: Array<String>) {
    println("scegli tra:")
    println("Mazda")
    println("Toyota")
    println("Nissan")
    println("Honda")
    println("")

    val IDAuto = readLine()!!.toString()

    when(IDAuto){
        "Mazda" -> {
            println("hai scelto RX-7")
        }

        "Toyota" -> {
            println("hai scelto Supra")
        }

        "Nissan" -> {
            println("hai scelto R33")
        }

        "Honda" -> {
            println("hai scelto S2000")
        }
    }


}