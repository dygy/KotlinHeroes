package main

fun main () {
    val list = mutableListOf<Int>()
    val numberOfI = readLine()?.toInt()
    val values = readLine()?.split(" ")!!
    var i = 0
    var fails = 0;
    while (i < numberOfI!!) {
        val myVar = values[i].toInt()
        list.add(myVar)
        i++
    }
    i = 2
    //  println(list)
    while (i < list.size) {
        if (i > 4) {
            if (list[i] < list[i - 1] && list[i] < list[i - 2] || list[i] < list[i - 1] && list[i] < list[i - 3] || list[i] < list[i - 2] && list[i] < list[i - 3] || list[i] < list[i - 2] && list[i] < list[i - 4] || list[i] < list[i - 3] && list[i] < list[i - 4] || list[i] < list[i - 1] && list[i] < list[i - 4] || list[i] < list[i - 1] && list[i] < list[i - 5] || list[i] < list[i - 2] && list[i] < list[i - 5] || list[i] < list[i - 3] && list[i] < list[i - 5] || list[i] < list[i - 4] && list[i] < list[i - 5]) {
                fails++
            }
        } else if (i > 3) {
            if (list[i] < list[i - 1] && list[i] < list[i - 2] || list[i] < list[i - 1] && list[i] < list[i - 3] || list[i] < list[i - 2] && list[i] < list[i - 3] || list[i] < list[i - 2] && list[i] < list[i - 4] || list[i] < list[i - 1] && list[i] < list[i - 4] || list[i] < list[i - 3] && list[i] < list[i - 4]) {
                fails++
            }
        } else if (i > 2) {
            if (list[i] < list[i - 1] && list[i] < list[i - 2] || list[i] < list[i - 1] && list[i] < list[i - 3] || list[i] < list[i - 2] && list[i] < list[i - 3]) {
                fails++
            }
        } else {
            if (list[i] < list[i - 1] && list[i] < list[i - 2]) {
                fails++
            }

        }
        i++
        println(fails)
    }
}
