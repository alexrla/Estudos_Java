# Java

### Variáveis

- **Uma variável corresponde a um espaço reservado na memória, utilizadao para armazenar um dado;**

- **Para indicar esse espaço reservado na memória, cada variável recebe um nome (um identificador) que deve ser único;**

- **Criando variáveis em Java (sintaxe):**

  ```java
  tipo_de_dado identificador; // Declaração de variável
  
  identificador = valor; // Atribuindo valor a variável variável
  
  tipo_de_dado identificador = valor; // Inicializando a variável
  ```

- **OBSs.:**

  - **Java é uma linguagem estaticamente tipada (todas as variáveis devem ser declaradas antes de serem utilizadas);**

  - **Após inicializarmos uma variável, ou atribuirmos um valor para ela, podemos alterar o seu valor. O que não podemos fazer é alterar o seu tipo (dentro do mesmo escopo), após realizar a sua declaração;**

    

#### Regras para nomear variáveis em Java

- **Java possue o seu próprio conjunto de regras e convenções, para nomear variáveis:**
  - **Não podemos utilizar palavras-chave da linguagem Java, como identificadores;** 
  - **Java diferencia letras maiúsculas de minúsculas (_case sensitive_);**
  - **Os nomes das variáveis podem começar com uma letra, um sublinado ou um cifrão ($);**
  - **Os nomes das variáveis não devem começar com um número e elas não devem conter espaços em branco (nome com mais de uma palavra, não podem utilizar o espaço em branco como separador);**
  - **Não podemos utilizar caracteres especiais (`@`, `#`,  etc.) para nomear variáveis;**
  - **Utiliza o padrão camelCase (em nomes de variáveis com mais de um palavra, a primeira deve possuir todas as letras minúsculas, enquanto as demais devem ser iniciadas com uma letra maiúscula);**




#### Tipos de variável

- **Na linguagem Java, existem 4 tipos de variáveis:**
  - **Variáveis de instância (campos não estáticos);**
  - **Variáveis de classe (campos estáticos);**
  - **Variáveis locais;**
  - **Parâmetros;**



### Literais

- **Literais são dados para representar valores fixos (eles podem ser utilizados diretamente no código):**

  ```java
  // Literais booleanos
  true
  false
      
  /*
  	Literais inteiros
  		- Binário (base 2);
  		- Decimal (base 10);
  		- Octal (base 8);
  		- Hexadecimal (base 16);
  */
  // Binário
  0b10010 // Binário começa com 0b
      
  // Octal
  027 // Octal começa com 0
      
  // Decimal
  34
      
  // Hexadecimal
  0x2f // Hexadecimal começa com 0x
  
  // Literais de ponto flutuante
  3.4
  5.2f
  10.25F
  3.445e2 // 3.445*10^2
  
  // Literais de caractere
  'a'
      
  /*
  	Também podemos utilizar as sequências de escape como literais de caractere:
  	- \n;
  	- \t;
  	- .
  	- .
  	- .
  */
      
  // Literais de string
  "Java"
  ```

  
