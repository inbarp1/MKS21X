public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zip) {
	try{
	    _zip=zip;
	    _checkDigit=checkSum();}
	catch{
	    throw RuntimeException;}
    }
    
    // postcondition: Creates a copy of a bar code.
    public Barcode clone(){
	Barcode cloned = new Barcode(this._zip);
	return cloned;
    }


    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	int sum=0;
	for(int index=0; index<5;index++){
	    sum+=Integer.parseInt(_zip.charAt(index));
	}
	return sum;	    
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	int number =0;
	String part ="";
	String toreturn = _zip + "  ";
	    switch(number){
	    case 0: part=":::||";
		break;
	    case 1: part= "||:::";
		break;
	    case 2: part="|:|::";
		break;
	    case 3: part="|::|:";
		break;
	    case 4: part="|:::|";
		    break;
	    case 5: part=":||::";
		break;
	    case 6: part=":|:|:";
		break;
	    case 7: part=":|::|";
		break;
	    case 8: part="::||:";
		break;
	    case 9: part="::|:|";
		break;}
	    for(int index=0; index<zip_.length();i++){
		number=Integer.parseInt(_zip.charAt(index));
		toreturn+=part}
	    return toreturn;		    
    }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	
    }
    
}
