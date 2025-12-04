public class RemoveAllMain {
    public static void main(String[] args) {
        RemoveAll ra = new RemoveAll();
        System.out.println(ra.removeAll("banana", "a"));
        System.out.println(ra.removeAll("hello", "l"));
        System.out.println(ra.removeAll("xxxxxx", "x"));
    }
}