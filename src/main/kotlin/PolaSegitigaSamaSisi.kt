class PolaSegitigaSamaSisi(ukuran:Int): Pola(ukuran) {
    override fun printPola() {
        for (i in 1..ukuran) {
            for (j in 1..(ukuran - i)) print(" ")
            for (j in 1..(2 * i - 1)) print("*")
            println()
        }
    }
}