package Basic;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double  maths ,phy,science,total,per;
Scanner sc= new Scanner(System.in);
System.out.println("enter maths ,phy,science");
maths=sc.nextDouble();
 phy=sc.nextDouble();
science= sc.nextDouble();
total=maths+phy+science;
per=total/3*100;
if(maths<40|| phy<40|| science<40)
{
System.out.println(" fail");
}
 else if( per>=90) {
	System.out.println(" grade: a" );

}
else if( per>=70) {
	System.out.println(" grade: b" );
}
else if( per>=50) {
	System.out.println(" grade: c" );
}
	else {
		System.out.println("student failed");







}


	} 

}
