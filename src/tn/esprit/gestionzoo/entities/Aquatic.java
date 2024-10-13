package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;  // Attribut spécifique pour l'habitat

    // Constructeur par défaut
    public Aquatic() {
        super();  // Appel du constructeur de Animal
        this.habitat = "Inconnu";  // Par défaut, l'habitat est inconnu
    }

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);  // Appel du constructeur paramétré de Animal
        this.habitat = habitat;
    }

    // Redéfinition de toString pour inclure les attributs spécifiques de Aquatic
    @Override
    public String toString() {
        return "Aquatic [family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat + "]";
    }

    // Méthode swim()
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
