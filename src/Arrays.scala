import scala.collection.mutable.ArrayBuffer

/**
  * Created by vikasg on 3/31/2016.
  */
object Arrays {

  def main(args: Array[String]) {


    val stringArray = Array("Vikas", "Ajay", "Vineet")

    println(stringArray.toList)

    println(stringArray(2))

    val arrayBuffer = new ArrayBuffer[String]()

    arrayBuffer.insert(0,"Gupta")

    arrayBuffer += "Goel"

    arrayBuffer ++= stringArray

    arrayBuffer ++= Array("testing","Array")

    println(arrayBuffer.toString())

    arrayBuffer.remove(arrayBuffer.length -1)

    for(i <- arrayBuffer) {
      println(i)
    }

    stringArray.foreach(println)

    arrayBuffer.foreach(println)

    val favNums = new Array[Int](20)

    for (i <- 0 to (favNums.length-1)){
      favNums(i) = i
    }
    favNums.foreach(println)

    println(favNums.toList)

    val favNumsMultiply = (for(i <- favNums) yield 4 * i)
    favNumsMultiply.foreach(println)

    val favNumsMod = for(i <- favNumsMultiply if i % 6 == 0) yield i
    favNumsMod.foreach(println)


    // multidimensional Array

    val mulDimArray = Array.ofDim[Int](10,10)
    for(i <- 0 to 9){
      for (j <- 0 to 9) {
        mulDimArray(i)(j) = i*j
      }
    }
    for(i <- 0 to 9) {
      for (j <- 0 to 9){
          printf("%d : %d = %d \n", i, j, mulDimArray(i)(j))
      }
    }

    // Function on Arrays

    println("Sum: "+favNumsMultiply.sum)
    println("Min: "+favNumsMultiply.min)
    println("Max: "+favNumsMultiply.max)

    // Sort
   /* val sortedArray = favNumsMultiply.sortBy(favNums)
    println(sortedArray)*/

    // aesc
    val sortedArray2 = favNumsMultiply.sortWith(_>_)
    println(sortedArray2.deep.mkString(", "))
    // desc
    val sortedArray3 = favNumsMultiply.sortWith(_<_)
    println(sortedArray3.mkString(", "))

  }


}
