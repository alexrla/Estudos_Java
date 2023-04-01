# Java

### for

- **Na programação, os _loops_ são utilizados para executar um conjunto de instruções, um determinado número de vezes (que podemos conhecer de antemão, ou não);**

  - **Por exemplo, se quisermos exibir uma mensagem na tela 100 vezes, podemos utilizar um _loop_ e executar a instrução `System.out.println("...")` 100 vezes, ao invés de ter que escrevé-la, a instrução, 100 vezes no código;**

- **O `for` é um dos três tipos de _loops_ existentes na linguagem Java:**

  - **Sintaxe:**

    ```java
    for(inicialização; condição; atualização) {
        instruções...
    }
    
    /*
    	1. inicialização
    		- Inicializa ou declara variáveis (é executada apenas uma vez);
    		
        2. condição
        	- É avaliada a cada iteração (volta) do loop (se for verdadeira, o loop continua 
        	sendo executado, se for falsa, o loop é encerrado);
        	
        3 - atualização
        	- atualiza as variáveis declaradas/inicializadas na inicialização;
    */
    ```

- **OBSs.:**

  - **O _loop_ `for` é utilizado quando sabemos o número de iterações (a quantidade de repetições);**
  - **Caso passemos uma condição para um _loop_, na qual ela nunca consiga ser avaliada como falsa, cairemos em um _loop_ infinito (o _loop_ será executado para sempre, ou mais provável, até que a memória se esgote);**
  - **Podemos ter _loops_ `for` aninhados:**
  
    ```java
    for(inicialização; condição; atualização) {
        for(inicialização; condição; atualização) {
        	instruções...
    	}
        
        instruções...
    }
    ```
  
    

