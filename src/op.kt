

    fun main(args:Array<String>) {

        var num1: Int = 10
        var num2: Int = 50
        var out:Int

        var s:Student=Student()
        s.name="surendra"

        println("out ust us $num2")
        println("${s.name}")

        out=if(num1>num2)num1 else  num2

        println(out)

    }

