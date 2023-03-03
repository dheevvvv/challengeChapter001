class PolaSegitigaTerbalik(ukuran:Int):Pola(ukuran) {
    override fun printPola() {
        for (i in ukuran downTo 1) {
            printSpasi(ukuran - i)
            for (j in 1..(i * 2 - 1)) {
                print("*")
                printSpasi(0)
            }
            println()
        }
    }
}