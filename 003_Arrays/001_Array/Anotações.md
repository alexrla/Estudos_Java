# Java

### Array

- **Um `array` é uma coleção de tipos semelhantes de dados;** 



#### Declaração

- **Sintaxe:**

  ```java
  tipo_de_dado[] identificador;
  ```

  - **`tipo_de_dado`: `int`, `double`, `String`, etc.;**
  - **`identificador`: nome do `array`;**

- **Exemplo:**

  ```java
  String[] names;
  ```

  - **No exemplo acima, temos um `array` de nome `names` e esse `array` só pode conter valores do tipo `String`;**

- **OBSs.:**

  - **Para definir o tamanho do `array` (quantos elementos/items ele pode conter), devemos alocar memórica para ele:**

    ```java
    // Declaração
    String[] names;
    
    // Alocação de memória
    names = new String[10];
    ```

    - **Agora o nosso `array` poderá armazenar 10 valores (10 nomes);**

  - **E claro, isso tudo (declarar e alocar) pode ser feito em uma única instrução:**

    ```java
    String[] names = new String[10];
    ```



#### Inicialização

- **Também podemos inicializar um `array`, quando o declaramos:**

  ```java
  // Opção 1
  int[] values = {1, 2, 3, 4, 5};
  
  // Opção 2
  int[] values = new int[]{1, 2, 3, 4, 5};
  ```

  - **Vejamos que não fornecemos o tamanho do `array`, mas ainda assim, o compilador especifica, automaticamente, o tamanho desse `array`, contando o número de elementos existentes nesse `array`;**

- **Também podemos inicializar um array, através do número do índice:**

  ```java
  // Declaração
  int[] values = new int[5];
  
  // Inicialização
  values[0] = 1;
  values[1] = 2;
  values[2] = 3;
  .
  .
  .
  ```

  - **No `array`, cada local de memória é associado a um número;**
    - **Esse número é conhecido como índice do `array`;**
    - **Os índices de um `array`, sempre começam no valor zero, ou seja, o primeiro elemento de um `array`, está no índice zero;**
    - **Se um `array` tem tamanho `n`, seu último elemento está no índice `n - 1` (o tamanho do array, menos um);**



#### Acesso

- **Para acessar o elemento de um `array`, utilizamos o número do seu índice;**

- **Sintaxe:**

  ```java
  array[índice]
  ```

- **Exemplo:**

  ```java
  class App {
   public static void main(String[] args) {
     	int[] values = {1, 2, 3, 4, 5};
  
     	// Acessando os elementos de um array
     	System.out.println("Primeiro elemento: " + values[0]);
     	System.out.println("Segundo elemento: " + values[1]);
   	System.out.println("Terceiro elemento: " + values[2]);
   	System.out.println("Quarto elemento: " + values[3]);
   	System.out.println("Quinto elemento: " + values[4]);
   }
  }
  ```

- **Também podemos acessar todos os elementos de um `array`, através de _loops_ (nesse caso, vamos percorrer cada elemento de um `array`):**

  ```java
  // Utilizando o loop for
  
  class App {
   public static void main(String[] args) {
     	int[] values = {1, 2, 3, 4, 5};
  
     	// Percorrendo o array
     	for(int i = 0; i < values.length; i++)	{
          System.out.println(values[i]);
      }
   }
  }
  
  // values.length: propriedade do array, utilizada para obter o tamanho do array
  ```

- **Além dos _loops_ "tradicionais", podemos utilizar o _loop_ `for-each`, para percorrer cada elemento do `array`:**

  ```java
  // Utilizando o loop for-each
  
  class App {
   public static void main(String[] args) {
     	int[] values = {1, 2, 3, 4, 5};
  
     	// Percorrendo o array - loop for-each
     	for(int value : values)	{
          System.out.println(value);
      }
   }
  }
  ```

  