class Main{

    public static void main(String[] args) {
       Teacher teacObj[] = new Teacher[2];
       teacObj[0] = new Teacher("name 1","gender 1","addr 1",45,1234,"cmp name 1","phd",12000,"CA","CS",34);
       teacObj[1] = new Teacher("name 2","gender 2","addr 2",46,1235,"cmp name 2","mphil",13000,"CN","CSS",35);
       teacObj[0].display();
       teacObj[1].display();
    }
}

class Person {
   String name;
   String gender;
   String address;
   int age;
   
   Person(String name,String gender,String addr,int age){
    this.name = name;
    this.gender = gender;
    this.address = addr;
    this.age = age;
   }

   protected void display(){
    System.out.println("Name : " + this.name);
    System.out.println("Gender : " + this.gender);
    System.out.println("Addrese : " + this.address);
    System.out.println("Age : " + this.age);
   }
}



class Employee extends Person{
    int empId;
    String companyName;
    String qualification;
    int salary;

    Employee(String name,String gen,String add,int age,int id,String comp,String qual,int salary){
        super(name,gen,add,age);
        this.empId = id;
        this.companyName =comp;
        this.qualification =qual;
        this.salary=salary;
    }
    protected void display(){
        super.display();
        System.out.println("ID : " + this.empId);
        System.out.println("Company name : " + this.companyName);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Salary : " + this.salary);
       }
}

class Teacher extends Employee{
    String subject;
    String dept;
    int tchrid;

    Teacher(String name,String gen,String add,int age,int id,String comp,String qual,int salary,String subj,String dept,int tchid){
        super(name,gen,add,age,id,comp,qual,salary);
        this.dept =dept;
        this.tchrid =tchid;
        this.subject =subj;
    }

    public void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Subject : " + this.subject);
        System.out.println("Department : " + this.dept);
        System.out.println("Teacher ID : " + this.tchrid);
        System.out.println("..........................................");
    }
}