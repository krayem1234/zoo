package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;  // Attribut spécifique pour la vitesse de nage

    // Constructeur par défaut
    public Dolphin() {
        super();  // Appel du constructeur de Aquatic
        this.swimmingSpeed = 0.0f;
    }

    // Constructeur paramétré
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);  // Appel du constructeur paramétré de Aquatic
        this.swimmingSpeed = swimmingSpeed;
    }

    // Redéfinition de toString pour inclure les attributs spécifiques de Dolphin
    @Override
    public String toString() {
        return "Dolphin [family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + " km/h]";
    }

    // Méthode swim()
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
