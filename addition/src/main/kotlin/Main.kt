fun addition() {
    println("შემოიყვანე პირველი შესაკრები:")
    var x = readLine()
    println("შემოიყვანე მეორე შესაკრები:")
    var y = readLine()
    var z = x!!.toDouble() + y!!.toDouble()
    if (z==z.toInt().toDouble()){
        println( "X და Y ჯამი არის: ${z.toInt()}")
    }
    else{
        println( "X და Y ჯამი არის: $z")
    }
    println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
    var ANSWER = readLine()
    while (ANSWER == "დიახ"){
        println("შემოიყვანე პირველი შესაკრები:")
        x = readLine()
        println("შემოიყვანე მეორე შესაკრები:")
        y = readLine()
        z = x!!.toDouble() + y!!.toDouble()
        if (z==z.toInt().toDouble()){
            println( "X და Y ჯამი არის: ${z.toInt()}")
        }
        else{
            println( "X და Y ჯამი არის: $z")
        }
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        ANSWER = readLine()
    }
}

fun main() {
    addition()
}