package lab5;
import java.util.Calendar;

public class Samochod {
	
	
			   private String brand;
			   private String model;
			   private int capacity;
			   private String type;
			   private String engine;
			   private int year_production;
			   private int price;
			   Calendar date_1registration;

	
			   public Samochod(String brand, String model, int capacity, String type, String engine, int year_production, int price, Calendar date_1registration) {
		       this.setBrand(brand);
		       this.setModel(model);
		       this.setCapacity(capacity);
		       this.setType(type);
		       this.setEngine(engine);
		       this.setYear_production(year_production);
		       this.setPrice(price);
		       this.setDate_1registration(date_1registration);
			   }
			   
			   
			   Calendar getDate_1registration() {
			       return date_1registration;
			   }

			   public void setDate_1registration(Calendar date_1registration) {
				   if (date_1registration.get(Calendar.YEAR) > 1870) {
				       this.date_1registration = date_1registration;
				   } else {
				       System.out.println("Error! The date is before the production of the first car!");
				   }
				}
			   
			   
			   public void isthereWarranty() {
				   Calendar calendar = Calendar.getInstance();
				   int actual_year = calendar.get(Calendar.YEAR);
				   int registration_year = date_1registration.get(Calendar.YEAR);
				   
				   if((actual_year - registration_year) <= 2)
				   {
					   System.out.println("The car has a valid warranty.");
				   }
				   else
				   {
					   System.out.println("The car has no warranty.");
				   }
			   }
			   
			   
			   public Samochod() {
			   }
			   
			   public String getBrand() {
			       return brand;
			   }
	
			   public void setBrand(String brand) {
			       this.brand = brand;
			   }
			   
			   
			   public String getModel() {
			       return model;
			   }
	
			   public void setModel(String model) {
			       this.model = model;
			   }
			   
			   
			   public int getCapacity() {
			       return capacity;
			   }

			   public void setCapacity(int capacity) {
				   if (capacity > 330 && capacity < 8277) {
				       this.capacity = capacity;
				   } else {
				       System.out.println("Error! Capacity given is out of range!");
				   }
				}
			   
			   public String getType() {
			       return type;
			   }

			   public void setType(String type) {
			       this.type = type;
			   }
			   
			   
			   public String getEngine() {
			       return engine;
			   }

			   public void setEngine(String engine) {
			       this.engine = engine;
			   }
			   
			   
			   public int getYear_production() {
			       return year_production;
			   }

			   public void setYear_production(int year_production) {
				   if (year_production > 1870) {
				       this.year_production = year_production;
				   } else {
				       System.out.println("Error! The year before the production of the first car is given!");
				   }
				}
			   
			   public int getPrice() {
			       return price;
			   }

			   public void setPrice(int price) {
				   if (price >= 0) {
				       this.price = price;
				   } else {
				       System.out.println("Error! Price can't be negative!");
				   }
				   
			   }
}



