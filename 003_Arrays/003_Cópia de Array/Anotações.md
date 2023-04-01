# Java

### Cópia de Array

- **Em Java, podemos copiar um array para outro, e isso pode ser feito de diferentes formas:**

  - **1 - Utilizando o operador de atribuição:**

    ```java
    class App {
        public static void main(String[] args) {
           
            int[] numbers1 = {1, 2, 3, 4, 5};
            int[] numbers2 = numbers1;    // Copiando arrays
    
            for (int number: numbers2) {
                System.out.println(number);
            }
        }
    }
    ```

    - **Essa técnica funciona, mas ela apresenta um problema: se alterarmos os elementos de um `array`, os elementos correspondentes do outro `array`, também mudam (`shallow copy` - cópia rasa/superficial);**

    - **Ou seja, ambos os `arrays` se referem ao mesmo objeto `array`;**

    - **Para criarmos novos objetos de `array`, enquanto fazemos a cópia,  precisamos de um `deep copy` (cópia profunda);**

  - **2 - Através de _loops_:**

    ```java
    // Para utilizar o método toString()
    import java.util.Arrays;
    
    class App {
        public static void main(String[] args) {
           
            int[] numbers1 = {1, 2, 3, 4, 5};
            int[] numbers2 = new int[5];
    
            for (int i = 0; i < numbers1.length; i++) {
                numbers2[i] = numbers1[i];
            }
            
            // Convertendo o array para string
            System.out.println(Arrays.toString(numbers2));
        }
    }
    ```

    - **No exemplo acima, os `arrays` se referem a objetos diferentes (logo, temos um `deep copy` - a alteração feita em um `array`, não refletirá no outro);**

  - **3 - Utilizando o método `arraycopy()`:**

    ```java
    import java.util.Arrays;
    
    class App {
        public static void main(String[] args) {
           
            int[] numbers1 = {1, 2, 3, 4, 5};
            int[] numbers2 = new int[5];
            int[] numbers3 = new int[numbers1.length];
    
            // Copiando todo o array numbers1 para o array numbers2
            System.arraycopy(numbers1, 0, numbers2, 0, numbers1.length);
            System.out.println("numbers2 = " + Arrays.toString(n2));  
            
            /*
            	- Copiando 2 elementos do array numbers1, a partir
            	do índice 2 (incluso) do array numbers1, no array 
            	numbers3;
            */
            System.arraycopy(numbers1, 2, numbers3, 1, 2);
            /*
            	- O zero é valor padrão inicial dos elementos de um array 
            	de inteiros;
            	- Por isso temos os números zero em numbers3, já que o array 
            	não foi totalmente preenchido;
            */
            System.out.println("numbers3 = " + Arrays.toString(n3)); 
        }
    }
    ```

    - **O método `arraycopy` é um método da classe `System`;**

    - **Esse método é uma abordagem melhor, para se copiar `arrays`, do as abordagens utilizadas nos dois exemplos anteriores;**

    - **Esse método permite ainda, a cópia de uma parte específica do array;**

    - **Sintaxe:**

      ```java
      System.arraycopy(A, B, C, D, E);
      ```

      **A - Objeto `array` de origem (que queremos copiar);**

      **B - Posição inicial (índice) - de onde queremos começar a pegar os itens para copiar, do objeto `array` de origem;**

      **C - Objeto `array` de destino, para onde iremos copiar;**

      **D - Posição inicial (índice) - a partir de onde iremos colocar os itens copiados do objeto `array` de origem, no objeto `array` de destino;**

      **E - Número de elementos a se copiar do objeto `array` de origem;**


  - **4 - Utilizando o método `copyOfRange()`:**

    ```java
    import java.util.Arrays;
    
    class App {
        public static void main(String[] args) {
           
            int[] numbers1 = {1, 2, 3, 4, 5};
            
            // Copiando todo o array
            int[] numbers2 = Arrays.copyOfRange(numbers1, 0, numbers1.length);
            System.out.println("numbers2 = " + Arrays.toString(numbers2));
    
            // Copiando do índice 2 até o índice 4 (o 5 não é incluso)
            int[] numbers3 = Arrays.copyOfRange(numbers1, 2, 5);
            System.out.println("numbers3 = " + Arrays.toString(numbers3));
        }
    }
    ```

    - **O método `copyOfRange()`, é um método da classe `Arrays`;**

    - **Sintaxe:**

      ```java
      Arrays.copyOfRange(A, B, C);
      ```

      **A - Objeto `array` de origem;**

      **B - Posição inicial (índice);**

      **C - "Posição final" (índice) - que não é incluída;**

  - **5 - Copiando `arrays` bidimensionais - com o _loop_ `for`:**

    ```java
    import java.util.Arrays;
    
    class App {
        public static void main(String[] args) {
           
            int[] numbers1 = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
            };
    
            int[][] numbers2 = new int[source.length][];
    
            for (int i = 0; i < numbers2.length; ++i) {
                // Alocando espaço para cada linha da matriz (array bidimensional)
                numbers2[i] = new int[numbers1[i].length];
    
                for (int j = 0; j < numbers2[i].length; ++j) {
                    numbers2[i][j] = numbers1[i][j];
                }
            }
         
            // Exibindo o array numbers2
            System.out.println(Arrays.deepToString(numbers2)); 
        }
    }
    ```

  - **6 - Copiando `arrays` bidimensionais - com o método `arraycopy()`:**

    ```java
    import java.util.Arrays;
    
    class App {
        public static void main(String[] args) {
           
            int[] numbers1 = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
            };
    
            int[][] numbers2 = new int[source.length][];
    
            for (int i = 0; i < numbers2.length; ++i) {
                // Alocando espaço para cada linha da matriz (array bidimensional)
                numbers2[i] = new int[numbers1[i].length];
    
                System.arraycopy(numbers1[i], 0, numbers2[i], 0, numbers2[i].length);
            }
         
            // Exibindo o array numbers2
            System.out.println(Arrays.deepToString(numbers2)); 
        }
    }
    ```

    - **Vejamos que o método `arraycopy()`, acaba substituindo o _loop_ interno;**




### SHALLOW COPY x DEEP COPY

- **`SHALLOW COPY`: é criado um novo objeto, mas esse objeto é preenchido com referências para os itens contidos no objeto original;**
  - **Aqui, qualquer mudança em qualquer um dos objetos, acaba refletindo no outro;**
- **`DEEP COPY`: um novo objeto é criado e ele é preenchido com cópias dos itens do objeto original (apenas os dados são copiados);**
  - **Já aqui, qualquer mudança sofrida por um dos objetos, não será refletida no outro;** 



### Métodos

- **`toString()`:**
  - **Retorna a representação textual (uma `string`) de um `array`;**

- **`copyOfRange()`:**

  - **Copia um intervalo especificado de um `array`, para um novo `array`;**

  - **Sintaxe:**

    ```java
    copyOfRange(original, from, to);
    ```

    - **`original`: `array` no qual o intervalo vai ser copiado;**
    - **`from`: índice inicial do intervalo a ser copiado (inclusivo);**
    - **`to`: índice final do intervalo a ser copiado (exclusivo - podendo até mesmo ser um valor que que ultrapassa o tamanho do `array`);**

- **`deepToString()`: retorna uma representação textual (uma `string`) de um `array` (uma lista dos itens do `array`, entre colchetes);**
