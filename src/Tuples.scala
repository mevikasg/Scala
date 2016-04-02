/**
  * Created by vikasg on 4/1/2016.
  */
object Tuples {

  def main(args: Array[String]){

    val tuples = (123, "Vikas Gupta", 35, 123.123)

    println(tuples.toString())

    printf("%s Id is %d and his Age is %d. He ran %.2f miles so far.\n", tuples._2, tuples._1, tuples._3, tuples._4)

    tuples.productIterator.foreach{ i => println(i)} }

}
