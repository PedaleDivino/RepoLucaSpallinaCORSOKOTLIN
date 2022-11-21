fun main(args: Array<String>) {
    println("Calcolatrice")

    println("inserisci numero 1")
    val numero1 = readLine()!!.toDouble()
    println("inserisci numero 2")
    val numero2 = readLine()!!.toDouble()

    println("Scegli un operazione...")
    println("somma")
    println("sottrazione")
    println("moltiplicazione")
    println("divisione")


    var scelta = readLine()!!.toString()
    when (scelta){

        "somma" -> {

            val somma = numero1 + numero2
            println("la somma e' $somma")

        }

        "sottrazione" -> {

            val sottrazione = numero1 - numero2
            println("la sottrazione e' $sottrazione")

        }

        "moltiplicazione" -> {

            val moltiplicazione = numero1 * numero2
            println("la moltiplicazione e' $moltiplicazione")

        }

        "divisione" -> {

            val divisione = numero1 / numero2
            println("la divisione e' $divisione")

        }

    }










}




/* if (nome!!contains("piero")){
    print("no piero")
}
 */