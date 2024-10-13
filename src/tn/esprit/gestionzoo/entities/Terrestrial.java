package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
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

    // Redéfinition de toString pour inclure les attributs spécifiques de Terrestrial
    @Override
    public String toString() {
        return "Terrestrial [family=" + family + ", name=" + name + ", age=" + age + ", nbrLegs=" + nbrLegs + "]";
    }
}
