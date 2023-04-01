# Java

- **Além do _loop_ `for`, os outros dois tipos de _loop_ existentes na linguagem Java, são os _loop_ `while` e `do... while`;**

  

### while

- **Sintaxe:**

  ```java
  while(condição) {
      instruções...
  }
  ```

  - **No _loop_ `while`, temos que:**
    - **A condição é avaliada;**
    - **Se ela for verdadeira, as instruções são executadas;**
    - **Caso contrário, se ela for falsa, o _loop_ é encerrado;**



### do... while

- **Sintaxe:**

  ```java
  do {
      instruções...
  } while(condição);
  ```

  - **No _loop_ `while`, temos que:**
    - **As instruções, primeiramente, são executadas;** 
    - **Em seguida, a condição é avaliada;**
    - **Se ela for verdadeira, as instruções são executadas novamente;**
    - **Caso contrário, se ela for falsa, o _loop_ é encerrado;**



### WHILE x DO... WHILE

- **O _loop_ `while` se diferencia do _loop_ `do... while`, pelo fato de, no _loop_ `do_while`, o conjunto de instruções ser executado ao menos uma vez, independentemente da condição ser verdadeira ou falsa (no loop `while`, a condição é avaliada primeiro);**



### Observações

- **Também podemos ter casos de _loops_ infinitos com os _loops_ `while` e `do... while`;**
- **Os _loops_ `while` e `do... while`, são utilizados, geralmente, quando não sabemos o número de iterações (repetições) que o _loop_ terá;**
- **Também podemos ter _loops_ `while` e `do... while` aninhados:**

  ```java
  while(condição) {
      while(condição) {
          instruções...
      }
      
      instruções...
  }
  ```

- **Os _loops_ `do... while` não são muito utilizados;**