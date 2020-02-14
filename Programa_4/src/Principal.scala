import scala.io.StdIn._

/*
  4.- Programa que muestre los cocientes enteros de la division entre entre dos números dados
 */

object Principal {
  def main(args: Array[String]): Unit = {
    print("\n\tCOCIENTE DE LA DIVICION ENTRE 2 NUMEROS\nNumero 1 (dividendo): ")
    var numeroDividendo = readInt()
    print("Numero 2 (divisor): ")
    var numeroDivisor = readInt()
    calculoDeCociente(numeroDividendo,numeroDivisor)
  }

  def calculoDeCociente(dividendo: Int, divisor: Int): Unit ={
    var cociente: Int = 0
    var resto: Int = dividendo
    if (divisor > 0){
      while ( resto >= divisor){
        resto -= divisor
        var temporal = resto - divisor
        cociente = cociente + 1
      }
      print("Resultado del cociente: "+ cociente)
    } else {
      print("Valores no validos.")
    }
  }

}
