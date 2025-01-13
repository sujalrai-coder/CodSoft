import java.util.Scanner;

class Student{
    int a,b,c,d,e;
    
    public void Sum(int a,int b,int c,int d,int e){
        int sum = a+b+c+d+e;
        System.out.println("Total Marks :- "+sum);
    }
    public void Avg(int a,int b,int c,int d,int e){
        int avg = (a+b+c+d+e)/5;
        System.out.println("The Average Percentage :- "+avg+" %");

        if(avg<=100 && avg>=90){
            System.out.println("Grade :- A+");
        }
        else if(avg<=89 && avg>=80){
            System.out.println("Grade :- A");
        }
        else if(avg<=79 && avg>=70){
            System.out.println("Grade :- B+");
        }
        else if(avg<=69 && avg>=60){
            System.out.println("Grade :- B");
        }
        else if(avg<=59 && avg>=50){
            System.out.println("Grade :- C");
        }
        else if(avg<=49 && avg>=40){
            System.out.println("Grade :- D");
        }
        else if(avg<=39 && avg>=0){
            System.out.println("Grade :- Fail");
        }

    }
   
}


public class Student_Grade_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the Marks of the Subjects mention below :");
        Scanner sc = new Scanner(System.in);


        System.out.print("Maths :- ");
        int a = sc.nextInt();

        System.out.print("Chemistry :- ");
        int b = sc.nextInt();

        System.out.print("Physcis :- ");
        int c = sc.nextInt();

        System.out.print("English :- ");
        int d = sc.nextInt();

        System.out.print("IP:- ");
        int e = sc.nextInt();

        Student obj = new Student();
        obj.Sum(a,b,c,d,e);
        obj.Avg(a,b,c,d,e);
        
    }
}
