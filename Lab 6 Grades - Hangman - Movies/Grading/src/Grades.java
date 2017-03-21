//Robert Cyril Plata III
public class Grades {

    // Initial variables
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int numF;
    
    // Constructor for input from GraphingGrades.java class
    // Parameters indicating inputted integers
    public Grades(int numA, int numB, int numC, int numD, int numF) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
        this.numD = numD;
        this.numF = numF;
    }

    //Assigning the class variables to the local public variables
    public void setNumA(int newA) {
        numA = newA;
    }
    public void setNumB(int newB) {
        numB = newB;
    }
    public void setNumC(int newC) {
        numC = newC;
    }
    public void setNumD(int newD) {
        numD = newD;
    }
    public void setNumF(int newF) {
        numF = newF;
    }
   
    // Sum of all grades for use in percentage computation
    public int totalGrades(){
        int total = numA + numB + numC + numD + numF;
        return total;
    }

    // Numbers being returned as percentages by multiplying by 100 and dividing by total
    public int percentA(){
        return numA * 100 / totalGrades();
    }

    public int percentB(){
        return numB * 100 / totalGrades();
    }

    public int percentC(){
        return numC * 100 / totalGrades();
    }

    public int percentD(){
        return numD * 100 / totalGrades();
    }

    public int percentF(){
        return numF * 100 / totalGrades();
    }

    // Method creation of drawGraph to call in other classes
    public void drawGraph(){
        // Print the heading for the graph
        System.out.println("0    10   20   30   40   50   60   70   80   90   100%");
        System.out.println("|    |    |    |    |    |    |    |    |    |    |");
        System.out.println("***************************************************");
        
        // For each letter grade, print *'s equal to half the percent (It's rounded up)
        for(int i = 0; i < percentA(); i+=2) {
            System.out.print("*");
        }
        System.out.println(" A");
        for(int i = 0; i < percentB(); i+=2) {
            System.out.print("*");
        }
        System.out.println(" B");
        for(int i = 0; i < percentC(); i+=2) {
            System.out.print("*");
        }
        System.out.println(" C");
        for(int i = 0; i < percentD(); i+=2) {
            System.out.print("*");
        }
        System.out.println(" D");
        for(int i = 0; i < percentF(); i+=2) {
            System.out.print("*");
        }
        System.out.println(" F");

    }
}