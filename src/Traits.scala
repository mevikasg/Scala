/**
  * Created by vikasg on 4/3/2016.
  */
object Traits {

  def main(args: Array[String]) {
    val traitImpl = new TraitImpl("Vikas Gupta")

    traitImpl.checkingTrait

    traitImpl.validateTrait2
  }



  // Interface in Scala
  trait Traits {

    def checkingTrait: String

  }

  trait Trait2 {

    def validateTrait2:String
  }

  class TraitImpl(val message:String) extends Traits with Trait2 {

    def checkingTrait:String = {
      printf("%s is CheckingTrait method \n",this.message)
      ""
    }

    def validateTrait2:String = {
      printf("%s is Validating Trait2 method \n", this.message)
      ""
    }

  }

}
