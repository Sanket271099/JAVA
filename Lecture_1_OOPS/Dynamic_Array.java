package Lecture_1_OOPS;

public class Dynamic_Array {
private int nextIndex;
private int data[];
public Dynamic_Array() {
	 data=new int[5];
	 nextIndex=0;
}
public int size() {
	return nextIndex;
}
private int[] restructure() {
	int  temp[]=data;
	data=new int[2*data.length];
	for(int i=0;i<temp.length;i++) {
		data[i]=temp[i];
	}
	return data;
}public boolean isEmpty() {
	if(size()==0) {
		return true;
	}
	else {
		return false;
	}
}
public void set(int index, int value) {
	data[index]=value;
	return;
}
public int RemoveLast() {
	int value=data[nextIndex-1];
	data[nextIndex-1]=0;
	nextIndex--;
	return value;
}public void add(int element) {
	if(data.length==nextIndex) {
		restructure();
	}
	data[nextIndex]=element;
	nextIndex++;
}public int get(int index) {
	if(index>nextIndex){
		return -1;
	}
	else if(index==nextIndex){
		restructure();
	}else {
		return data[index];
		} 
	return 0;
}
}
