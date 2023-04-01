# Java

### Operadores

- **Operadores são símbolos que executam operações em variáveis e valores;**
- **Existem 6 tipos de operadores em Java...**



#### Operadores aritméticos

- **Utilizados para realizar operações aritméticas em variáveis e valores:**

  ```java
  class App {
      public static void main(String[] args) {
          int operating1 = 8, operating2 = 5;
          
          // Operador de adição
          int sum = operating1 + operating2;
          
          // Operador de substração
          int subtraction = operating1 - operating2;
          
          // Operador de multiplicação
          int multiplication = operating1 * operating2;
          
          // Operador de divisão
          int division = operating1 / operating2;
          
          // Operador de resto/módulo
          int module = operating1 % operating2;
          
          System.out.println(operating1 + " + " + operating2 + " = " + sum); // 13
          System.out.println(operating1 + " - " + operating2 + " = " + subtraction); // 3
          System.out.println(operating1 + " * " + operating2 + " = " + multiplication); // 40
          System.out.println(operating1 + " / " + operating2 + " = " + division); // 1
          System.out.println(operating1 + " % " + operating2 + " = " + module); // 3
      }
  }
  ```

- **OBSs.:**

  - **Se utilizarmos o operador de divisão, com valores inteiros, o quociente (resultado da divisão) também será um valor inteiro. Do contrário, se ao menos tivermos um valor de ponto flutuante, envolvido na operação, o qociente também será um valor em ponto flutuante;**
  - **O operador de módulo (que nos dá o resto da operação), só é utilizado com valores inteiros;**



#### Operadores de atribuição

- **Utilizados para atribuir valores às variáveis**

  | Operador |     Exemplo      |     Equivalente a      |
  | :------: | :--------------: | :--------------------: |
  |  **=**   | **var1 = var2**  |                        |
  |  **+=**  | **var1 += var2** | **var1 = var1 + var2** |
  |  **-=**  | **var1 -= var2** | **var1 = var1 - var2** |
  | **\*=**  | **var1 *= var2** | **var1 = var1 * var2** |
  |  **/=**  | **var1 /= var2** | **var1 = var1 / var2** |
  |  **%=**  | **var1 %= var2** | **var1 = var1 % var2** |



#### Operadores relacionais

- **Utilizados para verificar a relação entre dois operandos:**

  | Operador |      Descrição       |             Exemplo             |
  | :------: | :------------------: | :-----------------------------: |
  |  **==**  |    **É igual a**     |   **2 == 4** ( retorna falso)   |
  |  **!=**  |   **Diferente de**   | **2 != 4** (retorna verdadeiro) |
  |  **>**   |    **Maior que**     |    **2 > 4** (retorna falso)    |
  |  **<**   |    **Menor que**     | **2 < 4** (retorna verdadeiro)  |
  |  **>=**  | **Maior ou igual a** |   **2 >= 4** (retorna falso)    |
  |  **<=**  | **Menor ou igual a** | **2 <= 4** (retorna verdadeiro) |

- **OBS.: os operadores relacionais são utilizados nas tomadas de decisões e nos loops;**



#### Operadores lógicos

- **Utilizados para verificar se uma expressão é verdadeira (`true`) ou falsa (`false`);**

  |       Operador       |            Exemplo             |                      Significado                       |
  | :------------------: | :----------------------------: | :----------------------------------------------------: |
  |  **&&** (E lógico)   |  **expressão1 && expressão2**  |   **true** se ambas as expressões forem verdadeiras    |
  | **\|\|** (OU lógico) | **expressão1 \|\| expressão2** | **true** se ao menos uma das expressões for verdadeira |
  |  **!** (NÃO lógico)  |         **!expressão**         |     **true** se a expressão for falsa e vice-versa     |



#### Operadores unários

- **Utilizados apenas com um operando:**

  | Operador |                         Significado                          |
  | :------: | :----------------------------------------------------------: |
  |  **+**   | **Mais unário**: transforma os números em positivos, mas o seu uso não é necessário; |
  |  **-**   |     **Menos unário**: inverte o sinal de uma expressão;      |
  |  **++**  |     **Operador de incremento**: incrementa o valor em 1;     |
  |  **--**  |     **Operador de decremento**: decrementa o valor em 1;     |
  |  **!**   | **Operador de complemento lógico**: inverte o valor de um booleano; |

- **Operadores de incremento e decremento:**

  - **Podem ser utilizados como pré-fixos (quando vêm antes do operando) ou pós-fixos (quando vêm após o operando);**

    ```java
    class Main {
      public static void main(String[] args) {
        int x = 2, y = 3;
    
        // Operador de incremento
        // Pré-fixo
        System.out.println("x = " + (++x)); // x = 3
        // Pós-fixo
        System.out.println("x = " + (x++)); // x = 3
    
        // Operador de decremento
        // Pré-fixo
        System.out.println("y = " + (--y)); // x = 2
        // Pós-fixo
        System.out.println("y = " + (y--)); // x = 2
      }
    }
    ```

    

#### Operadores bit a bit

- **Utilizados para executar operações em bits individuais (geralmente, não são muito utilizados no Java):**

  | Operador |              Descrição              |
  | :------: | :---------------------------------: |
  |  **~**   |        Complemento bit a bit        |
  |  **<<**  |       Deslocamento à esquerda       |
  |  **>>**  |       Deslocamento à direita        |
  | **>>>**  | Deslocamento à direita não assinado |
  |  **&**   |           **E** bit a bit           |
  |  **^**   |     **OU exclusivo** bit a bit      |