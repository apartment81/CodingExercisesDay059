package ro.mirodone;

public class Main {

    public static void main(String[] args) {


        Permutations permutations = new Permutations();
        String  s1= "aabb";

        System.out.println(permutations.singlePermutations(s1));

        StringPermutations stringPermutations = new StringPermutations();

        System.out.println(stringPermutations.permutationFinder("aabb"));

    }
}
