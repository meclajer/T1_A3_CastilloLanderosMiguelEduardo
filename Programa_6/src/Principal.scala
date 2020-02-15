import scala.io.StdIn._

/*
  6.- Programa que muestre la conversión de un numero decimal a su representación en sistema binario.
 */

object Principal {
  def main(args: Array[String]): Unit = {
    print("\n\tCONVERCION A BINARIO\nNumero a combertir: ")
    var numero = readInt()
    print("Resultado en binario: ")
    conversion(numero)
  }

  def conversion(numero: Int): Unit = {
    if (numero < 2){
      print( numero )
    } else {
      conversion((numero/2))
      print(numero%2)
    }
  }

}
