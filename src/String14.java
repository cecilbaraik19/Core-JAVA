class StringBufferDemo {
    StringBuffer st = new StringBuffer("We Love Jharkhand");
    int l;

    void disp() {
        System.out.println("Original String: " + st);

        l = st.length();
        System.out.println("Length of String: " + l);

        System.out.println("After Append: " + st.append(" & India"));
        System.out.println("After Insert: " + st.insert(8, "Ranchi, "));
        System.out.println("After Replace: " + st.replace(4, 6, "ik"));
        System.out.println("After Delete: " + st.delete(18, 25)); // adjusted range
        System.out.println("Substring (5,9): " + st.substring(5, 9));
        System.out.println("After Reverse: " + st.reverse());
        System.out.println("After Re-Reverse: " + st.reverse());
        System.out.println("Final String after all operations: " + st);
    }
}

public class String14 {
    public static void main(String[] args) {
        StringBufferDemo ob = new StringBufferDemo();
        ob.disp();
    }
}
