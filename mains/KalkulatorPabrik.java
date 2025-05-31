package mains;

import java.util.Scanner;
import models.Sphere;
import models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NADA HUSAYNA");
        System.out.println("245150700111005");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = sc.nextDouble();
        System.out.print("Isikan radius   : ");
        double r = sc.nextDouble();
        System.out.println("=============================================");

        Torus torus = new Torus(R, r);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double rs = sc.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(rs);
        sphere.printInfo();

        System.out.println("=============================================");
        sc.close();
    }
}
