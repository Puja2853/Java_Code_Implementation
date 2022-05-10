package AccessModifiers;

//modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses.

class Addition {
    // protected method
    protected int add(int x, int y) {
        return x+y;
    }
}
public class ProtectedAccessModifier extends Addition {

	public static void main(String[] args) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
         // access protected method
       System.out.println(obj.add(100, 10)); 

	}

} 
