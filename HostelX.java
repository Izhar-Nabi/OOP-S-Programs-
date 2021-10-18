class HostelX
{
	int NumberOfHostelInUniversity;
	String MyHostel;
	int numberofWings;
	int EachWingRoom;
	int NumberOfRooms;
	int numberofStudentsperRoom;
	int TotalStudents;

	public static void main(String args[]){
	HostelX ABC = new HostelX();
	System.out.print("X Y Z Name Of College OR Univesity");
	System.out.println();
	ABC.NumberOfHostelInUniversity= 10;
	ABC.MyHostel= "ABC, X Y Z University,City";
	ABC.numberofWings=4;
	ABC.EachWingRoom=13;
	ABC.NumberOfRooms=52;
	ABC.numberofStudentsperRoom=3;
	ABC.TotalStudents=156;
	System.out.println( "Number of Hostel In University are : "+ABC.NumberOfHostelInUniversity);
	System.out.println( "MyHostel : "+ABC.MyHostel);
	System.out.println( "Number of Wings are  : "+ABC.numberofWings);	
	System.out.println( "Each Wing Room are : "+ABC.EachWingRoom);
	System.out.println( "Number of Rooms : "+ABC.NumberOfRooms);
	System.out.println( "Number Of Student per Room : "+ABC.numberofStudentsperRoom);
	System.out.println( "Total Number of Students in Jatoi Hostel are : "+ABC.TotalStudents);
	}
}