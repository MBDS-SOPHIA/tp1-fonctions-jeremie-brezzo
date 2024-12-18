fun afficherNombresPairsOuImpairs(x: Int, pair: Boolean) {
    var count = 0
    var num = if (pair) 0 else 1

    while (count < x) {
        println(num)
        num += 2
        count++
    }
}
afficherNombresPairsOuImpairs(5, true)
afficherNombresPairsOuImpairs(5, false)

fun afficherFibonacci(x: Int) {
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
afficherFibonacci(5)

fun factoriel(x: Int = 10): Int {
    if (x == 0 || x == 1) return 1
    return x * factoriel(x - 1)
}
println(factoriel(5)) // Affiche 120
println(factoriel()) // Affiche 3628800

fun afficherNombresPremiers(x: Int) {
    var count = 0
    var num = 2

    while (count < x) {
        if (estPremier(num)) {
            println(num)
            count++
        }
        num++
    }
}
fun estPremier(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
afficherNombresPremiers(5)



