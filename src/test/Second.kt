package test

fun main (){
    val (a,b,c) = readLine()!!.split(' ')
    println(calc(a.toInt(), b.toInt(), c.toInt()))
}
fun calc( a:Int,b:Int,c:Int): Int {
    var cC = c
    var bB = 0
    var aA = 0
    bB = if (cC >b+1){
        b
    }
    else{
        cC-1
    }
    aA = if(bB>a+1){
        a
    }
    else{
        bB-1
    }
    cC = bB+1
    if (bB<2){
            bB=2
    }
    if (aA<1){
        aA=1
    }
    if (cC<3){
        cC=3
    }
    return cC+bB+aA
}
