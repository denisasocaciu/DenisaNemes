package ro.sci.s06;

public class arrayStrings {
    public static void main(String[] args) {
        String[] random = {"Ana ", "are ", "zece ", "mere", "."};
        StringBuilder all = new StringBuilder(random[0]);

        for (int i =1; i < random.length; i++) {

            all.append(random[i]);
        }
        System.out.println(all);
    }
}