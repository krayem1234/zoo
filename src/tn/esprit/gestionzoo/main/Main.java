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
/*
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Création de plusieurs animaux
        Animal lion = new Animal("Félin", "Lion", 10, true);
        Animal elephant = new Animal("Mammifère", "Elephant", 25, true);
        Animal crocodile = new Animal("Reptile", "Crocodile", 12, false);
        Animal giraffe = new Animal("Mammifère", "Giraffe", 8, true);
        Animal tiger = new Animal("Félin", "Tiger", 6, true);

        // Création d'un zoo
        Zoo myZoo = new Zoo("My Zoo", "Tunis");

        // Ajout des animaux au zoo
        System.out.println(myZoo.addAnimal(lion));       // true
        System.out.println(myZoo.addAnimal(elephant));   // true
        System.out.println(myZoo.addAnimal(crocodile));  // true
        System.out.println(myZoo.addAnimal(giraffe));    // true
        System.out.println(myZoo.addAnimal(tiger));      // true

        // Tentative d'ajouter un animal déjà présent
        System.out.println(myZoo.addAnimal(lion));       // false (Lion déjà ajouté)

        // Affichage des animaux dans le zoo
        myZoo.displayAnimals();

        // Suppression de l'animal "elephant"
        System.out.println("Suppression de l'éléphant : " + myZoo.removeAnimal(elephant)); // true

        // Affichage après suppression
        myZoo.displayAnimals();

        // Ajout d'animaux supplémentaires jusqu'à remplir le zoo
        for (int j = 0; j < 22; j++) {
            Animal animal = new Animal("Espèce" + j, "Animal" + j, j + 1, true);
            boolean added = myZoo.addAnimal(animal);
            System.out.println("Ajout de Animal" + j + ": " + added);
        }

        // Tentative d'ajouter un animal supplémentaire après avoir rempli le zoo
        Animal extraAnimal = new Animal("Oiseau", "Poule", 7, true);
        boolean added = myZoo.addAnimal(extraAnimal);  // false, zoo plein
        System.out.println("Ajout de poule (extra) : " + added);

        // Vérification si le zoo est plein
        System.out.println("Le zoo est plein ? " + myZoo.isZooFull()); // true

        // Affichage final du zoo
        myZoo.displayZoo();
    }
}
/*

 */
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Création d'instances avec les constructeurs par défaut
        Animal genericAnimal = new Animal();  // Animal générique
        Dolphin genericDolphin = new Dolphin();  // Dauphin générique
        Penguin genericPenguin = new Penguin();  // Pingouin générique

        // Affichage des instances créées avec les constructeurs par défaut
        System.out.println(genericAnimal);
        System.out.println(genericDolphin);
        System.out.println(genericPenguin);

        // Création d'un zoo
        Zoo myZoo = new Zoo("My Zoo", "Tunis");

        // Création d'animaux aquatiques avec les constructeurs paramétrés
        Dolphin dolphin1 = new Dolphin("Cetacea", "Dolly", 5, true, "Ocean", 60.5f);
        Penguin penguin1 = new Penguin("Spheniscidae", "Pingu", 3, true, "Arctic", 20.0f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pingou", 4, true, "Arctic", 30.0f);

        // Ajout d'animaux aquatiques au zoo
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);

        // Appel des méthodes swim() pour tous les animaux aquatiques
        System.out.println("Tous les animaux aquatiques nagent :");
        myZoo.swimAllAquaticAnimals();

        // Affichage du nombre de dauphins et de pingouins dans le zoo
        myZoo.displayNumberOfAquaticsByType();

        // Calcul et affichage de la profondeur maximale de nage des pingouins
        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("Profondeur maximale de nage des pingouins : " + maxDepth + " m");

        // Ajout d'animaux au zoo jusqu'à atteindre la capacité maximale
        for (int j = 0; j < 22; j++) {
            Animal animal = new Animal("Espèce" + j, "Animal" + j, j + 1, true);
            boolean added = myZoo.addAnimal(animal);
            System.out.println("Ajout de " + animal.getName() + ": " + added);
        }

        // Tentative d'ajouter un animal supplémentaire après avoir rempli le zoo
        Animal extraAnimal = new Animal("Oiseau", "Poule", 7, true);
        boolean added = myZoo.addAnimal(extraAnimal);  // Cela devrait maintenant échouer si le zoo est plein
        System.out.println("Ajout de poule (extra) : " + added);

        // Vérification si le zoo est plein
        System.out.println("Le zoo est plein ? " + myZoo.isZooFull()); // Devrait être true

        // Affichage final du zoo
        System.out.println("État final du zoo :");
        myZoo.displayZoo();
    }
}
