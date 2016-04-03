/**
  * Created by vikasg on 4/3/2016.
  */

import java.io.PrintWriter
import scala.io.Source

object FilesIO {

  def main(args:Array[String]): Unit ={

    // import PrintWriter (Write) and Source (Read) functions

    // Create a new file
    val printWriter = new PrintWriter("C:\\Vikas\\scala\\ScalaFileIO.txt")
    printWriter.write("Created a new file using File I/O operations in Scala. \n Scala is pretty good and getting hang of it.")
    printWriter.close()


    val textFromFile = Source.fromFile("C:\\Vikas\\scala\\ScalaFileIO.txt","UTF-8")
    val lineIterator = textFromFile.getLines()

    for(line <- lineIterator) {
      println(line)
    }

    textFromFile.close()
  }

}
