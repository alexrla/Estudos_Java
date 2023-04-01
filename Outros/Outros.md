# Java

### Palavras-chaves e identificadores

- **Palavras-chaves são as palavras reservadas/pré-definidas da linguagem;**

  - **Elas possuem um significado especial para o compilador;**
  - **Elas compõem a sintaxe da linguagem;**

- **Não podemos utilizar palavras-chave da linguagem, como identificadores (nomes de variáveis);**

- **Lista de palavras-chave no Java:**

  |    abstract    |      assert      |    boolean    |     break      |    byte    |
  | :------------: | :--------------: | :-----------: | :------------: | :--------: |
  |    **case**    |    **catch**     |   **char**    |   **class**    | **const**  |
  |  **continue**  |   **default**    |    **do**     |   **double**   |  **else**  |
  |    **enum**    |   **extends**    |   **final**   |  **finally**   | **float**  |
  |    **for**     |     **goto**     |    **if**     | **implements** | **mport**  |
  | **instanceof** |     **int**      | **interface** |    **long**    | **native** |
  |    **new**     |   **package**    |  **private**  | **protected**  | **public** |
  |   **return**   |    **short**     |  **static**   |  **strictfp**  | **super**  |
  |   **switch**   | **synchronized** |   **this**    |   **throw**    | **throws** |
  | **transient**  |     **try**      |   **void**    |  **volatile**  | **while**  |

- **Além dessas palavras-chaves, também temos: `true`, `false` e `null` (literais em Java), que também são palavras reservadas da linguagem;**



### var

- **Palavra-chave introduzida no Java 10;**

- **Quando inicializamos uma variável declarada com a palavra-chave `var`, é realizado a inferência de tipo, que detecta automaticamente, o tipo de dado daquela variável:**

  ```java
  // int
  var number = 2;
  
  // double
  var pi = 3.14;
  
  // char
  var letter = 'A';
  
  // String
  var name = "Alex";
  
  // boolean
  var option = true;
  ```

  - **OBSs.:**
    - **Podemos declarar uma variável de qualquer tipo de dado, com a palavra-chave `var`;**
    - **Também podemos utilizá-la para declarar variáveis locais;**
    - **Agora, ela não pode ser utilizada em instâncias;**
    - **Não pode ser utilizada para declarar variáveis globais;**
    - **Não pode ser utilizado com, nem como um tipo genérico;**
    - **Não pode ser utilizada sem uma inicialização explícita;**
    - **Não pode ser utilizada com expressão lambda;**
    - **Não pode ser utilizada para parâmetros de métodos e nem tipo de retorno;**



### Constantes

- **Para declarar constantes ("variáveis" que não podemos alterar o seu valor, após a sua inicialização), utilizamos a palavra-chave `final`:**

  ```java
  final double PI = 3.14;
  ```



### Operador ternário (operador condicional)

- **Avalia a "condição de teste" "e executa um bloco de código/expressão, com base na avaliação da condição;**

  - **Em determinadas situações substitue a instrução `if... else`;**

- **`Sintaxe`:**

  ```
  condição ? expressão1 : expressão2;
  ```

  - **A `condição` é avaliada e:**
    - **Se for verdadeira (`true`), executa `expressão1`;**
    - **Se for falsa (`false`), executa `expressão2`;**

- **OBS.: Leva esse nome (operador ternário), porque é definido a partir de três operandos (`condição`, `expressão1` e `expressão2`);**

- **Exemplo:**

  ```java
  import java.util.Scanner;
  
  class App {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
        
      System.out.print("Digite um número: ");
      int number = input.nextInt();
      
    	input.close();
    
      String result = (number % 2 == 0) ? (number + " é um número par") : (number + " é um número ímpar");
        
      System.out.println(result);
    }
  }
  ```

- **Operadores ternários aninhados**

  - **Também podemos ter operadores ternários, dentro de operadores ternários:**

    ```java
    // Encontrando o maior entre 3 números
    
    class App {
      public static void main(String[] args) {
        
        int n1 = 6, n2 = 21, n3 = 17;
    
        int bigger = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
          
        System.out.println("O maior número é: " + bigger);
      }
    }
    
    /*
    	Vejamos:
    		- Primeira condição: n1 >= n2;
            - Segunda condição: n1 >= n3 (avaliada se a primeira condição for verdadeira);
            - Terceira condição: n2 >= n3 (avaliada se a primeira condição for falsa);
    */
    ```

  - **Não é recomendado o uso de operadores ternários aninhados, pois essa prática pode tornar o código complexo;**

  

### Precedência de operadores

- **A precedência de operadores determina a ordem na qual os operadores, em uma expressão, são avaliados;**

- **Tabela de precedência de operadores (de maior precedência para o de menor):**

  |                          Operadores                          |
  | :----------------------------------------------------------: |
  |                  **++**, **--** (pós-fixo)                   |
  |    **+**, **-**, **~**, **!**, **++**, **--** (pré-fixo)     |
  |                     *****, **/**, **%**                      |
  |                        **+**, **-**,                         |
  |                   **<<**, **>>**, **>>>**                    |
  |        **<**, **>**, **<=**, **>=**, **`instanceof`**        |
  |                        **==**, **!=**                        |
  |                            **&**                             |
  |                            **^**                             |
  |                            **\|**                            |
  |                            **&&**                            |
  |                           **\|\|**                           |
  |                 **? : **(operador ternário)                  |
  | **=**, **+=**, **-=**, **\*=**, **/=**, **%=**, **&=**, **\|=**, **<<=**, **>>=**, **>>=** |

- **Ao trabalharmos com expressões que envolvem muitos operadores e operandos, podemos utilizar parêntes, para maior clareza na visualização das operações e para definirmos a ordem na qual as operações irão ocorrer (tudo entre parênteses é avaliado e feito primeiro);**



### Associatividade de operadores

- **Se uma expressão tiver dois operadores de mesma precedência, a expressão será realizada de acordo com a sua associatividade (da esquerda para à direita ou da direita para à esquerda);**

  

  |                          Operadores                          |        Associatividade         |
  | :----------------------------------------------------------: | :----------------------------: |
  |                        **++**, **--**                        | **Da esquerda para à direita** |
  |          **+**, **-**, **~**, **!**, **++**, **-**           | **Da direita para à esquerda** |
  |                     *****, **/**, **%**                      | **Da esquerda para à direita** |
  |                        **+**, **-**,                         | **Da esquerda para à direita** |
  |                   **<<**, **>>**, **>>>**                    | **Da esquerda para à direita** |
  |        **<**, **>**, **<=**, **>=**, **`instanceof`**        | **Da esquerda para à direita** |
  |                        **==**, **!=**                        | **Da esquerda para à direita** |
  |                            **&**                             | **Da esquerda para à direita** |
  |                            **^**                             | **Da esquerda para à direita** |
  |                            **\|**                            | **Da esquerda para à direita** |
  |                            **&&**                            | **Da esquerda para à direita** |
  |                           **\|\|**                           | **Da esquerda para à direita** |
  |                           **? :**                            | **Da direita para à esquerda** |
  | **=**, **+=**, **-=**, **\*=**, **/=**, **%=**, **&=**, **\|=**, **<<=**, **>>=**, **>>=** | **Da direita para à esquerda** |



### System.out.printf()

- **Exibe a saída do dados, formatada;**

- **O primeiro argumento consiste em literais de texto e especificadores de formato;**

  - **Os especificadores de formato são  códigos que indicam onde e que tipo de dado será exibido na saída;**

  - **Os especificadores de formato começam pelo símbolo de porcentagem e em seguida temos uma letra que indica o tipo de dado;**

    |   Especificador    |                         Tpo de dado                          |
    | :----------------: | :----------------------------------------------------------: |
    |       **%s**       |                            String                            |
    |       **%d**       |               Número inteiro decimal (base 10)               |
    |       **%u**       |               Número inteiro decimal sem sinal               |
    |       **%o**       |           Número inteiro octal (base 8) sem sinal            |
    | **%x** \|\| **%X** | Número inteiro hexadecimal (base 16) sem sinal - minúsculo/maiúsculo |
    |       **%f**       |                       float \| double                        |
    | **%e** \|\| **%E** |   Número real, em notação científica - minúsculo/maiúsculo   |
    |       **%b**       |                           boolean                            |
    |       **%c**       |                             char                             |

- **O segundo argumento consiste no valor/variável, a ser exibido na saída;**

- **Exemplo:**

  ```java
  int number = 2;
  float price = 12.5f;
  double value = 3.2;
  String name = "Jenna Melissa";
  char letter = 'A';
  
  // int
  System.out.printf("Number: %d\n", number);
  
  // float
  System.out.printf("Price: %f\n", price);
  
  // Double - Informando o número de casas decimais
  System.out.printf("Value: %.3f\n", value);
  
  // String
  System.out.printf("Name: %s\n", name);
  
  // char
  System.out.printf("Letter: %c\n", letter);
  ```

- **Caracteres de escape:**

  | Caractere |        Representa         |
  | :-------: | :-----------------------: |
  |  **\t**   |         Tabulação         |
  |  **\b**   |        _Backspace_        |
  |  **\t**   |        Nova linha         |
  |  **\t**   |     Retorno de carro      |
  |  **\\'**  | Aspas simples / Apóstrofo |
  |  **\\"**  |        Aspas dupla        |
  | **\\\\**  |      Barra invertida      |
  |           |                           |
  |  **%%**   |  Símbolo de porcentagem   |



### _Loops_ aninhados

- **_Loops_ aninhados consiste em _loops_ dentro de _loops_;**

  - **_Loops_ `for` aninhados:**

    ```java
    // Loop mais externo
    for(int i = 0; i < n; i++) {
      ...
    
      // Loop mais interno
      for(int j = 0; j < n; j++) {
        ...
      }
        
      ...
    }
    ```

  - **_Loops_ `while` aninhados:**

    ```java
    // Loop mais externo
    while(condição) {
      ...
    
      // Loop mais interno
      while(condição) {
        ...
      }
        
      ...
    }
    ```

  - **Também podemos ter _loops_ `while` dentro de _loops_ `for` e vice-versa:**

    ```Java
    // Loop mais externo
    while(condição) {
        ...
            
    	// Loop mais interno
        for(int i = 0; i < n; i++) {
          ...
        }
        
        ...
    }
    ```

- **Quando utilizamos instruções `break` e `continue` em _loops_ internos, os _loops_ externos não são afetados, por exemplo:**

  ```java
  // Loop mais externo
  while(condição) {
    ...
  
    // Loop mais interno
    while(condição) {
       ...
           
       // Somente o loop mais interno é afetado (nesse caso, encerrado)
      if(condição) {
      	break;
      }
    }
      
    ...
  }
  ```

  

### Packages (Pacotes)

- **Pacotes são simplesmentes "contêineres", que agrupam tipos relacionados (classes, interfaces, etc.);**
  - **Uma regra na programação Java é de que em um projeto Java, só é permitido um nome de classe exclusivo. Porém, podemos incluir classes de mesmo nome em nosso projeto, pertencentes a pacotes diferentes. Como o caso da classe `Date`, que pertencem a dois pacotes diferentes:**
    - **`java.util.Date`: utilizada para trabalhar com datas de forma normal;**
    - **`java.sql.Date`: utilizada  para trabalhar com datas em consultas SQL;**

- **Os pacotes são divididos em duas categorias:**
  - **Pacotes embutidos/integrados:**
  
    - **São os pacotes javas existentes, que acompanham o JDK. Por exemplo:**
  
      **- `java.lang`;**
  
      **- `java.util`;**
  
      **- `java.io`; **
  
  - **Pacotes definidos pelo usuário:**
  
    - **São os pacotes que nós mesmos criamos (podemos criar pacotes conforme a nossa necessidade);**
  
    - **Convenção de nomenclatura de pacotes:**
  
      **- O nome do pacote deve ser exclusivo;**
  
      **- Existe uma convenção para criar um pacote como um nome de domínimo, mas na ordem inversa. Ex.: `com.company.name`;**
  
    - **Cada nível do pacote é um diretório no nosso sistema de arquivos;**
  
      **- Não há limitação de quantos subdiretórios (hierarquia de pacotes), podemos criar;**

- **Importação de pacotes:**

  - **Para importar pacotes (um pacote inteiro ou algumas classes e interfaces definidas no pacote), podemos utilizar a palavra-chave `import` (que é opcional no Java)**:

    ```java
    import pacote.nome_do_pacote.Classe; // Importar determinada classe
    import pacote.nome_do_pacote.*; // Importar o pacote inteiro
    ```

  - **Se quisermos utilizar uma classe/interface de um determinado pacote, podemos utilizar o seu nome "totalmente qualificado", incluindo sua hierarquia completa de pacotes:**

    ```java
    // Com import
    importar java.util.Date; 
    
    class MinhaClasse implements Date { 
        ... 
    }
    
    // Sem import - Com o nome totalmente qualificado
    class MinhaClasse implements java.util.Date { 
        ...
    }
    ```




