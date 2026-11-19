import java.util.*;
class designation{
    int count=0;
    int employee;
    String designation;
    String desig[];
    public static void main(String args[]){
    }
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total no. of employees:");
        employee= sc.nextInt();
        sc.nextLine();
        desig= new String[employee];
        for(int i=0;i<employee;i++){
            System.out.println("enter the designation of employee "+(i+1)+":");
            desig[i]= sc.nextLine();
        }
    }
    void display(){
        System.out.println("enter the designation to be found-");
        for(int i=0;i<employee;i++){
            if(designation.equals(desig[i])){
                count++;
            }
            else{
            }
        }
        if(count>0){
            System.out.println("the designation is found "+count+" times");
        }
        else{
            System.out.println("the designation is not found");
        }
    }
}

