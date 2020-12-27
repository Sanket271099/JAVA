package Generic;
public class genericUSe {
	public static void main(String[] args) {
		
	Stundent<Character,String>s2=new Stundent<>('a',"Sanket");
	System.out.println(s2.getFirst());
	System.out.println(s2.getSecond());
	int a=11;
	int b=22;
	int c=33;
//	Stundent []s=new Stundent[10];
//	for(int i=0;i<s.length;i++) {
//		s[i].first=i+1;
//		s[i].second=i+2;
//	}
//	for(int i=0;i<s.length;i++) {
//		s[i].print();
//	}
Stundent <Integer,Integer>Internal=new <Integer,Integer>Stundent(a,b);
Stundent<Stundent<Integer,Integer>,Integer> s=new<Integer,Integer>Stundent(Internal,c);
System.out.println(s.getSecond());
System.out.println(s.getFirst().getFirst());
System.out.println(s.getFirst().getSecond());
Stundent <Integer,Integer>s1=new <Integer,Integer>Stundent(22,33);
}
}
