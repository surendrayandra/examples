import java.util.*

fun main(args:Array<String>){

    var map=TreeMap<String,String>();

    map["1"]="name"
    map["2"]="address"

    for((id,name) in map){
        println("$id name is $name")
    }

}