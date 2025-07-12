public class i_bit {

    public static void main(String[] args) {
        
        int a = 5;  // 0101
        int pos = 1;

        int bitMask = 1 << pos;   // set bit  { left sift }

        if((bitMask & a) == 0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is one");
        }

        int newNumber = bitMask | a;
        System.out.println(newNumber);
    }
    
}
