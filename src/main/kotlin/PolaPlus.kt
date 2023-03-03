class PolaPlus(ukuran:Int):Pola(ukuran) {
    override fun printPola() {
        for (i in 1..ukuran) {
            for (j in 1..ukuran) {
                if (i == ukuran/2 + 1 || j == ukuran/2 + 1) print("*") else print(" ")
            }
            println()
        }
    }
}