public class Main {
    public static void main(String[] args) {
        // Création de plusieurs animaux
        Animal lion = new Animal("wahchi", "Lion", 10, true);
        Animal elephant = new Animal("kalech", "Elephant", 25, true);
        Animal crocodile = new Animal("kalech", "Crocodile", 12, false);
        Animal giraffe = new Animal("kalech", "Giraffe", 8, true);
        Animal tiger = new Animal("wahchi", "Tiger", 6, true);

        // Création d'un zoo
        Zoo myZoo = new Zoo("My Zoo", "Tunis");

        // Ajout des animaux au zoo
        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = crocodile;
        myZoo.animals[3] = giraffe;
        myZoo.animals[4] = tiger;

        // Affichage via la méthode displayZoo()
        myZoo.displayZoo();

        // Affichage direct du zoo et d'un animal (par exemple, le lion)
        System.out.println(myZoo);
        System.out.println(lion);
    }
}

