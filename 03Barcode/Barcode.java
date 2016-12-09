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
	catch(RuntimeException e){
 
	    throw e;}
    }
    
    // postcondition: Creates a copy of a bar code.

    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	int sum=0;
	for(int index=0; index<5;index++){
	    sum+=Character.getNumericValue(_zip.charAt(index));
	}
	return sum%10;	    
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	return _zip+_checkDigit+" " + toBarcode(_zip)+toBarcode(_checkDigit);
    }
    public String toBarcode(String zip){
	int number =0;
	String part ="";
	String toreturn ="|";
	for(int index=0; index<_zip.length();i++){
		number=Integer.parseInt(_zip.charAt(index));
		toreturn+=part;}
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
	    return toreturn+"|";	
    }
    //throw exception for when it is not right length, for when it is not all indexes, when it doesnt all start and end w | when checksum doesnt work and when there are illegal chars
    public String toZip(String code){
	if (code.charAt(0)!='|"=' || code.charAt(31)!=='|'){
	    throw IllegalArgumentException("your barcode must begin with | and end with |");}
	if (code.length()!=32){
	    throw IllegalArgumentException("your barcode needs to be 32 characters long");}
	for(int n=0; n<code.length()-1;n++){
	    if(code.charAt(n)!='|' || code.charAt(n)!=':'){
		throw IllegalArgumentException("String must be composed of only : and |");}}
	String []array=new String[10];
	array[0]=":::||";
	array[1]= "||:::";
	array[2]="|:|::";
	array[3]="|::|:";
	array[4]="|:::|";
	array[5]=":||::";
	array[6]=":|:|:";
	array[7]=":|::|";
	array[8]="::||:";
	array[9]="::|:|";
	String zip="";
	String part="";
	
	for(int index=1;index<31;index+=5){
	    part="";
	    for(int i=0; i<5;i++){
		part+=code.charAt(index+i);}
	    zip+=Integer.toString(array.indexOf(part));}
	if (checkDigit(Integer.parseInt(zip)/10)!=Integer.parseInt(zip)%10){
	    throw IllegalArgumentException("checksum does not work out");}
    return zip;
    }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return Integer.parseInt(other._zip+other._checkDigit)-Integer.parseInt(_zip+_checkDigit);
									       }
}
