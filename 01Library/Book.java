public class Book{
    String author;
    String title;
    String ISBN;
    public Book(){
    }
    public Book(String auth, String titl, String ISBNnum){
	author=auth;
	title=titl;
	ISBN=ISBNnum;}
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
    public String toString(){
	return title+ "," + author+"," +ISBN;
    }
    
}
