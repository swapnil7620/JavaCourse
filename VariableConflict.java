
public interface Interface1 {
	String s = "Geeks for Geeks";
}
public interface Interface2 {
	String s = "GFG";
}
// implement the interfaces
public class VariableConflict
	implements Interface1, Interface2 {
	public static void main(String[] args)
	{
		
		VariableConflict obj = new VariableConflict();
		System.out.println(Interface1.s);
		System.out.println(Interface2.s);
	}
}
