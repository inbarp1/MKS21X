import java.util.Iterator;
import java.util.NoSuchElementException;
public class superArrayIterator implements Iterator<String>{
    int start, end;
    String[] superarray;
    public superArrayIterator(int start, int end, String[]superarray){
	this.start=start;
	this.end=end;
	this.superarray=superarray;
    }
    public String next(){
	if(hasNext()){
	    start++;
	    return superarray[start-1];
	}
	else{
	    throw new NoSuchElementException();
	}
    }
    public boolean hasNext(){
	return start<end;
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}