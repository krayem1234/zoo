public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = 25;  // Le zoo contient 25 cages par défaut
        this.animals = new Animal[nbrCages];  // Initialisation du tableau des animaux
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


