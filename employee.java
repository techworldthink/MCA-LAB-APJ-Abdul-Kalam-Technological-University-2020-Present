import java.util.*;  
public class employee {
    String ID;
    String name;
    int salary;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        ID = sc.nextLine();;
        System.out.print("Enter Name : "); 
        name = sc.nextLine();;
        System.out.print("Enter monthly salary : "); 
        salary = sc.nextInt();
    }

    public void display(){
        System.out.println("Year salary is : "+ salary*12);
    }
    public static void main(String []args){
        employee emp_1 = new employee();
        emp_1.read();
        emp_1.display();

        employee emp_2 = new employee();
        emp_2.read();
        emp_2.display();
    }
}
