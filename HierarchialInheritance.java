package inheritanceProgram;

public class HierarchialInheritance {
	public void Ammu() {
		System.out.println("Ammu");
	}
}
class A extends HierarchialInheritance {
	public void Pravs() {
		System.out.println("Pravs");
	}
}
class B extends HierarchialInheritance {
	public void AmmuPravs() {
		System.out.println("AmmuPravs");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	HierarchialInheritance np = new HierarchialInheritance();
	np.Ammu();
	A rp = new A();
	rp.Pravs();
	B ak = new B();
	ak.AmmuPravs();
}

}
