public class Faktorial{
	public static void main(String[] args){
	int n = Integer.parseInt(args[0]);
	int factorial = factorial(n, 1);

	System.out.println("Factorial "+ n +"adalah"+ factorial);
	}	
	
	public static int factorial(int n, int result){
	if(n==1){	
		return result;
	} else {
		return factorial(n-1, result *(n));
	}

	} 
}