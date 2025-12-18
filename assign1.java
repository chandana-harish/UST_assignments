import java.util.Scanner;
class Employee{
    String name;
    int employee_Id;
    double salary;
    Employee( String name,int employee_Id,double salary){
        this.name=name;
        this.employee_Id=employee_Id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("employee details are");
         System.out.println("employee name is"+name);
          System.out.println("employee id is"+employee_Id);
           System.out.println("employee salary is"+salary);
        
    }
}
class Manager extends Employee{
    int teamSize;
    Manager( String name,int employee_Id,double salary,int teamSize){
        super(name,employee_Id,salary);
        this.teamSize=teamSize;
    }
    public void displayDetails(){
          System.out.println("Employee details are");
         System.out.println("Employee Name: "+name);
          System.out.println("Emoployee ID: "+employee_Id);
           System.out.println("Employee Salary: "+salary);
       System.out.println("Size: "+teamSize);
        
    }
    
}
class Developer extends Employee{
    String programmingLanguage;
    Developer( String name,int employee_Id,double salary,String programmingLanguage){
        super(name,employee_Id,salary);
        this.programmingLanguage=programmingLanguage;
    }
     public void displayDetails(){
         System.out.println("Employee details are");
         System.out.println("Employee Name: "+name);
          System.out.println("Emoployee ID: "+employee_Id);
           System.out.println("Employee Salary: "+salary);
       System.out.println("Programming Language: "+programmingLanguage);
        
    }
}
class assign1{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee E1=new Manager("Alice",101,80000.0,5);
        E1.displayDetails();
        System.out.println();
        Employee E2=new Developer("bob",102,80000.0,"Java");
        E2.displayDetails();
    }
}
    

