@file:JvmName("JDoodle")
// Função que calcula a tensão elétrica aplicada através da fórmula V = I * R.
fun calcV() {
    print("Digite a corrente (I) em Amperes: ")
// Recebe a entrada do usuario e retorna erro caso seja inválida.
    val I = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!") 
    val V = I * R
    print("Digite a resistência (R) em Ohms: ")
// Recebe a entrada do usuario e retorna erro caso seja inválida.
    val R = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!")
// Variável imutável com a fórmula que descobre a grandeza da resistência.    
    val V = I * R
    println("A tensão (V) é: $V Volts") 
}
// Função que calcula a resistência de um material através da fórmula R= V/I.
fun calcR() {
    print("Digite a tensão (V) em Volts: ")
// Recebe a entrada do usuario e retorna erro caso seja inválida.
    val V = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!") 
    print("Digite a corrente (I) em Amperes: ")
// Recebe a entrada do usuario e retorna erro caso seja inválida.
    val I = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!") 
// Condicional que verifica se a corrente elétrica for diferente de zero para a fórmula ser calculada normalmente.
    if (I != 0.0) {
        val R = V / I
        println("A resistência (R) é: $R Ohms")
    } 
// Outra condicional que se o número da intensidade for 0 retorna erro.    
    else {
        println("Erro: Corrente não pode ser zero para calcular a resistência.")
    }
}
// Função que calcula a intensidade elétrica através da fórmula I = V / R.
fun calcI() {
    print("Digite a tensão (V) em Volts: ")
// Recebe a entrada do usuario e retorna erro caso seja inválida.
    val V = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!") 
    print("Digite a resistência (R) em Ohms: ")
// Recebe a entrada do usuario e retorna erro caso seja inválida
    val R = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida!") 
// Condicional que verifica se a resistência for diferente de zero para a fórmula ser calculada normalmente.    
    if (R != 0.0) { 
        val I = V / R
        println("A corrente (I) é: $I Amperes")
    }
// Outra condicional que se o número da resistência for 0 retorna erro. 
    else {
        println("Erro: Resistência não pode ser zero para calcular a corrente.")
    }
}
// Método principal da aplicação  
fun main() {
    println("Testando no JDoodle!") 
    var opcao: String
// Do é usado para mostra o menu de opções
    do {
        println("\n===== Calculadora da Lei de Ohm =====")
        println("1 - Calcular Tensão (V)")
        println("2 - Calcular Resistência (R)")
        println("3 - Calcular Corrente (I)")
        println("4 - Sair")
        print("Escolha uma opção:  " )
// Permite que o programa lê a opção escolhida pelo usuário
        opcao = readLine() ?: "" 
// Permite executar a função escolhida pelo menu do usuário
        when (opcao) {
            "1" -> calcV()
            "2" -> calcR()
            "3" -> calcI()
            "4" -> println("Programa desenvolvido por Seu Nome, RA Seu RA encerrado.")
            else -> println("Opção inválida! Tente novamente.")
        }
    } 
// While permite repetir o menu até o usuário quiser sair dele
    while (opcao != "4")
}
