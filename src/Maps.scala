import scala.collection.mutable
import scala.reflect.internal.util.Collections

/**
  * Created by vikasg on 3/31/2016.
  */
object Maps {

  def main(args: Array[String]){
    val empMap = Map("User" -> "mevikasg", "Name" -> "Vikas Gupta", "Age" -> "35")

    if(empMap contains "User") {
      printf("User: %s\n", empMap("User"))
    }
    println(empMap)
    println(empMap.values)

    //      empMap("User") = "vgupta"

    val mutableMap = collection.mutable.Map("User" -> "mevikasg", "Name"-> "Vikas Gupta", "Age"-> "35")
    println(mutableMap)

    mutableMap("User") = "vgupta"

    println(mutableMap)
    println(mutableMap.values)

    for((k,v) <- mutableMap)
      printf("%s: %s\n", k,v)



  }

}
