/**
  * Created by vikasg on 3/30/2016.
  */
import scala.util
import scala.sys

object ForLoop{
  def main(args:Array[String]): Unit ={
    /*var i = 0
    do {
      i += 1
      println(i)
    }while(i <=10)

    for(i <- 1 until(5))
     println(i)

    var j = 0
    val list = List('a', 'b', 'c', 'd', 'e')
//    val list = List(1,2,5,9,3)
        for(j <- list)
      print("List Items: \n ")
      print(j+" ")

    val evenList = for {
      j <- 1 to 20
      if (j % 2) == 0
    }yield j

    for( j <- evenList)
      print(j +" ")
    var k =0
    var l = 0*/

    for( k <- 1 to 5; l <- 6 to 10){
      println(k+" ")
//      println()
      println(l+" ")
    }
  }
}



