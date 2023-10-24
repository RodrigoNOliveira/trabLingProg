object DesempenhoScala {
  def calcularSoma(n: Int): Long = {
    var total = 0L
    for (i <- 1 to n) {
      total += i
    }
    total
  }

  def main(args: Array[String]): Unit = {
    val inicio = System.currentTimeMillis()
    val resultado = calcularSoma(1000000)  
    val fim = System.currentTimeMillis()
    val tempo: Double= fim - inicio
    
    println(s"Resultado: $resultado")
    println(s"Tempo corrido: ${tempo/1000} segundos")
  }
}