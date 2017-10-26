fun main(args: Array<String>) {
    var nome:String? = "Anisio" //TipoDeVariavel? indica que ela pode receber null
    println("Olá, $nome!")
    nome = null
    println("Olá, $nome!")
    println("$nome tem ${nome?.length} letras")  
	//variavel? -> passa null, caso o valor seja null
	//variavel!! -> força e pode exibir o famoso NullPointerException  
}