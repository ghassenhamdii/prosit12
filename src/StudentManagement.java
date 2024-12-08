import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Comparator;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> etudiants, Consumer<Etudiant> con) {
        for (Etudiant etudiant : etudiants) {
            con.accept(etudiant);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant etudiant : etudiants) {
            if (pre.test(etudiant)) {
                con.accept(etudiant);
            }
        }
    }

    @Override
    public String returnStudentNames(List<Etudiant> etudiants, Function<Etudiant, String> fun) {
        StringBuilder names = new StringBuilder();
        for (Etudiant etudiant : etudiants) {
            names.append(fun.apply(etudiant));
            names.append(", ");
        }
        return names.length() > 0 ? names.substring(0, names.length() - 2) : ""; // Pour enlever la dernière virgule et espace
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> etudiants, Comparator<Etudiant> com) {
        List<Etudiant> sortedStudents = new ArrayList<>(etudiants);
        sortedStudents.sort(com);
        return sortedStudents;
    }
}
