fun parOuImpar(numero: Int) =
	if (numero % 2 == 0) "$numero � par" 
	else "$numero � impar"    


fun main ( args: Array<String>){
    println(parOuImpar(2))
    println(parOuImpar(3))
}