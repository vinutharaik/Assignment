package logicalprogramming;

public class RemoveSpecialChacter {
	public static void main(String[] args) {
		String str="$ja!va$st%ar";
		String remove=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(remove);
	}
	

}
