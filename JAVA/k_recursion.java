// loop + function = recursion

// #   info == ??
// #   kam == ???
// #   base case == ??

// import java.util.HashSet;

import java.util.ArrayList;

public class k_recursion {
    
//1 print no. 1 to 5.

    // public static void printNo(int n){
    //     if(n == 6){
    //         return;
    //     }

    //    System.out.println(n);
    //    printNo(n+1);  // recursion
        
    // }

    // public static void main(String[] args) {
    //     int n = 1;
    //     printNo(n);
 
        
    // }

//2 print sum of first n natural numbers

    // public static void sumNatural(int i, int n, int sum){
    //     if(i == n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
        
    //     sum += i;
    //     sumNatural(i+1, n, sum);
        
    // }

    // public static void main(String[] args) {
        
    //     sumNatural(1, 5, 0);

        
    // }


//3  print factorial of number n

    // public static int calcFactorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }

    //     int factorial1 = calcFactorial(n-1);
    //     int factorialN = n * factorial1;
    //     return factorialN;

    // }

    // public static void main(String[] args) {

    //     int n = 9;
    //     int ans = calcFactorial(n);
    //     System.out.println(ans);
        
    // }


//4  print the fabonacci sequence till nth term

    // public static void fabonacci(int a, int b, int n){
    //     if(n == 0){
    //         return;
    //     }

    //     int c = a + b;
    //     System.out.println(c);

    //     fabonacci(b, c, n-1);

    // }
    // public static void main(String[] args) {

    //     int a = 0, b = 1;
    //     System.out.println(a);
    //     System.out.println(b);

    //     int n = 9;
    //     fabonacci(a, b, n-2);
        
    // }


//5   print X^n {stack height = n }

    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }

    //     int xpower1 = power(x, n-1);
    //     int xpower = x * xpower1;
    //     return xpower;
    // }

    // public static void main(String[] args) {

    //     int x = 2, n = 5;
    //     int ans = power(x, n);
    //     System.out.println(ans);
    // }



//6   print X^n {stack height = logn }

    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }

    //     if(n % 2 == 0){  // for even
    //         return power(x, n/2) * power(x, n/2);
    //     }
    //     else{  // for odd
    //         return power(x, n/2) * power(x, n/2) * x;
    //     }
    // }

    // public static void main(String[] args) {
        
    //     int x = 2, n = 5;
    //     int ans = power(x, n);
    //     System.out.println(ans);
    // }


//7  tower of hanoi .....
//      RULES
//   1. Only one disk transferred in 1 step
//   2. Smaller disks are always kept on top of larger disks

    // public static void towerOfHanoi(int n, String source, String helper, String destination){
    //     if(n == 1){
    //         System.out.println("transfer disk "+ n + " from " + source + " to " + destination);
    //         return;
    //     }

    //     towerOfHanoi(n-1, source, destination, helper);
    //     System.out.println("transfer disk "+ n + " from " + source + " to " + destination);

    //     towerOfHanoi(n-1, helper, source, destination);
    // }

    // public static void main(String[] args) {
    //     int n = 4;
    //     towerOfHanoi(n, "S", "H", "D");
    // }


//8 print a string in reverse

    // public static void reverse(String str, int ind){
    //     if(ind == 0){
    //         System.out.println(str.charAt(ind));
    //         return;
    //     }
    //     System.out.println(str.charAt(ind));
    //     reverse(str, ind-1);
    // }

    // public static void main(String[] args) {

    //     String str = "abcd";
    //     reverse(str, str.length()-1);
        
    // }

//9 find the 1st and last occurence of an element in list 

    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurence(String str, int idx, char element){
    //     if(idx == str.length()){
    //         System.out.println("first position is "+first);
    //         System.out.println("last position is "+last);
    //         return;
    //     }

    //     char currentstr = str.charAt(idx);
    //     if(currentstr == element){
    //         if(first == -1){
    //             first = idx;
    //         }
    //         else{
    //             last = idx;
    //         }
    //     }

    //     findOccurence(str, idx+1, element);

    // }

    // public static void main(String[] args) {

    //     String str = "abaacdabefgah";
    //     char element = 'b';
    //     findOccurence(str, 0, element);
        
    // }


//10  check if an array is sorted { Strictly increasing }

    // public static boolean isSorted(int arr[], int idx){
    //     if(idx == arr.length-1){
    //         return true;
    //     }

    //     if(arr[idx] >= arr[idx+1]){
    //         // array is unsorted
    //         return false;
    //     }
        
    //     return isSorted(arr, idx+1);

                //       { array is sorted till now }
                    
                //   if(arr[idx] >= arr[idx+1]){
                //       return isSorted(arr, idx+1);
                //   }
                //   else{
                //       return false;
                //   }
        
    // } 

    // public static void main(String[] args) {
    //     int arr[] = {1, 9, 5};
    //     boolean sorting = isSorted(arr, 0);
    //     System.out.println(sorting);

    // }


//11  move all X to the end of all string

    // public static void moveX(String str, int idx, int count, String newString){
    //     if(idx == str.length()){
    //         for(int i = 0; i < count; i++){
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currentstr = str.charAt(idx);
    //     if(currentstr == 'x'){
    //         count++;
    //         moveX(str, idx+1, count, newString);
    //     }
    //     else{
    //         newString += currentstr;
    //         moveX(str, idx+1, count, newString);
    //     }

    // }

    // public static void main(String[] args) {
        
    //     String str = "axxbcxd";

    //     moveX(str, 0, 0, "");

    // }


//12 remove all duplicate from string

    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicate(String str, int idx, String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currentstr = str.charAt(idx);

    //     if(map[currentstr - 'a'] == true ){
    //         removeDuplicate(str, idx+1, newString);
    //     }
    //     else{
    //        newString += currentstr;
    //        map[currentstr - 'a'] = true;
    //        removeDuplicate(str, idx+1, newString);
    //     }

    // }

    // public static void main(String[] args) {
        
    //     String str = "abbcddce";
    //     removeDuplicate(str, 0, "");
    // }


//13 print all subsequence of a string

    // public static void subsequence(String str, int idx, String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currentstr = str.charAt(idx);

    //     // to be 
    //     subsequence(str, idx+1, newString+currentstr);

    //     // not to be 
    //     subsequence(str, idx+1, newString);

    // }

    // public static void main(String[] args) {
        
    //     String str = "abcd";
    //     subsequence(str, 0, "");
    // }


//14  print all unique subsequence of a string

    // public static void subsequence(String str, int idx, String newString, HashSet<String> set){
    //     if(idx == str.length()){
    //         if(set.contains(newString)){
    //             return;
    //         }
    //         else{
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
    //     }

    //     char currentstr = str.charAt(idx);

    //     // to be 
    //     subsequence(str, idx+1, newString+currentstr, set);

    //     // not to be 
    //     subsequence(str, idx+1, newString, set);

    // }

    // public static void main(String[] args) {
        
    //     String str = "aaa";
    //     HashSet<String> set = new HashSet<>();
    //     subsequence(str, 0, "", set);
    // }


//15  print keyboard combination

    // public static String[] keypad = {".", "abc", "def", "igh", "Jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    // public static void combination(String str, int idx, String combString){
    //     if(idx == str.length()){
    //         System.out.println(combString);
    //         return;
    //     }

    //     char currChar = str.charAt(idx);
    //     String mapping = keypad[currChar - '0'];

    //     for (int i = 0; i < mapping.length(); i++) {
    //         combination(str, idx+1, combString + mapping.charAt(i));            
    //     }

    // }

    // public static void main(String[] args) {
        
    //     String str = "456";
    //     combination(str, 0, "");
    // }


//16  print all permutation of a string 

    // public static void permutation( String str, String permuString){
    //     if(str.length() == 0){
    //         System.out.println(permuString);
    //         return;
    //     }

    //     for(int i = 0; i < str.length(); i++){
    //         char currChar = str.charAt(i);
    //         // abc -> a --> bc
    //         String newstr = str.substring(0,i) + str.substring(i+1);

    //         permutation(newstr, permuString+currChar);
    //     }

    // }


    // public static void main(String[] args) {
        
    //     String str = "abc";
    //     permutation(str, "");
    // }


//17  count total path in maze to move from (0, 0) to (n, m)

    // public static int countPath(int i, int j, int n, int m){
    //     if(i == n || j == m){
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }

    //     // move downward
    //     int downPath = countPath(i+1, j, n, m);

    //     // move right
    //     int rightPath = countPath(i, j+1, n, m);

    //     return downPath + rightPath;
    // }


    // public static void main(String[] args) {
    //     int n = 3, m = 4;
    //     int totalPath = countPath(0, 0, n, m);

    //     System.out.println(totalPath);
    // }


//18   place tiles of size 1*m in a floor of size n*m

    // public static int placeTile(int n, int m){
    //     if(n == m){
    //         return 2;
    //     }
    //     if(n < m){
    //         return 1;
    //     }

    //     // vertically
    //     int vertTile = placeTile(n-m, m);

    //     // horizontally
    //     int horizTile = placeTile(n-1, m);

    //     return vertTile + horizTile;
    // }

    // public static void main(String[] args) {
        
    //     int n = 4, m = 2;
    //     int totalTiles = placeTile(n, m);

    //     System.out.println(totalTiles);

    // }

//19  find the no. of way in which you can invite n people to your party, single or pair

    // public static int callGuest(int n){
    //     if(n <= 1){
    //         return 1;
    //     }

    //     // single
    //     int way1 = callGuest(n-1);

    //     // pair
    //     int way2 = (n-1) * callGuest(n-2);

    //     return way1 + way2;
    // }

    // public static void main(String[] args) {
        
    //     int n = 4;
    //     int totalWay = callGuest(n);
    //     System.out.println(totalWay);
    // }


//20  prints all the subsets of a set of first n natural number

    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }

        // add hoga
        subset.add(n);
        findSubsets(n-1, subset);

        // add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {

        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();

        findSubsets(n, subset);
    
    }
}