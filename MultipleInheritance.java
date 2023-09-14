package inheritanceProgram;

public class MultipleInheritance {
	public void Nemella() {
		System.out.println("Nemella");
	}
}
	class A extends MultipleInheritance {
		public void Pravallika() {
			System.out.println("Pravallika");
		}
	}
	class B extends A {
		public void Tester() {
			System.out.println("Tester");
		}
	
	public static void main(String[] args) {
		B np = new B();
		np.Nemella();
		np.Pravallika();
		np.Tester();
	}
	}





