object Q1
{
	def main(args:Array[String])
	{
		println("\n\tFibonacci Number Calculator\n")
		print("Enter the Number : ")
		var num:Int=scala.io.StdIn.readInt();
		var fibNo=1;

		print("fibonacci numbers up to "+num+" : ");
		while(num>=fibNo)
		{
			print(fibonacciNum(fibNo)+" ");
			fibNo=fibNo+1;
		}
	}

	def fibonacciNum(fibNo:Int):Int=
	{
		if(fibNo==1)
		{
			return 0;
		}
		else if(fibNo==2)
		{
			return 1;
		}
		else
		{
			return fibonacciNum(fibNo-1)+fibonacciNum(fibNo-2);
		}
	}
}