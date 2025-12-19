import java.util.Scanner;
class Employee{
    private String name;
    private int employee_Id;
    private double salary;
    Employee( String name,int employee_Id,double salary){
        this.name=name;
        this.employee_Id=employee_Id;
        this.salary=salary;
    }
    public void setName(String Name){
        this.name=name;
    }
    public void setId(int employee_Id){
      this.employee_Id=employee_Id;
    }
    public void setSaalary(double salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return employee_Id;
    }
    public double getSalary(){
        return salary;
    }
    public void displayDetails(){
        System.out.println("employee details are");
         System.out.println("employee name is"+name);
          System.out.println("employee id is"+employee_Id);
           System.out.println("employee salary is"+salary);
        
    }
}
class Manager extends Employee{
    private int teamSize;
    Manager( String name,int employee_Id,double salary,int teamSize){
        super(name,employee_Id,salary);
        this.teamSize=teamSize;
    }
    public void setTeamSize(String programmingLanguage){
        this.teamSize=teamSize;
    }
    public int getTeamSize(){
        return teamSize;
    }
    public void displayDetails(){
          System.out.println("Employee details are");
         super.displayDetails();
       System.out.println("Size: "+teamSize);
        
    }
    
}
class Developer extends Employee{
    private String programmingLanguage;
    Developer( String name,int employee_Id,double salary,String programmingLanguage){
        super(name,employee_Id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    public void setProgramLang(String programmingLanguage){
        this.programmingLanguage=programmingLanguage;
    }
    public String getProgramLang(){
        return programmingLanguage;
    }
     public void displayDetails(){
         System.out.println("Employee details are");
         super.displayDetails();
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
    

