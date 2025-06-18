package lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7

    println("Взлет ->>\n" +
            "Год: $year \n" +
            "Час: $hour \n" +
            "Минута: $minute \n")

    hour = 10
    minute = 55

    print("Посадка ->> %02d:%02d".format(hour, minute))
}