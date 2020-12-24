fun main() {

    /**
     * las listas son como los array pero con mas ventajas nos permite
     *  Agregar
     *  Quitar
     *  y muchos mas
     */

    /**
     *  Listas Mutables
     *  Listas Inmutables
     */

    // inmutables
    diasSemana()

    // mutables
    curso()
    println()

}

fun diasSemana() {
    val diasSemanas: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(diasSemanas.size)

    println(diasSemanas)

}

fun curso() {
    var cursos: MutableList<String> = mutableListOf("Goolang", "Ruby")
    cursos.add("Marketig")
    cursos.add("Kotlin")
    println(cursos) // Los Mostramos hasta aca los 2 que agregamos
    cursos.add(0, "PHP") // Remplazamos el valor de la posicion 0 por otro valor

    val cursoVacios: MutableList<String> = mutableListOf()
    println(cursoVacios)

    cursos.forEach {
        cursoVacios.add(it + ":")
    }

    println(cursos)
    println(cursoVacios)

}