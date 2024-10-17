package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Constructeur par défaut
    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    // Constructeur paramétré
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    // Redéfinition de la méthode swim
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin [family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + " m]";
    }
}
