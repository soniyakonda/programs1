package Basic;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math,phy,science, total,per;
  Scanner sc= new Scanner (System.in);
  System.out.println("enter 3 subject marks");
  math=sc.nextInt();
  phy=sc.nextInt();
  science=sc.nextInt();
  total =math+phy+science;
  per=total/3;
  System.out.println(" percentage is:" +per);
  
  
  
	}

}
