public class ReverseString{
public static void ReverseString(String arg[]) {
    String originalString="hello java";
    String reverseString="";
    for(int i=originalString.length() -1;i>=0;i--)
      ReverseString=reverseString+originalString.charAt(i);
}
    System.out.println("Original String" + originalString);
    System.out.println("Reversed String" +  reverseString);
  }
}