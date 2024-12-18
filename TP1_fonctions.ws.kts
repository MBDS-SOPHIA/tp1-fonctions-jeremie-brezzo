fun PairsouImpairs(x: Int, pair: Boolean) {
    var count = 0
    var num = if (pair) 0 else 1

    while (count < x) {
        println(num)
        num += 2
        count++
    }
}
PairsouImpairs(5, true)
PairsouImpairs(5, false)

fun fibo(x: Int) {
    var a = 0
    var b = 1
    var count = 0

    while (count < x) {
        println(a)
        val temp = a
        a = b
        b = temp + b
        count++
    }
}
fibo(5)

fun facto(x: Int = 10): Int {
    if (x == 0 || x == 1) return 1
    return x * facto(x - 1)
}
println(facto(5)) 
println(facto()) 

fun affiche_nombre_premier(x: Int) {
    var count = 0
    var num = 2

    while (count < x) {
        if (est_premier(num)) {
            println(num)
            count++
        }
        num++
    }
}
fun est_premier(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
affiche_nombre_premier(5)



