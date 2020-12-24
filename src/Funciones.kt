fun main(){

    /**
     * Funciones
     */

    sumar()
    persona("Manuel", "Duarte", 19)

}

fun sumar() {
    val num1 = 12
    val num2 = 12
    val resultadoo = num1.plus(num2)
    println(resultadoo)
}

fun persona (name:String, lastName:String, age:Int){
    val id = "Mi nombre es $name $lastName y tengo la edad de $age"
    println(id)
}
