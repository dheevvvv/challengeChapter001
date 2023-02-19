fun bintangSiku (){
    val n = 9
    for (i in 1..n){
        for (j in 1..1*i-1){
            print("*")
        }
        println()
    }

}

fun main() {
    bintangSiku()
}