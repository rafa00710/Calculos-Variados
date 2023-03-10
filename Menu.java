package CalculosVariados;

import java.util.Scanner;

public class Menu extends PadraoCalculos {


    public void menu() {
        Scanner menu = new Scanner(System.in);


        while (true) {

            System.out.print("        Calculos:          \n\n");
            System.out.print("|------------------------  |\n");
            System.out.print("| Opção 1 - Soma           |\n");
            System.out.print("| Opção 2 - Subtração      |\n");
            System.out.print("| Opção 3 - Divisão        |\n");
            System.out.print("| Opção 4 - Multiplicação  |\n");
            System.out.print("| Opção 5 - Potenciação    |\n");
            System.out.print("| Opção 6 - Calculadora IMC|\n");
            System.out.print("| Opção 7 - Circulo        |\n");
            System.out.print("| Opção 8 - Quadrado       |\n");
            System.out.print("| Opção 9 - Retângulo      |\n");
            System.out.print("| Opção 10 - Sair          |\n");
            System.out.print("|--------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 10) {
                System.out.print("\nAté logo!");
                menu.close();
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    this.setA(menu.nextFloat());

                    System.out.println("Digite o segundo valor: ");
                    this.setB(menu.nextFloat());


                    soma();


                    break;


                case 2:

                    System.out.println("Digite o primeiro valor: ");
                    this.setA(menu.nextFloat());

                    System.out.println("Digite o segundo valor: ");
                    this.setB(menu.nextFloat());


                    subtracao();
                    break;

                case 3:

                    System.out.println("Digite o primeiro valor: ");
                    this.setA(menu.nextFloat());

                    System.out.println("Digite o segundo valor: ");
                    this.setB(menu.nextFloat());


                    divisao();
                    break;

                case 4:

                    System.out.println("Digite o primeiro valor: ");
                    this.setA(menu.nextFloat());

                    System.out.println("Digite o segundo valor: ");
                    this.setB(menu.nextFloat());


                    multiplicacao();
                    break;

                case 5:

                    System.out.println("Digite o primeiro valor: ");
                    this.setA(menu.nextFloat());

                    System.out.println("Digite o segundo valor: ");
                    this.setB(menu.nextFloat());


                    potenciacao();
                    break;

                case 6:


                    System.out.println("Peso da Pessoa (kg): ");
                    this.setPeso(menu.nextFloat());

                    System.out.println("Altura da Pessoa (m): ");
                    this.setAltura(menu.nextFloat());


                    System.out.printf("IMC da Pessoa = %.1f - %s\n",
                            this.calcularIMC(), this.classificarIMC());


                    break;


                case 7:

                    System.out.println("Escreva o valor do raio: ");
                    this.setRaio(menu.nextFloat());

                    circulo();

                    break;

                case 8:

                    System.out.println("Entre com a base: ");
                    this.setBase(menu.nextFloat());


                    System.out.println("Entre com a altura: ");
                    this.setAltura(menu.nextFloat());

                    quadrado();

                    break;

                case 9:

                    System.out.println("Entre com a base: ");
                    this.setBase(menu.nextFloat());


                    System.out.println("Entre com a altura: ");
                    this.setAltura(menu.nextFloat());

                    retangulo();

                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;


            }
        }
    }
}






















