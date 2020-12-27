package Generic;



public class Stundent<T,V> {
T first;
V second;
public Stundent(T first ,V second) {
this.first=first;
this.second=second;
}
public void setAge(T first) {
	this.first = first;
}public void setSecond(V second) {
	this.second = second;
}public T getFirst() {
	return first;
}
public V getSecond() {
	return second;
}
public void print() {
	System.out.println(first+" "+second);
}
}
