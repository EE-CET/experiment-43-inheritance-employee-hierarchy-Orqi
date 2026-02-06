import java.util.Scanner;

class Employee {
   String name;
   int age;
   long phoneNumber;
   String address;
   double salary;
   public void printSalary(){
           System.out.println(salary);     
   }
  
}
class Officer extends Employee{
        String specialization;   
      public void display(){
                System.out.println("Officer:");
                System.out.println(name);
                System.out.println(age);
                System.out.println(phoneNumber);
                System.out.println(address);
                System.out.println(salary);
                System.out.println(specialization);
                
      }   
       Officer(String a, int b, long c, String d, double e,String f){
                name=a;
                age=b;
                phoneNumber=c;
                address=d;
                salary=e;
                specialization=f;
   }    
}
class Manager extends Employee{
        String department;
         public void display(){
                System.out.println("Manager:");
                System.out.println(name);
                System.out.println(age);
                System.out.println(phoneNumber);
                System.out.println(address);
                System.out.println(salary);
                System.out.println(department);
      }       
       Manager(String a, int b, long c, String d, double e,String f){
                name=a;
                age=b;
                phoneNumber=c;
                address=d;
                salary=e;
                department=f;
   }  
}

// TODO: Create class Officer extends Employee
// Add 'specialization' attribute

// TODO: Create class Manager extends Employee
// Add 'department' attribute

public class EmployeeInheritance {
   public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String ofname= sc.next();
        int ofage= sc.nextInt();
        long ofphone= sc.nextLong();
        String ofad= sc.next();
        Double ofsal= sc.nextDouble();
        String ofspe= sc.next();
        String maname= sc.next();
        int maage= sc.nextInt();
        long maphone= sc.nextLong();
        String maad= sc.next();
        Double masal= sc.nextDouble();
        String maspe= sc.next();
        Officer of= new Officer(ofname,ofage,ofphone,ofad,ofsal,ofspe);
        Manager ma= new Manager(maname,maage,maphone,maad,masal,maspe);
        of.display();
        ma.display();
   }
}
