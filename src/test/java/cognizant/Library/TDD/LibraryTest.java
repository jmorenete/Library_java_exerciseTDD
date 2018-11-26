package cognizant.Library.TDD;

import static org.junit.Assert.assertEquals;

import java.awt.print.Book;

import org.junit.Test;

import cognizant.Library.TDD.Books;
import cognizant.Library.TDD.DateAssignment;
import cognizant.Library.TDD.GovtDocs;
import cognizant.Library.TDD.Items;
import cognizant.Library.TDD.Library;
import cognizant.Library.TDD.People;

public class LibraryTest {
//
//	@Test
//	public void dateTest() {
//		DateAssignment date = new DateAssignment();
//		GovtDocs gov = new GovtDocs(null, null, 0, 0);
//		
//		assertEquals("returns todays date in dd/mm/yyyy","21/11/2018",date.currentDate());
//		assertEquals("today's date plus 5 days","26/11/2018",date.dueDate(gov));
//	}
//	
//	@Test
//	public void checkOutTest() {
//		Books book = new Books("bible", null, 0, 0);
//		Library lib = new Library();
//		assertEquals("No user present in people arraylist","Register a user register prior to checking out.", lib.checkOut("bible","jose"));
//		
//		People person1 = new People("Jose","maria","morenete","01/05/1996");
//		String name = person1.getName();
//		assertEquals("User and book present in corresponding arraylist",("Date borrowed: 21/11/2018"+"\n"+"Due date: 11/12/2018"+"\n"+ "User: " + name +"\n"), lib.checkOut("bible", "jose"));
//	}
//	
//	
//	public void checkInTest() {
//		Books book = new Books("bible", null, 0, 0);
//		Library lib = new Library();
//		lib.checkOut("bible", "jose");
//		
//		assertEquals("book checked out, book and person exist in array","Book checked-in for jose morenete, thanks!",lib.checkIn("bible", "jose"));
//	
//	}
	@Test
	
	public void peopleId() {
		People person1 = new People("Jose","maria","morenete","01/05/1996");
		String idbefore = person1.getPersonId();
		
		People person2 = new People("Chester", " ","Gardner","05/10/1990");
		
		String idafter = person2.getPersonId();
		
		assertEquals("id check", "U2", idafter);
		
	}
	
}
