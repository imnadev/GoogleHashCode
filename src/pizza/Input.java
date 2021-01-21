package pizza;

import java.util.List;
import java.util.Set;

public class Input {

    private int team2;
    private int team3;
    private int team4;
    private List<Set<String>> pizzas;

    public int getTeam2() {
        return team2;
    }

    public void setTeam2(int team2) {
        this.team2 = team2;
    }

    public int getTeam3() {
        return team3;
    }

    public void setTeam3(int team3) {
        this.team3 = team3;
    }

    public int getTeam4() {
        return team4;
    }

    public void setTeam4(int team4) {
        this.team4 = team4;
    }

    public List<Set<String>> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Set<String>> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public String toString() {
        return "pizza.Input{" +
                "team2=" + team2 +
                ", team3=" + team3 +
                ", team4=" + team4 +
                ", pizzas=" + pizzas +
                '}';
    }
}