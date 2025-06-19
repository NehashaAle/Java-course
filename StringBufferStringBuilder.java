public class StringBufferStringBuilder {
    public static void main(String srg[]) {
        StringBuffer str = new StringBuffer("Hello");

        System.out.println(str.capacity());

        str.append("World");
        System.out.println(str);

        str.deleteCharAt(4);
        System.out.println(str);

        str.insert(5, "Cat");
        System.out.println(str);
    }
}
