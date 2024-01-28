package Study;
public class HashTable
{
    //calculating the ascii value
    public static int HashInput(String input){
        int hash=0;
        for(int i=0;i<input.length();i++){
            hash=input.charAt(i);
           
        }
        return hash;
    }
    public static void main(String[] args)
    {
        String input="AI&CSD";
        //calculate hash value
        int hashVal=HashInput(input);
        System.out.println("user input: "+input);
        System.out.println("hash value: "+hashVal);
    }
}

