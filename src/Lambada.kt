fun main(args:Array<String>){


    var li= listOf<Int>(10,2,5,9);

    li.stream().filter{it%2==0}.map { it*2 }.forEach(::println);
}