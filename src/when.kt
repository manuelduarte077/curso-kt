fun main() {
    // Dias de la semana

    println(semana(8))
    println(tipo('1'))

}

fun semana(dia: Int): String {

    return when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Esta semana no conincide"
    }

}

fun tipo (tipo:Any):String {

    return when (tipo) {
        is String -> "Es una variable de tipo String"
        is Int -> "Es un numero entero"
        is Boolean -> "Es un numero booleano"
        else -> "Estos numeros no estan en control"
    }

}