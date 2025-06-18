package lesson_2

fun main() {
    val hourOfDeparture = 9
    val minutesOfDeparture = 39
    val totalMinutesInTheWay = 457

    val totalMinute = totalMinutesInTheWay + minutesOfDeparture
    val hoursInTheWay = totalMinute / 60

    val minutesOfArrival = totalMinute % 60
    val hourOfArrival = hourOfDeparture + hoursInTheWay

    print("Время прибытия поезда -> %02d:%02d".format(hourOfArrival, minutesOfArrival))

}
