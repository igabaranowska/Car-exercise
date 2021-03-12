package lab5;

import java.util.Calendar;


public class Main_samochod {

	public static void main(String[] args) {
		
		   Samochod test = new Samochod();
		   Calendar calendar = Calendar.getInstance();
		   calendar.set(Calendar.YEAR, 2020);
		   calendar.set(Calendar.MONTH, 10);
		   calendar.set(Calendar.DAY_OF_MONTH, 11);
		   
		   test.setDate_1registration(calendar);
		   test.isthereWarranty();
		   
		   calendar.add(Calendar.YEAR, 1);
		   
		  // test.setDate_1registration(calendar);
		  // test.isthereWarranty();
		
		   Samochod BMW = new Samochod("BMW", "Seria 3", 2222, "limuzyna", "320i", 2019, 215900, calendar);
	       BMW.setPrice(-1000);

	       System.out.println("The price of the car is: " + BMW.getPrice());

	}

}
