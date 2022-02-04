package demo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        float vægtKilo;
        float meterHøjde;


        System.out.println("Velkommen. Angiv højde og vægt for at udregne dit BMI.");

        System.out.println("Indtast højde i meter (brug komma): ");

        meterHøjde = user_input.nextFloat();
        if (meterHøjde > 20){
            System.out.println("Du kom til at skrive i CM. Vi har lige rettet det for dig");
            meterHøjde = meterHøjde / 100;
        }

        System.out.println("Indtast vægt i kilo");
        vægtKilo = user_input.nextFloat();

        float bmi = vægtKilo / (meterHøjde * meterHøjde);

        System.out.println("Din BMI er: " + bmi);

        if (bmi < 18.5 ) {
            System.out.println("Din BMI er under gennemsnittet.");
        }
        else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Din BMI er ganske normal");
        }
        else if (bmi > 25 && bmi < 30) {
            System.out.println("Din BMI er over gennemsnittet");
        }
        else if (bmi > 30) {
            System.out.println("Din BMI er langt over gennemsnittet");
        }

        System.out.println("(Husk at BMI ikke medregner kroppens muskel elller fedtprocent,kun kroppens masse så tag resultatet med et gram salt)");
    }
}
