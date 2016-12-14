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
      

 
 }

