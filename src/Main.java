import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant(1, "Alice", 20);
        Etudiant etudiant2 = new Etudiant(2, "Bob", 22);
        Etudiant etudiant3 = new Etudiant(3, "Charlie", 21);


        List<Etudiant> listeEtudiants = new ArrayList<>();
        listeEtudiants.add(etudiant1);
        listeEtudiants.add(etudiant2);
        listeEtudiants.add(etudiant3);


        StudentManagement gestion = new StudentManagement();


        System.out.println("Affichage de tous les étudiants:");
        gestion.displayStudents(listeEtudiants, System.out::println);


        System.out.println("\nAffichage des étudiants avec un âge > 20:");
        gestion.displayStudentsByFilter(listeEtudiants, e -> e.getAge() > 20, System.out::println);


        System.out.println("\nNoms des étudiants:");
        String noms = gestion.returnStudentNames(listeEtudiants, Etudiant::getNom);
        System.out.println(noms);


        System.out.println("\nCréation et affichage d'un nouvel étudiant:");
        Etudiant nouvelEtudiant = gestion.createStudent(() -> new Etudiant(4, "David", 23));
        System.out.println(nouvelEtudiant);


        System.out.println("\nTri et affichage des étudiants par ID:");
        List<Etudiant> etudiantsTries = gestion.sortStudentsById(listeEtudiants, (e1, e2) -> e1.getId() - e2.getId());
        etudiantsTries.forEach(System.out::println);
    }
}
