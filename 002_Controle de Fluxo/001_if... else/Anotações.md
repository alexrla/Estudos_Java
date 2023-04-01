# Java

- **As instruções `if... else`, na programação, são utilizadas para executar um bloco de código entre mais de uma alternativa;**



### if

- **Sintaxe:**

  ```java
  if(condição) {
  	instruções...
  }
  ```

- **Na declaração `if`, temos:**

  - **Se a condição for verdadeira, o bloco de instruções referente ao `if`, será "executado" (no caso, as instruções contidas no bloco);**
  - **Agora, se a condição for falsa, o bloco de instruções será ignorado e o fluxo do programa irá pular para a próxima instrução/declaração;**



### if... else

- **Sintaxe:**

  ```java
  if(condição) {
      instruções...
  } 
  else {
      instruções...
  } 
  ```

- **Na declaração `if... else`, temos:**

  - **Se a condição avaliada no `if`, for verdadeira, o conjunto de instruções referente ao bloco de código do `if`, serão executados;**
  - **Agora, se a condição for avaliada como falsa, o conjunto de instruções referente ao bloco do `else`, é que serão executado;**



### if... else if... else

- **Sintaxe:**

  ```java
  if(condição1) {
      instruções...
  } 
  else if(condição2) {
  	instruções...
  }
  else if(condição2) {
  	instruções...
  }
  .
  .
  .
  else {
      instruções...
  } 
  ```

- **Na declaração `if... else if... else`, temos:**

  - **Primeiro que a declaração é executada de cima para baixo;**
  - **Segundo, as condições vão sendo avaliadas, até que se "encontre" uma condição verdadeira;**
    - **Quando essa condição verdadeira é encontrada, o conjunto de instruções, referente ao "bloco da condição verdadeira", é executado;**
  - **Por último, se nenhuma condição avaliada, for verdadeira, as instruções do bloco do `else`, serão executadas;**

- **OBSs.:**

  - **Essa declaração é muito utilizada quando se deseja avaliar muitas condições;** 
  - **Devemos ter apenas um `if` (no começo da "estrutura") e um `else` (ao final da "estrutura");**
  - **Mas podemos ter vários blocos `else if`;**



### if... else (aninhado)

- **Podemos aninhar declarações `if... else` (utilizar `if... else`, dentro de `if... else`):**

  ```java
  if(condição1) {
      if(condição2) {
          instruções...
      }
      else {
          instruções...
      }
  }
  else {
      instruções...
  }
  ```

  