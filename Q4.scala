object Q4
{
	def main(args:Array[String])
	{
		println("\n\tOdd Even Finder")
		print("Enter the Number : ")
		var num:Int=scala.io.StdIn.readInt();

		if(isEven(num))
		{
			println(num+" is an even number");
		}
		else
		{
			println(num+" is an odd number");
		}
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
