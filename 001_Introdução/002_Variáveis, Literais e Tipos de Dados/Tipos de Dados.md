# Java

### Tipos de Dados 

- **Especificam o tipo de dado que podemos armazenar em uma variável;**



#### Tipos de dados primitivos

- **Tipo booleano:**

  - **Aceita somente os valores `true` ou `false`;**

  - **Geralmente, são utilizados em condições;**

    ```java
    boolean flag1 = true;
    boolean flag2 = false;
    ```

- **Typo _byte_:**

  - **Aceita valores (inteiros) no intervalo fechado de: `[-128, 127]`;**

  - **Pode ser utilizada para economizar memória;**

    ```java
    byte number = 125;

- **Tipo _short_:**

  - **Aceita valores (inteiros) num intervalo maior do que o tipo `byte`: `[-32768, 32767]`;**

    ```java
    short distance = 2000; 
    ```

- **Tipo int:**

  - **Aceita valores (inteiros) no intervalo de: `[-2.147.483.648, 2.147.483.647]`;**

    - **De `-2³¹` a `2³¹ - 1`;**
    
    ```java
    int range = -842674;
    ```

- **Tipo _long_:**

  - **Aceita valores (inteiros) no intervalo de: `[-9.223.372.036.854.775.808, 9.223.372.036.854.775.807]`;**

    - **De `-2⁶³` a `2⁶³ - 1` 
    
    ```java
    long bigNumber = 800000000000L;
    
    // A letra L ao final do valor, indica um número inteiro do tipo long
    ```

- **Tipo double:**

  - **Tipo de dados de ponto flutuante (apresenta uma parte decimal/fracionária/exponencial);**

  - **Ponto flutuante de dupla precisão;**

    ```java
    double value = 52.673;
    ```

- **Tipo float:**

  - **Tipo de dados de ponto flutuante;**

  - **Ponto flutuante de precisão simples;**

    ```java
    float value = -45.13f;
    
    /*
    	Vejamos que para o tipo float, devemos informar ao final do valor, as letras f/F para indicar 
    	ao compilador que valor trata-se de um float, ao invés de um double;
    */
    ```

- **Tipo char:**

  - **Caractere unicode, representado entre aspas simples (apóstrofos);**

    ```java
    char letter1 = '\u0051'; // Letra Q
    char letter2 = '4';
    char letter3 = 65; // Valor ASCII da letra A
    ```



#### Tipos de dados referenciados

- **Tipo string:**

  - **Sequência de caracteres entre aspas duplas;**

    ```java
    String poo = "Programação Orientada a Objetos";
    ```

    

| Tipo de dado |      Tamanho      | Primitivo/Referenciado |                   Valor (es)                   |
| :----------: | :---------------: | :--------------------: | :--------------------------------------------: |
|   boolean    |       1 bit       |       primitivo        |                 ture ou false                  |
|     byte     | 1 byte / 8 bites  |       primitivo        |                   -128 a 127                   |
|    short     | 2 bytes / 16 bits |       primitivo        |                -32.768 a 32.767                |
|     int      | 4 bytes / 32 bits |       primitivo        |             -2 bilhões a 2 bilhões             |
|     long     | 8 bytes / 64 bits |       primitivo        |         -9 quintilhões a 9 quintilhões         |
|              |                   |                        |                                                |
|    float     | 4 bytes / 32 bits |       primitivo        |  Valores decimais/fracionados de 6/7 dígitos   |
|    double    | 8 bytes / 64 bits |       primitivo        | Valores decimais/fracionados de até 15 dígitos |
|              |                   |                        |                                                |
|     char     | 2 bytes / 16 bits |       primitivo        |     caracteres únicos/letras/valores ASCII     |
|    String    |     Variável      |      referenciado      |            Sequência de caracteres             |
