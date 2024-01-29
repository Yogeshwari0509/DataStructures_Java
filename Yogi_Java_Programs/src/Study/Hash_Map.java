package Study;
//Collections:
import java.util.HashMap;
import java.util.Map;
public class Hash_Map {

	public static void main(String[] args) {
		//create HashMap using keys and values <>-Generics
		//creating object for map
		Map<Integer,String> hash = new HashMap();
		//Insertion():
		//Key-Values user define values:
		hash.put(1,"AI");
		hash.put(2,"ML");
		hash.put(3,"CSD");
		
		//Assigning the key for Hashing:
		System.out.println("Key Value 1: "+ hash.get(2));
		
		//Print all the values of Key:
		System.out.println("HashMap: "+hash);
		
		//Deletion():
		hash.remove(3);
		//Print the value after remove():
		System.out.println("After Removal of hash: "+hash);
	}

}
