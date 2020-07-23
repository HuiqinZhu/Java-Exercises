public class Books {
		String bookName;   //define a class and all its attributes/functions/methods
		private String author;    // new attributes should be defined based on old attributes like String and integer etc
		String category;   //private makes it not visible and not accessible in other classes    
		int pages;       //private--- can only been accessed in this class
		boolean meaningful;
		boolean famous;

		
		//a constructor below for other programs to create objects of this class
		public Books(String bookName, String author, String category,int pages,boolean meaningful,boolean famous) {
			this.bookName = bookName;     //connect 2 values by = or ()
			this.setAuthor(author);       // this.setx(x to public);
			//means public can fill out the content of setx method 
			//and the setx method will get acesses to original attributes
			// so that public can not change the value of original attributes directly
			//it has to pass the filter of setx method
			setCategory(category);  //make setx a middleman of x orginal attribute and x open to public when changing the value
			//this. is not necessary???
			//ways of getting input to be filtered out---1,make input connected to setx directly
			//2, make the original ones private and the input has to pass the setx
			this.pages = pages;
			this.meaningful = meaningful;   //this means original???!!!
			this.famous = famous;   	
		}	
		//the public has no direct access to the original attributes any more 
		//so we have to create a new method even to call and print out the value of original attributes
		
		
		 public String getAuthor() {     //nothing in the parenthesis of setx 
		    	return this.author;       //make getx a middleman between x original attribute and x open to public when printing out
		    }
		
		 //the class void can not use return, so use String or others
	   
		 public String getCategory() {    
		    	return category;    //this. is not necessary
		 }
	      
		 
		 //parameters should have a variable type   //void is very important
	    public String setAuthor(String author) {   //setters passes values to original attributes, so it needs parenthesis and parameters in it
			 return this.author = author ;  //original attribute in the left and public one in the right 
		} //get access to original 
	    
		public void setCategory(String category) {   //the category here is public one
			if(category.contentEquals("Romance") || category.contentEquals("Philosophy")|| category.contentEquals("Life") ) {
				this.category = category;   
			} this.category = "Not Defined" ;   //also can use else{}  //define the value of the original attributes
		}
		
		
		
		
}