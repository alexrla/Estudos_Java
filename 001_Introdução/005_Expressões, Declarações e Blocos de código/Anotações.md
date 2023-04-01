# Java

### Expressões

- **Expressões em Java conssiste em variáveis, operadores, literais e chamadas de métodos;**

- **Exemplos:**

  ```java
  int a;
  a = 2; // Expressão (a = 2)
  
  double x = 4.6, y = 7.9, sum;
  sum = x + y; // Expressão (x + y)
  
  System.out.println("Hello, World!"); // "Hello, World!" - Expressão de String
  ```

  

### Declarações (Instruções)

- **Em Java, cada declaração é uma unidade completa de execução:**

  ```java
  int a = 4 * 4;
  ```

  - **No exemplo acima, temos uma declaração (temos uma operação de multiplicação de inteiros: 4 * 4 e em seguida atribuimos o resultado dessa multiplicação, a variável `a`);**
  - **Também, nessa declaração, temos a expressão: `4 * 4`;**
    - **Ou seja, em Java, as expressões fazem parte das declarações;**

- **OBSs.:**

  - **Declarações de expressões: qualquer expressão que é encerrada com um ponto e vírgula:**

    ```java
    // Expressão
    i++
        
    // Declaração de expressão
    i++;
    ```



### Blocos de código

- **Um bloco de código consiste em um grupo/conjunto de declarações (zero/mais), entre chaves (` { ... }`):**

  ```java
  class App {
      // Início do bloco
      public static void main(String[] args) {   	
  		...
      } 
      // Fim do bloco
  }
  ```

  - **No exemplo dado acima, temos o bloco: `public static void main() { ... }`;**
  - **Ele pode conter muitas ou nenhuma declaração;**