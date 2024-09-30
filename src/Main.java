/*public class Main {
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
       /* myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = crocodile;
        myZoo.animals[3] = giraffe;
        myZoo.animals[4] = tiger;*/
       /* System.out.println(myZoo.addAnimal(lion));       // true
        System.out.println(myZoo.addAnimal(elephant));   // true
        System.out.println(myZoo.addAnimal(crocodile));  // true
        System.out.println(myZoo.addAnimal(giraffe));    // true
        System.out.println(myZoo.addAnimal(tiger));      // true

        // Ajouter plus d'animaux que la capacité
        for (int j = 0; j < 22; j++) {  // 22 autres animaux pour remplir le zoo
            Animal animal = new Animal("Espèce" + j, "Animal" + j, j + 1, true);
            boolean added = myZoo.addAnimal(animal);
            System.out.println("Ajout de Animal" + j + ": " + added);
        }
        Animal extraAnimal = new Animal("kalech", "poule", 7, true);
        boolean added = myZoo.addAnimal(extraAnimal);
        System.out.println("Ajout de poule (extra) : " + added);


        // Affichage via la méthode displayZoo()
        myZoo.displayZoo();
        myZoo.displayAnimals();

        // Affichage direct du zoo et d'un animal (par exemple, le lion)
        /*System.out.println(myZoo);
        System.out.println(lion);*/
    /*}
}
*/

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
        System.out.println(myZoo.addAnimal(lion));       // true
        System.out.println(myZoo.addAnimal(elephant));   // true
        System.out.println(myZoo.addAnimal(crocodile));  // true
        System.out.println(myZoo.addAnimal(giraffe));    // true
        System.out.println(myZoo.addAnimal(tiger));      // true

        // Test suppression d'un animal
        System.out.println("Suppression de l'éléphant : " + myZoo.removeAnimal(elephant));

        // Ajouter plus d'animaux que la capacité
        for (int j = 0; j < 22; j++) {  // 22 autres animaux pour remplir le zoo
            Animal animal = new Animal("Espèce" + j, "Animal" + j, j + 1, true);
            boolean added = myZoo.addAnimal(animal);
            System.out.println("Ajout de Animal" + j + ": " + added);
        }
        Animal extraAnimal = new Animal("kalech", "poule", 7, true);
        boolean added = myZoo.addAnimal(extraAnimal);
        System.out.println("Ajout de poule (extra) : " + added);

        // Affichage du zoo et des animaux
        myZoo.displayZoo();
        myZoo.displayAnimals();
    }
}



