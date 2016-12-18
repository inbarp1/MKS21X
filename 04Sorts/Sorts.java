public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "10.Pe'er.Inbar"; 
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
	for(int numInd=1; numInd<data.length;numInd++){
	    if(data[numInd]<data[numInd-1]){
		int start=numInd;
		int remember1;
		while(data[start]<data[start-1]&&start>0){
		    remember1= data[start-1];
		    data[start-1]=data[start];
		    data[start]=remember1;
		    if(start!=1){
			start=start-1;}}}}}
		    
		    
    public static void bubbleSort(int[] data){
        for(int l=data.length;l>1;l--){
	    int remember;
	    for(int index=0; index<l-1;index++){
		if(data[index]>data[index+1]){
		   remember=data[index+1];
		   data[index+1]=data[index];
		   data[index]=remember;
		}}}}
	
 }

