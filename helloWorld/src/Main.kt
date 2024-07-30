fun main() {

    val price: Double = 31.90 // 64-bit ponto flutuante(floating point)
    val desconto: Float = 31.90f // 32-bit
    val byte: Byte = 8 //8-bit
    val short: Short = 16 // 16-bit
    val age: Int = 31 // 32-bit (99% do tempo)
    val long: Long = 22222222222222 // 64-bit
    val product: String  = "Imac"

    val nomes = listOf("Felipe", "Eduardo")
    val idades = listOf(31, 1)

    for (i in nomes.indices) {

        if(idades[i] > 1){
            println("${nomes[i]} tem ${idades[i]} anos")
        }else{
            println("${nomes[i]} tem ${idades[i]} ano")
        }
    }

    println(nomes::class)
}
