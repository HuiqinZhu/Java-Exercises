
public class Songs {

	String title;  //private---so that the original attributes can only be accessed directly by things in this class 
	private String artist;  //private is the key of accessing directly 
	private int length;
	private static int songsCount;   //static is sth shared the same value by every variable in the class 
	
	Songs(String title, String artist, int length){
		setTitle(title);   //but with the private written before this, original things can not be accessed
		//can be given a value secretly, but can not be called
		this.setArtist(artist);
		setLength(length);  //means the input of public is connected to the setters
		songsCount++;   //increment every time when calling the constructor
		System.out.println("songs count: " + songsCount);
		
	}
	//ways of getting input to be filtered out---1,make input connected to setx directly
	//2, make the original ones private and the input has to pass the setx
	
	//better to set setters and getters
	//getters for things you want to print out in other programs
	//setters for things you want to change in other programs
	public String getTitle() {    //things except void can be returned
		return this.title;      // return means give a value
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getSongsCount() {
		return this.songsCount;
	}
	
	public void setTitle(String title) {   //void is for sth to be returned 
		//parameter of certain type and certain name in the parenthesis is for public to input
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setLength(int length) {
		this.length = length;
       //void means give a condition 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
