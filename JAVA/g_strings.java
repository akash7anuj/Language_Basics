public class g_strings {
    
    public static void main(String[] args) {
        
        String name = "anuj";
        System.out.println(name.length());

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

// Compare

        String name1 = "Tony";
        String name2 = "Tony";

        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value

        // aahello aabello

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        String nameb = "anuj kumar";
        System.out.println(nameb.substring(0, 5));

    //  String are immutable...

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb); 

        // insert new char..
        sb.insert(0, "S");
        System.out.println(sb);

        // delete the extra char
        sb.delete(0, 1);
        System.out.println(sb);

        // append {add} new value
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append("e"); // sb1 = sb1 + "e" if use only { string }
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);


// reverse the string

        StringBuilder sb2 = new StringBuilder("hello");

        for(int i=0; i<sb2.length()/2; i++) {
            int front = i;
            int back = sb2.length() - 1 - i; // 5-1-0

            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);

            sb2.setCharAt(front, backChar);
            sb2.setCharAt(back, frontChar);
        }

        System.out.println(sb2);


    }
}
