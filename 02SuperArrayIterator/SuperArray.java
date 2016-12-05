public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;
    public SuperArray(){
	size = 0;
        data = new String[10];
    }
public SuperArray(int initialCapacity){
		if (initialCapacity<0){
		throw new IllegalArgumentException();}
	size=0;
	data= new String[initialCapacity];
}
    //0
    //constructor make an empty superArray should make size 0, 
    //but the data capacity 10.

    public int size(){
	return size;
    }
    public String get(int index){
	if (index<0 || index>=size()){
	    throw new IndexOutOfBoundsException();
}
	return data[index];
    }

    //1
    /**add the value n to the next available slot in the superArray.
     *this will change the size. This function should always work
     *And will resize the SuperArray if needed.*/
    public void add(String n){
	if (size<data.length){
	  data[size]=n;
	  size+=1;}
      else{
	  this.grow();
	  this.add(n);
      }
}

  //2
  /**Resize the data, by making a new array, then copying over elements, use this as your data.
    */
    public superArrayIterator iterator(){
	return new superArrayIterator(0,size,data);}
	
    private void grow(){
	String[] temp = new String[data.length*2];
	for (int i = 0; i<data.length; i++){
	    temp[i]=data[i];}
	data=temp;
    }
  
    //3
    /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
     *commas between... square bracket start/end and no comma at end.*/
    public String toString(){
	String array = "[";
	    for(int i = 0; i<size;i++){
	    array+=data[i];
	    if (size==i+1){
		array+="]";
		return array;}
	    else{
		array+=", ";}

	    }
	    array+="]";
	    return array;
    }

    //4
    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
     *(capacity is 10, but only 6 are used)
     *commas between... square bracket start/end and no comma at end.
     *unused slots should be printed as _ (underscores) */
    public String toStringDebug(){
	String array = "";
            for(int i = 0; i<size;i++){
		if(i<size){
		if (i==0){
                    array+=data[i];}
                array+=", ";
		array+=data[i];
		}
		else{
		    array+=", _";
		}
		array+="]";
	    }
	    return array;
    }
    public void clear(){
	size=0;
    }
    public boolean isEmpty(){
	return size==0;
    }
    public String  set (int index, String  element){
	if (index<0 || index>size()){
	    throw new IndexOutOfBoundsException();
	}
	String replaced= data[index];
	data[index]= element;
	return replaced;
	
    }
    public void add(int index, String element){
	if (index<0 || index>size()){
	    throw new IndexOutOfBoundsException();
}	
	if (size<data.length){
	for(int i=size-1;i>=index;i--){
	    data[i+1]=data[i];
	}
	data[index]=element;
	size+=1;}
	else{
	    this.grow();
	    this.add(index, element);
	}}
    public String  remove(int index){
if (index<0 ||index >=size()){
    throw new IndexOutOfBoundsException();
}
	String toreturn=data[index];
	for(int i=index;i<size-1;i++){
	    data[i]=data[i+1];
	}
	size-=1;
	return toreturn;
    }
    public String[] toArray(){
	String[]toarray= new String[size];
	for (int i =0; i<size;i++){
	    toarray[i]=data[i];
	}
	return toarray;}
    public int indexOf(String i){
	for (int m=0; m<size; m++){
	    if( data[m]==i){
		return m;}}
	return -1;}
    public int lastIndexOf(String i){
	for(int m=size-1;m>0; m--){
	    if (data[m]==i){
		return m;}
	}
	return -1;}
    public void trimToSize(){
	String[] temp = new String[size];
	for (int i = 0; i<size; i++){
	    temp[i]=data[i];}
	data=temp;
    }
}
