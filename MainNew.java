package Hospital1Project;

import java.util.Scanner;
public class MainNew {
	  public static void main(String[] args) {

	        HospitalQueue queue = new HospitalQueue();

	        Doctor d1 = new Doctor("Dr.A", queue);
	        d1.start();

	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Add Patient");
	            System.out.println("2. Exit");

	            int ch = sc.nextInt();

	            if (ch == 1) {
	                sc.nextLine();

	                System.out.print("Enter name: ");
	                String name = sc.nextLine();

	                System.out.print("Condition: ");
	                String condition = sc.nextLine();

	                System.out.print("Priority (1-10): ");
	                int priority = sc.nextInt();

	                Patient p = new Patient(name, condition, priority);
	                queue.addPatient(p);

	                System.out.println("Patient Added!");
	            } else {
	                break;
	            }
	        }
	  }  }
