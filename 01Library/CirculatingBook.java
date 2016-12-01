public class CirculatingBook extends LibraryBook{
    String currentHolder;
    String dueDate;
  public CirculatingBook(String auth,String ti,String isbn, String callNum){
	author=auth;
	title=ti;
	ISBN=isbn;
	callNumber=callNum;
	currentHolder=null;
	dueDate=null;}
    public String getAuthor(){
	return author;}
    public void setAuthor(String auth){
	author=auth;}
    public String getTitle(){
	return title;}
    public void setTitle(String titl){
	title=titl;}
    public String getISBN(){
	return ISBN;}
    public void setISBN(String isbn){
	ISBN=isbn;}
    public String getCallNumber(){
	return callNumber;}
    public void setCallNumber(String callnum){
	callNumber=callnum;}
   
    public void  setCurrentHolder(String currhol){
	currentHolder=currhol;}
    public String getCurrentHolder(){
	return currentHolder;}
    public String getDueDate(){
	return dueDate;}
    public void setDuedate(String dd){
	dueDate=dd;}
    public void checkout(String patron, String due){
	currentHolder=patron;
	dueDate=due;}
    public void returned(){
	currentHolder=null;
	dueDate=null;}
    public String circulationStatus(){
	if( !(currentHolder==null)){
	    return currentHolder +" checked this book out and it is due "+dueDate;}
	    else{
		return "book is available on shelves";
	    }}
public int compareTo(LibraryBook b){
    return callNumber.compareTo(b.getCallNumber());}
	public String toString(){
	    return title + "," + author +"," + ISBN +"," +callNumber +"," + this.circulationStatus() ;
	}}
	   
	
	
	
