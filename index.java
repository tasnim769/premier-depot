public class Calculatrice {
    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro !");
        }
        return a / b;
    }
}
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        while (true) {
            System.out.println("\nCalculatrice - Choisissez une opération :");
            System.out.println("1. Addition (+)");
            System.out.println("2. Soustraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            
            int choix = scanner.nextInt();
            if (choix == 5) {
                System.out.println("Merci d'avoir utilisé la calculatrice. À bientôt !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre : ");
            double num2 = scanner.nextDouble();

            try {
                double resultat = 0;
                switch (choix) {
                    case 1:
                        resultat = calc.addition(num1, num2);
                        break;
                    case 2:
                        resultat = calc.soustraction(num1, num2);
                        break;
                    case 3:
                        resultat = calc.multiplication(num1, num2);
                        break;
                    case 4:
                        resultat = calc.division(num1, num2);
                        break;
                    default:
                        System.out.println("Option invalide !");
                        continue;
                }
                System.out.println("Résultat : " + resultat);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
