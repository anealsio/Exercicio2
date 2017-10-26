fun toList(vararg args:String): List<String>{
    val list = ArrayList<String>()
    for (s in args)
        list.add(s)    
    return list
}
fun main(args: Array<String>){
    val list = toList("Ingrid","Leo","Bruno","Ariel","Julio","Amaury","Vinni","Daniel","Ravier")
	println(list)
}