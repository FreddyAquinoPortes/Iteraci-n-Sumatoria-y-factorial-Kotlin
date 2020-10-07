//Sumatoria iterada
fun main(args:Array<String>)
{
var num=10

sumatoria(num)
fact(num)


}
fun sumatoria(num:Int)
{
    var sumatoria: Int=1
    for(i in 1..num)
    {
        sumatoria +=i.toInt()
    }

    println(sumatoria-1)

}
fun fact(num1:Int)
{
var fac: Int=1
    for(x in 1..num1)
    {
        fac *=x.toInt()
    }
    println(fac)

}