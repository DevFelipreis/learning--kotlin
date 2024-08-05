fun main() {
    println("Digite a operação: Soma, Subtração, Divisão ou Multiplicação")
    val entrada: String = readln().toLowerCase()
    println("Digite o primeiro número")
    val number1 = readln().toDouble()
    println("Digite o segundo número")
    val number2 = readln().toDouble()

    when (entrada) {
        "soma" -> println(soma(number1, number2))
        "subtração" -> println(subtracao(number1, number2))
        "divisão" -> println(divisao(number1, number2))
        "multiplicação" -> println(multiplicacao(number1, number2))
        else -> println("Operação inválida")
    }
}

fun soma(a: Double, b: Double): Double {
    return a + b
}

fun subtracao(a: Double, b: Double): Double {
    return a - b
}

fun divisao(a: Double, b: Double): Double {
    return a / b
}

fun multiplicacao(a: Double, b: Double): Double {
    return a * b
}
