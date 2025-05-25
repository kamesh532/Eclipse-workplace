package JavaPrograms;

public class ReplaceSpaceswithSingleSpace {
	public static void main(String[] args) {
        System.out.println(" as    and  ".trim().replaceAll("\\s+", " "));
    }
}
