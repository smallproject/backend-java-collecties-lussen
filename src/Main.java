import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht

        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        //getallenVertalen(10);

        Translator translate = new Translator(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "Ongeldig invoer";
        Scanner scanner = new Scanner(System.in);

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                if (number < 10 && number >= 0) {
                    String result = translate.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                    input = scanner.nextLine();
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }
    }

    private static void getallenVertalen(Integer nummer)
    {
        HashMap<Integer, String> getallen = new HashMap<>();

        getallen.put(1,"een");
        getallen.put(2,"twee");
        getallen.put(3,"drie");
        getallen.put(4,"vier");
        getallen.put(5,"vijf");
        getallen.put(6,"zes");
        getallen.put(7,"zeven");
        getallen.put(8,"acht");
        getallen.put(9,"negen");
        getallen.put(10,"tien");

        if (getallen.containsKey(nummer)) {
            System.out.println(getallen.get(nummer));
        }

    }
}
