class Product(private val calories: Int, private val weight: Int) {
    fun getInfoString(): String {
        return "Calories: $calories, Weight: $weight grams"
    }

    fun calculateTotalCalories(): Int {
        return calories * weight
    }
}

fun main() {
    val product1 = Product(100, 200)
    val product2 = Product(150, 300)

    println("Product 1 info: ${product1.getInfoString()}")
    println("Total calories of product 1: ${product1.calculateTotalCalories()}")

    println("Product 2 info: ${product2.getInfoString()}")
    println("Total calories of product 2: ${product2.calculateTotalCalories()}")
}