class PolaWajikBelahKetupat(ukuran:Int):Pola(ukuran) {
    override fun printPola() {
        for (i in 1..ukuran) {
            printSpasi(ukuran - i)
            for (j in 1..(i * 2 - 1)) {
                print("*")
            }
            println()
        }
        for (i in (ukuran - 1) downTo 1) {
            printSpasi(ukuran - i)
            for (j in 1..(i * 2 - 1)) {
                print("*")
            }
            println()
        }
    }
}