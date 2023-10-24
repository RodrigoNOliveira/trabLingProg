object Desempenho2 {
  def main(args: Array[String]): Unit = {
    val inicio = System.currentTimeMillis()
    val tamanho = 1000000
    val lista = List.fill(tamanho)(scala.util.Random.nextInt(1000))

    // Encontre o valor máximo na lista
    val max = lista.reduceLeft((a, b) => if (a > b) a else b)

    val fim = System.currentTimeMillis()
    println(s"Valor máximo encontrado: $max")
    println(s"Tempo corrido: ${(fim - inicio)} milissegundos")
  }
}
