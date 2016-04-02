/**
  * Created by vikasg on 4/1/2016.
  */

object UserClassObject {

  def main(args: Array[String]): Unit = {
    val userKlass = new UserKlass

    val userClass = new UserClass("Vikas", "Gupta", 35)

    printf("%d %s  %s  %d %d\n",userClass.id, userClass.fName, userClass.lName, userClass.age ,userClass.mySalary())

    userClass.setFName("")

    printf("%s \n",userClass.getFName())

    userClass.setFName("23.23")

    printf("%s \n",userClass.getFName())

    userClass.setFName("Vikas")

    printf("%s \n",userClass.getFName())

    println(userClass.toString())

    val userClass2 = new UserClass("Deepa", "Gupta", 32)

    printf("%d %s  %s  %d %d\n",userClass2.id, userClass2.fName, userClass2.lName, userClass2.age ,userClass2.mySalary())

    val internalUser = new InternalUser("Ajay", "Gupta", 38)

    printf("%d %s  %s  %d %d\n",internalUser.id, internalUser.fName, internalUser.lName, internalUser.age ,internalUser.mySalary())
  }


  class UserClass(var fName: String, var lName: String, var age: Int) {
    // no need of specific default getters & setters
    //    this.fName = fName
    //    this.lName = lName

    // no Static variables and members in Scala

    // Accessing Static members & variables
    val id = UserClass.newNumId

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

    /*def this(fName : String) {
      this("No FirstName Given")
      this.setFName(fName)
    }*/

    def this() { // matching constructors with the default parameters
      this("No FirstName Given", "No LastName Given", 0)
    }

    override def toString() : String = {
      "%d %s  %s  %d %d".format(UserClass.idNumber, this.fName,this.lName, this.age, this.salary)
    }
  }

  // Create Static Methods & Members

  object UserClass{
    private var idNumber = 0
    private def newNumId = {
      idNumber += 1; idNumber
    }
  }

  class InternalUser(fName: String, lName:String, age:Int) extends UserClass(fName, lName,age) {

    def this(){
      this("No FirstName Given", "No LastName Given", 0)
    }

    def this(fName:String, lName:String){
      this(fName, lName, 0) //  Age not given
    }

    def this(fName:String){
      this(fName, "No LastName Given", 0)
    }

    override def toString() : String = {
      "%d %s  %s  %d %d".format(this.fName,this.lName, this.age, this.salary)
    }
  }


  class UserKlass() {

  }
}