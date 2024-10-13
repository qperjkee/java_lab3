import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        EducationalInstitution[] institutions = new EducationalInstitution[]{
                new EducationalInstitution("University A", 1990, 1500, 4.5, "City A"),
                new EducationalInstitution("University B", 1985, 2000, 4.7, "City B"),
                new EducationalInstitution("University C", 2000, 1200, 4.2, "City A"),
                new EducationalInstitution("University D", 2010, 1800, 4.8, "City C"),
                new EducationalInstitution("University E", 1995, 2200, 4.6, "City B")
        };

        Arrays.sort(institutions, Comparator.comparingInt(EducationalInstitution::getEstablishedYear));
        System.out.println("Sorted by Established Year (Ascending):");
        for (EducationalInstitution institution : institutions) {
            institution.printDetails();
        }

        Arrays.sort(institutions, Comparator.comparingDouble(EducationalInstitution::getRating).reversed());
        System.out.println("\nSorted by Rating (Descending):");
        for (EducationalInstitution institution : institutions) {
            institution.printDetails();
        }

        EducationalInstitution[] searchInstitutions = new EducationalInstitution[]{
            new EducationalInstitution("University A", 1990, 1500, 4.5, "City A"),
            new EducationalInstitution("University DB", 2010, 1800, 4.8, "City DB"),
            new EducationalInstitution("University AB", 2020, 1000, 4.0, "City AB")
        };

        for (EducationalInstitution searchInstitution : searchInstitutions) {
            int index = Arrays.asList(institutions).indexOf(searchInstitution);
            if (index != -1) {
                System.out.println("\nFound institution: " + institutions[index]);
            } else {
                System.out.println("\nInstitution not found: " + searchInstitution.getName());
            }
        }
    }
}
