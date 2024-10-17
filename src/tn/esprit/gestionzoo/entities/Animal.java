package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    // Constructeur par défaut
    public Animal() {
        this.family = "Inconnu";
        this.name = "Inconnu";
        this.age = 0;
        this.isMammal = false;
    }

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Getter et Setter pour l'âge
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif");
        }
        this.age = age;
    }

    // Méthode toString pour afficher les informations d'un animal
    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}
