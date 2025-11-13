package Java.FacultyDemo;

public class Faculty implements AcademicUnit{
    private String facultyName;
    private String dean;

    public Faculty(String name, String dean) {
        this.facultyName = name;
        this.dean = dean;
    }
    @Override
    public String getFacultyName() {
        return facultyName;
    } 

    @Override
    public void describe() {
        System.out.println("Faculty: " + facultyName);
        System.out.println("Dean " + dean);
    }

    // Method Overloading
    public void displayFacultyType(boolean isTechnical) {
        if (isTechnical) {
            System.out.print(facultyName + " Technical faculties: SIT && Engineering");
        } else {
            System.out.print(facultyName + "Non-Technical faculties: SoLA && SoA+D");
        }
    }

    public void displayFacultyType(boolean isTechnical, int programCount) {
        displayFacultyType(isTechnical);
        System.out.println("| They offer " + programCount + " undergraduate program(s)");
    }
}
