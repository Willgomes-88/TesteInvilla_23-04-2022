import java.util.Scanner;

public class testeFormula1 {
/*Uma equipe da Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque de um de seus carros para que ele possa percorrer um
determinado número de voltas até o primeiro reabastecimento. Escreva um programa (EM QUALQUER LINGUAGEM) que leia o comprimento da pista (em metros),
o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L).
Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. Considere que
o número de voltas entre os reabastecimentos é o mesmo.

 */

    public static void main(String[] args) {
        double comprimPista, consumo, comprimTotal, consumoTotal, quantidadeMinim;
        int totalVoltas, qtdReabast;



        Scanner scan = new Scanner(System.in);
        System.out.println("Comprimento da pista (M): ");
        comprimPista= scan.nextDouble();
        System.out.println("Total de voltas: ");
        totalVoltas = scan.nextInt();
        System.out.println("Reabastecimentos: ");
        qtdReabast = scan.nextInt();
        System.out.println("Consumo de combustivel (Km/l): ");
        consumo = scan.nextDouble();

       comprimTotal = comprimPista * totalVoltas;
       consumoTotal = comprimTotal / (consumo*1000);
       quantidadeMinim = consumoTotal / qtdReabast;

        System.out.println("Quantidade minima de litros de combustivel necessario para o primeiro resbastecimento: " + String.format("%.2f litros" ,quantidadeMinim));






    }



}









