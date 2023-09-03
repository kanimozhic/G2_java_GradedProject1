public class CredentialService {
	public static String generatePassword() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%^&*";
		StringBuilder password = new StringBuilder();
		for (int i = 0; i <= 8; i++) {
			int index = (int) (Math.random() * chars.length());
			password.append(chars.charAt(index));
		}
		return password.toString();
	}

	public static String generateEmailAddress(Employee employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String email = firstName + "." + lastName + "@department.company.com";
		return email;

	}

	public void showCredentials(Employee employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String Password = generatePassword();
		String email = generateEmailAddress(employee);
		System.out.println("Dear " + firstName + ", your generated credentials are as follows");
		System.out.println("Email: " + email);
		System.out.println("Password: " + Password);

	}
}

