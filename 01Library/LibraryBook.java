abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    String callNumber;
    public LibraryBook(){}
public LibraryBook(String auth,String  ti,String  ISBNnum,String callnum){
    author=auth;
    title=ti;
    ISBN=ISBNnum;
    callNumber=callnum;}
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
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
public int CompareTo(LibraryBook b){
    if (Integer.parseInt(callNumber)>Integer.parseInt(b.getCallNumber())){
	return 1;}
    if (Integer.parseInt(callNumber)==Integer.parseInt(b.getCallNumber())){
	return 0;}
    else{
	return -1;}}
public String toString(){
    return title + "," + author +"," + ISBN +"," +callNumber +"," + this.circulationStatus();}
}
