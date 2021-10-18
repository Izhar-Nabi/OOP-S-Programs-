class Book
{
	String Name;
	int Pages;
	int chapter;
	String WritterName;

	public static void main(String args[]){
	System.out.println("!! WELCOME TO BOOK STORE !!");
	Book physics = new Book();
	physics.Name="Introduction to Physics";
	physics.Pages=100;
	physics.chapter=10;
	physics.WritterName="Newton";
	System.out.println();
	System.out.println("Book Name :"+physics.Name);
	System.out.println("Pages :" +physics.Pages );
	System.out.println("chapters :" +physics.chapter);
	System.out.println("Writter Name :" +physics.WritterName);
	System.out.println();
	Book Chemistry= new Book();
	Chemistry.Name="Introduction to Chemistry";
	Chemistry.Pages=100;
	Chemistry.chapter=10;
	Chemistry.WritterName="ABC";
	System.out.println("Book Name :"+Chemistry.Name);
	System.out.println("Pages :" +Chemistry.Pages );
	System.out.println("chapters :" +Chemistry.chapter);
	System.out.println("Writter Name :" +Chemistry.WritterName);
	}

}