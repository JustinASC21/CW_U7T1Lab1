import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> trees = new ArrayList<String>();
//        trees.add("pine");
//        trees.add("maple");
//        trees.add("frasier fir");
//        System.out.println(trees.size());
//        System.out.println(trees);
//        System.out.println(trees.get(3));
        // second question
        /*
        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths = names.size() + moreNames.length + names.get(0).length() + moreNames[0].length(); //complete me!
        System.out.println(lengths);
        */
//         ArrayList<Cat> CatList = new ArrayList<Cat>();
//         CatList.add(new Cat("Tails"));
//         CatList.add(new Cat("Scruffles"));
//         CatList.add(new Cat("Garfield"));
//         CatList.add(new Cat("Gruff"));
//         Cat newCat = new Cat("Extra cat");
//         CatList.set(2,newCat);
//         CatList.get(1).setName("Archie");
//         System.out.println(CatList);
        ArrayList dogList = new ArrayList();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        Dog d = (Dog) dogList.get(0);
        d.bark();

    }
}
