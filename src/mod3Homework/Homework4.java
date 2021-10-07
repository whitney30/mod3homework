package mod3Homework;

public class Homework4 {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.setName("whitney");
		
		System.out.println(computer1.getName());
		computer1.setCost(7);
		System.out.println(computer1.getCost());
		
		
	
         computer1.setYear(2021);
		System.out.println(computer1.getYear());
		
		
	}

}


//Create a Computer class that has 3 variables. The first variable will have a name. The second variable will be the year of the computer. Last variable will be the cost of the computer.

//- All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.


//public static void computer(String name);
//System.out.println("computer" + name);
//System.out.println("computer" + cost);
//System.out.println("computer" + year);


//a.computer("Whitney");

