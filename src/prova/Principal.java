package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quadrado square = new Quadrado("Quadrado");
        Cubo cube = new Cubo("Cubo");

        try {
            System.out.print("Medida do lado do quadrado: ");
            double side = input.nextDouble();
            input.nextLine();
            square.setSide(side);
            System.out.print("Cor do quadrado: ");
            String color = input.nextLine();
            square.setColor(color);
            System.out.print("Medida da aresta do cubo: ");
            double aresta = input.nextDouble();
            input.nextLine();
            cube.setAresta(aresta);
            System.out.print("Cor do cubo: ");
            color = input.nextLine();
            cube.setColor(color);
        } catch (Exception e) {
            System.out.println("[ERRO] " + e.getMessage());
        }


        ArrayList<Figura> list = new ArrayList<>();
        list.add(square);
        list.add(cube);

        for (int i = 0; i < list.size(); i++) {
            Figura figure = list.get(i);
            System.out.println("-------------------------");
            if (figure instanceof Volume) {
                System.out.println("Nome: " + figure.getName());
                System.out.println("Cor: " + figure.getColor());
                System.out.println("Area: " + ((Cubo) figure).calculateArea());
                System.out.println("Volume: " + ((Cubo) figure).calculateVolume());
            } else {
                System.out.println("Nome: " + figure.getName());
                System.out.println("Cor: " + figure.getColor());
                System.out.println("Area: " + ((Quadrado) figure).calculateArea());
            }
        }

    }
}
