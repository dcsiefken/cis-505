package Module_12.GradeBookApp;

public class StudentGradeEntry {
    private String firstName;
    private String lastName;
    private String course;
    private String grade;

    // Getter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for LastName
    public String getLastName() {
        return this.lastName;
    }

    // Setter for LastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for Course
    public String getCourse() {
        return this.course;
    }

    // Setter for Course
    public void setCourse(String course) {
        this.course = course;
    }

    // Getter for grade
    public String getGrade() {
        return this.grade;
    }

    // Getter for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toCSV() {
        return String.format("%s,%s,%s,%s", 
            firstName, lastName, course, grade);
    }
}
