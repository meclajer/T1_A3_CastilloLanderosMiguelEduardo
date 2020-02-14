import scala.io.StdIn._

/*
  3.- Programa que muestre el FACTORIAL de un numero dado
 */

object Principal {
  def main(args: Array[String]): Unit = {
    print("\n\t\tFACTORIAL DE UN NÚMERO\nIngrese un numero: ")
    var numeroEntrada = readInt()
    calculoDeFactorial( numeroEntrada, 1, 1.0 )
  }

  def calculoDeFactorial(numeroObjetivo: Int, creciente: Int, sumatoria: Double): Unit ={
    if ( creciente > numeroObjetivo) {
      print("\nFactorial de "+numeroObjetivo+" es: " + sumatoria)
    } else {
      var res = sumatoria * creciente;
      calculoDeFactorial( numeroObjetivo, (creciente+1), res )
    }
  }

}
