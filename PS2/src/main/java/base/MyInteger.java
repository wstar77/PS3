package base;

public class MyInteger {

	private int iValue;
	
	public MyInteger (int iValue) {
		this.iValue = iValue;
	}
	
	public int getiValue() {
	return iValue;
	
}
	

	public boolean isEven() {
		if ((iValue / 2) * 2 == iValue){
			return true;
		}
		return false;
		}
	
	
	public boolean isOdd() { 
		if ((iValue/2) * 2 != iValue) {
			return true;
		}
		return false;
		
		}
	
	
	public boolean isPrime(){
		int in = 0;
		for(in = 2; in <= iValue / 2; in++){
			if(iValue % in != 0)
				return true;
		}
		return false;
	}
	
	public static boolean isEven(int iValue){
		return isEven(iValue);
		}
	public static boolean isOdd(int iValue){
		return isOdd(iValue);
	}
	public static boolean isPrime(int iValue){
		return isPrime(iValue);
	}
	
	public static boolean isEven(MyInteger mi){
		return isEven(mi.getiValue());
	}
	
	public static boolean isOdd(MyInteger mi){
		return isOdd(mi.getiValue());
	}
	
	public static boolean isPrime(MyInteger mi){
		return isPrime(mi.getiValue());
	}
	
	public boolean equals(int Value){
		if (Value == iValue) {
			return true;
		}
		return false;
		}
	
	
	public boolean equals(MyInteger mi){
		if (mi.getiValue() == iValue){
			return true;
		}
		return false;
		}
		} 