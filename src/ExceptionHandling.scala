/**
  * Created by vikasg on 4/3/2016.
  */
object ExceptionHandling {

  def main(args:Array[String]){

    def divideNumbers(num1:Int, num2:Int)=try{

      num1/num2
    }catch {
      case ex:java.lang.ArithmeticException => "Can't Divide by 0 (Zero)."
     }
    finally {
      //cleanup
    }

    println(divideNumbers(100,0))

  }

}
