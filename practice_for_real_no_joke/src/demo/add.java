package demo;
import java.util.Scanner;

class add{
public static void main(String args[]){
int sum=0;
Scanner s=new Scanner(System.in);
int end=s.nextInt();
if(end<2){
return;
}
int num;
int i=1;
while(i<=end){
num=s.nextInt();
       sum=sum+num;
i++;
             }
System.out.print(sum);
   }
}
