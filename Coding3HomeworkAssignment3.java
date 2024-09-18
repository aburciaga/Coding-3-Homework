
public class Coding3HomeworkAssignment3 {
    
    public static boolean IsAllUnique(String str){
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j]) {
                    return false; 
                }
            }
        }
        return true; 
    }
    
    public static void main(String[] args) {
        System.out.println(IsAllUnique("stack"));
        System.out.println(IsAllUnique("unique"));
    }
    
}
    
