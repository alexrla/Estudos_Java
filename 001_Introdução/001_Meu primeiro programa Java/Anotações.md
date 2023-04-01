# Java

### Criando o primeiro projeto Java no VSCode

- **Linux ou Windows: `ctrl + shift + p`;**
- **No menu que será aberto, clicamos na opção: `Java: Create Java Project`;**
- **Em seguida, clicamos na opção `No build tools`;**
  - **Será perguntado onde queremos salvar o projeto e com qual nome queremos salvá-lo;**



### Primeiro programa Java

```java
// Meu primeiro programa Java

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- **`// Meu primeiro programa Java`: em Java, as linhas que começam com `//` (dupla barra), são comentários;**
  - **Comentários são destinados a documentação de código, para o próprio autor e outros programadores, entenderem o que foi feito, as funcionalidades implementadas;**
  - **Eles são completamente ignorados pelos compiladores Java;**
- **`public class App { ... }`: em Java, todo programa começa pela definição de uma classe;**
  - **O nome da classe deve corresponder ao nome do arquivo em Java;**
- **`public static void main(String[] args) { ... }`: método principal;**
  - **Todo programa Java deve conter o método principal;**
  - **O compilador Java começa a executar o programa a partir do método principal;**
- **`System.out.println("Hello, World!")`: instrução de impressão;**
  - **Exibe na tela (saída padrão) o texto `Hello, World!`;**
- **OBSs.:**
  - **Todo programa Java válido, deve ter uma definição de classe (que corresponde ao nome do arquivo);**
  - **O método `main` deve estar dentro da definição da classe;**
  - **O compilador executa os códigos a partir do método `main`;**



### JVM

- **Java Virtual Machine;**
- **Permite que o nosso computador execute programas Java;**
- **Quando executamos programas Java, o compilador Java transforma esse código Java em _bytecode_ (código intermediário entre o código fonte e o código de máquina) e em seguida a `JVM` traduz esse _bytecode_  é código de máquina (código que o processador entende);**
- **Java é uma linguagem independente de plataforma;**
  - **O código Java é escrito para `JVM`. É ela quem vai traduzir o _bytecode_ (o código Java compilado) para código de máquina;**
  - **E como as `JVM` estão disponíveis para diferentes plataformas, o código Java pode ser executados em qualquer sistema operacional;**



### JRE

- **Java Runtime Environment;**
- **Ambiente de execução;**
- **Pacote de _software_ que fornece bibliotecas e componentes Java (incluindo a `JVM`), para que seja possível a execução de programas Java;**
  - **Se precisarmos apenas executar códigos Java, mas queremos desenvolver nada em Java, o `JRE` é o suficiente;**



### JDK

- **Java  Development Kit;**
- **Ambiente de desenvolvimento;**
- **Kit de desenvolvimento de software, necessário para desenvolver aplicativos em Java;**
- **Ao baixar e instalar o `JDK`, outras ferramentas como o `JRE`, acabam vindo junto no pacote;**



<img src="./java.png" />
