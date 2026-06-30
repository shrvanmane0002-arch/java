package primeNumber;

public class Pn {
	
	public static void main(String[] args) {
		
		int i=2,count =0,num;
		for(num=1;num<=50;num++);{
			count=0;
		for( i = 1 ; i < num; i++) {
			if (num%i==0)
			{
				count++;
			
			}
			
		}
	
		if (count==2) {
			System.out.println(num);
		}
		}
	
	
	
	}
}

