fun main(args:Array<String>){

    var al1:allien=allien("java");


    al1.show();
    al1=al1.plus();
    al1.show()



}

fun allien.plus():allien{
    var res:allien=allien("java");
    res.skill=this.skill+"sql";

      return res;

}