fun piramidaBintang(){
    val n = 7
    var spasi = 8-1
    for (i in 1..n){
        for (j in 1..spasi){
            print(" ")
        }
        spasi--
        for (j in 1..2*i-1){
            print("*")
        }
        println()
    }
}

fun piramidaBintangTerbalik(){
    val n = 8
    var spasi = n-8
    for (i in n downTo 1){
        for (j in 1..spasi){
            print(" ")
        }
        spasi++
        for (j in 1..2*i-1){
            print("*")
        }
        println()
    }
}

fun main() {
    piramidaBintang()
    piramidaBintangTerbalik()
}