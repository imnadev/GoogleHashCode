package pizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("src/pizza.input/a");
            Scanner sc = new Scanner(file);

            String[] lineOne = sc.nextLine().split(" ");

            Input input = new Input();
            input.setTeam2(Integer.parseInt(lineOne[1]));
            input.setTeam3(Integer.parseInt(lineOne[2]));
            input.setTeam4(Integer.parseInt(lineOne[3]));

            List<Set<String>> pizzas = new ArrayList<>();
            for (int i = 0; i < Integer.parseInt(lineOne[0]); i++) {
                String[] line = sc.nextLine().split(" ");

                Set<String> pizza = new HashSet<>();
                for(int j = 1; j <= Integer.parseInt(line[0]); j++) {
                    pizza.add(line[j]);
                }
                pizzas.add(pizza);
            }
            input.setPizzas(pizzas);

            System.out.println(input.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
