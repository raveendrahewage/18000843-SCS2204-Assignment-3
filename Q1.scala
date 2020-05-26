object Q1
{
	def main(args:Array[String])
	{
		println("\n\tPrime Number Checker\n")
		print("Enter the Number : ")
		var num:Int=scala.io.StdIn.readInt();

		if(prime(num,num-1))
		{
			printf("%d is a prime number.",num);
		}
		else
		{
			printf("%d is not a prime number.",num);
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