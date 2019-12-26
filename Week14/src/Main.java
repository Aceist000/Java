import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input Language: ");
        String language = input.nextLine();
        System.out.print("Input parameters: ");
        String parameters = input.nextLine();

        Generator generate = new Generator(language, parameters);
        generate.readParameters();
        generate.parameterChecker();
        generate.generateAlphabet();
        System.out.println(generate.generateParagraph());
    }
}