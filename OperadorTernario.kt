fun parOuImpar(numero: Int) =
	if (numero % 2 == 0) "$numero é par" 
	else "$numero é impar"    


fun main ( args: Array<String>){
    println(parOuImpar(2))
    println(parOuImpar(3))
}