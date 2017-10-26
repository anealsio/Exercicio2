fun <T> toList(vararg args:  T): List<T>{ // T pode ser qualquer letra, é so pra indicar que aquilo pode ser de qualquer tipo
    val list = ArrayList<T>()
    for (s in args)
        list.add(s)    
    return list
}
fun main(args: Array<String>){
    // depois do toList<TipoDasVariaveisQueVoceVaiColocarNasListas>
    val list = toList<String>("Ingrid","Leo","Bruno","Ariel","Julio","Amaury","Vinni","Daniel","Ravier")
	println(list)
    val numeros = toList<Int>(0,1,2,3,4,5,6,7,8,9)
    println(numeros)
}