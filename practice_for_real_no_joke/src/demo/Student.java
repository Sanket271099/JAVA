package demo;

public class Student {
String name;
int Roll_no;
static int obj_num;
public Student(int Roll_no, String name) {
	this.Roll_no=Roll_no;
	this.name=name;
	obj_num++;
}

}
