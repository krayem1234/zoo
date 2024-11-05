package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;  // Attribut spécifique pour le nombre de pattes

    // Constructeur par défaut
    public Terrestrial() {
        super();  // Appel du constructeur de Animal
        this.nbrLegs = 0;  // Par défaut, 0 pattes
    }

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);  // Appel du constructeur paramétré de Animal
        this.nbrLegs = nbrLegs;
    }

    // Implémentation de la méthode eatMeat de l'interface Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("This terrestrial animal is eating meat.");
        } else {
            System.out.println("This terrestrial animal cannot eat plants alone.");
        }
    }

    // Implémentation de la méthode eatPlant de l'interface Herbivore
    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("This terrestrial animal is eating plants.");
        } else {
            System.out.println("This terrestrial animal cannot eat meat alone.");
        }
    }

    // Implémentation de la méthode eatPlantAndMeat de l'interface Omnivore
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("This terrestrial animal can eat both plants and meat, but only one type was provided.");
        }
    }

    // Redéfinition de toString pour inclure les attributs spécifiques de Terrestrial
    @Override
    public String toString() {
        return "Terrestrial [family=" + family + ", name=" + name + ", age=" + age + ", nbrLegs=" + nbrLegs + "]";
    }
}
