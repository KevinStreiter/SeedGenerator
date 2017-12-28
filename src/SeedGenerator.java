
import java.util.*;

public class SeedGenerator {

    public static void main(String[] args) {

        List<Seed> seedList = new ArrayList<>();

        for(int i = 0; i <= 1000; i++){
            Seed seed = new SeedModel();
            seedList.add(seed);
        }

        for(Seed seed : seedList) {
            System.out.println(seed.getSeed());

        }
    }
}
