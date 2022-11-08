package smartphone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\nVerificando Conexão Smartphone");

        Scanner scan = new Scanner(System.in);
        SmartPhoneService service = new SmartPhoneService();
        String marca;
        String modelo;
        String cor;
        Integer ano;
        Boolean conectividade5g = false;

        System.out.println("\tBem Vindo ao Teste de Conexão 5G");

        System.out.print("Marca: ");
        marca = scan.nextLine();
        System.out.print("Modelo: ");
        modelo = scan.nextLine();
        System.out.print("Cor: ");
        cor = scan.nextLine();
        System.out.print("Ano: ");
        ano = scan.nextInt();

        service.testeConectividade(conectividade5g);
        System.out.println(new SmartPhone(marca, modelo, cor, ano, conectividade5g));
    }
}
