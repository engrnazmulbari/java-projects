
public class Singleton implements Cloneable{

	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		try{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println("Object 1 hash code: "+obj1.hashCode());
		System.out.println("Object 2 hash code: "+obj2.hashCode());
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
