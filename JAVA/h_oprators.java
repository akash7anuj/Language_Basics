public class h_oprators {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;
        
        b = ++a;  // first change then use  { a == b }
        b = a++;  // first use then change  { a != b }
        System.out.println(a);
        System.out.println(b);

        b = --a;  // first change then use  { a == b }
        b = a--;  // first use then change  { a != b }
        System.out.println(a);
        System.out.println(b);


// logical oprators

        // && { and } { t & t = t otherwise f}
        // || { or }  { f & f = f otherwise t}
        //  ! { make opposite }

// bit-wise oprators
        //   &
        //   |
        //   ^
        //   ~
        //   <<
        //   >>
        
//  Assignment Operators
        //   =
        //   +=
        //   -+
        //   *=
        //   /+

    }
}
