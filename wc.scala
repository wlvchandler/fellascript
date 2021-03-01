import scala.io.Source

object Parser {
	   def match_token(t: String) : Unit = println("parsing " + t)
}

object wc extends App {
	   if (args.length == 0) {
	   	  println("wc.error: no input file provided")
	   }
	   val filename = args(0)
	   val tokens = Source.fromFile(filename).getLines.toArray.iterator
	   while (tokens.hasNext) {
	   		 println(tokens.next())
	   }
}
