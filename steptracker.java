import java.util.Scanner;
class steptracker{
    int sw;
    String name;
    double cb,km;
    public static void main (String args[]){
        
    }
    void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your step count: ");
        sw = sc.nextInt();
    }
    void calculate(){
        cb= sw*0.04;
        km= sw/1300;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Step count: "+sw);
        System.out.println("Calories burned: "+cb);
        System.out.println("Distance covered in km: "+km);
    }

}