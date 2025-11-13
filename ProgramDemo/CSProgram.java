package Java.ProgramDemo;

public class CSProgram extends Program {
    private String[] coreSubjects;
    
    public CSProgram() {
        super("Computer Science", 4, "Bachelor of Science", "English");
        this.coreSubjects = new String[]{"Algorithms", "Data Structures", "AI", "Software Engineering"};
    }
    
    @Override
    public void displayInfo() {
        System.out.println("COMPUTER SCIENCE");
        System.out.println();
        super.displayInfo();
        System.out.println("Focus: Software Development & Algorithms");
        System.out.println("Core Subjects: " + String.join(" | ", coreSubjects));
    }
    
    @Override
    public String getSpecialization() {
        return "Software Engineering & Artificial Intelligence";
    }
    
    @Override
    public void showCareerPaths() {
        System.out.println("Careers: Software Developer, AI Engineer, Data Scientist");
    }
}
