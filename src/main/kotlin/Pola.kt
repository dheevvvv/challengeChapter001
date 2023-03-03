abstract class Pola(protected val ukuran:Int) {
    abstract fun printPola()
    protected fun printSpasi(count: Int) {
        for (i in 1..count) {
            print(" ")
        }
    }
}