package POO;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;



public class Carro {

    private String marca;
    private String modelo;
    private int ano;



    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void exibirInfo(){

        System.out.println("\nMarca: "+marca+"\nModel: "+modelo+"\nAno: "+ano);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Carro Toyota = new Carro("Toyota", "Corolla", 2022);

        Carro Honda = new Carro("Honda", "Civic", 2020);

        Toyota.exibirInfo();
        Honda.exibirInfo();

        String escolha;

        System.out.println("Qual carro voce deseja?:");
        escolha = scanner.nextLine();

        if (escolha.equals("Honda")){

            System.out.println("O carro escolhido foi um Honda Civic 2020 avalido em 170.000");
        }
        else if (escolha.equals("Toyota"))
            System.out.println("O carro escolhido foi um Toyota Corolla 2022 avalido em 220.000");

        float valorEntrada;
        float valorFinal;

        float valorHonda = 170000F;
        float valorToyota = 220000F;

        System.out.println("Qual vai ser o valor de entrada ?");
        valorEntrada = scanner.nextFloat();

        if (escolha.equals("Honda")){

            valorFinal = valorHonda - valorEntrada;

            DecimalFormat formato = new DecimalFormat("#,###");
            System.out.println("O valor final ficara em "+ formato.format(valorFinal));

            float parcelas;

            System.out.println("Em quantas vezes deseja parcelar o valor ?: ");
            parcelas = scanner.nextFloat();

            float valorParcelas = valorFinal / parcelas;

            DecimalFormat format = new DecimalFormat("#,###");
            System.out.println("O valor das parcelas vao ficar em "+formato.format(valorParcelas));

        } else if (escolha.equals("Toyota")) {

            valorFinal = valorToyota - valorEntrada;

            DecimalFormat formato1 = new DecimalFormat("#,###");
            System.out.println("O valor final ficara em "+ formato1.format(valorFinal));

            float parcelas;

            System.out.println("Em quantas vezes deseja parcelar o valor ?: ");
            parcelas = scanner.nextFloat();

            float valorParcelas = valorFinal / parcelas;

            DecimalFormat formato2 = new DecimalFormat("#,###");
            System.out.println("O valor das parcelas vao ficar em "+formato2.format(valorParcelas));

        }




    }
}
