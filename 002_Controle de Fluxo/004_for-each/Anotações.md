# Java

### for-each

- **O loop _for-each_ é utilizado para percorrer `arrays` e coleções;**

- **Sintaxe:**

  ```java
  for(tipo_de_dado nome_do_item: array) {
      instruções...
  }
  
  /*
  	1. tipo_de_dado
  		- Corresponde ao tipo do array;
  		
      2. nome_do_item
      	- Identificado que corresponde a cada item/elemento do array;
      	
      3. array
      	- Coleção de dados;
  */
  ```

- **Exemplo:**

  ```java
  class App {
    public static void main(String[] args) {
      // Array
      int[] numbers = {3, 9, 5, -5};
      
      // loop for-each
      for (int number: numbers) {
        System.out.println(number);
      }
    }
  }
  ```
  
  - **OBS.:**
  
    - **A cada iteração do _loop_, `number` vai assumir um valor do array:**
  
      **1° iteração: `number = 3`;**
  
      **2° iteração: `number = 9`;**
  
      **3° iteração: `number = 5`;**
  
      **4° iteração: `number = -5`;**