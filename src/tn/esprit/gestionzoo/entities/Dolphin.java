package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Constructeur par défaut
    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    // Constructeur paramétré
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Redéfinition de la méthode swim
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin [family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + " km/h]";
    }
}
