package test

fun main (){
    var list = mutableListOf<Int>()
    val numberOfI = readLine()?.toInt()
    var i = 0
    while (i< numberOfI!!){
        readLine()?.toInt()?.let { list.add(it) }
        i++
    }
    for (item: Int in list) {
    println(deside(item))
    }
}
fun deside( int: Int): Int {
    var value = int
    var turns = 0
    while (value>=6){
        value-=6
        turns++
    }
    while (value>=5){
        value-=5
        turns++
    }
    while (value>=4){
        value-=4
        turns++
    }
    while (value>=3){
        value-=3
        turns++
    }
    while (value>=2){
        value-=2
        turns++
    }
    while (value>=1){
        value-=1
        turns++
    }
    return turns;
}
