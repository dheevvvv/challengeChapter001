fun main() {
    val ukuran = 7
    val polaSegitigaSamaSisi = PolaSegitigaSamaSisi(ukuran)
    val polaSgitigaSiku = PolaSgitigaSiku(ukuran)
    val polaPlus = PolaPlus(ukuran)
    val polaSegitigaTerbalik = PolaSegitigaTerbalik(ukuran)
    val polaX = PolaX(ukuran)
    val polaWajikBelahKetupat = PolaWajikBelahKetupat(ukuran)

    polaSegitigaSamaSisi.printPola()
    println()

    polaSgitigaSiku.printPola()
    println()

    polaPlus.printPola()
    println()

    polaSegitigaTerbalik.printPola()
    println()

    polaX.printPola()
    println()

    polaWajikBelahKetupat.printPola()
    println()
}