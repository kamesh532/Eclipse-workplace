package JavaPrograms;

public class Amstrong {

	public static void amstrong(int num)
	{
		int rem=0,temp,sum=0;
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum+=Math.pow(rem, 3);
			num/=10;
			
		}
		if(sum==temp)
		{
			System.out.println(temp+" number is amstrong");
		}
		else
			System.out.println(temp+" number isnot amstrong");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=372;
		amstrong(num);
	}

}
