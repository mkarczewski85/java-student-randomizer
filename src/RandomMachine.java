import java.util.ArrayList;
import java.util.Collections;

public class RandomMachine {

    private ArrayList<String> randomizer = null;
    private String[] names;
    private boolean[] isPresent;
    private int counter;

    public RandomMachine() {
        this.names = new String[]{"Maciej", "Krzysztof", "Mateusz", "Michał K.", "Piotr", "Przemysław",
                "Marta", "Tomek", "Filip", "Sebastian", "Dawid", "Damian", "Michał P.", "Andrzej"};
        this.isPresent = new boolean[]{true, true, true, true, true, true, true, true, true, true, true,
                true, true, true};
        this.randomizer = new ArrayList<>();
        this.counter = 0;
    }

    private void prepareRandomizer() {

        for (int i = 0; i < names.length; i++) {
            if (isPresent[i]) {
                randomizer.add(names[i]);
            }
        }
        Collections.shuffle(randomizer);
    }

    public void setIsPresent(int id, boolean state) {
        this.isPresent[id] = state;
    }

    public String getRandomStudent() {
        if (counter == 0) {
            prepareRandomizer();
        }
        if (counter < randomizer.size()) {
            String randomStudent = randomizer.get(counter++);
            return randomStudent;
        } else {
            return "żadna osoba nie została zaznaczona!";
        }
    }

    public String getName (int id){
        return names[id];
    }

    public int getClicksLeft() {
        return randomizer.size() - counter;
    }

    public void reset(){
        this.randomizer.clear();
        this.counter = 0;
    }

}
