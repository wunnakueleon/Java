package Java.ProgramDemo;

public class DigitalInnovationProgram extends Program {
    private String[] coreSubjects;
    
    public DigitalInnovationProgram() {
        super("Digital Innovation", 4, "Bachelor of Digital Innovation", "Thai");
        this.coreSubjects = new String[]{"UX Design", "Digital Transformation", "Entrepreneurship", "Emerging Technologies"};
    }
    
    @Override
    public void displayInfo() {
        System.out.println("DIGITAL INNOVATION");
        System.out.println();
        super.displayInfo();
        System.out.println("Focus: Technology Innovation & Business Applications");
        System.out.println("Core Subjects: " + String.join(" | ", coreSubjects));
    }
    
    @Override
    public String getSpecialization() {
        return "Digital Transformation & Technology Entrepreneurship";
    }
    
    @Override
    public void showCareerPaths() {
        System.out.println("Careers: Product Manager, UX Designer, Innovation Consultant");
    }
}