public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "01.Pe'er.Inbar"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
      int startIndex=0;
      while(startIndex<data.length-1){
	  // System.out.println("this is the start index:"+startIndex);
	  int indexofSmallestNumber=startIndex;
	  for(int i=startIndex; i<data.length; i++){
	      if(data[i]<data[indexofSmallestNumber]){
		  indexofSmallestNumber=i;}}
	  //System.out.println("this is the smallest number:"+data[indexofSmallestNumber]+ "and this is its index"+indexofSmallestNumber);
	  int num= data[startIndex];
	  
	  data[startIndex]=data[indexofSmallestNumber];
	  data[indexofSmallestNumber]=num;
	  startIndex+=1;}}		
      
    public static void insertionSort(int[] data){
	for(int start=1;start<data.length-1;start++){
	    if(data[start]<data[start-1]){
		int insert=data[start];
		System.out.println("this is the insert:" +insert);
		if (data.length-start-1==1){
		    data[start-1]=data[start];
		    data[start]=data[start-1];}
		for(int shift=start+1;shift<data.length-1;shift++){
		    data[shift+1]=data[shift];}
		System.out.println("This is where it is being inserted:"+ start);
		data[start-1]=insert;}}}
 
 }

