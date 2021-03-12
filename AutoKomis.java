package lab5;
import java.util.Calendar;
import java.util.Scanner;

public class AutoKomis {
	
	Samochod[] komis = new Samochod[10];
	int full = 0;
	
	
	
	
	void addSamochod() {
		
		if(full == 10) {
		System.out.println("AutoKomis is full!!!");
		System.exit(1);
		}
				
		Scanner skaner = new Scanner(System.in);
		
		System.out.println("Enter the car brand: ");
		String brand = skaner.nextLine();
		
		System.out.println("Enter the car model: ");
		String model = skaner.nextLine();
		
		System.out.println("Enter the car capacity: ");
		int capacity = skaner.nextInt();
		
		System.out.println("Enter the car type: ");
		String type = skaner.nextLine();
		
		System.out.println("Enter the car engine: ");
		String engine = skaner.nextLine();
		
		System.out.println("Enter the car year production: ");
		int year_production = skaner.nextInt();
		
		System.out.println("Enter the car price: ");
		int price = skaner.nextInt();
		
		
		Calendar new_calendar = Calendar.getInstance();
		
		System.out.println("Enter the year of car registration: ");
		int year = skaner.nextInt();
		
		System.out.println("Enter the month of car registration: ");
		int month = skaner.nextInt();
		
		System.out.println("Enter the day of car registration: ");
		int day = skaner.nextInt();
		
		new_calendar.set(Calendar.YEAR, year);
		new_calendar.set(Calendar.MONTH, month);
		new_calendar.set(Calendar.DAY_OF_MONTH, day);
		
		
		komis[full] = new Samochod(brand, model, capacity, type, engine, year_production, price, new_calendar);
		full++;
		
		
		
	}

}
