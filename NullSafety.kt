fun main(args: Array<String>) {
    var nome:String? = "Anisio" //TipoDeVariavel? indica que ela pode receber null
    println("Ol�, $nome!")
    nome = null
    println("Ol�, $nome!")
    println("$nome tem ${nome?.length} letras")  
	//variavel? -> passa null, caso o valor seja null
	//variavel!! -> for�a e pode exibir o famoso NullPointerException  
}