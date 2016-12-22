public class Driver{
    public static void main(String[] args){
	int[] ary = {5,6,11,2,33,8,22};
	for(int i = 0; i < ary.length; i++){
	    System.out.print(ary[i] + ",");
	}
	System.out.print("\n");
	Sorts.bubbleSort(ary);
	for(int i = 0; i < ary.length; i++){
	    System.out.print(ary[i] + ",");
	}
    }}
