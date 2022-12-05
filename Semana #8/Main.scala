//Semana #8
//28/11/2022 17:13
// Efectos Colaterales

                              FP se basa en que las funciones no deberian tner efectos colaterales       
int cont = 0;
void addOne() {
  cont = cont + 1;
}

newState = print("hola") + oldState
se considera que una funciones tiene efectos colaterales si modifica el valor de una variable o de una estructura de datos mutable
utuliza mecanismos de IO
lanza una excepcion
se detiene por un error

Solucion efectos colaterales

la Solucion es codificarlos en el valor de retorno



Solucion Ejemplo

def division(n1: Double, n2: Double)=
  if(n2 == 0) throw new Runt imeException("Division por 0")
  else n1 / n2

  // falta una parte 

  
  import scala.util.Try
  def pureDivision(n1: Double, n2: Double): Try[Double] =
    Trydivision(n1: Double, n2: Double):util.Try[Double]
    val res2:util.Try[Double] = Succes(2,5)
    val res3:util.Try[Double] = Failure(java.lang.RuntimeException: Division por 0)

  import scala.util.Try
    def pureDivision(n1: Double, n2: Double): Try[Double] =
        Trydivision(n1: Double, n2: Double):util.Try[Double]
    def pureDivision(n)


Try[Double] represnat al error como una estructura de datos fenomemos representados como datos 

val result = pureDivision(1, 3)
import scala.util.{Success, Failure}
import java.util.concurrent.Executor

result match{
  case Succes(v) => println(v)
  case Failure(e) => println(e.getMessage)
}

Option / Some / None


/*
String search(String id) {
  var students = List.of("1-Valencia, 2-Caicedo, 3-Galindez")
  for(var student : students) {
    if(student.startsWith(id) ){
      return student;
    }
  }
  return null
}

String split(String student) {
  return student.split("-")[1];
}
*/


Null billion dollar mistake
Tony Hoare

def toInt(s: String): Option[Int] = {
  try{
    Some(Integer.parseInt(s))
  } catch {
    case e: Exception => None
  
  }
}
toInt("1")
toInt("Uno")
val txtNumbers = List("1", "2", "fon", "3", "har")
txtNumbers.map(toInt)
txtNumbers.map(toInt).flatten


def toInt(s: String) : Option[Int] = {
  try{
    Some(Integer.parseInt(s))
  } catch {
    case e: Exception => None
  }
}
import  scala.util.control.Exception._
def toInt(s: String) : Option[Int] = allcatch.opt(s.toInt)

OPtion obtener valores

val x = toInt("1").getOrElse(0)
toInt("1").foreach { i => printf("Obtener un Int: %d", i)}
toInt("1") match {
  case Some(i) => println(i)
  case None => println(" that didn't work.")
}

falta una imagen



Either / Left / Right

def divideXByY(x: Int, y: Int): Either[String, Int] = 
  if(y = 0) Left("No se puedo dividir por 0")
  else Right(x / y)


  val x = divideXByY(1,1).right.getOrElse(0)
  val x = divideXByY(1,0).right.getOrElse(0)

  divideXByY(1, 0) match {
    case Left(s)=> println("Answer: " + s)
    case Right(i) => println("Ansewer: " + i)
  }
  val x = divideXByY(1, 0)
  //X : Either[String, Int] = left(no se puede dividir por 00)
  x,isleft
  // res0: 
  x.leff

  Recomendaiocnes usar
  Try / Succes / Failure
  