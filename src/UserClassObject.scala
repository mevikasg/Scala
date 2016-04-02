/**
  * Created by vikasg on 4/1/2016.
  */

object UserClassObject {

  def main(args: Array[String]): Unit = {
    val userKlass = new UserKlass

    val userClass = new UserClass("Vikas", "Gupta", 35)

    printf("%s  %s  %d %d\n",userClass.fName, userClass.lName, userClass.age ,userClass.mySalary())

    userClass.setFName("")

    printf("%s \n",userClass.getFName())

    userClass.setFName("23.23")

    printf("%s \n",userClass.getFName())

    userClass.setFName("Vikas")

    printf("%s \n",userClass.getFName())
  }


  class UserClass(var fName: String, var lName: String, var age: Int) {
    // no need of specific default getters & setters
    //    this.fName = fName
    //    this.lName = lName

    // no Static variables and members in Scala

    //    val id = UserClass.newIdNum

     protected var salary = 10000  // only accessed by member methods.

     def mySalary(): Int = {
        salary
     }

     // Getters & Setters
     def getFName(): String ={
       this.fName
     }
     def getLName(): String ={
       this.lName
     }

//      def getName():String = fName


     def setFName(fName:String): Unit ={
        if(fName nonEmpty) {
          if(!fName.matches(".*\\d+.*")){
            this.fName = fName
          }
          else {
            this.fName = "FirstName Not Given"
          }
        }
        else {
          this.fName = "FirstName Not Given"
        }
     }
  }

  class UserKlass() {

  }
}