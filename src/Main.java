
public class Main {
	
	public static void main(String[] args) {
	
		var personClass = new PersonClass("João", 25);
		System.out.println(personClass);
		
		var personRecord = new PersonRecord("Wilson", 35);
		System.out.println(personRecord);
		personRecord.printName();
		
	}
	
}
