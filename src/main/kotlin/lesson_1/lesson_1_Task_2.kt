package lesson_1

fun main() {
    var numberOfOrders: Int
    var reviewText: String
    var numberOfEmployees = 2000

    numberOfOrders = 5
    reviewText = "Спасибо за качество"

    println("Кол-во заказов: $numberOfOrders \n" +
            "Описание отзыва: $reviewText")

//    println("Кол-во работников магазина: $numberOfEmployees")

    numberOfEmployees -= 1
    println("Кол-во работников магазина: $numberOfEmployees")
}