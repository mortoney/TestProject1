

class MyEx extends Exception {
	
	}


public class ExTestDrive {
	static void doRisky(String t) throws MyEx{
		System.out.println("t");
		System.out.println("h");
		if("yes".equals(t)){
			System.out.println("a");
					throw new MyEx();
		}
			System.out.println("r");
			System.out.println("o");
		
		
	}
	
	public static void main(String[] args) {
		String test = args[0];
		try{
			doRisky(test);
		}catch(MyEx e){
			
		}finally{
			System.out.println("w");
			System.out.println("s");
		}
	}
}

