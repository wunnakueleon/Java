package Java.FacultyDemo;

public class FacultyDemo {
    public static void main(String[] args) {

        // Creating objects based on Faculty class
        Faculty sit = new Faculty("School of Information Technology", "Prof. Narongrit Waraporn");
        Faculty engineering = new Faculty("Faculty of Engineering", "Prof. Tawich Pulngern");
        Faculty liberalArts = new Faculty("School of Liberal Arts", "Prof. Natjiree Jaturapitakkul");
        Faculty archi = new Faculty("School of Architecture and Design", "Prof. Waraluk Pansuwan");

        // Display SIT
        System.out.println("SIT information");
        sit.describe();
        System.out.println();

        System.out.println("Technical Faculties");
        // Method Overloading
        // Provide Technical Faculties 
        sit.displayFacultyType(true);
        System.out.println();
        // Provide Technical Faculties along with programs it offers
        sit.displayFacultyType(true, 3);
        System.out.println();


        System.out.println("Non-Technical Faculties");
        archi.displayFacultyType(false);
        System.out.println();
        archi.displayFacultyType(false, 1);
    }
}
