public class ReferenceBook extends LibraryBook{
    String collection;
    public ReferenceBook(String auth,String ti,String isbn, String callNum, String collect){
	author=auth;
	title=ti;
	ISBN=isbn;
	callNumber=callNum;
	collection=collect;}
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
    public String getCollection(){
	return collection;}
    public void setCollection(String collect){
	collection=collect;}
    public void checkout(String x,String y){
	System.out.println("cannot checkout reference book!");}
    public void returned(){
	System.out.println("Reference book could not have been checked out--return impossible");}
    public String circulationStatus(){
	return "non-circulating reference book";}
    public int CompareTo(LibraryBook b){
    if (Integer.parseInt(callNumber)>Integer.parseInt(b.getCallNumber())){
	return 1;}
    if (Integer.parseInt(callNumber)==Integer.parseInt(b.getCallNumber())){
	return 0;}
    else{
	return -1;}}
    public String toString(){
	return title + "," + author +"," + ISBN +"," +callNumber +"," + this.circulationStatus()+","+collection;}
}
