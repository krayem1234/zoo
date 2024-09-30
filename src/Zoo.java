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
class Zoo {
    private final int nbrCages = 25; // Capacité maximale de 25 cages (constante)
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimaux = 0; // Compteur pour suivre le nombre d'animaux ajoutés

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];  // Initialisation du tableau des animaux
    }

    // Vérifie si un animal existe déjà dans le zoo (par nom)
    private boolean animalExists(Animal animal) {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animals[i].name.equals(animal.name)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour ajouter un animal, avec vérification des doublons
    public boolean addAnimal(Animal animal) {
        if (animalExists(animal)) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false;
        }
        if (nbrAnimaux < nbrCages) {
            animals[nbrAnimaux] = animal;
            nbrAnimaux++; // Incrémenter le compteur après ajout
            return true;   // Retourne true si l'ajout est réussi
        } else {
            System.out.println("Le zoo est plein.");
            return false;  // Retourne false si le zoo est plein
        }
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'existe pas dans le zoo.");
            return false;
        }
        // Décale les animaux pour combler l'espace laissé par l'animal supprimé
        for (int i = index; i < nbrAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimaux - 1] = null;  // Supprime le dernier animal
        nbrAnimaux--;
        return true;
    }

    // Méthode pour rechercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    // Vérifie si le zoo est plein
    public boolean isZooFull() {
        return nbrAnimaux >= nbrCages;
    }

    // Compare deux zoos et retourne celui qui contient le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.nbrAnimaux > z2.nbrAnimaux ? z1 : z2;
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
    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo :");
        for (int x = 0; x < nbrAnimaux; x++) {
            System.out.println("Animal " + (x + 1) + " : " + animals[x].toString());//j'ai pas besoin d'ecrire toString
        }
    }

    // Méthode toString pour afficher le zoo via println()
    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}




