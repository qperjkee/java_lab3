public class EducationalInstitution {
    private String name;
    private int establishedYear;
    private int numberOfStudents;
    private double rating;
    private String location;

    public EducationalInstitution(String name, int establishedYear, int numberOfStudents, double rating, String location) {
        this.name = name;
        this.establishedYear = establishedYear;
        this.numberOfStudents = numberOfStudents;
        this.rating = rating;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public double getRating() {
        return rating;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "EducationalInstitution{" +
                "name='" + name + '\'' +
                ", establishedYear=" + establishedYear +
                ", numberOfStudents=" + numberOfStudents +
                ", rating=" + rating +
                ", location='" + location + '\'' +
                '}';
    }

    public void printDetails() {
        System.out.println("Institution Name: " + name);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Rating: " + rating);
        System.out.println("Location: " + location);
        System.out.println("-------------------------------");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EducationalInstitution)) return false;
        EducationalInstitution institution = (EducationalInstitution) obj;
        return establishedYear == institution.establishedYear &&
               numberOfStudents == institution.numberOfStudents &&
               Double.compare(institution.rating, rating) == 0 &&
               name.equals(institution.name) &&
               location.equals(institution.location);
    }
}