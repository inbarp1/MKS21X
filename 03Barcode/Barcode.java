public class Barcode implements Comparable <Barcode>{
//instance vars
	private String _zip;
	private int _checkDigit;

//constructors
//precondition: _zip.length()=5 and zip containts only digits.
//postcondition: throws a runtime exception if zip is not the correct length
						//or zip contains a non digit
						//_zip and checkDigit are initialized.

public Barcode(String zip){
	try{
		_zip=zip;
		_checkDigit=checkSum();}
	 catch{
		throw RuntimeException(zip is not the right length, please make sure it is five digits!);
	}
}

//postcondition:Creates a copy of a bar code.
public Barcode clone(){

}

//postcondition: computes and returns the check sum for _zip
  private int checkSum(){
	int sum=0;
	for(int index=0;index<5;index++){
		sum+=Integer.parseInt(zip[index]);
	}
	return sum;
}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}
	switch(){
	case

// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}

	
}






