package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;  // Attribut spécifique pour la profondeur de nage

    // Constructeur par défaut
    public Penguin() {
        super();  // Appel du constructeur de Aquatic
        this.swimmingDepth = 0.0f;
    }

    // Constructeur paramétré
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);  // Appel du constructeur paramétré de Aquatic
        this.swimmingDepth = swimmingDepth;
    }

    // Redéfinition de toString pour inclure les attributs spécifiques de Penguin
    @Override
    public String toString() {
        return "Penguin [family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + " m]";
    }

    // Méthode swim()
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
