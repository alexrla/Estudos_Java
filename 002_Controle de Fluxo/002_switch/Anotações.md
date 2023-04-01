# Java

### switch

- **Nos permite executar um bloco de código, mediante a avaliação de um caso, entre muitas outras alterantivas (outros blocos);**

- **Sintaxe:**

  ```java
  switch(expressão) {
      case valor1:
          instruções...
      break;
      
      case valor2:
          instruções...
      break;
          
  	. . .
  	. . .
      . . .
          
      default:
      	instruções...  
  }
  ```

  - **Na declaração `switch`, temos:**

    - **A expressão é avaliada um vez e é comparada com os valores de cada caso;**
    - **Se a expressão "combinar"/"corresponder" com o `valor1`, somente as instruções de `case valor1` serão executadas, se "combinar" com o `valor2`, somente as instruções de `case valor2` serão executadas e assim sucessivamente;**
    - **Caso a expressão não "combine" com nenhum valor, as instruções do "caso" `default`, serão executadas;**

  - **OBSs.:**

    - **A declaração `switch` é semelhante a declaração `if... else if... else`, mas ela acaba sendo mais "limpa" e fácil de ler e escrever;** 

    - **A instrução `break` é utilizada para encerrar a declaração `switch`, após a execução das suas instruções do "bloco case" correspondente a expressão;**

    - **Se a instrução `break` não for inserida, os "blocos case" que vêm logo após  o "bloco case" correspondente a expressão, terão as suas instruções executadas (também serão executados);**

    - **O "caso" `default` é opcional;**

    - **A declaração `switch` funciona apenas com:**

      **- Tipos primitivos: byte, shot, char e int;**

      **- Tipos enumerados;**

      **- Classe String;**

      **- Classes de wrapper: Character, Byte, Short e Integer;**

