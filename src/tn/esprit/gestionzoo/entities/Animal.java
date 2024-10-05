package tn.esprit.gestionzoo.entities;

public class Animal {
    public String family;
    public String name;
    public int age;          // âge ne peut pas être négatif
    public boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);  // Utiliser le setter pour appliquer la validation
        this.isMammal = isMammal;
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
