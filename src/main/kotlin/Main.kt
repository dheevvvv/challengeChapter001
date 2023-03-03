fun main() {
    val ukuran = 5
    val polaSegitigaSamaSisi: Pola = PolaSegitigaSamaSisi(ukuran)
    val polaSgitigaSiku: Pola = PolaSgitigaSiku(ukuran)
    val polaPlus: Pola = PolaPlus(ukuran)
    val polaX: Pola = PolaX(ukuran)

    polaSegitigaSamaSisi.printPola()
    println()

    polaSgitigaSiku.printPola()
    println()

    polaPlus.printPola()
    println()

    polaX.printPola()
}