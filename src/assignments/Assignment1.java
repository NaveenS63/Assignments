package assignments;

import java.time.Year;

public class Assignment1 {

	public static void main(String[] args) {

		// String DataType
		String EmailAddress = "john.doe@example.com";
		String Occupation = "Software Engineer";
		String FavColor = "Blue";
		String BookTitle = "To Kill a Mockingbird";
		String TimeOfEvent = "2:30 PM";
		String EyeColor = "Brown";
		String PhoneNumber = "123-456-7890";
		String Followers = "1,000,000";

		// Array DataType
		String[] Address = new String[2];
		Address[0] = "United States";
		Address[1] = "New York City";

		// Float DataType
		float Temperature = 25.5f; // DataType double also will work.
		float BankBalance = 1000.50f;
		float MovieRating = 7.5f;
		float DistanceOfTwoCities = 200.5f;

		// Double DataType
		double latitude = 37.7749;
		double longitude = -122.4194;

		// Boolean DataType
		boolean OrderPlaced = true;
		boolean MaritalStatus = true;

		// Integer DataType
		int CurrentYear = Year.now().getValue();
		int NoOfEmployees = 500;

		// Character DataType
		char BloodGroup = 'A';

		System.out.println("1. Temperature of a city in degrees Celsius: " + Temperature);
		System.out.println("2. Whether a customer has placed an order: " + OrderPlaced);
		System.out.println("3. Person's phone number: " + "\"" + PhoneNumber + "\"");
		System.out.printf("4. Amount of money in a customer's bank account: %.2f%n", BankBalance);
		System.out.println("5. Person's email address: " + "\"" + EmailAddress + "\"");
		System.out.printf("6. Coordinates of a location (latitude, longitude): %.4f,%.4f%n", latitude, longitude);
		System.out.println("7. Person's marital status: " + MaritalStatus);
		System.out.println("8. Person's occupation: " + "\"" + Occupation + "\"");
		System.out.println("9. Person's favourite colour: " + "\"" + FavColor + "\"");
		System.out.println("10. Current year: " + CurrentYear);
		System.out.println("11. Number of followers on a social media platform: " + Followers);
		System.out.println("12.Rating of a movie: " + MovieRating);
		System.out.println("13.Person's blood type: " + "\'" + BloodGroup + "\'");
		System.out.println("14.Title of a book: " + "\"" + BookTitle + "\"");
		System.out.println("15.Number of employees in a company: " + NoOfEmployees);
		System.out.println("16.Time of an event: " + TimeOfEvent);
		System.out.println("17.Name of a country: " + "\"" + Address[0] + "\"");
		System.out.println("18.Person's eye color: " + "\"" + EyeColor + "\"");
		System.out.println("19.Person's birthplace: " + "\"" + Address[1] + "\"");
		System.out.println("20.Distance between two cities: " + DistanceOfTwoCities);

	}

}
