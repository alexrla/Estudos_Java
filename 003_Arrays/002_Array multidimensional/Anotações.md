# Java

### Array multimensional

- **Um `array` multidimensional é um `array` de `array`;**

  - **Cada elemento de um `array` multidimensional, acaba sendo um outro `array`;**
  - **Podemos ter `arrays` bidimensionais, tridimensionais, etc.;**

- **Exemplo:**

  ```java
  int[][] matrix = new int[3][4];
  ```

  - **No exemplo acima, temos um `array` multidimensional: `matrix`;**
  - **Esse `array` é um `array` bidimensional, que possui 3 linhas e 4 colunas, ou seja, esse `array` pode conter até no máximo, 12 elemento (`3 * 4 = 12`);**

- **Outro exemplo:**

  ```java
  // Array tridimensional
  String [][][] data = new String[3][4][2]
      
  /*
  	- Esse array pode conter 24 elemento (3 * 4 * 2 = 24);
  */
  ```

  

#### Inicialização

- **Inicializando um `array` multidimensional:**

  ```java
  int[][] values = {
      {1, 2, 3, 4},
      {5, 6, 7, 8, 9},
      {10}
  };
  ```

  - **Vejamos que cada elemento do `array`, é outro `array`;**
  - **E as linhas (representada por cada `array`), podem ter tamanhos diferentes (número de elementos diferentes);**

- **Exemplos:**

  - **1 - Verificando o tamanho de cada linha da matriz (`array` bidimensional):**
  
    ```java
    class App {
        public static void main(String[] args) {
    
            // Array 2D
            int[][] values = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10}
            };
          
            // Verificando o tamanho de cada linha
            System.out.println("Linha 1: " + values[0].length);
            System.out.println("Linha 2: " + values[1].length);
            System.out.println("Linha 3: " + values[2].length);
        }
    }
    ```
  
  - **2 - Exibindo os valores da matriz (`array` bidimensional):**
  
    ```java
    class App {
        public static void main(String[] args) {
    
            // Array 2D
            int[][] values = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10}
            };
          
            for(int i = 0; i < values.length; i++) {
                for(int j = 0; j < values[i].length; j++)	{
                    System.out.println(values[i][j]);
                }
            }
        }
    }
    ```
  
  - **3 - Exibindo os valores da matriz (`array` bidimensional), utilizando o _loop_ `for-each`:**
  
    ```java
    class App {
        public static void main(String[] args) {
    
            // Array 2D
            int[][] values = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10}
            };
          
            // O primeiro loop acessa o array individual (cada linha)
            for(int[] array: values) {
                // O segundo array acessa cada elemento do array (da linha)
                for(in value: array) {
                    System.out.println(value);
                }
            }
        }
    }
    ```
  
  - **4 - Inicializando e exibindo valores de um `array` tridimensional:**
  
    ```java
    class App {
        public static void main(String[] args) {
    
            // Array 3D
            int[][][] array3D = {
                {
                  {2, 4, 6}, 
                  {8, 10},
                  {12}
                }, 
                { 
                  {1, 3, 5}, 
                  {7, 9}, 
                  {11}
                } 
            };
    
            // Loop for-each
            for (int[][] array2D: array3D) {
                for (int[] array1D: array2D) {
                    for(int value: array1D) {
                        System.out.println(value);
                    }
                }
            }
        }
    }
    
    // Basicamente, um array 3D, é um array de arrays 2D
    ```
  
    
  

