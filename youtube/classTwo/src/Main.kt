fun main() {

val sexo = 'f' // 16-bits
    println(sexo)

    if(sexo == 'f'){
        println("Femino")
    } else{
        println("Masculino")
    }

    val name = "Felipe"
    val lastName = "Reis"
    val firstLetter = '\t' // dar espaço
    val secondLetter = '\n' // quebra linha

    val array = arrayListOf("João", "Pedro", "Sergio", 5)

    println(name +firstLetter+ lastName)
    println(name +secondLetter+ lastName)

    println(array[array.size-1])
    println(array[0])

    println(name.length)
    println(array.size)

}