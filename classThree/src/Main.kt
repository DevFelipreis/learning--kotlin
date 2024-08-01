fun main() {
    var message = "Olá Felipe.\tSeu produto chegou"
    println(message)
    message = "Olá Felipe.\nSeu produto chegou"
    println(message)

    var welcome = """
        Olá, Felipe.
        Seu produto chegou
        """
    println(welcome)


    val string = "Felipe"
    println(string.toLowerCase())
    println(string.toUpperCase())

    message = "      Olá Felipe. Seu produto chegou"
    println(message.trim())

    var csv = """
        Olá, Felipe.
        Seu produto chegou
        """.replaceIndent(newIndent = "-")
    println(csv)

    val name = "Felipe"
    val age = 32
    val price: Double = 1.99
    val moeda = { price: Double -> if (price <= 2.0) "real" else "reais" } //lambda
    println("Olá $name. Sua idade é $age. Sua compra é de $price ${moeda(price)}")

    val compra = 20_000.99
    var desconto=0
    var valorDesconto = 0.0
    var totalCompra = 0.0

    if(compra > 20_000 && compra < 50_000){
        desconto = 10
        totalCompra = compra-((compra*desconto)/100)
        valorDesconto = compra*desconto/100
        println("""Você ganhou $desconto% (R$ ${"%.2f".format(valorDesconto)})
        de desconto. Total da sua compra R${'$'} ${"%.2f".format(totalCompra + 0.01)}
        """.trimMargin())
    } else if(compra > 50_000){
        desconto = 25
        totalCompra = compra-((compra*desconto)/100)
        valorDesconto = compra*desconto/100
        println("""Você ganhou $desconto% (R$ ${"%.2f".format(valorDesconto)})
        de desconto. Total da sua compra R$ ${"%.2f".format(totalCompra+0.01)}
        """.trimMargin())
    }else{
        println("Vocè não ganhou desconto. Total da sua compra R$ ${"%.2f".format(compra)}")
    }

}