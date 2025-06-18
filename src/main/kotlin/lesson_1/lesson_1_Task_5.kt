package lesson_1

fun main() {
    var seconds = 6480
    var minutes: Int
    var hours: Int

    minutes = seconds / 60 // 108
    hours = minutes / 60 //1
    minutes %= 60 // 48
    seconds %= 60 // 0

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}