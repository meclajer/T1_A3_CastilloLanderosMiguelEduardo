import scala.io.StdIn._

/*
  7.- Programa que calcule a cantidad de vocales en una cadena.
 */

object Principal {
  def main(args: Array[String]): Unit = {
    print("\n\tCUENTA VOCALES\nInserte las palabras: ")
    var frase = readLine()
    cantidadVocales(0,frase, 0)
  }

  def cantidadVocales(cantidad: Int, frase: String, recorrido: Int): Unit = {
    if (((frase.length)-1 ) > 0){
      if (frase.substring(0, 1).equalsIgnoreCase("a") ||
          frase.substring(0, 1).equalsIgnoreCase("e") ||
          frase.substring(0, 1).equalsIgnoreCase("i") ||
          frase.substring(0, 1).equalsIgnoreCase("o") ||
          frase.substring(0, 1).equalsIgnoreCase("u") ){
        cantidadVocales( (cantidad+1) , frase.substring(1, (frase.length)) , (recorrido+1) )
      } else {
        cantidadVocales( cantidad , frase.substring(1, (frase.length)) , (recorrido+1) )
      }
    } else {
      print("Cantidad de vocales: " + cantidad)
    }
  }

}
