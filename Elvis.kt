fun main ( args: Array<String>){
    println(enviarEmail("Anisio"))
    println(enviarEmail("Anisio","Bem Vindo, "))
}
fun enviarEmail(usuario: String, titulo: String? = null): String {
    val seNull = titulo?: "Welcome, " // ?: indica que se aquela variavel tiver o valor nulo ela recebera o valor que estiver logo ap�s, caso contraio ela manter� seu valor
    return "$seNull $usuario"
}