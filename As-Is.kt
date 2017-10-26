fun main(args: Array<String>) {
    val nome:Any = "Anisio" 
    println(nome as String)
    println(nome as? Int)
    if (nome is String){
        println("$nome é uma String")
    }
}