/**
 * 
 */
import java.util.Scanner;
/**
 * @author Ramesh
 *
 */ class PrimeNumber {

	/**
	 * @param args
	 */
     public static boolean isPrime(int primeNumber){
    	 if(primeNumber<=0){
    		 return false;
    		 
    	 }
    	 for(int i=2;i<Math.sqrt(primeNumber);i++){
    		 if(i%primeNumber==0){
    			 return false;
    			 
    		 }
    	 }
    	 return true;
    	 
    	 
     }
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeNumber;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number to know whether given is Prime or not");
	    primeNumber=scan.nextInt();
	    
	    if(isPrime(primeNumber)){
	    	System.out.println(primeNumber+" is aPrime number");
	    }
	    else{
	    	System.out.println(primeNumber+" is not a prime number");
	    }
	 }
	 public void ram() {
		 System.out.print();
	 }
	public void kingKong() {
		 System.out.print();
	 }
	}
