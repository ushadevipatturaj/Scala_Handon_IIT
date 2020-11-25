
val z ="Hello"

val my_imx:Int = 10
var my_mutx:Int = 20
val myname:String = "hi"

val (myname:String, myage:Int) = ("usha",28)

print(myname)

val state:String = "New York"

val principal:Int = 500
val interest_rate:Int = 12
val years:Int =5
val interest = principal * interest_rate * years /100

object Hello{
    def main(args: Array[String]){
        var str: String = "hello"
        println(str)
        str = "hello all"
        println(str)
        str.concat(" there")
        println(str)
        str = str.concat(" there")
        println(str)
    }
}

Hello.main(Array())

object STringInterpolation{
    def main(args: Array[String]){
        val floatval = 1.70
        val str = "hello all"
        val intval = 5000
        printf("the value of float value is %2.3f and the integer value is %d and the string value is %s\n",floatval,intval,str)
        println(s"the value of float value is $floatval and the integer value is $intval and the string value is $str")
        println(f"the value of float value is $floatval%2.3f and the integer value is $intval%d and the string value is $str%s")
        println(raw"ln is used to give new line")   
    }
}

STringInterpolation.main(Array())

// String Functions
//length
// concat
// charAt
// replace
// replaceAll
// split
// substring
println("String Functions")
var str1:String = "one"
val str2 :String = str1.concat(" two")
println(s"concat one + two is: $str2")
println(s"length of str2: ${str2.length()}")
println(s"chatAt 5th position is : ${str2.charAt(4)}")
val str3 = "Airplane number 4567328"
val replaced_str = str3.replace("Air","Jet")
println(s"replacing Air with Jet: $replaced_str")
val replaced_num = str3.replaceAll("[0-9]","*")
println(s"replacing all numbers with *: $replaced_num")
val replaced_except_num = str3.replaceAll("[^0-9]","*")
println(s"replacing all except numbers with *: $replaced_except_num")
val sentence:String = "there was an old castle made of gold"
val sentence_array :Array[String] = sentence.split(" ")
println(s"Splitting a sentence into array of strings: fourth element is ${sentence_array(3)}")

println(s"substring from a sentence 17-24 is ${sentence.substring(17,24)}")


object Purge {
   def purgeVowels( str:String ) : String = {
      return str.replaceAll("[a,e,i,o,u|A,E,I,O,U]","")
   }
}


Purge.purgeVowels("New York")

def simpleInterest(principal:Int, rate:Double, duration:Int) :Double ={
if (principal <= 0){
    print("wrong principal amount")
    return 0
}

var interest = principal * rate * duration /100
return interest
}

simpleInterest(0,7,4)

simpleInterest(1000,4,2)

val list_fruits:List[String] = List("Apple","Banana","Mango","Grapes")
for (x <- list_fruits){
    if (x == "Apple"){
        println("Skipping Apple")
    }
    else
    println(x)
}
list_fruits.foreach(println(_))
var y:Int = 5
while(y>0){
    println(y)
    y -= 1
}

object LoopsTest{
    def main(args: Array[String]){
        //for loop execution with ranges
        println(s"for loop a <- 0 to 10:")
        for (a <- 0 to 10)
        println(s"$a")
        
        println(s"for loop a <- 0 to 10 by 2")
        for (a <- 0 to 10 by 2)
        println(s"$a")
        
        println(s"for loop a <- 10 to 0 by -1")
        for (a <- 10 to 0 by -1)
        println(s"$a")
        
        println(s"for loop a <- 0 until 10 by 3")
        for (a <- 0 until 10 by 3)
        println(s"$a")
        
        println(s"for loop List(1,2,3,4,5)")
        for (a <- List(1,2,3,4,5))
        println(s"$a")
        
        println(s"for loop with different ranges x <- 0 to 10; y <- 0 to 5")
        for (x <- 0 to 3; y <- 0 to 5)
        println(s"$x $y")       
        }
}

LoopsTest.main(Array())

println(s"for loop a <- 0 to 10 by -1")
for( a <- 5 to 1 by -1){
         println( "Value of a: " + a );
      }

object Greet{
    def greet(hour:Int):String={
        if (hour >= 4 && hour < 12){
        return "Good Morning"}
        
        else if (hour >= 12 && hour < 16){
        return "Good Afternoon"}
        
        else if (hour >= 16 && hour < 21){
        return "Good Evening"}
        
        else if ((hour >= 21 && hour < 24) | (hour >= 1 && hour < 4)){
        return "Good Night"}
        
        else
        return "Invalid"
    }
}



Greet.greet(10)


