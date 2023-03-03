class PolaSgitigaSiku(ukuran:Int):Pola(ukuran) {
    override fun printPola() {
        for (i in 1..ukuran) {
            for (j in 1..i) print("*")
            println()
        }
    }
}