programa {
  funcao inicio() {

    cadeia nome
    escreva("Qual seu nome? ", "\n")
    leia(nome)

    inteiro anoAtual, anoNascimento, idade
    escreva("Digite o ano atual: ", "\n")
    leia(anoAtual)
    escreva("Digite o ano em que nasceu: ", "\n")
    leia(anoNascimento)

    idade = anoAtual - anoNascimento
    escreva("Sua idade é: ", idade)
  }
}
