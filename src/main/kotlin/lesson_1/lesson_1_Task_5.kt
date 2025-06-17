package lesson_1

fun main() {
    var seconds = 6480
    var minutes: Int
    var hour: Int

    minutes = seconds / 60 // 108
    hour = minutes / 60 //1
    minutes %= 60 // 48
    seconds %= 60 // 0

    println(hour)
    println(minutes)
    println(seconds)
}