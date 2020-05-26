object Q1
{
	def main(args:Array[String])
	{
		println("\n\tSum Calculator\n")
		print("Enter the Number : ")
		var num:Int=scala.io.StdIn.readInt();
		var sum=0;
		while(num>=0)
		{
			if(isEven(num))
			{
				sum=sum+num;
			}
		}
		 println("The sum of even numbers up to "+num+ " : "+sum);
	}

	def isEven(num:Int):Boolean=
	{
		if(num==0)
		{
			return true;
		}
		else
		{
			return isOdd(num-1);
		}
	}

	def isOdd(num:Int):Boolean=
	{
		return !(isEven(num));
	}
}