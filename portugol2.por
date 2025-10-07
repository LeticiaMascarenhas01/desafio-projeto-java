programa {
  funcao inicio() {
    inteiro ladoTriangulo, alturaTriangulo, area

    escreva("qual o lado do triangulo: ")
    leia(ladoTriangulo)
    escreva("O lado e igual a: ", ladoTriangulo, "\n")

    escreva("qual a altura do triangulo: ")
    leia(alturaTriangulo)
    escreva("A altura e igual a: ", alturaTriangulo, "\n")

    area = (ladoTriangulo * alturaTriangulo) / 2
    leia (area)
    escreva("A area do triangulo e: ", area)
  }
}
