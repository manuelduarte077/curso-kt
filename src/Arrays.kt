fun main() {

    // Arrays
    diaSemana()

    println("Asignaturas")
    asignaturas()

}

fun diaSemana() {
    val diaSemanas = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    print(diaSemanas[3])

    diaSemanas.forEach {
        println(it)
    }

}

fun asignaturas () {


    val materias = arrayListOf<String>("Ingles", "Matemática", "Base de Datos", "Prograación1", "Ingenieria de software")
    materias.add("Marketing")
    materias.add("Comercio Electronico")

    // Este imprimer todos los datos que tiene el array
    materias.forEach {
        println(it)
    }


    // Aca solo imprimimos un item del arrar
    println(materias[5])
    // con el .set lo que hacemos es cambiar el valor actual por otro
    materias.set(5, "Arquitectura de datos")

    println(materias[5])

}