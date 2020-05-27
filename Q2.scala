object Q2
{
	def main(args:Array[String])
	{
		println("\n\tPrime Number Checker\n")
		print("Enter the Number : ")
		var num:Int=scala.io.StdIn.readInt();
		
		print("Prime Numbers : ");

		while(num>1)
		{
			if(prime(num,num-1))
			{
				print(num+" ");
			}
			
			num=num-1;
		}
	}

	def prime(num1:Int,num2:Int):Boolean=
	{
		if(num2==1)
		{
			return true;
		}
		else if(num1%num2==0)
		{
			return false;
		}
		else
		{
			return prime(num1,num2-1);
		}
	}
}