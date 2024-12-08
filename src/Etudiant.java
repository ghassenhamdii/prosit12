import java.util.Objects;

public class Etudiant {
    int id;
    String nom;
    int age;
    public Etudiant(){};
    public Etudiant(int id, String nom, int age){
        this.id=id;
        this.nom=nom;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id == etudiant.id && age == etudiant.age && Objects.equals(nom, etudiant.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, age);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

}
