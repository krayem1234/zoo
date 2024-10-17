/*public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimaux = 0; // Compteur pour suivre le nombre d'animaux ajoutés

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = 25;  // Le zoo contient 25 cages par défaut
        this.animals = new Animal[nbrCages];  // Initialisation du tableau des animaux
    }

    public boolean addAnimal(Animal animal) {
        if (nbrAnimaux < nbrCages) {
            animals[nbrAnimaux] = animal;
            nbrAnimaux++; // Incrémenter le compteur après ajout
            return true;   // Retourne true si l'ajout est réussi
        } else {
            return false;  // Retourne false si le zoo est plein
        }
    }

    public int searchAnimal(Animal animal)
    {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animals[i].name == animal.name) {
                return i;

            }

        }
        return -1;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo :");
        for (int x = 0; x < nbrAnimaux; x++) {
            System.out.println("Animal " + (x + 1) + " : " + animals[x].toString());//j'ai pas besoin d'ecrire toString
        }
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]");
        System.out.println("Liste des animaux dans le zoo:");
        for (Animal animal : animals) {
            if (animal != null) {  // Vérifie si un animal est présent
                System.out.println(animal);
            }
        }
    }

    // Méthode toString pour afficher le zoo via println()
    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
*/
package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;  // Liste des animaux dans le zoo
    private String name;
    private String city;
    private int nbrCages = 25;  // Capacité maximale du zoo
    private Aquatic[] aquaticAnimals = new Aquatic[10];  // Tableau pour les animaux aquatiques
    private int aquaticCount = 0;  // Compteur pour le nombre d'animaux aquatiques ajoutés

    // Constructeur
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new ArrayList<>();
    }

    // Méthode pour ajouter un animal au zoo
    public boolean addAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Erreur : L'animal à ajouter ne peut pas être null.");
            return false;
        }

        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter " + animal.getName());
            return false;  // Le zoo est plein
        }

        if (animals.contains(animal)) {
            System.out.println("L'animal " + animal.getName() + " est déjà présent dans le zoo.");
            return false;  // L'animal est déjà présent
        }

        animals.add(animal);
        System.out.println("Animal ajouté : " + animal.getName());
        return true;  // Animal ajouté avec succès
    }

    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        if (animals.remove(animal)) {
            System.out.println("L'animal " + animal.getName() + " a été supprimé du zoo.");
            return true;  // Animal supprimé avec succès
        } else {
            System.out.println("L'animal " + animal.getName() + " n'est pas présent dans le zoo.");
            return false;  // L'animal n'était pas dans le zoo
        }
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animals.size() >= nbrCages;  // Retourne true si le nombre d'animaux atteint la capacité
    }

    // Méthode pour ajouter un animal aquatique au tableau
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic == null) {
            System.out.println("Erreur : L'animal aquatique à ajouter ne peut pas être null.");
            return;
        }

        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Animal aquatique ajouté : " + aquatic.getName());
        } else {
            System.out.println("Le tableau des animaux aquatiques est plein.");
        }
    }

    // Méthode pour faire nager tous les animaux aquatiques
    public void swimAllAquaticAnimals() {
        System.out.println("Les animaux aquatiques nagent :");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Méthode pour obtenir la profondeur maximale de nage des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    // Méthode pour afficher le nombre de dauphins et de pingouins
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]");
        displayAnimals();
        swimAllAquaticAnimals();
    }

    // Méthode pour afficher tous les animaux dans le zoo
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
