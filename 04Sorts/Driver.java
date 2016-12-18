public class Driver{
    public static void main(String[] args){
	int[] ary = {599, 84, 72, 21, 1};
	for(int i = 0; i < ary.length; i++){
	    System.out.print(ary[i] + ",");
	}
	System.out.print("\n");
	Sorts.bubbleSort(ary);
	for(int i = 0; i < ary.length; i++){
	    System.out.print(ary[i] + ",");
	}
    }}
