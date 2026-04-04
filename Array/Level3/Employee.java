import java.util.Scanner;
 class Employee{
    private int id;
    private String name;
    private double salary;
    private String address;
    
    public Employee(int id, String name, double salary, String address){
     this.id = id;
     this.name = name;
     this.salary = salary;
     this.address = address;
   }
  
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    
    Employee[] employee = new Employee[5];

    for(int i=0; i<5; i++){ 

    System.out.println("Enter the detail of Employee "+i+1);
    System.out.println("Enter the  id : ");
      int id = sc.nextInt();
    
    System.out.print("Name : ");
    String name = sc.nextLine();

    sc.nextLine();

    System.out.print("Salary : ");
    double salary = sc.nextDouble();
     
    System.out.print("Address : ");
    String address = sc.nextLine();
     sc.nextLine();
    
     employee[i] = new  Employee(id, name, salary, address);
    }

    double maxsalary = 0;
    for(Employee e : employee){
       double currSalary = e.salary;
       if(maxsalary < currSalary){
          maxsalary = currSalary; 
        }
    }
   System.out.println("Max Salary : "+maxsalary);
    
   
   }
}