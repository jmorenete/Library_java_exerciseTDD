package cognizant.Library.TDD;


public class Runner {
	
	public static void main(String[] args) {
		Books book1 = new Books("The Bible", "religion",666,1.5);
		Books book2 = new Books("Colour Purple", "fiction",300,1.0);
		Books book3 = new Books("Econocracy", "economics",200,2.0);
		Journals journal1 = new Journals("Chemical Eng.","chemeng", 5000,3.0);
		GovtDocs doc1 = new GovtDocs("Civil Law", "law", 1000, 4.0);
		
		People person1 = new People("Jose","Morenete","01/05/1996");
		People person2 = new People("Chester", " ","Gardner","05/10/1990");
		People person3 = new People("Chris","chris", "01/01/2000");

	
		Library lib = new Library();
		
		System.out.println(lib.checkOut("the bible", "jose"));

		System.out.println(lib.checkOut("civil law", "chester"));
		
		System.out.println(lib.checkOut(" law", "chris"));
		
		System.out.println(lib.checkIn("civil law", "chester"));

	
	System.out.println(lib.addItem("book","matrix", "fiction", 555, 1.0));
	 System.out.println(lib.deleteItem("The Bible", "B1"));
	}
	

}
