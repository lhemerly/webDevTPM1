/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3_5;

/**
 *
 * @author Luiz Hemerly
 */

import java.util.Scanner; // importa uma library que estende as funcionalidades do programa

public class Aula3_5 { // nome da classe igual o nome do arquivo

    public static void main(String[] args) { // main será executado quando executar o programa
        
        int choice = 0; // variável de seleção de menu na linha de comando
        Scanner selection = new Scanner (System.in); // criou um novo objeto scanner para receber inputs
        
        while(choice != 9){ // loop do menu principal. Enquanto o usuário não selecionar opção 9 ele ficará aqui
            System.out.println("Selecione uma opção:"); // fiz em vários printLn(nova linha) mas poderia ter feito em um bloco de texto (tem um exemplo no programa 3)
            System.out.println("1 - Programa 1");
            System.out.println("2 - Programa 2");
            System.out.println("3 - Programa 3");
            System.out.println("9 - Sair");
            choice = selection.nextInt(); // recebe o input do usuário em forma de Int
            
            switch (choice){ // 
                
                /**
                 * switch é uma estrutura condicional que tem nos vídeos da aula. 
                 * Basicamente ele testa a variável dentro de switch para cada case e executa o que vem em seguida.
                 * pode ser mais legível do que vários IFs
                 */
                
                case (1) -> programa1();
                   
                case (2) -> programa2();
                    
                case (3) -> programa3();
                    
                default -> { // default no switch é o que ele vai executar caso não atenda nenhuma das opções
                }
            }
            
            System.out.println("\n");
            
        }
        
    }
    
    public static void programa1(){
        int num1, num2; //declaração de variáveis Int
        double div; //declaração de variáveis Double 
        Scanner entry = new Scanner (System.in); // Novo objeto do tipo Scanner para inputs do sistema
        System.out.println("Digite um numero inteiro maior que 100 (ex: 150): "); // Imprime texto na tela
        num1 = entry.nextInt(); // atribui à variavel num1 a próxima entrada do usuário como Int
        System.out.println("Digite um numero inteiro menor que 10 (ex: 6: "); // Imprime texto na tela
        num2 = entry.nextInt(); // atribui à variavel num2 a próxima entrada do usuário como Int
        if ((num1 > 100) && (num2 < 10)){ // Testa se os dois numeros fornecidos atendem, ao mesmo tempo, as restrições
            System.out.println("Muito bem, valores válidos!"); // Imprime texto na tela
            div = num1/num2; // Atribui à variável div o resultado da divisão do num1 pelo num2
            System.out.println("O valor da divisão é: " + div); // Imprime texto na tela
        } else if ((num1<100 && num2 < 10) || (num1 > 100 && num2 > 10)){ // Se o IF não for verdadeiro testa se OU (||) num1 não atende e num2 atende e vice versa
            System.out.println("Um dos numeros está fora do limite."); // Imprime texto na tela
        } else { // Se nenhum dos testes anteriores for verdadeiro
            System.out.println("Você não respeita as regras."); // Imprime texto na tela
        }
    }
    
    public static void programa2(){ 
        int num1, num2 = 20, num3; // declara 3 ints, num1 e num3 sem atribuição de valor e num2 com atribuição de valor 20
        Scanner entry = new Scanner (System.in); // novo objeto Scanner recebendo entradas do sistema
        System.out.println("Digite um numero inteiro: "); // Imprime texto
        num1 = entry.nextInt(); // Aguarda input do usuário no formato Int
        num2 += num1; // Soma num1 ao num2. Equivalente a escrever num2 = num2 + num1
        if ((num1%2) == 0){ // testa se o resto de num1 dividido por 2 é zero (ou seja, se é divisivel por 2 ou par)
            num3 = num1*4; // atribui a num3 o valor de num1 multiplicado por 4
        } else if ((num2%3) == 0){ // se o IF for falso, testa se o resto de num2 divido por 3 é zero (ou seja, se é divisivel por 3)
            num3 = num2 + 2*num1; // atribui a num3 a soma de num2 com 2 vezes num 1
        } else { // se todos os testes anteriores forem falsos
            num3 = num2; // atribui a num3 o valor de num2
        }
        
        System.out.println("O valor de Num2 é = " + num2); //imprime texto e o valor de num2. Incluí essa saída que não estava na apostila pois algumas perguntas solicitam o valor de num2. Você pode chegar no valor de num2 somente interpretando o código também.
        System.out.println("O valor de Num3 é = " + num3); //imptime texto e o valor de num3.
        
    }
    
    public static void programa3(){
        int choice; // declaração de uma variável int. Essa variável será utilizada no menu. No programa da apostila tem nome "aux"
        boolean a_vista, carro_novo, seguir; // declaração de variáveis booleanas (verdadeiro ou falso). Usei nomenclatura com _ que é mais comum
        double desconto, valor_carro; // declaração de variáveis double, ou números reais
        Scanner entry = new Scanner (System.in); // novo objeto Scanner para input do usuário
        
        do{ // Loop Do While. Ele executa o código dentro dele e checa a condição no final (dentro do while). Se a condição for verdadeira ele executa de novo
            desconto = 0; // atribuição da variável desconto. Esse primeiro bloco de atribuição de variáveis é o reset dos valores para uma nova cotação
            a_vista = false;
            seguir = false;
            System.out.println("""
                               PROGRAMA PARA VENDA DE CARRO 
                               
                               Digite o valor do carro (ex: 75000)"""); //Impressão de texto usando bloco de texto. Alternativamente pode-se utilizar \n para pular uma linha
            valor_carro = entry.nextDouble(); // atribui a variavel valor_carro o próximo input do usuário no formato Double
            System.out.println(" O pagamento será a vista? \n Aperte 1 para SIM e outro número para NÃO:"); //imprime texto
            choice = entry.nextInt(); // Atribui o input do usuário à variável choice
            
            a_vista = switch (choice) {
                /**
                 * Atribuição avançada de variável usando switch que substitui o formato apresentado no enunciado.
                 * Atribui o resultado do switch à variável.
                 */
                case (1) -> true;
                default -> false;
            };
            
            System.out.println("O carro escolhido é 0KM? \n Aperte 1 para SIM e outro número para NÃO:"); // imprime texto
            choice = entry.nextInt(); // recebe próximo input como Int
            
            carro_novo = switch (choice) { // atribui resultado do switch à variável como acima
                case (1) -> true;
                default -> false;
            };
            
            if (a_vista && carro_novo) { // Checa se as variáveis são verdadeiras em conjunto (AND). Note que não é necessário fazer == true.
                desconto = 0.15; // atribui valor à variável desconto
            } else if (a_vista) { // Se o IF for falso, checa se a variável a_vista é verdadeira
                desconto = 0.08; // atribui valor à variável desconto
            } else if (carro_novo) { // Se as condicionais acima forem falsas, checa se caro_novo é verdadeira
                desconto = 0.05; // atribui valor à variável desconto
            } else { // Se todas as condicionais forem falsas, executa o código abaixo
                System.out.println("Ofereça um Café para o cliente."); // Imprime texto
            }
            
            valor_carro -= (valor_carro*desconto); // Atribui a valor_carro o prórpio valor menos o valor vezes o desconto. Equivalente: valor_carro = valor_carro - valor_carro * desconto
            System.out.println("Valor final para pagamento: " + valor_carro); // imprime valor carro com desconto
            System.out.println("\n\n\n\n\nCalcular o valor de uma nova venda? (Aperte 1)"); // imprime texto. \n pula linha
            System.out.println("Encerrar o programa (Aperte outro número)"); // imprime texto. Todo println começa pulando uma linha automaticamente
            choice = entry.nextInt(); // atribui input do usuário em forma int à variavel choice
            
            seguir = switch (choice){ // atribuição de variável com resultado do switch como acima
                case (1) -> true;
                default -> false;
            };
            
        } while (seguir); // Teste para seguir o loop. O loop poderia ser um While. Recomendo fazer o teste de como seria o código usando While ao inves de Do While
    }
    
}
