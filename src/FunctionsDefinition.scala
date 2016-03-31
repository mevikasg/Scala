import scala.io._

/**
  * Created by vikasg on 3/30/2016.
  */
object FunctionsDefinition {



  def main(args: Array[String]) {

    // Unit if no Return from function

    /*def printPrimes(): Unit = {

 /*     val list = List (1, 2, 5, 7, 11, 13, 17)
      for(i <- list){
        println(i)
      }
*/
      for( i <- 2 to 50) {

        if(50 % i == 0){
          println(i)
        }

      }

    }
    printPrimes()

    println("Enter your age:")
    val j = StdIn.readInt()

    println(j * 2)

    //read from user input

    println("Enter your name:")
    val name = StdIn.readLine()

    // styling
    println(s"My name is $name")
    println(f"Age: ${j+1}")

  }*/
/*

    def getSum(a: Int = StdIn.readInt(), b: Int = StdIn.readInt()): Int = {
      print("a: " + a + " b: " + b + " Sum = " + (a + b))
      a + b
    }

    println("Enter your numbers: ")
    getSum()
*/

    def getSumMultipleValues(args : Int*) : Int = {

      var sum : Int = 0

      for(num <- args) {
        sum += num
      }
      println("Sum: "+sum)
      sum
    }
    getSumMultipleValues(1,5,6,7)
  }
}

