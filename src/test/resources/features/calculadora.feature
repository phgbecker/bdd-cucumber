# language: pt
Funcionalidade: Calculadora
  Como um aluno da aula de matemática
  Eu quero validar meus calculos 
  Para que eu possa garantir que meus calculos estejam corretos

	Contexto: 
		Dado que eu ligue a calculadora.

  Esquema do Cenário: Realizar a soma entre dois valores.
    Quando adiciono o <valor_1> e o <valor_2>
    Então o resultado é <resultado>

    Exemplos:
      | valor_1 | valor_2| resultado |
      | 1       | 2      | 3         |
      | 4       | 7      | 11        |
      | 3       | -5     | -2        |

  Esquema do Cenário: Realizar a subtração entre dois valores.
    Quando subtraio o <valor_1> e o <valor_2>
    Então o resultado é <resultado>

    Exemplos:
      | valor_1 | valor_2| resultado |
      | 5       | 2      | 3         |
      | 18      | 7      | 11        |
      | 3       | -5     | 8        |

	@fast
  Esquema do Cenário: Realizar a divisão entre dois valores.
    Quando divido o <valor_1> e o <valor_2>
    Então o resultado é <resultado>

    Exemplos:
      | valor_1 | valor_2| resultado |
      | 50      | 2      | 25        |
      | 4       | 1      | 4         |
      | -55     | 11     | -5        |

  Esquema do Cenário: Multiplicação.
    Quando multiplico o <valor_1> e o <valor_2>
    Então o resultado é <resultado>

    Exemplos:
      | valor_1 | valor_2| resultado |
      | 1       | 2      | 2         |
      | 4       | 7      | 28        |
      | 3       | -5     | -15       |