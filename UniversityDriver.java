package Java;

import Java.ProgramDemo.CSProgram;
import Java.ProgramDemo.DigitalInnovationProgram;
import Java.ProgramDemo.ITProgram;
import Java.ProgramDemo.Program;

public class UniversityDriver {
    public static void main(String[] args) {
        System.out.println("    SCHOOL OF INFORMATION TECHNOLOGY");
        System.out.println("==========================================");
        System.out.println();
        
        // Create all three programs - POLYMORPHISM!
        Program cs = new CSProgram();
        Program it = new ITProgram();
        Program di = new DigitalInnovationProgram();
        
        // Array demonstrating polymorphism
        Program[] sitPrograms = {cs, it, di};
        
        System.out.println("1. INDIVIDUAL PROGRAM DETAILS:");
        System.out.println("------------------------------------------");
        
        // Display each program individually
        for (int i = 0; i < sitPrograms.length; i++) {
            System.out.println("\nPROGRAM " + (i + 1) + ":");
            sitPrograms[i].displayInfo();
            System.out.println("Specialization: " + sitPrograms[i].getSpecialization());
            sitPrograms[i].showCareerPaths();
            System.out.println("------------------------------------------");
        }
        
        
        for (Program program : sitPrograms) {
            program.displayInfo();  // Polymorphic call!
        }
        
        System.out.println("\n3. PROGRAM COMPARISON:");
        System.out.println("==========================================");
        
        System.out.println("COMPUTER SCIENCE:");
        System.out.println("• " + cs.getSpecialization());
        cs.showCareerPaths();
        
        System.out.println("\nINFORMATION TECHNOLOGY:");
        System.out.println("• " + it.getSpecialization());
        it.showCareerPaths();
        
        System.out.println("\nDIGITAL INNOVATION:");
        System.out.println("• " + di.getSpecialization());
        di.showCareerPaths();
        

        System.out.println("\n--- Computer Science Program ---");
        CSProgram csDirect = new CSProgram();
        csDirect.displayInfo();
        csDirect.showCareerPaths();
        
        System.out.println("\n--- Information Technology Program ---");
        ITProgram itDirect = new ITProgram();
        itDirect.displayInfo();
        itDirect.showCareerPaths();
        
        System.out.println("\n--- Digital Innovation Program ---");
        DigitalInnovationProgram diDirect = new DigitalInnovationProgram();
        diDirect.displayInfo();
        diDirect.showCareerPaths();
        
        System.out.println("\n==========================================");
        System.out.println("        PROGRAM SUMMARY");
        System.out.println("==========================================");
        System.out.println("Total Programs Offered: " + sitPrograms.length);
        System.out.println("• Computer Science (4 years)");
        System.out.println("• Information Technology (3 years)");
        System.out.println("• Digital Innovation (4 years)");

        System.out.println("==========================================");
    }
}
