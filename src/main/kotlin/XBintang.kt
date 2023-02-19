fun main() {
    val n = 7
    for (i in 1..n) {
        for (j in 1..n) {
            if (i == j || i == n-j+1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}