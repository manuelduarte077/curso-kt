fun main() {

    var perro: Boolean = true
    var ressultado = 22 + 25

    if (ressultado > 20) {
        println("Mayor que 20")
    } else {
        println("Menor que 20")
    }

    mascota()

}

// Mascotas
 fun mascota() {
     val animal = "Leon"
    val raza = "Labrador"

    if (animal == "Perro" || raza == "Labrador") {
        print("Si es mi perro")
    } else if (animal == "Gato") {
        print("Este es mi gato")
    } else if (animal == "Raton") {
        print("Este es mi raton")
    } else {
        print("Esas no son mis mascotas")
    }
 }