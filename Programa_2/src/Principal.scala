import scala.io.StdIn._

/*
  2.- Programa que muestre los DIVISORES de un numero dado
 */

object Principal {
  def main(args: Array[String]): Unit = {
    print("\n\t\tDIVISORES DE UN NUMERO\nIgrese el numero: ")
    var numero = readInt()
    divisores(numero,numero)
  }

  def divisores(aEvaluar: Int, evaluando: Int): Unit ={
    if (evaluando != 0){ // no dividir sobre 0
      if (aEvaluar%evaluando == 0){ // es un divisor
        print(evaluando+" ")
      }
      if (evaluando > 0){
        divisores( aEvaluar, (evaluando-1))
      }
    }
  }

}
