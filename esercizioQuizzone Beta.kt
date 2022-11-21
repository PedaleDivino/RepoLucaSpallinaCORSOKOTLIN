import java.util.ArrayList
import kotlin.system.exitProcess

fun main() {                                                // Funzione main APERTURA

    var exit = false
    while (exit == false) {

        println("sei utente o amnistratore? 'admin' / 'user' ")
        println("")
        var answer = ""
        val usernameAdmin = "root"                              // Instanzio credenziali ADMIN
        val pswAdmin = "toor"                                   // Instanzio credenziali ADMIN
        var try1 = false                                        // try1 servirà per uscire dal primo me
        var domande: ArrayList<String> = ArrayList<String>()   // Dichiaro ARRAY DI DOMANDE
        var risposte: ArrayList<String> = ArrayList<String>()   // Dichiaro ARRAY DI DOMANDE

        while (try1 == false) {                         // primo menu con ciclo while SE UTENTE O ADMIN


            answer = readLine()!!.toString()


            if (answer.equals("user")) {                       // INIZIO IF USER nel PRIMO MENU


                var menuChoice = 0
                menuChoice = readLine()!!.toInt()

                when (menuChoice) {                              // menu user quiz || exit

                    1 -> {
                        println("Fai il Quiz")                       // SCELTA (1) QUIZ INIZIO

                        if (domande.size <= 0) {                             // IF di presenza delle domande se non ci sono torna alla scelta nel menu

                            println("non ci sono domande al momento, l'amnistratore non ha preparato il test")

                        } else {                                              // se ci sono le domande, continua e fa il quiz

                            println("inizio del test...")
                            println(domande.size)


                            try1 == true
                        }


                    }                                                   // scelta (1) QUIZ FINE

                    2 -> {
                        println("esci")                              // scelta (2) ESCI

                        System.exit(-1)
                    }                                           // FINE SCELTA (2) ESCI

                }                                              // IF dell'utente mel primo menu FINE


                try1 == true                            // IF DELL'USER FINE, con uscita dal CICLO

            }                                           // FINE IF DELL'USER nel PRIMO MENU

            else if (answer.equals("admin")) {         // APERTURA ELSE IF è UN admin nel primo menu

                println("controllo username e password...")
                println("inserisci username...")
                var usernameChance =
                    ""                             // inizializzo stringa VUOTA (username) per ADMIN affinchè dià un INPUT
                usernameChance = readLine()!!.toString()            // inserimento USERNAME ADMIN
                println("inserisci password")
                var pswChance =
                    ""                                  // inizializzo stringa VUOTA (password) per ADMIN affinchè dià un INPUT
                pswChance = readLine()!!.toString()                 // inserimento PASSWORD ADMIN
                var try1Admin = false                               // var per ciclo controllo credenziali ADMIN

                while (try1Admin == false) {                                             // ciclo controllo credenziali ADMIN

                    if (usernameChance.equals(usernameAdmin) && pswChance.equals(pswAdmin)) {         // se le credenziali sono corrette, menu admin con CRUD

                        println("username e password corretti.")

                        var menuAdminChoice =
                            0                     // inizializzo variabile a 0 per la scelta da fare nel menu
                        println("scegli un opzione:")
                        println("Aggiungi domande : 1")
                        println("Modifica domande : 2")
                        println("Elimina domande : 3")
                        println("Esci : 4")
                        menuAdminChoice = readLine()!!.toInt()      // lettura da input della variabile menuAdminChoice
                        var try2Admin =
                            false                       // inizializzo variabile a FALSE per uscita dal ciclo
                        var sceltaContinua =
                            ""                     // inizializzo stringa vuota per permettere all'ADMIN di continuare con le operazioni a menu

                        when (menuAdminChoice) {                              // menu CRUD scelta 1,2,3,4


                            1 -> {                                              // APERTURA AGGIUNGI DOMANDE
                                var domandaAdmin = ""                               // inizializzo stringa vuota per poter aggiungere domanda da INPUT
                                var rispostaAdmin = ""                               // inizializzo stringa vuota per poter aggiungere domanda da INPUT



                                while (try2Admin == false) {                        // INIZIO CICLO WHILE per poter continuare ad aggiugere domande o meno

                                    println("Aggiungi una domanda")
                                    domandaAdmin = readLine()!!.toString()              // popolo variabile domandaAdmin con INPUT da ADMIN
                                    domande.add(domandaAdmin)                           // utilizzo del metodo add per aggiungere domande nell'array 'domande'
                                    println("Aggiungi una risposta")
                                    rispostaAdmin = readLine()!!.toString()
                                    risposte.add(rispostaAdmin)
                                    println("continuare? y/n")
                                    sceltaContinua =
                                        readLine()!!.toString()            // richiedo da input se continuare o meno con utilizzo della variabile sceltaContinua


                                    if (sceltaContinua.equals("y")) {                   // se "y" non va fuori dal CICLO WHILE a R.92
                                        try2Admin = false
                                    }                                                   // fine prima condizione
                                    else {                                               // qualsiasi cosa tu scriva starà dentro il CICLO WHILE R.92
                                        try2Admin = true
                                    }                                                   // fine seconda condizione

                                }                                                   // FINE CICLO WHILE per poter continuare ad aggiugere domande o meno
                            }                                                   // CHIUSURA AGGIUNGI DOMANDE


                            2 -> {                                              // APERTURA MODIFICA DOMANDE

                                while (try2Admin == false) {                        // INIZIO CICLO WHILE per poter continuare a modificare domande o meno

                                    println("Modifica domande")
                                    println("quale domanda vuoi modificare")
                                    var i = 0
                                                                                   // inizializzo variabile vuota per poter modificare domanda scelta da INPUT
                                    println(domande.size)                            // mostra array domande tramite il metodo .size
                                    i = readLine()!!.toInt()                            // legge da INPUT l'indice dell'array delle domande. così che possa modificare la domanda richiesta
                                    println(domande.get(i))                             // lettura INDICE array, corrispondenza con la domanda scelta
                                    println("modifica la domanda...")
                                    var newQuestion = ""                                // inizializzo stringa vuota per poter modificare domanda da INPUT
                                    newQuestion = readLine()!!.toString()
                                    domande.set(i, newQuestion)                         // utilizzo del metodo .set per modificare domanda dell'array in posizione [i]
                                    println("domanda : $newQuestion , impostata con successo!")

                                    println(risposte.get(i))                             // lettura INDICE array, corrispondenza con la domanda scelta
                                    println("modifica la risposta...")
                                    var newAnswer = ""                                // inizializzo stringa vuota per poter modificare domanda da INPUT
                                    newAnswer = readLine()!!.toString()
                                    risposte.set(i, newAnswer)                         // utilizzo del metodo .set per modificare domanda dell'array in posizione [i]
                                    println("risposta : $newAnswer , impostata con successo!")


                                    // script molto utile poichè è possibile allacciare l'array delle domande con quelle delle risposte
                                    // indirettamente utilizzando 'i' come posizione sia per l'uno che per l'altro
                                    // l'utente è, cosi, costretto a dover modificare la domanda voluta con la conseguente risposta.


                                    println("continuare? y/n")                          // richiesta di continuare a modificare domande
                                    sceltaContinua =
                                        readLine()!!.toString()            // richiedo da input se continuare o meno con utilizzo della variabile sceltaContinua


                                    if (sceltaContinua.equals("y")) {                   // se "y" non va fuori dal CICLO WHILE a R.120
                                        try2Admin = false                                // fine prima condizione
                                    } else {                                               // qualsiasi cosa tu scriva starà dentro il CICLO WHILE R.92
                                        try2Admin = true
                                    }                                                   // fine seconda condizione
                                }                                                   // FINE CICLO WHILE per poter continuare a modificare domande o meno


                            }                                                   // CHIUSURA MODIFICA DOMANDE


                            3 -> {                                              // APERTURA ELIMINA DOMANDE
                                println("Elimina domande")
                                println("quale domanda vuoi eliminare")
                                var die = 0                                             // inizializzo variabile vuota per poter eliminare domanda scelta da INPUT
                                println(domande.size)                                   // mostra array domande tramite il metodo .size
                                die = readLine()!!.toInt()                              // legge da INPUT l'indice dell'array delle domande. così che possa eliminare la domanda richiesta
                                domande.removeAt(die)                                   // utilizzo del metodo .removeAt per eliminare domanda dell'array in posizione [i]
                                risposte.removeAt(die)

                            }                                                   // CHIUSURA ELIMINA DOMANDE

                            4 -> {                                              // APERTURA DELL'EXIT
                                println("Esci")
                                var usernameChance = ""
                                var pswChance = ""
                                try1Admin == false
                                exit == false
                                // OR system.exit(-1)
                            }                                                   // CHIUSURA DELL'EXIT

                        }                                               // CHIUSURA WHEN menu CRUD scelta 1,2,3,4 r.85


                    } // CHIUSURA se le credenziali sono corrette, menu admin con CRUD r.71

                    else {                      // APERTURA IF ADMIN, ELSE RI-TENTA CREDENZIALI

                        println("errore, riprova...")
                        println("inserisci username...")
                        usernameChance = readLine()!!.toString()            // inserimento USERNAME ADMIN
                        println("inserisci password")
                        pswChance = readLine()!!.toString()
                        try1Admin == false              // utilizzo var per ciclo controllo credenziali ADMIN, torna nel ciclo while r 69 per poter riscrivere credenziali

                    }
                }                               // CHIUSURA CONTROLLO credenziali ADMIN CICLO WHILE

                try1 == true

            }                               // CHIUSURA ELSE IF è UN admin nel primo menu


            else {            // apertura else di errore del primo menu

                println("errore ripeti: ")
                println("sei utente o amnistratore? 'admin' / 'user")
                try1 == false


            }                   // chiusura else di errore del primo menu

        }                       // chiusura while del primo controllo sul menu


    }


}   // fine MAIN


/* sei utente o admin? entri o esci
USER
FA QUIZ O ESCE

ADMIN
dammi psw e nome + controllo
controllo, aggiungi elimna domande O ESCE



Creare un sistema di login per due tipologie



- Utente:   Verrà riportato al menu per eseguire il quiz o uscire

- Admin:  Verrà riportato a un menu per : AGGIUNGERE, RIMUOVERE  E VISUALIZZARE le domande e uscire





All'utente quando finisce il corso dovrà uscire il suo risultato e non potrà ripetere il test

Il test dev'essere almeno di 4 domande con 3 risposte

Alla fine del test gli utenti torneranno al login
 */