import java.util.*;

public class SeedModel implements Seed {
    private String seed;
    private List<String> alphabet = new ArrayList<>();

    public SeedModel() {

        alphabet.addAll(Arrays.asList("A", "B", "C", "D", "E",
                "F","G","H","I","J","K","L",
                "M","N","O","P","Q","R","S",
                "T","U","V","W","X","Y","Z","9"));

        seed = generateSeed();
    }

    private String generateSeed(){
        List<String> seed = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        swapElements();
        for (int i = 0; i < 81; i++) {
            Random random = new Random();
            int position = random.nextInt(alphabet.size());
            String letter = alphabet.get(position);
            seed.add(letter);
        }
        for (String item : seed) {
            sb.append(item);
        }
        return sb.toString();
    }

    private void swapElements(){
        for (int i = 0; i < alphabet.size(); i++){
            Random random1 = new Random();
            Random random2 = new Random();
            int position1 = random1.nextInt(alphabet.size());
            int position2 = random2.nextInt(alphabet.size());
            Collections.swap(alphabet,position1,position2);
        }
    }

    public String getSeed() {
        return seed;
    }
}

