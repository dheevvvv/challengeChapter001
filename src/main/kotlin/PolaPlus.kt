class PolaPlus(ukuran:Int):Pola(ukuran) {
    override fun printPola() {
        for (i in 1..ukuran) {
            for (j in 1..ukuran) {
                if (j == i || j == ukuran - i + 1) print("*") else print(" ")
            }
            println()
        }
    }
}