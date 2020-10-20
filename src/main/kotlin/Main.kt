fun main() {
    val second = 14400
    val text = agoToText(second)
    println("был(а) в сети $text")
}

fun agoToText(second: Int): String {
    return when (second) {
        in 0..60 -> "только что"
        in 61..60 * 60 -> (second / 60).toString() + toMinutes(second / 60)
        in 3601..24 * 60 * 60 -> (second / 3600).toString() + toHours(second / 3600)
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> "сегодня"
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> "вчера"
        else -> "давно"
    }
}

fun toMinutes(minute: Int): String {
    return when (minute) {
        1, 21, 31, 41, 51 -> " минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> " минуты назад"
        else -> " минут назад"
    }
}

fun toHours(hours: Int): String {
    return when (hours) {
        1, 21 -> " час назад"
        2, 3, 4, 22, 23, 24 -> " часа назад"
        else -> " часов назад"
    }
}




