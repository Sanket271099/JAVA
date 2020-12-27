package Generic1_1;

public class Student <T>{
T first;
T Second;
public Student(T first,T second) {
	this.first=first;
	this.Second=second;
}
public T getFirst() {
	return first;
}public void setFirst(T first) {
	this.first = first;
}public void setSecond(T second) {
	Second = second;
}public T getSecond() {
	return Second;
}
public  void print() {
	System.out.println(first+" "+Second);
}
}
