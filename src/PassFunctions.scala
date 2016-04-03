/**
  * Created by vikasg on 4/3/2016.
  */
object PassFunctions {

  def main(args: Array[String]): Unit = {

    def multi2(num1:BigInt)={
      num1*2
    }

    def multi3(num2:BigInt)={
      num2*3
    }

    def testPassFunction(anyFunction:BigInt => BigInt,number:Int) ={
      anyFunction(number)
    }

    printf("Testing Pass function: %d \n",testPassFunction(multi2,2000))

    printf("Testing PAss function %d \n",testPassFunction(multi3,3000))
  }



}
