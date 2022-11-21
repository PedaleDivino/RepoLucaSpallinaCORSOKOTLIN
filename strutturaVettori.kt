import java.util.ArrayList

fun main() {
    /*println("Pets app")
    println("Inserisci numero animali: ")
    val valoreMax = readLine()!!.toInt()            // richiesta all'utente di ins
    var listaDiAnimali:Array<String?> = Array(valoreMax){""}
    for (i in 0 until valoreMax){
        println("Inserisci nome dell'animale $i")
        listaDiAnimali[i] = readLine()!!.toString()

    }

    println("I tuoi animali sono in un array...")
    for (i in 0 until valoreMax){
        println("Animale: $i: ${listaDiAnimali[i]}")
    }*/


    var listaDiAnimali1 : ArrayList<String> = ArrayList<String>()
    var b = 0
    println("Quanti animali vuoi inserire? ")
    b = readLine()!!.toInt()

    for (b in listaDiAnimali1){

        println("Inserisci animale ")
        listaDiAnimali1.add(readLine()!!.toString())
        println(listaDiAnimali1)

    }



}