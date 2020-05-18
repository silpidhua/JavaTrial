
class SupplyObject{
	//override the constructor to private
	private SupplyObject() {};
	static SupplyObject obj = null;
	public static SupplyObject getInstance() {
		if (obj == null){
			obj = new SupplyObject();
		}
		return obj;
	}
	double generateRand() {
		return Math.random();
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		
		SupplyObject object = SupplyObject.getInstance();
		System.out.println(object.generateRand());
	}

}
