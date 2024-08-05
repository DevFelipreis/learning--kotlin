# Aprendendo Kotlin

Atualmente, estou estudando Kotlin, uma linguagem de programação moderna que torna os desenvolvedores mais felizes. Aqui estão alguns dos conceitos e tópicos principais que tenho explorado:

## Tópicos Abordados

- **Sintaxe Básica**: Compreendendo a estrutura e os elementos básicos dos programas em Kotlin.
- **Variáveis e Tipos de Dados**: Aprendendo sobre diferentes tipos de dados e como declarar variáveis.
- **Funções**: Criando e utilizando funções, incluindo funções de ordem superior.
- **Controle de Fluxo**: Usando `if`, `when`, loops e outros construtos de controle de fluxo.
- **Coleções**: Trabalhando com listas, conjuntos, mapas e outros tipos de coleção.
- **Classes e Objetos**: Compreendendo conceitos de programação orientada a objetos em Kotlin.
- **Extensões**: Usando funções de extensão e propriedades para adicionar funcionalidade a classes existentes.
- **Corrotinas**: Aprendendo sobre a abordagem do Kotlin para programação assíncrona.

## Código de Exemplo

Aqui está um exemplo simples de um programa em Kotlin que realiza operações aritméticas básicas:

```kotlin
import kotlin.math.pow

fun main() {
    println("Digite a operação: Soma, Subtração, Divisão, Multiplicação ou Potenciação")
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
        "potenciação" -> println(potenciacao(number1, number2))
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

fun potenciacao(a: Double, b: Double): Double {
    return a.pow(b)
}
```

## Recursos

- [Documentação do Kotlin](https://kotlinlang.org/docs/home.html)
- [Kotlin Programming by Big Nerd Ranch](https://www.bignerdranch.com/books/kotlin-programming/)
- [Kotlin for Android Developers](https://antonioleiva.com/kotlin-android-developers-book/)

## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato comigo em [lfreis.contato@gmail.com].

Feliz codificação!


