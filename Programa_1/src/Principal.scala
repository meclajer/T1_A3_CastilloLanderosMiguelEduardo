import scala.io.StdIn._
import scala.math._
/*
  1.- Programa que mueste la sumatoria de numeros enteros desde un limite inicial hasta un limite final
 */

object Principal {
  def main(args: Array[String]): Unit = {
    print("\n\t\tSUMATORIA EN RANGO\nLimite superior: ")
    var sup = readInt()
    print("Limite inferior: ")
    var inf = readInt()
    print("Resultado de la suma: "+ sumatoriaEnRangoRecursiva(inf,sup))
  }

  def sumatoriaEnRangoRecursiva(limiteInferior: Int, limiteSuperior: Int): Int = {
    if( limiteSuperior < limiteInferior){
      0
    } else {
      limiteSuperior + sumatoriaEnRangoRecursiva(limiteInferior,limiteSuperior-1)
    }
  }

}
