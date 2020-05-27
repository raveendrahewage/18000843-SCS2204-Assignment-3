object Q3
{
	def main(args:Array[String])
	{
		println("\n\tSum Calculator\n")
		print("Enter the Number : ")
		var num:Int=scala.io.StdIn.readInt();

		println("The sum of the number up to "+num+" : "+sum(num));
	}

	def sum(num:Int):Int=
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num+sum(num-1);
		}
	}
}