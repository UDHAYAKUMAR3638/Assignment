
import java.util.*;


class Arraylist {
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("World");
		al.add(1, "New");
        al.add("Wlcome");
        String n= al.get(1);
        System.out.println(n);
        al.remove(1);
        al.add(1,"toNew");
        for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}
        al.remove("New");
		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}
		System.out.println();

	}
}
