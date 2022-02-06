package logicalprogramming;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		
	
String str="    j  a   v   a   ta  r  ";
String trimStr=str.trim();
System.out.println(trimStr);

//replace empty 
str.replaceAll("\\s", "");
System.out.println(str);
}
}