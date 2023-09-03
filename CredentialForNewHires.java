import java.util.Scanner;


public class CredentialForNewHires {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstname = sc.nextLine();
		System.out.println("Enter the last name:");
		String lastname = sc.nextLine();
		Employee employee = new Employee(firstname,lastname);
		System.out.println("Please Enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		int opt = sc.nextInt();
		String department = "";
		switch(opt) {
		case 1:
			department = "Technical";
			break;
		case 2:
			department = "Admin";
			break;
		case 3:
			department = "Humen Resource";
			break;
		case 4:
			department = "Legal";
			break;
		}
		CredentialService cs = new CredentialService();
		cs.showCredentials(employee);
	}
}
