class Carro (nome: String, ano: Int){
    val nome: String
    val ano: Int
    init{
        //bloco de inicialização
        this.nome = nome
        this.ano = ano
    }
    override fun toString() = "Carro $nome, ano: $ano"
    
}
fun main (args: Array<String>){
    var anisio = Carro("Ferrari", 2017)
    println(anisio.toString())
}