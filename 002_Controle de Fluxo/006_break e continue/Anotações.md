# Java

### break

- **A instrução `break` é utilizada para, além de encerrar declarações `switch`, encerrar _loops_, sem que seja necessário a avaliação da condição;**

  - **Os _loops_ são encerrados imediatamente e o fluxo do programa pula para a próxima instrução após o _loop_;**
  - **Geralmente, no caso de _loops_, as instruções `break` são declaradas dentro de estruturas condicionais (`if... else if... else`);**

- **Sintaxe:**

  ```java
  break;
  ```

- **Exemplo:**

  ```java
  class App {
      public static void main(String[] args) {
          // loop for
          for (int i = 1; i <= 10; ++i) {
              
              // Quando i assume o valor 5, o loop é encerrado 
              if (i == 5) {
                  break;
              }   
              
              System.out.println(i);
          }   
      }
  }
  ```

- **OBSs.:**

  - **A instrução `break` pode ser utilizado com qualquer _loop_;**

  - **No caso de _loops_ aninhados, a instrução `break` encerra o  _loop_ a qual ela está "alocada" / "inserida":**

    ```java
    /* Nesse exemplo, o loop mais interno é encerrado e o fluxo do programa pula para o loop externo */
    
    while(condição) {
        while(condição) {
        	...
                
            if(condição) {
                break;
            }
            
            ...
    	}
        
        instruções...
    }
    ```

  - **Uma outra forma de utilizar a instrução `break`, é passando um "rótulo" (identificador);**

    - **E isso pode ser feito para encerrar _loops_ externos, por exemplo:**

      ```java
      rótulo:
      while(condição) {
         while(condição) {
           if(condição) {
               break rótulo;
           }
         }
      }
      
      /*
      	- O "rótulo" é declarado acima do loop que queremos encerrar (assim temos uma "declaração rotulada");
      	
      	- Quando o fluxo do programa atinge a instrução break, temos que a "declaração rotulada", o loop mais 
      	externo, é encerrada;
      */
      ```

    - **Exemplo:**

      ```java
      class App {
          public static void main(String[] args) {
              // Rótulo do primeiro loop for (loop externo)
              first:
              for( int i = 0; i < 5; i++) {
                  System.out.println(i + 1);
                  
      
                  // Rótulo do segundo for (loop interno)
                  second:
                  for(int j = 0; j < 5; j ++ ) {
                      System.out.println("\t" + (i + 1) + "." + (j + 1));
                   
                      // Quando i assume o valor de 2, o loop mais externo (de rótulo first) é encerrado
                      if ( i == 2)
                          break first;
                  }
              }
          }
      }
      ```

      

### continue

- **A instrução `continue` é utilizada quando queremos pular/ignorar, a iteração atual do _loop_;**

  - **Após a execução da instrução `continue`, o fluxo do programa se move para o final do _loop_;**

- **Sintaxe:**

  ```java
  continue;
  ```

- **Assim como as instruções `break`, as instruções `continue`, geralmente, são declaradas em estruturas condicionais, podem ser utilizadas com qualquer _loop_ (incluindo _loops_ aninhados), além de oferecer a opção de uso de rótulos (onde temos declarações rotuladas);**

- **Exemplos:**

  - **1_**

    ```java
    class App {
      public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
          // Se i assumir valores do intervalo fechado [1, 8]... 
          // A iteração atual será ignorada
          if (i >= 1 && i <= 8) {
            continue;
          }
            
          System.out.println(i + 1);
        }
      }
    }
    ```

  - **2_**

    ```java
    // loops aninhados
    
    while(condição) {
        while(condição) {
            // A iteração atual a ser ignorada é a do loop mais interno
            if(condição) {
                continue;
            }
        }
    }
    ```

  - **3_**

    ```java
    // Declarações rotuladas
    
    rótulo:
    while(condição) {
       while(condição) {
         if(condição) {
             // A instrução continue ignora a iteração do loop especificado através do rótulo...
             // Nesse caso, o loop while mais externo
             continue rótulo;
         }
       }
    }
    
    /*
    	- Essa prática não é muito recomendada, pois pode tornar o código difícil de ler e entender;
    */
    ```

    