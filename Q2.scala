object Q2
{
	def main(args:Array[String])
	{
		println("\n\tPrime Number Checker\n")
		print("Enter the Number : ")
		var num:Int=scala.io.StdIn.readInt();
		var count=2;
		print("Prime Numbers : ");

		while(num>=count)
		{
			if(prime(count,count-1))
			{
				print(count+" ");
			}
			
			count=count+1;
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
