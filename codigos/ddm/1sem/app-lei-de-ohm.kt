@file:JvmName("JDoodle")
fun calcV() {
    print("Digite a corrente (I) em Amperes: ")
    val I = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!")
    print("Digite a resistência (R) em Ohms: ")
    val R = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!")
    
    val V = I * R
    println("A tensão (V) é: $V Volts")
}

fun calcR() {
    print("Digite a tensão (V) em Volts: ")
    val V = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!")
    print("Digite a corrente (I) em Amperes: ")
    val I = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!")

    if (I != 0.0) {
        val R = V / I
        println("A resistência (R) é: $R Ohms")
    } else {
        println("Erro: Corrente não pode ser zero para calcular a resistência.")
    }
}

fun calcI() {
    print("Digite a tensão (V) em Volts: ")
    val V = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!")
    print("Digite a resistência (R) em Ohms: ")
    val R = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!")

    if (R != 0.0) { // Adicionamos {} para o bloco do if
        val I = V / R
        println("A corrente (I) é: $I Amperes")
    } else {
        println("Erro: Resistência não pode ser zero para calcular a corrente.")
    }
    
}  
fun main() {
    println("Testando no JDoodle!") 
    var opcao: String

    do {
        println("\n===== Calculadora da Lei de Ohm =====")
        println("1 - Calcular Tensão (V)")
        println("2 - Calcular Resistência (R)")
        println("3 - Calcular Corrente (I)")
        println("4 - Sair")
        print("Escolha uma opção:  " )
        opcao = readLine() ?: ""

        when (opcao) {
            "1" -> calcV()
            "2" -> calcR()
            "3" -> calcI()
            "4" -> println("Programa desenvolvido por Seu Nome, RA Seu RA encerrado.")
            else -> println("Opção inválida! Tente novamente.")
        }
    } while (opcao != "4")
}
