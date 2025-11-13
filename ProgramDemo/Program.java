package Java.ProgramDemo;


public class Program {
    protected String programName;
    protected int duration;
    protected String degreeType;
    protected String programType;
    
    public Program(String name, int duration, String degreeType, String programType) {
        this.programName = name;
        this.duration = duration;
        this.degreeType = degreeType;
        this.programType = programType;
    }

    public String getName() {
        return programName;
    }
    
    public void displayInfo() {
        System.out.println("Program: " + programName);
        System.out.println("Degree: " + degreeType);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Language: " + programType);
    }
    
    public String getSpecialization() {
        return "General Program";
    }
    
    public void showCareerPaths() {
        System.out.println("Various career opportunities");
    }
}