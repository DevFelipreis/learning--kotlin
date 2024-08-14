fun main() {
    var endereco: String? = "Imac"
    val comprimentoEndereco = endereco?.length
    println(comprimentoEndereco)

    var endereco2: String = "Rua A"
    val qtdCaracteres = endereco2.length
    println(qtdCaracteres)

    var endereco3: String? = null
    var comprimentoEndereco3 = endereco3?.length ?: 0 // operador Elvis
    println(comprimentoEndereco3)
    endereco3= "Felipe"
    comprimentoEndereco3 = endereco3?.length ?: 0 // operador Elvis
    println(comprimentoEndereco3)

   var funcao:Int = soma(2,3)
    println(funcao)

}

fun soma(a:Int,b:Int):Int{
    return a + b
}