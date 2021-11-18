
fun main(arg : Array<String>){

    var s:String?=null

    println(s?.length)


    var age:Int=10;

    var m:String=""

   m= when(age){

        10->"child"
        20->"young"
        else->"sss"

    }
    println(m)


}