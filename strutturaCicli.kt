fun main(args: Array<String>) {
    println("FOR LOOP")
    for (i in 11..10 step 2){
        println("LOOP counter $i")
    }
    println("WHILE LOOP")

    var i = 11
    while (i <= 10){
        println("WHILE counter $i")
        i += 2
    }

    println("DO WHILE LOOP")

    i=11
    do {
        println("DO WHILE Counter $i")
        i += 2
    } while (i <= 10)
}