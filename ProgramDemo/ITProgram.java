package Java.ProgramDemo;

public class ITProgram extends Program {
    private String[] coreSubjects;
    
    public ITProgram() {
        super("Information Technology", 4, "Bachelor of IT", "Thai");
        this.coreSubjects = new String[]{"Network Administration", "System Security", "Database Management", "Cloud Computing"};
    }
    
    @Override
    public void displayInfo() {
        System.out.println("INFORMATION TECHNOLOGY");
        System.out.println();
        super.displayInfo();
        System.out.println("Focus: IT Infrastructure & System Management");
        System.out.println("Core Subjects: " + String.join(" | ", coreSubjects));
    }
    
    @Override
    public String getSpecialization() {
        return "Network Systems & Enterprise Infrastructure";
    }
    
    @Override
    public void showCareerPaths() {
        System.out.println("Careers: Network Administrator, IT Support, Cloud Specialist");
    }
}
