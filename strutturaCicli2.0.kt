fun main(args: Array<String>) {

    for (UtenteID in 1 .. 2){                               // serve per inserire eventualmente più utenti se cambi 2 con N

        println("$UtenteID Inserisci il tuo Username")
        val Username = readLine()!!.toString()                    // richiede nome

        println("Dove vivi?")                                     // richiede luogo
        val Posto = readLine()!!.toString()

        var nomeAnimale:String?=""                                // richiede QUANTITA' ANIMALI
        println("Inserisci quanti animali hai")

        val numeroAnimali = readLine()!!.toInt()

        for (Animale in 1 .. numeroAnimali){
            println("Inserisci Animale")
            nomeAnimale = nomeAnimale + readLine()!!.toString() + " "
        }

        println("INFO")
        println("nome ->  $Username")
        println("Residenza -> $Posto")
        println("nome animale -> $nomeAnimale")

    }
}