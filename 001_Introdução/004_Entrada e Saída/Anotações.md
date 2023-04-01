# Java

### Saída

- **Em Java, para saída (enviar a saída para a saída padrão - a tela), podemos utilizar:**

  ```java
  System.out.println();
  
  System.out.print();
  
  System.out.printf();
  ```

  - **`System` é uma classe;**
  - **`out` é um campo: `public static` (aceita dados de saída);**

- **Exemplo:**

  ```java
  class App {
      public static void main(String[] args) {
          System.out.println("Hello, World!");   
      }
  }
  ```

- **Diferenças:**

  - **`print()`: imprime a `string` dentro das aspas (e mantém o curso na mesma linha);**
  - **`println()`: semelhante ao `print`, mas o cursor acaba sendo movido para o início da próxima linha;**
  - **`printf()`: fornece formatação de string (semelhante a funções `printf()` das linguagens C e C++);**

- **OBSs.:**

  - **Para imprimir textos, utilizamos aspas duplas, mas para imprimir números, não é necessário o uso de aspas duplas:**

    ```java
    class App {
        public static void main(String[] args) {
            System.out.println(2);
        }
    }
    ```

  - **Também podemos imprimir `strings` concatenadas (utilizando o operador de adição, que nesse caso, assume outro significado - passa a ser o operador de concatenação):**

    ```java
    class App {
        public static void main(String[] args) {
            String myName = "Alex";
            // Primeiro é avaliado o valor armazenado na variável...
            // E em seguida, o valor é concatenado à string
            System.out.println("Olá! " + "Meu nome é " + myName + "!");
        }
    }
    
    // Vejamos que não é necessário o uso de aspas para imprimir os valores armazenados em variáveis
    ```



### Entrada

- **Existem diferentes formas, em Java, de se obter a entrada do usuário e uma delas é utilizando o objeto da classe `Scanner`;**

  - **Para utilizar o objeto da classe `Scanner`, devemos importar o pacote:**

    ```java
    import java.util.Scanner;
    ```

  - **Em seguida criamos o objeto da classe `Scanner`:**

    ```java
    Scanner input = new Scanner(System.in);
    ```

  - **Agora podemos utilizar o objeto criado para receber a entrada do usuário:**

    ```java
    import java.util.Scanner;
    
    class App {
        public static void main(String[] args) {
        	
            Scanner input = new Scanner(System.in);
        	
            System.out.print("Digite o seu nome: ");
            int name = input.next();
            System.out.println("Seja bem-vindo " + name + "!");
    
            // Fechando o objeto Scanner
            input.close();
        }
    }
    ```

    - **No exemplo acima, criamos o objeto `input` da classe `Scanner`;**
    - **Em seguida chamamos o método `next()`, da classe `Scanner`, para obter a entrada, do tipo `String`, do usuário;**
    - **Da mesma, podemos utilizar outros métodos como: `nextInt()`, `nextLong()`, `nextFloat()` e `nextDouble()`, para obter as entradas do tipo: `int`, `long`, `float` e `double`, respectivamente, do usuário;**
    - **Após receber as entradas do usuário, é recomendado fechar o objeto da classe `Scanner`, através do método `close()`;**  