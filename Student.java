import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    int mark1, mark2, mark3;
    int total;
    double average;
void getData()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Name: ");
name = sc.nextLine();
System.out.print("Enter Roll Number: ");
rollNo = sc.nextInt();
System.out.print("Enter Mark 1: ");
mark1 = sc.nextInt();
System.out.print("Enter Mark 2: ");
mark2 = sc.nextInt();
System.out.print("Enter Mark 3: ");
mark3 = sc.nextInt();
}
void calculate() {
total = mark1 + mark2 + mark3;
average = total / 3.0;
}
void display() {
System.out.println("\n--- Student Details ---");
System.out.println("Name: " + name);
System.out.println("Roll Number: " + rollNo);
System.out.println("Total Marks: " + total);
System.out.println("Average Marks: " + average);
}
public static void main(String[] args) {
Student s = new Student();
s.getData();
s.calculate();
s.display();
}
}
