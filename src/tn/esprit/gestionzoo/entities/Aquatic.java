package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    // Constructeur par défaut
    public Aquatic() {
        super();
        this.habitat = "Inconnu";
    }

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Méthode swim() abstraite pour forcer la redéfinition dans les classes filles
    public abstract void swim();

    // Implémentation de la méthode eatMeat de l'interface Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("This aquatic animal is eating meat.");
        } else {
            System.out.println("This aquatic animal only eats meat.");
        }
    }

    // Redéfinition de la méthode equals pour comparer les animaux aquatiques
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return age == aquatic.age && habitat.equals(aquatic.habitat) && name.equals(aquatic.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + habitat.hashCode();
    }

    @Override
    public String toString() {
        return "Aquatic [family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat + "]";
    }
}
