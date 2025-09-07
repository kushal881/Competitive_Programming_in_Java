//class Student {
//    int rollno;
//    String studentname;
//}
//public class Main{
//    public static void main(String[] args) {
//        Student obj1 = new Student();
//        obj1.rollno = 1;
//        obj1.studentname = "Kushal";
//        System.out.println(obj1.rollno);
//        System.out.println(obj1.studentname);
//
//
//        Student obj2 = new Student();
//        obj2.rollno = 2;
//        obj2.studentname = "nohan";
//        System.out.println(obj2.rollno);
//        System.out.println(obj2.studentname);
//    }
//}

//How to declare Methods
//        access  modifier   return type methodname(parameters){
//        method body}
//        public int sum(int a, int b){
//        int ans = a+b;
//        return ans;}
//    Call a Method:
// public class Main{
//    static void welcome() {
//        System.out.println("Welcome to My Black Universe");
//    }
//
//    public static void main(String[] args) {
//        welcome();
//    }
//}


//import java.awt.desktop.ScreenSleepEvent;
//import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.Scanner;
//
////class Student{
////    int mul(int a, int b){
////        int mul = a*b;
////        return mul;
////    }
////}
////public class Main{
////    public static void main(String[] args) {
////        Student obj = new Student();
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        System.out.println("The multiplication of the two numbers is: ");
////        int ans = obj.mul(a, b);
////        System.out.println(ans);
////    }
////}
//
////public class Main{
////    public static void main(String[] args) {
////        System.out.println(Math.sqrt(24));
////        System.out.println(Math.sqrt(16));
////        System.out.println(Math.floor(5.2));
////        System.out.println(Math.floor(5.8));
////        System.out.println(Math.ceil(5.8));
////        System.out.println(Math.ceil(5.3));
////    }
////}
//
////class arraysExample {
////    int a;
////    int b;
////
////    arraysExample(int x, int y){
////        System.out.println("Sum of the given numbers is : ");
////        a=x;
////        b=y;
////    }
////    int sum() {
////        int sum = a + b;
////        return sum;
////    }
////}
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        arraysExample obj = new arraysExample(sc.nextInt(), sc.nextInt());
////        int ans = obj.sum();
////        System.out.println(ans);
////
////        arraysExample obj2 = new arraysExample(sc.nextInt(), sc.nextInt());
////        int ans2 = obj2.sum();
////        System.out.println(ans2);
////    }
////}
//
////                                     Introduction to arrays
////  1. Collection of similar type of Data.
////  2. arrays have 0 based Indexing.
////  3. Contiguous Memory Allocated.
////                                     Representation of array
////     int[] ages;
////     String[] names;
////     float[] weights;
////                                     Syntax of array
////  int[] ages;
////  ages = new int [size]
////  Example:-
////   int[] ages = new int[10];
////   float ages[] = new float[10];
////                                     array Literal
//// int[] array = {1, 2, 3, 5, 6, 2}
//
//
////class arraysExample{
////    void demoarrays() {
////        int[] ages = new int[3];
////        float[] weights = new float[3];
////        String[] names = new String[3];
////        int[][] Ages  = {{12,45,21}, {45,14,8}, {12,45,78}};
////        float[][] weights = new float[3][3];
////        String[][] names = new String[3][3];
//
////        ages[0][0] = 18;
////        ages[0][1] = 24;
////        ages[0][2] = 78;
////
////        ages[1][0] = 11;
////        ages[1][1] = 81;
////        ages[1][2] = 56;
////
////        weights[0][0] = 74.2f;
////        weights[0][1] = 72.65f;
////        weights[0][2] = 78.12f;
//
//
//
////        ages[0] = 34;
////        ages[1] = 12;
////        ages[2] = 45;
////
////        System.out.println(ages[0]);
////        System.out.println(ages[1]);
////        System.out.println(ages[2]);
//
//
//
////        System.out.println(Ages[1][0]);
////        System.out.println(Ages[1][1]);
////        System.out.println(Ages[1][2]);
////        System.out.println(Ages.length);
////
////        System.out.println(weights[0][0]);
////        System.out.println(weights[0][1]);
////        System.out.println(weights[0][2]);
////    }
////}
//
////public class Main {
////    public static void main(String[] args) {
////        arraysExample obj = new arraysExample();
////        obj.demoarrays();
////    }
////}
////                         Taking inputs in the form of array from the users
////public class Main{
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////
////        System.out.println("Enter " + n + " elements: ");
////        for(int i=0; i<arr.length; i++){
////            arr[i] = sc.nextInt();
////        }
////        for(int i = 0; i<n; i++){
////            System.out.print(arr[i] + " ");
////        }
////    }
////}
////                                     array refenence in Java
////public class Main{
////    static void printarray(int[] arr){
////        for(int i=0; i<arr.length; i++){
////            System.out.print(arr[i] + " ");
////        }
////        System.out.println();
////    }
////    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
////        int[] arr = new int[5];
////        arr[0] = 5;
////        arr[1] = 6;
////        arr[2] = 7;
////        arr[3] = 8;
////        arr[4] = 9;
////
//////        for(int i=0; i<arr.length; i++){
//////            arr[i] = sc.nextInt();
//////        }
////        System.out.println("Original array: ");
////        printarray(arr);
////        int[] arr_2 = arr.clone();
////        System.out.println("Copied array: ");
////        printarray(arr_2);
////        arr_2[0] = 0;
////        arr_2[1] = 0;
////        System.out.println("Original array after changing arr_2: ");
////printarray(arr);
////System.out.println("Copied array after changing arr_2: ");
////        printarray(arr_2);    }
////}
//
////public class Main{
////    static void number(int[] arr){
////        int y =5;
////        int x = 0;
////        for(int i=0;i<arr.length;i++){
////            if(y<arr[i]){
////                x++;
////            }
////        }
////        System.out.println(x);
////    }
////
////    public static void main(String[] args) {
////        int[] arr = new int[5];
////        arr[0] = 5;
////        arr[1] = 6;
////        arr[2] = 7;
////        arr[3] = 8;
////        arr[4] = 9;
////
////        number(arr);
////    }
////}
//
////public class Main{
////    static void number(int[] arr){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the number which is repeating: ");
////        int y = sc.nextInt();
////        int x = 0;
////        for(int i=0; i<arr.length;i++){
////            if(y==arr[i]) {
////                x++;
////            }
////        }
////        System.out.println(y + " is repeating " + x + " times in this array");
////    }
////
////
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.println("Enter the elements in array: ");
////        for(int i = 0;i<arr.length;i++){
////            arr[i] = sc.nextInt();
////        }
////        for(int i=0;i<n;i++){
////            System.out.println(arr[i] + " ");
////        }
////        number(arr);
////    }
////}
//
////public class Main {
////    static void number(int[] arr) {
////        int x = 0;
////        int n = arr.length;
////        for (int i = 0; i < n; i++) {
////            for (int j = i + 1; j < n; j++) {
////                for(int k=j+1; k<n;k++)
////                    if (arr[i]+arr[j]+arr[k] == 12) {
////                        x++;
////                }
////            }
////        }
////        System.out.println("number of pairs whose sum is 7 are: "+ x);
////    }
////
////        public static void main (String[]args){
////            Scanner sc = new Scanner(System.in);
////            System.out.println("Enter the size of the array: ");
////            int n = sc.nextInt();
////            int[] arr = new int[n];
////            System.out.println("Enter the elements in array: ");
////            for (int i = 0; i < arr.length; i++) {
////                arr[i] = sc.nextInt();
////            }
////            for (int i = 0; i < n; i++) {
////                System.out.print(arr[i] + " ");
////            }
////            number(arr);
////        }
////    }
//
//
////                                       array Manipulation
////public class Main{
////    static void number(int[] arr){
////        int x=-1;
////        int n = arr.length;
////        for(int i=0;i<n;i++){
////            for(int j=i+1;j<n;j++){
////                if(arr[i]==arr[j]){
////                        arr[i]=-1;
////                        arr[j]=-1;
////                }
////            }
////        }
////        for(int i=0;i<n;i++){
////            if(arr[i]>0){
////                x=arr[i];
////            }
////        }
////        System.out.println("Unique Element: "+x);
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.print("Enter the elements in the array: ");
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////        number(arr);
////    }
////}
//
////public class Main{
////    static void number(int[] arr){
////        int mx=Integer.MIN_VALUE;
////        int n=arr.length;
////        for(int i=0;i<n;i++){
////            if(arr[i]>mx){
////                mx=arr[i];
////            }
////        }
////        System.out.println("Maximum value in the array is: "+mx);
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n= sc.nextInt();
////        int[] arr=new int[n];
////        for(int i=0;i<n;i++){
////            arr[i]=sc.nextInt();
////        }
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////        number(arr);
////    }
////}
////                        FINDING SECOND MAXIMUM VALUE IN THE ARRAY
////public class Main {
////    static int number(int[] arr) {
////        int mx = Integer.MIN_VALUE;
////        int n = arr.length;
////        for (int i = 0; i < n; i++) {
////            if (arr[i] > mx) {
////                mx = arr[i];
////            }
////        }//return mx;
////        }
////
////    static int secondnumber(int[] arr) {
////        int mx = number(arr);
////        int n = arr.length;
////        for (int i = 0; i < n; i++) {
////            if (arr[i] == mx) {
////                arr[i] = Integer.MIN_VALUE;
////            }
////        }
////        int secondnumber = number(arr);
////        return secondnumber;
////    }
////
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        for (int i = 0; i < n; i++) {
////            arr[i] = sc.nextInt();
////        }
////        for (int i = 0; i < n; i++) {
////            System.out.print(arr[i] + " ");
////        }
////        System.out.println(number(arr));
////        System.out.println(secondnumber(arr));
////    }
////}
//
////                               repeating number In THE array
////public class Main{
////    static int repeat(int[] arr){
////        int n = arr.length;
////        for(int i=0; i<n;i++){
////            for(int j=i+1;j<n;j++){
////                if(arr[i]==arr[j]){
////                    return arr[i];
////                }
////            }
////        }
////        return -1;
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n= sc.nextInt();
////        int[] arr=new int[n];
////        for(int i=0;i<n;i++){
////            arr[i]= sc.nextInt();
////        }
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////        System.out.println("number which is repeating in the array is: "+repeat(arr));
////    }
////}
//
////                                            Swap Cases
////public class Main{
////    static void swap(int a, int b){
////        System.out.println("Original Values: ");
////        System.out.println("a: "+a);
////        System.out.println("b: "+b);
////        int temp=a;
////        a=b;
////        b=temp;
////        //          Or
//////        a=a+b;
//////        b=a-b;
//////        a=a-b;
////        System.out.println("Values after Swap: ");
////        System.out.println("a: "+a);
////        System.out.println("b: "+b);
////    }
////    public static void main(String[] args) {
////        int a=9;
////        int b=3;
////        int[] arr = {1,2,3,4,5};
////        swap(a,b);
////    }
////}
//
////                                         reversed array
////public class Main{
////    static void array(int[] arr){
////        int n=arr.length;
////        System.out.println("reversed array: ");
////        for(int i=n-1;i>=0;i--){
////            System.out.print(arr[i]+" ");
////        }
////
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] arr=new int[n];
////        for(int i=0;i<n;i++){
////            arr[i]= sc.nextInt();
////        }
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////        array(arr);
////    }
////}
////                                        ROTATION OF array
////public class Main{
////    static void array(int[] arr){
////        System.out.println("Given array: ");
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    static int[] rotate(int[] arr){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the positive number by which you want to rotate: ");
////        int k = sc.nextInt();
////        int n = arr.length;
////        k=k%n;
////        int[] ans = new int[n];
////        int j = 0;
////        for(int i=n-k;i<n;i++){
////            ans[j++]=arr[i];
////        }
////        for(int i=0;i<n-k;i++){
////            ans[j++]=arr[i];
////        }
////        return ans;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the array: ");
////        int n= sc.nextInt();
////        System.out.println("Enter the elements in the array: ");
////        int[] arr=new int[n];
////        for(int i=0;i<n;i++){
////            arr[i]=sc.nextInt();
////        }
////        array(arr);
////        int[] ans = rotate(arr);
////        array(ans);
////
////    }
////}
//
////                                       freqUEnCY array
//
////public class Main{
////    static int[] makefrequencyarray(int[] arr){
////        int[] freq = new int[100005];
////
////        for(int i=0;i<arr.length;i++){
////            freq[arr[i]]++;
////        }
////        return freq;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.println("Enter "+n+" elements: ");
////        for(int i=0;i<n;i++){
////            arr[i]=sc.nextInt();
////        }
////        int[] freq = makefrequencyarray(arr);
////        System.out.print("Enter number of Queries: ");
////        int q = sc.nextInt();
////        while(q>0){
////            System.out.println("Enter number to be Searched: ");
////            int x= sc.nextInt();
////            if(freq[x]>0){
////                System.out.println("YES");
////            }
////            else{
////                System.out.println("NO");
////            }
////            q--;
////        }
////
////    }
////}
//////                                            prefIX SUM array
////public class Main {
////    static void Array(int[] arr,int n){
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////        System.out.println();
////    }
////
////    static int[] PrefixSum(int[] arr,int n){
////        int[] ans = new int[n];
////        ans[0] = arr[0];
////        for(int i=1;i<n;i++){
////            ans[i] = arr[i] + ans[i-1];
////        }
////        return ans;
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.println("Enter the elements in the Array: ");
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        System.out.println("Given Array: ");
////        Array(arr,n);
////        int[] ans = PrefixSum(arr,n);
////        System.out.println("Prefix Sum Array: ");
////        Array(ans,n);
////    }
////}
////                                     prefIX SUM In THE GIVEn RAnGE
////public class Main{
////    static void array(int[] arr){
////        for(int i=1;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    static int[] prefarray(int[] arr){
////        int n = arr.length;
////        int[] pref = new int[n];
////        pref[0] = arr[0];
////
////        for(int i=1;i<n;i++){
////            pref[i] = pref[i-1] + arr[i];
////        }
////        return pref;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the array: ");
////        int n = sc.nextInt();
////        System.out.println("Enter the elements in the array: ");
////        int[] arr=new int[n+1];
////        for(int i=1;i<=n;i++){
////            arr[i]= sc.nextInt();
////        }
////
////        int[] pref = prefarray(arr);
////        System.out.println("Enter number of queries: ");
////        int q = sc.nextInt();
////        while(q-- >0){
////            System.out.println("Enter range: ");
////            int l = sc.nextInt();
////            int r = sc.nextInt();
////            int ans = pref[n] - pref[l-1];
////            System.out.println("Sum "+ ans );
////        }
////    }
////}
////                                           2D arrayS
////public class Main {
////    static void array(int[][] arr){
////        System.out.println("Given matrix: ");
////        int n = arr.length;
////        for(int i=0;i<n;i++){
////            for(int j=0;j<n;j++){
////                System.out.print(arr[i][j]+" ");            }
////            System.out.println();
////
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the square matrix: ");
////        int n = sc.nextInt();
////        int[][] arr = new int[n][n];
////        System.out.println("Enter "+n*n+" elements in the matrix: ");
////        for(int i=0;i<n;i++){
////            for(int j=0;j<n;j++){
////                arr[i][j]= sc.nextInt();
////            }
////        }
////        array(arr);
////    }
////}
//
////                                 ADDITIOn OF square MATnICES
//
////public class Main {
////    static void array(int[][] arr, int[][] sec){
////        System.out.println("First matrix: ");
////        int n = arr.length;
////        int k = sec.length;
////        for(int i=0;i<n;i++){
////            for(int j=0;j<n;j++){
////                System.out.print(arr[i][j]+" ");            }
////            System.out.println();
////
////        }
////        System.out.println("Second matrix: ");
////        for(int i=0;i<k;i++){
////            for(int j=0;j<k;j++){
////                System.out.print(sec[i][j]+" ");            }
////            System.out.println();
////
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the first square matrix: ");
////        int n = sc.nextInt();
////        int[][] arr = new int[n][n];
////        System.out.println("Enter "+n*n+" elements in the matrix: ");
////        for(int i=0;i<n;i++){
////            for(int j=0;j<n;j++){
////                arr[i][j]= sc.nextInt();
////            }
////        }
////        System.out.println("Enter the size of the second square matrix: ");
////        int k = sc.nextInt();
////        int[][] sec = new int[k][k];
////        System.out.println("Enter "+k*k+" elements in the matrix: ");
////        for(int i=0;i<k;i++){
////            for(int j=0;j<n;j++){
////                sec[i][j]= sc.nextInt();
////            }
////        }
////
////        array(arr, sec);
////        System.out.println("Addition matrix: ");
////        int[][] sum = new int[n][n];
////        for(int i=0;i<k;i++){
////            for(int j=0;j<k;j++){
////                sum[i][j] = arr[i][j] + sec[i][j];
////                System.out.print(sum[i][j]+" ");
////            }
////            System.out.println();
////        }
////        }
////    }
//
////                                  MULTIPLICATIOn OF TWO MATnICES
//
////public class Main {
////    static void array(int[][] arr, int[][] sec, int n1, int c1, int n2, int c2) {
////        System.out.println("Finst matrix: ");
////
////        for (int i = 0; i < n1; i++) {
////            for (int j = 0; j < c1; j++) {
////                System.out.print(arr[i][j] + " ");
////            }
////            System.out.println();
////
////        }
////        System.out.println("Second matrix: ");
////        for (int i = 0; i < n2; i++) {
////            for (int j = 0; j < c2; j++) {
////                System.out.print(sec[i][j] + " ");
////            }
////            System.out.println();
////
////        }
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the first square matrix: ");
////        int n1 = sc.nextInt();
////        int c1 = sc.nextInt();
////
////        int[][] arr = new int[n1][c1];
////        System.out.println("Enter " + n1 * c1 + " elements in the matrix: ");
////        for (int i = 0; i < n1; i++) {
////            for (int j = 0; j < c1; j++) {
////                arr[i][j] = sc.nextInt();
////            }
////        }
////        System.out.println("Enter the size of the second square matrix: ");
////        int n2 = sc.nextInt();
////        int c2 = sc.nextInt();
////
////        int[][] sec = new int[n2][c2];
////        System.out.println("Enter " + n2 * c2 + " elements in the matrix: ");
////        for (int i = 0; i < n2; i++) {
////            for (int j = 0; j < c2; j++) {
////                sec[i][j] = sc.nextInt();
////            }
////        }
////
////        array(arr, sec, n1, c1, n2, c2);
////        if (c1 != n2) {
////            System.out.println("Multiplication not possible");
////        } else {
////            System.out.println("Multiplication of two matrix: ");
////            int[][] mul = new int[n1][c2];
////            for (int i = 0; i < n1; i++) {
////                for (int j = 0; j < c2; j++) {
////                    for (int k = 0; k < c1; k++) {
////                        mul[i][j] += (arr[i][k] * sec[k][j]);
////                    }
////                    System.out.print(mul[i][j]+" ");
////
////                }
////                System.out.println();
////
////            }
////        }
////
////    }
////}
//
////                                      TRANSPOSE OF A matrix
////public class Main {
////    static void array(int[][] arr, int n, int c){
////        System.out.println("Given matrix: ");
////        for(int i=0;i<n;i++){
////            for(int j=0;j<c;j++){
////                System.out.print(arr[i][j]+" ");
////            }
////            System.out.println();
////        }
////        System.out.println("Transposed matrix: ");
////        for(int i=0;i<c;i++){
////            for(int j=0;j<n;j++){
////                System.out.print(arr[j][i]+" ");
////            }
////            System.out.println();
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter number of nows: ");
////        int n = sc.nextInt();
////        System.out.println("Enter number of columns: ");
////        int c = sc.nextInt();
////        int[][] arr = new int[n][c];
////        System.out.println("Enter "+n*c+" elements in the array: ");
////        for(int i=0;i<n;i++){
////            for(int j=0;j<c;j++){
////                arr[i][j] = sc.nextInt();
////            }
////        }
////        array(arr, n, c);
////
////    }
////}
//
////                                       ROTATION OF A matrix AT 90 DEGREE
////public class Main {
////    static void array(int[][] arr, int n, int c){
////        System.out.println("Given matrix: ");
////        for(int i=0;i<n;i++){
////            for(int j=0;j<c;j++){
////                System.out.print(arr[i][j]+" ");
////            }
////            System.out.println();
////        }
////        System.out.println("Transposed matrix: ");
////        for(int i=0;i<c;i++){
////            for(int j=0;j<n;j++){
////                System.out.print(arr[j][i]+" ");
////            }
////            System.out.println();
////        }
////        System.out.println("rotated matrix at 90 degree: ");
////        for(int i=0;i<c;i++){
////            for(int j=n-1;j>=0;j--){
////                System.out.print(arr[j][i]+" ");
////            }
////            System.out.println();
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter number of rows: ");
////        int n = sc.nextInt();
////        System.out.println("Enter number of columns: ");
////        int c = sc.nextInt();
////        int[][] arr = new int[n][c];
////        System.out.println("Enter "+n*c+" elements in the array: ");
////        for(int i=0;i<n;i++){
////            for(int j=0;j<c;j++){
////                arr[i][j] = sc.nextInt();
////            }
////        }
////        array(arr, n, c);
////
////    }
////}
//
////                                          PASCAL TRIANGLE
////public class Main {
////    static void printMatrix(int[][] matrix){
////            for(int i=0;i<matrix.length;i++){
////                for(int j=0;j<matrix[i].length;j++){
////                    System.out.print(matrix[i][j]+" ");
////                }
////                System.out.println();
////            }
////    }
////    static int[][] pascal(int n){
////        int[][] ans = new int[n][];
////        for(int i=0;i<n;i++){
////            ans[i]=new int[i+1];
////            ans[i][0] = ans[i][i] = 1;
////            for(int j=1;j<i;j++){
////                ans[i][j]=ans[i-1][j] + ans[i-1][j-1];
////            }
////        }
////        return ans;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[][] ans = pascal(n);
////        printMatrix(ans);
////    }
////}
//
////                                       SPIRAL Order matrix
////public class Main{
////    static void printMatrix(int[][] matrix){
////        for(int i=0;i<matrix.length;i++){
////            for(int j=0;j<matrix[i].length;j++){
////                System.out.print(matrix[i][j]+" ");
////            }
////            System.out.println();
////        }
////    }
////    static void printSpiralOrder(int[][] matrix, int n, int c){
////        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = c-1;
////        int curr = 0;
////        while(curr<n*c){
////            for(int j = leftCol;j<=rightCol && curr<n*c;j++){
////                System.out.print(matrix[topRow][j]+" ");
////                curr++;
////            }
////            topRow++;
////            for(int i = topRow;i<=bottomRow && curr<n*c;i++){
////                System.out.print(matrix[i][rightCol]+" ");
////                curr++;
////            }
////            rightCol--;
////            for(int j = rightCol;j>=leftCol && curr<n*c;j--){
////                System.out.print(matrix[bottomRow][j]+" ");
////                curr++;
////            }
////            bottomRow--;
////            for(int i = bottomRow;i>=topRow && curr<n*c;i--){
////                System.out.print(matrix[i][leftCol]+" ");
////                curr++;
////            }
////            leftCol++;
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter number of rows: ");
////        int n = sc.nextInt();
////        System.out.println("Enter number oF Columns: ");
////        int c = sc.nextInt();
////        int[][] matrix = new int[n][c];
////        int total = n*c;
////        System.out.println("Enter "+total+" values");
////        for(int i=0;i<n;i++){
////            for(int j=0;j<c;j++){
////                matrix[i][j] = sc.nextInt();
////            }
////        }
////        System.out.println("Input matrix: " );
////        printMatrix(matrix);
////        System.out.println("Spiral Order: ");
////        printSpiralOrder(matrix, n, c);
////    }
////}
//
//
////                                   GENERATE SPIRAL ORDER MATRIX
//
////public class Main {
////    static void printMatrix(int[][] matrix){
////        for(int i=0;i<matrix.length;i++){
////            for(int j=0;j<matrix[i].length;j++){
////                System.out.print(matrix[i][j]+" ");
////            }
////            System.out.println();
////        }
////    }
////    static int[][] generateSpiralOrder(int n) {
////        int[][] matrix = new int[n][n];
////        int topRow = 0, leftCol = 0, bottomRow = n - 1, rightCol = n - 1;
////        int curr = 1;
////        while (curr <= n * n) {
////            for (int j = leftCol; j <= rightCol && curr<=n*n; j++) {
////                matrix[topRow][j] = curr++;
////            }
////            topRow++;
////            for (int i = topRow; i <= bottomRow && curr<=n*n; i++) {
////                matrix[i][rightCol] = curr++;
////            }
////            rightCol--;
////            for(int j=rightCol;j>=leftCol && curr<=n*n;j--){
////                matrix[bottomRow][j] = curr++;
////            }
////            bottomRow--;
////            for(int i = bottomRow;i>=topRow && curr<=n*n;i--){
////                matrix[i][leftCol] = curr++;
////            }
////            leftCol++;
////        }
////        return matrix;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[][] matrix = generateSpiralOrder(n);
////        printMatrix(matrix);
////    }
////}
//
////                                        SUM OF RECTANGLE
//
////public class Main {
////    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
////        int sum = 0;
////        for(int i=l1;i<=l2;i++){
////            if(r1>=1){
////                sum += matrix[i][r2] - matrix[i][r1-1];
////            }
////            else{
////                sum += matrix[i][r2];
////            }
////        }
////        return sum;
////
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter number of rows: ");
////        int r = sc.nextInt();
////        System.out.println("Enter number of columns: ");
////        int c= sc.nextInt();
////        int[][] matrix = new int[r][c];
////        for(int i=0;i<r;i++){
////            for(int j=0;j<c;j++){
////                matrix[i][j] = sc.nextInt();
////                }
////            System.out.println();
////        }
////        System.out.println("Enter range: ");
////        int l1 = sc.nextInt();
////        int r1 = sc.nextInt();
////        int l2 = sc.nextInt();
////        int r2 = sc.nextInt();
////        System.out.println(findSum(matrix, l1, l2, r1, r2));
////    }
////}
//
////                                         ARRAYLISTS
//
////import java.util.ArrayList;
////import java.util.Collections;
////public class Main {
////    public static void main(String[] args) {
//////        Integer i = Integer.valueOf(4);
//////        Float f = Float.valueOf(4.5f);
//////        System.out.println(f + i);
////        ArrayList<Integer> l1 = new ArrayList<>();
////        l1.add(5);
////        l1.add(6);
////        l1.add(7);
////        l1.add(8);
////        System.out.println(l1.get(1));
////        for(int i=0; i<l1.size(); i++){
////            System.out.print(l1.get(i));
////        }
////        System.out.println(l1);
////        l1.add(1, 100);
////        System.out.println(l1);
////        l1.set(1, 10);
////        System.out.println(l1);
////        l1.remove(1);
////        System.out.println(l1);
////        l1.remove(Integer.valueOf(7));
////        System.out.println(l1);
////        System.out.println(l1.remove(Integer.valueOf(7)));
////        Collections.reverse(l1);
////        Collections.sort(l1);
////        System.out.println(l1);
////        Collections.sort(l1, Collections.reverseOrder());
////        System.out.println(l1);
////        ArrayList<String> l = new ArrayList<>();
////
////    }
////}
//
////                                            RECURSION
////                               PRINTING NUMBERS IN INCREASING ORDER
////public class Main {
////    static void PI(int n){
////        if(n==0){
////            return;
////        }
////
////        PI(n-1);
////        System.out.println(n);
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter a valid number: ");
////        int n = sc.nextInt();
////        PI(n);
////    }
////}
//
////                               PRINTING NUMBERS IN DECREASING ORDER
////public class Main {
////    static void PI(int n){
////        if(n==1){
////            System.out.println(1);
////            return;
////        }
////        System.out.print(n+" ");
////        PI(n-1);
////
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter a valid number: ");
////        int n = sc.nextInt();
////        PI(n);
////    }
////}
////                                  FINDING FACTORIAL OF A NUMBER
////public class Main {
////    static int factorial(int n){
////        if(n==0 || n==1){
////            return 1;
////
////        }
////        int a = factorial(n-1);
////        int ans  = n*a;
////        return ans;
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter a valid number: ");
////        int n = sc.nextInt();
////        System.out.println(factorial(n));
////    }
////}
//
////                                  PRINTING FIBONACCI NUMBER
////public class Main {
////    static int fibonacci(int n) {
////        if (n == 1 || n == 0) return n;
////
////
////        int a = fibonacci(n - 1) + fibonacci(n - 2);
////        return a;
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter a number: ");
////        int n = sc.nextInt();
////        for (int i = 0; i <= n; i++) {
////            System.out.print(fibonacci(i)+" ");
////        }
////    }
////}
//
////                        FINDING SUM OF ITS DIGITS USING RECURSION
//
////public class Main{
////    static int Sum(int n){
////        if(n==1) return 1;
////        int b = n + Sum(n-1);
////        return b;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        System.out.println(Sum(n));
////    }
////}
//
////public class Main{
////    static int Sum(int n){
////        if(n>=0 && n<=9) return n;
////        int a = n%10;
////        int b = a + Sum(n/10);
////        return b;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        System.out.println(Sum(n));
////    }
////}
////                                     NUMBER RAISE TO THE POWER
////public class Main {
////    static int Power(int p, int q){
////        if(q==0) return 1;
////        return p * Power(p, q-1);
////    }
////    public static void main(String[] args) {
////        Scanner sc=  new Scanner(System.in);
////        System.out.println("Enter a number: ");
////        int p = sc.nextInt();
////        System.out.println("Enter the power: ");
////        int q= sc.nextInt();
////        System.out.println(Power(p,q));
////    }
////}
////                                     COUNTING NUMBER OF DIGITS IN THE NUMBER
////public class Main{
////    static int numberOfDigits(int n){
////        if(n>=0 && n<=9) return 1;
////        int a = 0;
////        a +=numberOfDigits(n/10);
////        a++;
////        return a;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the number: ");
////        int n = sc.nextInt();
////        System.out.println(numberOfDigits(n));
////    }
////}
////                      GIVEN A NUMBER AND A VALUE K . PRINT K MULTIPLES OF NUM
////public class Main {
////    static void Multiple(int num, int k){
////        if(k==1) {
////            System.out.println(num);
////            return ;
////        }
////        Multiple(num, k-1);
////        System.out.println(num * k);
////    }
////    public static void main(String[] args) {
////        Scanner sc =  new Scanner(System.in);
////        System.out.println("Enter the value of num: ");
////        int num = sc.nextInt();
////        System.out.println("Enter the number of multiples you want to print: ");
////        int k = sc.nextInt();
////        Multiple(num, k);
////    }
////}
////                                 CALCULATING GREATEST COMMON DIVISOR
////public class Main {
////    static int iGCD(int x, int y){
////        while(x%y!=0){
////            int rem = x % y;
////            x = y;
////            y = rem;
////        }
////        return y;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        int y = sc.nextInt();
////        System.out.println(iGCD(x, y));
////    }
////}
//
////                              PRINTING AN ARRAY USING RECURSION
////public class Main {
////    static void printArray(int[] arr, int idx) {
////        if (idx == arr.length) {
////            return;
////        }
////        System.out.print(arr[idx] + " ");
////        printArray(arr, idx + 1);
////    }
////    public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////
////        int[] arr = {1, 2, 3, 1, 2};
////        printArray(arr,0);
////    }
////}
////                       FINDING MAXIMUM VALUE IN THE ARRAY USING RECURSION
////public class Main {
////    static int maxInArray(int[] arr, int idx) {
////        if (idx == arr.length-1) {
////            return arr[idx];
////        }
////        return Math.max(arr[idx], maxInArray(arr, idx+1));
////    }
////    public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        System.out.println("Enter "+n+" elements in the Array: ");
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        System.out.println("Maximum value in the Array is: ");
////        System.out.println(maxInArray(arr,0));
////    }
////}
////                         FINDING THE SUM OF THE ELEMENTS IN THE ARRAY
////public class Main {
////    static int Sum(int[] arr, int idx){
////        if(idx==arr.length-1){
////            return arr[idx];
////        }
////        return (arr[idx] + Sum(arr,idx+1));
////    }
////     public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////         System.out.println("Enter the size of the array: ");
////        int n = sc.nextInt();
////         System.out.println("Enter "+n+" elements in the array: ");
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////         System.out.println("Sum of the elements in the array is: ");
////        System.out.println(Sum(arr, 0));
////    }
////}
//
////class maxnum{
////    int mx(int[] arr){
////        int max=Integer.MIN_VALUE;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>max){
////                max=arr[i];
////            }
////        }
////        return max;
////    }
////    int mm(int[] arr){
////        int max = mx(arr);
////        int mn = Integer.MIN_VALUE;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>mn);
////            arr[i] = Integer.MIN_VALUE;
////        }
////        return max;
////    }
////}
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////        System.out.println("enter the total element of array");
////        int a= sc.nextInt();
////        int[] arr=new int[a];
////        System.out.println("enter the element of aaray");
////        for(int i=0;i<arr.length;i++){
////            arr[i]=sc.nextInt();
////        }
////        maxnum obj= new maxnum();
////        System.out.println("max number in the given array is "+ obj.mx(arr));
////        maxnum obj1 = new maxnum();
////        int mm=obj.mx(arr);
////        for(int i=0;i<arr.length;i++){
////            if(mm==arr[i]){
////                arr[i]=Integer.MIN_VALUE;
////            }
////        }
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>mm && arr[i]!=mm){
////                mm=arr[i];
////            }
////        }
////        System.out.println("second maximum number in the given array is "+ obj1.mm(arr));
////    }
////}
//
//// finding wheather element in the array exist or not, print index, on which indexes the number is repeating
////public class Main {
////    static void exist(int[] arr,int idx, int a){
////        if(idx== arr.length){
//////            System.out.print("No");
////            return;
////        }
////        if(arr[idx]==a){
////            System.out.print(idx+" ");
////        }
////        exist(arr,idx+1,a);
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        System.out.println("Enter the number of elements in the Array: ");
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        System.out.println("Enter the number: ");
////        int a = sc.nextInt();
////        exist(arr,0,a);
////    }
////}
////                           REMOVING OCCURRENCES USING RECURSION IN THE STRING
////public class Main {
////    static String removeA(String s, int idx){
////        if(idx==s.length()) return "";
////        String smallAns = removeA(s, idx+1);
////        char currChar = s.charAt(idx);
////        if(currChar != 'a'){
////            return currChar + smallAns;
////        }
////        else{
////            return smallAns;
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String s = sc.nextLine();
////        System.out.println(removeA(s,0));
////    }
////}
//
////                             REVERSE OF A STRING USING RECURSION
////public class Main {
////    static String Reverse(String s, int idx){
////        if(idx==s.length()) return "";
////        char c = s.charAt(idx);
////        return Reverse(s, idx+1)+c;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String s = sc.nextLine();
////        System.out.println(Reverse(s,0));
////    }
////}
//
////                               CHECKING OF PALINDROME STRING
//
////public class Main {
////    static boolean Palindrome(String s, int l, int r){
////        if(l>=r) return true;
////        return (s.charAt(l) == s.charAt(r) && Palindrome(s, l+1, r-1));
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String s = sc.next();
////        System.out.println(Palindrome(s,0,s.length()-1));
////    }
////}
//
////                                             PRIME NUMBERS
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////        int i = 2;
////        while(n<m){
////            if(n%i!=0){
////                System.out.print(n+ " ");
////            }
////            n++;
////            i++;
////        }
////    }
////}
////                                   SUM AND COUNTING OF DIGITS
////public class Main {
////    static int numberOfDigits(int n){
////        if(n>=0 && n<=9) return 1;
////        int a = 0;
////        a +=numberOfDigits(n/10);
////        a++;
////        return a;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.println("Enter the number of elements in the Array: ");
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////        int sum = arr[0] + arr[n-1];
////        System.out.println("Sum of first and last digit is: ");
////        System.out.println(sum);
////        System.out.println("Number of digits: ");
////        System.out.println(numberOfDigits(n));
////    }
////}
////                             FINDING SUBSEQUENCE USING RECURSION AND ARRAYLISTS
////public  class Main {
////    static ArrayList<String> SSQ(String s){
////        ArrayList<String> ans = new ArrayList<>();
////        if(s.length() ==0){
////            ans.add("");
////            return ans;
////        }
////        char curr = s.charAt(0);
////        ArrayList<String> smallAns = SSQ(s.substring(1));
////        for(String ss: smallAns){
////            ans.add(ss);
////            ans.add(curr + ss);
////        }
////        return ans;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        ArrayList<String> ans = SSQ("abc");
////        for(String ss : ans){
////            System.out.print(ss+" ");
////        }
////    }
////}
////                                              FROG JUMP
////public class Main {
////    static int best(int[] arr,int n, int idx){
////        if(idx==n-1) return 0;
////        int op1 = Math.abs(arr[idx] - arr[idx+1]) + best(arr,n,idx+1);
////        if(idx==n-2)  return op1;
////        int op2 = Math.abs(arr[idx] - arr[idx+2]) + best(arr,n,idx+2);
////        return Math.min(op1,op2);
////    }
////    public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.println("Enter the elements in the Array: ");
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        System.out.println(best(arr,n,0));
////    }
////}
////                                         BUBBLE SORTING
////public class Main {
////    static void bubbleSort(int arr[],int n){
////        for(int i=0;i<n-1;i++){
////            boolean flag = false;
////            for(int j=0;j<n-i-1;j++){
////                if(arr[j]>arr[j+1]){
////                    int temp = arr[j];
////                    arr[j] = arr[j+1];
////                    arr[j+1] = temp;
////                }
////            }
////            if(!flag){
////                return;
////            }
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        bubbleSort(arr,n);
////        for(int i:arr){
////            System.out.print(i+" ");
////        }
////    }
////}
//
////   STABLE SORT:- ORDER OF APPEARENCE OF DUPLICATE ELEMENTS IS SAME IN THE SORTED ARRAY AS COMPARED TO THE ORIGINAL ARRAY
////   BUBBLESORT IS A STABLE SORT.INSERTION SORT IS ALSO A STABLE ALGORITHM.
////                                   SELECTION SORT ALGORITHM
////public class Main {
////    static void selectionSort(int[] arr,int n){
////        for(int i=0;i<n-1;i++) {
////            int min_index = i;
////            for (int j = i + 1; j < n; j++) {
////                if(arr[j]<arr[min_index]) {
////                    min_index = j;
////                }
////            }
////            int temp = arr[i];
////            arr[i] = arr[min_index];
////            arr[min_index] = temp;
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////        System.out.println("Enter the size of the Array :");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////            }
////        selectionSort(arr,n);
////        for(int i1=0;i1<n;i1++){
////            System.out.print(arr[i1]+" ");
////        }
////   }
////}
////                                    INSERTION SORT ALGORITHM
////public class Main {
////    static void insertionSort(int[] arr,int n){
////        for(int i=1;i<n;i++){
////            int j =i;
////            while(j>0 && arr[j]<arr[j-1]){
////                int temp  = arr[j];
////                arr[j] = arr[j-1];
////                arr[j-1] = temp;
////                j--;
////            }
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n= sc.nextInt();
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        insertionSort(arr,n);
////        for(int i:arr){
////            System.out.print(i+" ");
////        }
////    }
////}
////                                           BUBBLE SORT
////public class Main {
////    static void Sort(int[] arr,int n){
////        for(int i=0;i<n-1;i++){
////            for(int j=0;j<n-1;j++){
////                if(arr[j]==0 && arr[j+1]!=0){
////                    int temp = arr[j];
////                    arr[j]=arr[j+1];
////                    arr[j+1] = temp;
////                }
////            }
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.println("Enter the elements in the Array: ");
////        for(int i=0;i<n;i++) {
////            arr[i] = sc.nextInt();
////        }
////        Sort(arr,n);
////        for(int i:arr){
////            System.out.print(i+" ");
////        }
////    }
////}
////                                        lexograpgical order
////public class Main {
////    static void Sort(String[] fruits){
////        int n = fruits.length;
////        for(int i=0;i<n-1;i++){
////            int min_index = i;
////            for(int j=i+1;j<n;j++){
////                if(fruits[j].compareTo(fruits[min_index])<0){
////                    min_index = j;
////                }
////            }
////            String temp = fruits[i];
////            fruits[i] = fruits[min_index];
////            fruits[min_index] = temp;
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String[] fruits = {"kiwi","apple","papaya","mango"};
////        Sort(fruits);
////        for(String val: fruits){
////            System.out.print(val+" ");
////        }
////    }
////}
//
////                                       MERGE SORT ALGORITHM
////public class Main {
////    static void displayArr(int[] arr){
////        for(int val: arr){
////            System.out.print(val+" ");
////        }
////    }
////    static void merge(int[] arr, int l, int mid , int r){
////        int n1 = mid-l+1;
////        int n2 = r-mid;
////        int[] left = new int[n1];
////        int[] right = new int[n2];
////
////        int i,j,k;
////        for(i=0;i<n1;i++)  left[i] = arr[l+i];
////        for(j=0;j<n2;j++)  right[j] = arr[mid+1+j];
////        i=0;
////        j=0;
////        k=l;
////        while(i<n1 && j<n2){
////            if(left[i]<right[j])  arr[k++] = left[i++];
////            else  arr[k++] = right[j++];
////        }
////        while (i<n1){
////            arr[k++] = left[i++];
////        }
////        while(j<n2){
////            arr[k++]  = arr[j++];
////        }
////
////    }
////    static void mergeSort(int[] arr, int l, int r){
////        if(l>=r) return;
////        int mid = (l+r)/2;
////        mergeSort(arr, l, mid);
////        mergeSort(arr, mid+1, r);
////        merge(arr, l, mid, r);
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        System.out.println("Enter the number of elements in the Array: ");
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        System.out.println("Array before Sorting: ");
////        displayArr(arr);
////        mergeSort(arr,0,n-1);
////        System.out.println();
////        System.out.println("Array after sorting: ");
////        displayArr(arr);
////    }
////}
////                                          COUNT SORT
////public class Main {
////    static int findMax(int[] arr){
////        int mx = Integer.MIN_VALUE;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>mx){
////                mx=arr[i];
////            }
////        }
////        return mx;
////    }
////    static void displayArr(int[] arr,int n){
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    static void basicCountSort(int[] arr){
////        int max = findMax(arr);
////        int[] count = new int[max + 1];
////        for(int i=0;i<arr.length;i++){
////            count[arr[i]]++;
////        }
////        int k=0;
////        for(int i=0;i<count.length;i++){
////            for(int j=0;j<count[i];j++){
////                arr[k++] = i;
////            }
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n= sc.nextInt();
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++) {
////            arr[i] = sc.nextInt();
////        }
////        System.out.println("Array before Sorting: ");
////        displayArr(arr,n);
////        System.out.println();
////        System.out.println("Array after Sorting: ");
////        basicCountSort(arr);
////        displayArr(arr,n);
////    }
////}
//
//
////public class Main {
////    static void Array(int[] arr, int n){
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    static int findMax(int[] arr,int n){
////        int mx = Integer.MIN_VALUE;
////        for(int i=0;i<n;i++){
////            if(arr[i]>mx){
////                mx = arr[i];
////            }
////        }
////        return mx;
////    }
////    static void basicCountSort(int[] arr, int n){
////        int max = findMax(arr,n);
////        int[] ans = new int[max+1];
////        int[] output = new int[n];
////        for(int i=0;i<n;i++){
////            ans[arr[i]]++;
////        }
////        for(int i=1;i<ans.length;i++){
////            ans[i]+=ans[i-1];
////        }
////        for(int i =n-1;i>=0;i--){
////            int idx = ans[arr[i]]-1;
////            output[idx]=arr[i];
////            ans[arr[i]]--;
////        }
////        for(int i=0;i<n;i++){
////            arr[i] = output[i];
////        }
////
////    }
////    public static void main(String[] args) {
////        Scanner sc =  new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        System.out.println("Enter the number of elements in the Array: ");
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++) {
////            arr[i] = sc.nextInt();
////        }
////        basicCountSort(arr,n);
////        Array(arr,n);
////    }
////}
//
////                                     RADIX SORT ALGORITHM
////public class Main {
////    static void Array(int[] arr, int n){
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    static int findMax(int[] arr,int n){
////        int mx = Integer.MIN_VALUE;
////        for(int i=0;i<n;i++){
////            if(arr[i]>mx){
////                mx = arr[i];
////            }
////        }
////        return mx;
////    }
////    static void basicCountSort(int[] arr, int n,int place){
////        int[] ans = new int[10];
////        int[] output = new int[n];
////        for(int i=0;i<n;i++){
////            ans[(arr[i]/place)%10]++;
////        }
////        for(int i=1;i<ans.length;i++){
////            ans[i]+=ans[i-1];
////        }
////        for(int i =n-1;i>=0;i--){
////            int idx = ans[(arr[i]/place)%10]-1;
////            output[idx]=arr[i];
////            ans[(arr[i]/place)%10]--;
////        }
////        for(int i=0;i<n;i++){
////            arr[i] = output[i];
////        }
////
////    }
////
////    static void radixSort(int[] arr,int n){
////        int max = findMax(arr,n);
////        for(int place=1;max/place>0;place*=10){
////            basicCountSort(arr,place,n);
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc =  new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        System.out.println("Enter the number of elements in the Array: ");
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++) {
////            arr[i] = sc.nextInt();
////        }
////        radixSort(arr,n);
////        Array(arr,n);
////    }
////}
////public class Main {
////    static void Array(int[] arr, int n){
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    static void Sort(int[] arr, int n){
////        n=n-1;
////        int l=0;
////        while(l<n){
////            while(arr[l]<0) l++;
////            while(arr[n]>0) n--;
////            if(l<n){
////                int temp = arr[l];
////                arr[l]=arr[n];
////                arr[n]=temp;
////                l++;
////                n--;
////            }
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        Sort(arr,n);
////        Array(arr,n);
////    }
////}
////                      FINDING NUMBER PRESENT IN THE SORTED ARRAY USING RECURSION
////public class Main {
////    static boolean binarySearch(int[] arr,int st, int end, int target){
////        if(st>end)  return false;
////        int mid = st+(end-st)/2;
////        if(target==arr[mid]){
////            return true;
////        }
////        else if(target<arr[mid]){
////            return binarySearch(arr,st,mid-1,target);
////        }
////        else{
////            return binarySearch(arr,mid+1,end,target);
////        }
////    }
////    public static void main(String[] args) {
////        int[] arr = {1,2,3,4,5};
////        int target = 4;
////        System.out.println(binarySearch(arr,0,arr.length-1,target));
////
////    }
////}
////                           FINDING MINIMUM ELEMENT IN THE ROTATED SORTED ARRAY
////public class Main {
////    static void Array(int[] arr,int n){
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    static int findMin(int[] arr,int n){
////        int st =0, end = n-1;
////        int ans = -1;
////        while(st<=end){
////            int mid = st+(end-st)/2;
////            if(arr[mid]<=arr[n-1]){
////                ans = mid;
////                end = mid-1;
////            } else{
////                st = mid+1;
////            }
////        }
////        return ans;
////    }
////
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        Array(arr,n);
////        System.out.println();
////        System.out.println(findMin(arr,n));
////    }
////}
////                               CHECKING NUMBER IN 2D MATRIX
////public class Main {
////    static boolean searchMatrix(int[][] arr,int n, int m,int target){
////        int st = 0, end = n*m -1;
////        while(st<=end){
////            int mid = st+(end-st)/2;
////            int midElt = arr[mid/m][mid%m];
////            if(midElt == target)  return true;
////            if(target<midElt){
////                end = mid-1;
////            } else{
////                st = mid+1;
////            }
////        }
////        return false;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Target Element: ");
////        int target = sc.nextInt();
////        System.out.println("Enter number of rows: ");
////        int n = sc.nextInt();
////        System.out.println("Enter number of cols: ");
////        int m = sc.nextByte();
////        int[][] arr = new int[n][m];
////        for(int i=0;i<n;i++){
////            for(int j=0;j<m;j++){
////                arr[i][j] = sc.nextInt();
////            }
////        }
////        System.out.println(searchMatrix(arr,n,m,target));
////    }
////}
////public class Main {
////    static boolean isDivisionPossible(int[] arr,int a,int mxChocoAllowed){
////        int nos = 1;
////        int choc = 0;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>mxChocoAllowed) return false;
////            if(choc + arr[i] <= mxChocoAllowed){
////                choc+=arr[i];
////            } else{
////                nos++;
////                choc = arr[i];
////            }
////        }
////        if(nos>a) return false;
////        return true;
////    }
////    static int distributeChocolates(int[] arr,int n, int a){
////        if(n<a) return -1;
////        int ans = 0,st = 1,end = (int)1e9;
////        while(st<=end){
////            int mid = st + (end-st)/2;
////            if(isDivisionPossible(arr,a,mid)){
////                ans = mid;
////                end = mid-1;
////            }else{
////                st=mid+1;
////            }
////        }
////        return ans;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the Array: ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        System.out.println("Enter number of elements in the Array: ");
////        for(int i=0;i<n;i++){
////            arr[i] = sc.nextInt();
////        }
////        System.out.println("Enter number of students: ");
////        int a = sc.nextInt();
////        System.out.println(distributeChocolates(arr,n,a));
////    }
////}
//
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        int max = -1000;
////        int a = 0;
////        for (int i = 0; i < n; i++) {
////            arr[i] = sc.nextInt();
////        }
////        for(int i=0;i<n;i++){
////            if(arr[i]>max){
////                max = arr[i];
////            }
////        }
////        for (int i = 0; i < n; i++) {
////            int count = 0;
////            for (int j = 0; j < n; j++) {
////                if (arr[i] == arr[j]) {
////                    count++;
////                }
////            }
////            a=count;
////        }
////        for(int i=0;i<max;i++){
////            System.out.print(a+" ");
////        }
////    }
////}
//
//
//
//
//
//
//
//
//
//
//
////                                         AGE CALCULATOR
////public class Main {
////    static void leapYear(int year) {
////
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.print("Enter Current Year: ");
////        int year = sc.nextInt();
////        System.out.print("Enter Current Month: ");
////        int month = sc.nextInt();
////        System.out.print("Enter Current Day: ");
////        int day  = sc.nextInt();
////        System.out.print("Enter Year of your DOB: ");
////        int DOBy = sc.nextInt();
////        System.out.print("Enter Month of your DOB: ");
////        int DOBm = sc.nextInt();
////        System.out.print("Enter Date of your DOB: ");
////        int DOBd = sc.nextInt();
////        if(year>DOBy && month>DOBm && day>DOBd){
////            int years = year-DOBy;
////            int months = month - DOBm;
////            int days = day-DOBd;
////            System.out.println("Your Age is: ");
////            System.out.print(years + " Years " + months + " Months "+ days + " Days");
////        }
////        else if(year>DOBy && month>DOBm && day<DOBd){
////            int years = year-DOBy;
////            int months = month - DOBm-1;
////            int days = day+30-DOBd;
////            System.out.println("Your Age is: ");
////            System.out.print(years + " Years " + months + " Months "+ days + " Days");
////        }
////        else if(year>DOBy && month<DOBm && day<DOBd){
////            int years = year-DOBy-1;
////            int months = month - DOBm +11;
////            int days = day+30-DOBd;
////            System.out.print(years + " Years " + months + " Months "+ days + " Days");
////        }
////        else{
////            System.out.print("CURRENT YEAR MUST BE GREATER THAN DATE OF YEAR");
////        }
////    }
////}
//
////public class Main{
////        static void printArray(int[] arr, int idx) {
////        if (idx == arr.length) {
////            return;
////        }
////        System.out.print(arr[idx] + " ");
////        printArray(arr, idx + 1);
////    }
////    static int[] rotate(int[] arr,int k){
////        Scanner sc = new Scanner(System.in);
////        int n = arr.length;
////        k=k%n;
////        int[] ans = new int[n];
////        int j = 0;
////        for(int i=n-k;i<n;i++){
////            ans[j++]=arr[i];
////        }
////        for(int i=0;i<n-k;i++){
////            ans[j++]=arr[i];
////        }
////        return ans;
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter number of test cases: ");
////        int t = sc.nextInt();
////        while(t>0){
////            int n = sc.nextInt();
////            int[] arr = new int[n];
////            for(int i=0;i<n;i++){
////                arr[i] = sc.nextInt();
////            }
////            int k = sc.nextInt();
////            t--;
////        }
////    }
////}
//
//
////public class Main {
////    public static void display(int[] arr,int n){
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    public static void mergeSort(int[] arr,int mid,int l,int r){
////        int n1 = mid-l+1;
////        int n2 = r-mid;
////        int[] left = new int[n1];
////        int[] right = new int[n2];
////        int i,j,k;
////        for(i=0;i<n1;i++)  left[i] =  arr[l+i];
////        for(j=0;j<n2;j++) right[j] = arr[mid+1+j];
////        i=0;
////        j=0;
////        k=l;
////        while(i<n1 && j<n2){
////            if(left[i]<=right[j]){
////                arr[k++] = left[i++];
////            }
////            else{
////                arr[k++] = right[j++];
////            }
////        }
////        while (i<n1){
////            arr[k++] = left[i++];
////        }
////        while (j<n2){
////            arr[k++] = right[j++];
////        }
////    }
////    public static void merge(int[] arr,int l,int r){
////        int mid = (l+r)/2;
////        if(l>=r) return;
////        merge(arr,0,mid);
////        merge(arr,mid+1,r);
////        mergeSort(arr,mid,l,r);
////    }
////    public static void main(String[] args) {
////        int[] arr = {1,2,3,2,5,6};
////        int n = arr.length;
////        display(arr,n);
////        merge(arr,0,n-1);
////        System.out.println();
////        display(arr,n);
////    }
////}
//
////public class Main {
////    public static void display(int[] arr){
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    public static void swap(int[] arr,int x,int y){
////        int temp = arr[x];
////        arr[x] = arr[y];
////        arr[y] = temp;
////
////    }
////    public static int Partition(int[] arr,int st,int end){
////        int pivot = arr[st];
////        int count = 0;
////        for(int i=st+1;i<=end;i++){
////            if(pivot>=arr[i]){
////                count++;
////            }
////        }
////        int pivotidx = st+count;
////        swap(arr,st,pivotidx);
////        int i=st;
////        int j=end;
////        while(i<pivotidx && j>pivotidx){
////            while(arr[i]<=pivot) i++;
////            while(arr[j]>pivot) j--;
////            if(i<pivotidx && j>pivotidx) {
////                swap(arr, i, j);
////                i++;
////                j--;
////            }
////        }
////        return pivotidx;
////    }
////    public static void quickSort(int[] arr,int st,int end){
////        if(st>=end) return;
////        int pi = Partition(arr,st,end);
////        quickSort(arr,st,pi-1);
////        quickSort(arr,pi+1,end);
////    }
////    public static void main(String[] args) {
////        int[] arr = {7,13,8,5,10,2,4};
////        int n = arr.length;
////        display(arr);
////        quickSort(arr,0,n-1);
////        System.out.println();
////        display(arr);
////    }
////}
//
////public class Main {
////    public static void basicCountSort(int[] arr){
////        int max = -100;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>max){
////                max = arr[i];
////            }
////        }
////        int[] count = new int[max+1];
////        for(int i=0;i<arr.length;i++){
////            count[arr[i]]++;
////        }
////        int k=0;
////        for(int i=0;i<count.length;i++){
////            for(int j=0;j<count[i];j++){
////                arr[k++] = i;
////            }
////        }
////    }
////    public static void CountSort(int[] arr){
////        int max = -100;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>max){
////                max = arr[i];
////            }
////        }
////        int[] count = new int[max+1];
////        for(int i=0;i<arr.length;i++){
////            count[arr[i]]++;
////        }
////        int n = arr.length;
////        int[] output = new int[n];
////        for(int i=1;i< count.length;i++){
////            count[i]+=count[i-1];
////        }
////        for(int i=n-1;i>=0;i--){
////            int idx = count[arr[i]]-1;
////            output[idx] = arr[i];
////            count[arr[i]]--;
////        }
////        for(int i=0;i<n;i++){
////            arr[i] = output[i];
////        }
////    }
////    public static void display(int[] arr){
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////        }
////    }
////    public static void main(String[] args) {
////        int[] arr={1,4,5,2,2,5, 2, 5 , 4};
////        basicCountSort(arr);
////        display(arr);
////        System.out.println();
////        CountSort(arr);
////        display(arr);
////    }
////}
//
//
////import java.util.*;
////public class Main{
////    public static String longestPrefix(String s) {
////        int n = s.length();
////        int[] lps = new int[n];
////        int len = 0;
////
////        for (int i = 1; i < n; i++) {
////            while (len > 0 && s.charAt(i) != s.charAt(len)) {
////                len = lps[len - 1];
////            }
////            if (s.charAt(i) == s.charAt(len)) {
////                len++;
////                lps[i] = len;
////            }
////        }
////
////        return s.substring(0, lps[n - 1]);
////    }
////    public static void main(String args[]) {
////        String str = "ababcabababaabcababc";
////        System.out.println(longestPrefix(str));
////    }
////
////
////}
//
////import java.util.*;
////import java.util.*;
////public class Main{
////    public static void main(String args[]){
////        Scanner sc = new Scanner(System.in);
////        int[] arr = new int[4];
////
////        int max = Integer.MIN_VALUE;
////        for(int i=0;i<4;i++){
////            arr[i] = sc.nextInt();
////        }
////        for(int i=0;i<4;i++){
////            if(max<arr[i]){
////                max=arr[i];
////            }
////        }
////        for(int i=0;i<4;i++){
////            if(arr[i]!=max){
////                System.out.print(max-arr[i]+" ");
////            }
////        }
////    }
////}
//
//
////import java.util.*;
////public class Main{
////    public static void main(String args[]){
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        if(n==1){
////            System.out.print("I hate it");
////            return;
////        }
////        for(int i=1;i<=n;i++){
////            if(i==n && i%2!=0)  {
////                System.out.print("I hate it");
////                return;
////            }
////            else if(i==n && i%2==0) {
////                System.out.print("I love it");
////                return;
////            }
////            if(i%2!=0) System.out.print("I hate that ");
////            else System.out.print("I love that ");
////        }
////    }
////}
//
////import java.util.*;
////public class Main{
////    public static void main(String args[]){
////        Scanner sc = new Scanner(System.in);
////        String str = sc.next();
////        if(str==null || str.isEmpty()){
////            System.out.println(str);
////        }
////        else{
////            System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
////        }
////    }
////}
//
//
////import java.util.*;
////public class Main{
////    public static void main(String args[]){
////        Scanner sc = new Scanner(System.in);
////        String str = sc.next();
////
////        char last = str.charAt(0);
////        int count=0;
////        if(str.length()<7){
////            System.out.println("NO");
////            return;
////        }
////        for(int i=1;i<str.length();i++){
////            if(count==7){
////                System.out.println("YES");
////                return;
////            }
////
////            if(str.charAt(i)==last){
////                count++;
////            }
////            else{
////                count=1;
////                last = str.charAt(i);
////            }
////        }
////        System.out.println("NO");
////    }
////}
//
//
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int[] arr = {23,2,54,3,32,43,10};
////        for(int i=1;i<arr.length;i++){
////            int j=i;
////            while(j>0 && arr[j]<arr[j-1]){
////                int temp = arr[j];
////                arr[j]=arr[j-1];
////                arr[j-1] = temp;
////                j--;
////            }
////        }
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////        }
////
////    }
////}
//
////                                     CIRCULAR STRING MATCHING
//
////import java.util.*;
////public class Main {
////    public static int[] compute(String s){
////        int[] lps = new int[s.length()];
////        int first =0;
////        int second=1;
////        while(second<s.length()){
////            if(s.charAt(first)==s.charAt(second)){
////                lps[second]=first+1;.
////                first++;
////                second++;
////            }
////            else{
////                if(first==0){
////                    lps[second]=0;
////                    second++;
////                }
////                else{
////                    first=lps[first-1];
////                }
////            }
////        }
////        return lps;
////    }
////    public static void main(String[] args) {
////        String s = "cdeabroab";
////        String s1="abcde";
////        s+=s;
////        int[] lps = compute(s1);
////
////        int first=0;
////        int second=0;
////        while(second<s1.length() && first<s.length()){
////            if(s.charAt(first)==s1.charAt(second)){
////                first++;
////                second++;
////            }
////            else{
////                if(second==0){
////                    first++;
////                }
////                else{
////                    second=lps[second-1];
////                }
////            }
////        }
////        if(second==s1.length()) System.out.println("YES");
////        else System.out.println("NO");
////    }
////}
//
////import java.util.*;
////public class Main {
////    public static void main(String args[]) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while (t-- > 0) {
////            int n = sc.nextInt();
////            String str = sc.next();
////            if (n != 5) {
////                System.out.println("NO");
////            } else {
////                char[] chars = str.toCharArray();
////                Arrays.sort(chars);
////                if (String.valueOf(chars).equals("Timru")) {
////                    System.out.println("YES");
////                } else {
////                    System.out.println("NO");
////                }
////            }
////        }
////    }
////}
//
//
//
//import java.util.*;
//
//import java.util.*;
////public class Main{
////    public static void main(String srgs[]){
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while(t-- > 0){
////            String a = sc.next();
////            String b= sc.next();
////            String c = sc.next();
////            char ch1 = a.charAt(0);
////            char ch2 = b.charAt(0);
////            char ch3 = c.charAt(0);
////            String s = "";
////            s+=ch1;
////            s+=ch2;
////            s+=ch3;
////            System.out.println(s);
////        }
////    }
////}
//
////import java.util.*;
////public class Main{
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int count =0;
////        if((n&(n-1))==0) {
////            System.out.println(1);
////            return;
////        }
////        else{
////            while(n!=0){
////                int k = n%2;
////                count+=k;
////                n/=2;
////            }
////        }
////        System.out.println(count);
////    }
////}
//
//
////
////import java.io.*;
////import java.util.*;
////
////public class Main{
////    public static int precedence(char op) {
////        switch (op) {
////            case '+':
////            case '-': return 1;
////            case '*':
////            case '/': return 2;
////        }
////        return -1;
////    }
////
////    public static String convertToPostfix(List<Character> tokens) {
////        StringBuilder postfix = new StringBuilder();
////        Stack<Character> stack = new Stack<>();
////        for (char token : tokens) {
////            if (Character.isDigit(token)) {
////                postfix.append(token);
////            } else if (token == '(') {
////                stack.push(token);
////            } else if (token == ')') {
////                while (!stack.isEmpty() && stack.peek() != '(') {
////                    postfix.append(stack.pop());
////                }
////                if (!stack.isEmpty() && stack.peek() == '(') {
////                    stack.pop();
////                }
////            } else {
////                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
////                    postfix.append(stack.pop());
////                }
////                stack.push(token);
////            }
////        }
////        while (!stack.isEmpty()) {
////            postfix.append(stack.pop());
////        }
////        return postfix.toString();
////    }
////
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        int testCases = Integer.parseInt(br.readLine().trim());
////        for (int t = 0; t < testCases; t++) {
////            br.readLine();
////            List<Character> tokens = new ArrayList<>();
////            String line;
////            while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
////                tokens.add(line.trim().charAt(0));
////            }
////            String postfix = convertToPostfix(tokens);
////            System.out.println(postfix);
////            if (t != testCases - 1) {
////                System.out.println();
////            }
////        }
////    }
////}
//
//
////import java.io.*;
////import java.util.*;
////
////public class Main {
////    public static boolean isBalanced(String s) {
////        Stack<Character> stack = new Stack<>();
////        for (char ch : s.toCharArray()) {
////            if (ch == '(' || ch == '[') {
////                stack.push(ch);
////            } else if (ch == ')') {
////                if (stack.isEmpty() || stack.pop() != '(') return false;
////            } else if (ch == ']') {
////                if (stack.isEmpty() || stack.pop() != '[') return false;
////            }
////        }
////        return stack.isEmpty();
////    }
////
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        int n = Integer.parseInt(br.readLine().trim());
////        for (int i = 0; i < n; i++) {
////            String str = br.readLine().trim();
////            if (isBalanced(str)) {
////                System.out.println("Yes");
////            } else {
////                System.out.println("No");
////            }
////        }
////    }
////}
//
//
//import java.util.*;
//
//public class Main{
//    public static boolean isBalanced(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char ch : s.toCharArray()) {
//            if (ch == '(' || ch == '[') {
//                stack.push(ch);
//            } else if (ch == ')') {
//                if (stack.isEmpty() || stack.pop() != '(') return false;
//            } else if (ch == ']') {
//                if (stack.isEmpty() || stack.pop() != '[') return false;
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine().trim());
//        for (int i = 0; i < n; i++) {
//            String str = sc.nextLine().trim();
//            System.out.println(isBalanced(str) ? "Yes" : "No");
//        }
//        sc.close();
//    }
//}


//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            solve(scanner);
//        }
//        scanner.close();
//    }
//
//    private static void solve(Scanner scanner) {
//        long n = scanner.nextLong();
//        List<Long> solutions = new ArrayList<>();
//        long powerOf10 = 10;
//
//        while (true) {
//            long divisor = 1 + powerOf10;
//
//            if (divisor > n) {
//                break;
//            }
//
//            if (n % divisor == 0) {
//                solutions.add(n / divisor);
//            }
//
//            if (powerOf10 > Long.MAX_VALUE / 10) {
//                break;
//            }
//            powerOf10 *= 10;
//
//        }
//
//        if (solutions.isEmpty()) {
//            System.out.println(0);
//        } else {
//            Collections.sort(solutions);
//            StringBuilder sb = new StringBuilder();
//            sb.append(solutions.size());
//            for (long x : solutions) {
//                sb.append(" ").append(x);
//            }
//            System.out.println(sb.toString());
//        }
//    }
//}






//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            solve(scanner);
//        }
//        scanner.close();
//    }
//
//    private static void solve(Scanner scanner) {
//        int n = scanner.nextInt();
//
//        long totalCost = 0;
//        int x = 0;
//        long powerOf3_x = 1;
//
//        while (n > 0) {
//            int digit = n % 3;
//
//            if (digit > 0) {
//                long costOfOneDeal;
//                if (x == 0) {
//                    costOfOneDeal = 3;
//                } else {
//                    costOfOneDeal = (powerOf3_x * 3) + ((long)x * (powerOf3_x / 3));
//                }
//                totalCost += (long)digit * costOfOneDeal;
//            }
//
//            n /= 3;
//            x++;
//            powerOf3_x *= 3;
//        }
//
//        System.out.println(totalCost);
//    }
//}



//import java.util.Scanner;
//
//public class Main {
//    // Use a constant for the maximum deal type 'x' needed.
//    // 3^20 > 10^9, so x=20 is sufficient. We use 21 for a safe margin.
//    static final int MAX_X = 21;
//    // The powers array needs to hold up to 3^(x+1) to calculate cost[x].
//    static final long[] powersOf3 = new long[MAX_X + 2];
//    // The costs array needs to hold up to cost[x].
//    static final long[] costs = new long[MAX_X + 1];
//
//    static void precompute() {
//        powersOf3[0] = 1;
//        // Fill the powers array up to the maximum index required.
//        for (int i = 1; i < powersOf3.length; i++) {
//            powersOf3[i] = powersOf3[i - 1] * 3;
//        }
//
//        costs[0] = 3;
//        // The loop now correctly calculates costs without going out of bounds.
//        for (int i = 1; i < costs.length; i++) {
//            costs[i] = powersOf3[i + 1] + (long) i * powersOf3[i - 1];
//        }
//    }
//
//    public static void main(String[] args) {
//        precompute();
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            solve(scanner);
//        }
//        scanner.close();
//    }
//
//    private static void solve(Scanner scanner) {
//        long n = scanner.nextLong();
//        long k = scanner.nextLong();
//
//        long[] deals = new long[MAX_X + 1];
//        long min_deals = 0;
//        long current_cost = 0;
//
//        long temp_n = n;
//        for (int i = 0; i <= MAX_X && temp_n > 0; i++) {
//            deals[i] = temp_n % 3;
//            min_deals += deals[i];
//            if (deals[i] > 0) {
//                current_cost += deals[i] * costs[i];
//            }
//            temp_n /= 3;
//        }
//
//        if (k < min_deals) {
//            System.out.println(-1);
//            return;
//        }
//
//        long deals_to_add = k - min_deals;
//
//        // Loop from the highest deal type 'x' down to 1
//        for (int x = MAX_X; x > 0; x--) {
//            if (deals_to_add == 0) break;
//
//            long trades_affordable = deals_to_add / 2;
//            long trades_possible_here = deals[x];
//            long trades_to_perform = Math.min(trades_possible_here, trades_affordable);
//
//            if (trades_to_perform > 0) {
//                // Cost reduction for breaking a deal of type x is 3^(x-1)
//                current_cost -= trades_to_perform * powersOf3[x - 1];
//                deals_to_add -= trades_to_perform * 2;
//                deals[x - 1] += trades_to_perform * 3;
//            }
//        }
//
//        System.out.println(current_cost);
//    }
//}



//import java.util.Scanner;
//
//public class Main {
//
//    private static long sumDigitsUpTo(long n) {
//        if (n < 0) {
//            return 0;
//        }
//        if (n < 10) {
//            return n * (n + 1) / 2;
//        }
//
//        String s = String.valueOf(n);
//        int d = s.length();
//
//        long p = 1;
//        for (int i = 0; i < d - 1; i++) {
//            p *= 10;
//        }
//
//        long msd = n / p;
//        long rem = n % p;
//        long res = 0;
//
//        res += msd * (d - 1) * 45L * (p / 10);
//        res += (msd * (msd - 1) / 2) * p;
//        res += msd * (rem + 1);
//        res += sumDigitsUpTo(rem);
//
//        return res;
//    }
//
//    private static void solve(Scanner scanner) {
//        long k = scanner.nextLong();
//
//        long total_sum = 0;
//        long d = 1;
//        long count = 9;
//        long powerOf10 = 1;
//
//        while (true) {
//            long digits_in_block = d * count;
//            if (k <= digits_in_block) {
//                break;
//            }
//
//            k -= digits_in_block;
//
//            long sum_of_block;
//            if (d == 1) {
//                sum_of_block = 45;
//            } else {
//                sum_of_block = 45L * (powerOf10 / 10) * (9L * d + 1);
//            }
//            total_sum += sum_of_block;
//
//            d++;
//            powerOf10 *= 10;
//            count *= 10;
//        }
//
//        long start_num = powerOf10;
//        long number_index = (k - 1) / d;
//        long the_number = start_num + number_index;
//        long digit_index = (k - 1) % d;
//
//        long first_num_in_block = start_num;
//        long last_full_num = the_number - 1;
//
//        if (last_full_num >= first_num_in_block) {
//            total_sum += sumDigitsUpTo(last_full_num) - sumDigitsUpTo(first_num_in_block - 1);
//        }
//
//        String s_the_number = String.valueOf(the_number);
//        for (int i = 0; i <= digit_index; i++) {
//            total_sum += Character.getNumericValue(s_the_number.charAt(i));
//        }
//
//        System.out.println(total_sum);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            solve(scanner);
//        }
//        scanner.close();
//    }
//}


//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastReader() {
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//        String next() {
//            while (st == null || !st.hasMoreElements()) {
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//
//        long nextLong() {
//            return Long.parseLong(next());
//        }
//    }
//
//    static class Card implements Comparable<Card> {
//        int value;
//        int owner;
//
//        public Card(int value, int owner) {
//            this.value = value;
//            this.owner = owner;
//        }
//
//        @Override
//        public int compareTo(Card other) {
//            return Integer.compare(other.value, this.value);
//        }
//    }
//
//    private static void solve(FastReader sc) {
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int q = sc.nextInt();
//
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//
//        int[] b = new int[m];
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//        }
//        Arrays.sort(b);
//
//        long[] prefix_sum_a = new long[n + 1];
//        for (int i = 0; i < n; i++) {
//            prefix_sum_a[i + 1] = prefix_sum_a[i] + a[n - 1 - i];
//        }
//
//        long[] prefix_sum_b = new long[m + 1];
//        for (int i = 0; i < m; i++) {
//            prefix_sum_b[i + 1] = prefix_sum_b[i] + b[m - 1 - i];
//        }
//
//        Card[] combined = new Card[n + m];
//        for (int i = 0; i < n; i++) {
//            combined[i] = new Card(a[n - 1 - i], 0);
//        }
//        for (int i = 0; i < m; i++) {
//            combined[n + i] = new Card(b[m - 1 - i], 1);
//        }
//        Arrays.sort(combined);
//
//        int[] opt_a = new int[n + m + 1];
//        for (int i = 0; i < n + m; i++) {
//            opt_a[i + 1] = opt_a[i] + (combined[i].owner == 0 ? 1 : 0);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < q; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int z = sc.nextInt();
//
//            int min_ca = Math.max(0, z - y);
//            int max_ca = Math.min(x, z);
//
//            int c_a_opt = opt_a[z];
//
//            int c_a_final = Math.max(min_ca, Math.min(max_ca, c_a_opt));
//            int c_b_final = z - c_a_final;
//
//            long maxSum = prefix_sum_a[c_a_final] + prefix_sum_b[c_b_final];
//            sb.append(maxSum).append("\n");
//        }
//        System.out.print(sb);
//    }
//
//    public static void main(String[] args) {
//        FastReader sc = new FastReader();
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            solve(sc);
//        }
//    }
//}




//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.PriorityQueue;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastReader() {
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//        String next() {
//            while (st == null || !st.hasMoreElements()) {
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//    }
//
//    static class State implements Comparable<State> {
//        int u;
//        int dist;
//        int laneIdx;
//
//        public State(int u, int dist, int laneIdx) {
//            this.u = u;
//            this.dist = dist;
//            this.laneIdx = laneIdx;
//        }
//
//        @Override
//        public int compareTo(State other) {
//            if (this.dist != other.dist) {
//                return Integer.compare(this.dist, other.dist);
//            }
//            return Integer.compare(this.laneIdx, other.laneIdx);
//        }
//    }
//
//    static ArrayList<ArrayList<int[]>> adj;
//    static int[] disc, low, parent;
//    static int timer;
//
//    static void findBridgesDfs(int u, int p, int p_idx) {
//        disc[u] = low[u] = ++timer;
//        parent[u] = p;
//
//        for (int[] edge : adj.get(u)) {
//            int v = edge[0];
//            int edgeIdx = edge[1];
//            if (v == p) continue;
//            if (disc[v] != 0) {
//                low[u] = Math.min(low[u], disc[v]);
//            } else {
//                findBridgesDfs(v, u, edgeIdx);
//                low[u] = Math.min(low[u], low[v]);
//            }
//        }
//    }
//
//    private static void solve(FastReader sc) {
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        adj = new ArrayList<>();
//        Map<Integer, int[]> edgeMap = new HashMap<>();
//        for (int i = 0; i <= n; i++) {
//            adj.add(new ArrayList<>());
//        }
//
//        for (int i = 1; i <= m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            adj.get(u).add(new int[]{v, i});
//            adj.get(v).add(new int[]{u, i});
//            edgeMap.put(i, new int[]{u, v});
//        }
//
//        int q = sc.nextInt();
//        int[] queries = new int[q];
//        for (int i = 0; i < q; i++) {
//            queries[i] = sc.nextInt();
//        }
//
//        disc = new int[n + 1];
//        low = new int[n + 1];
//        parent = new int[n + 1];
//        timer = 0;
//        findBridgesDfs(1, -1, -1);
//
//        ArrayList<Integer> pathBridgeIndices = new ArrayList<>();
//        if (disc[n] != 0) {
//            int curr = n;
//            while (curr != 1 && parent[curr] != -1) {
//                int p = parent[curr];
//                if (low[curr] > disc[p]) {
//                    for(int[] edge : adj.get(p)){
//                        if(edge[0] == curr){
//                            pathBridgeIndices.add(edge[1]);
//                            break;
//                        }
//                    }
//                }
//                curr = p;
//            }
//        }
//
//        if (pathBridgeIndices.isEmpty()) {
//            for (int i = 0; i < q; i++) {
//                System.out.println(-1);
//            }
//            return;
//        }
//
//        int[] minDist = new int[n + 1];
//        int[] bestLaneIdx = new int[n + 1];
//        Arrays.fill(minDist, Integer.MAX_VALUE);
//        Arrays.fill(bestLaneIdx, Integer.MAX_VALUE);
//        PriorityQueue<State> pq = new PriorityQueue<>();
//
//        Map<Integer, Integer> endpointMinLane = new HashMap<>();
//        for (int idx : pathBridgeIndices) {
//            int[] endpoints = edgeMap.get(idx);
//            int u = endpoints[0];
//            int v = endpoints[1];
//            endpointMinLane.put(u, Math.min(endpointMinLane.getOrDefault(u, Integer.MAX_VALUE), idx));
//            endpointMinLane.put(v, Math.min(endpointMinLane.getOrDefault(v, Integer.MAX_VALUE), idx));
//        }
//
//        for (Map.Entry<Integer, Integer> entry : endpointMinLane.entrySet()) {
//            int u = entry.getKey();
//            int idx = entry.getValue();
//            minDist[u] = 0;
//            bestLaneIdx[u] = idx;
//            pq.add(new State(u, 0, idx));
//        }
//
//        while (!pq.isEmpty()) {
//            State curr = pq.poll();
//            int u = curr.u;
//            int d = curr.dist;
//            int lane = curr.laneIdx;
//
//            if (d > minDist[u] || (d == minDist[u] && lane > bestLaneIdx[u])) {
//                continue;
//            }
//
//            for (int[] edge : adj.get(u)) {
//                int v = edge[0];
//                if (minDist[v] > d + 1 || (minDist[v] == d + 1 && bestLaneIdx[v] > lane)) {
//                    minDist[v] = d + 1;
//                    bestLaneIdx[v] = lane;
//                    pq.add(new State(v, d + 1, lane));
//                }
//            }
//        }
//
//        for (int c : queries) {
//            System.out.print(bestLaneIdx[c]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        FastReader sc = new FastReader();
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            solve(sc);
//        }
//    }
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;




//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            Set<Integer> distinctGears = new HashSet<>();
//            boolean foundDuplicate = false;
//            for (int i = 0; i < n; i++) {
//                int teeth = scanner.nextInt();
//                if (!distinctGears.add(teeth)) {
//                    foundDuplicate = true;
//                }
//            }
//            if (foundDuplicate) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}








//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
//        int t = Integer.parseInt(br.readLine());
//        while (t-- > 0) {
//            int n = Integer.parseInt(br.readLine());
//            List<List<Integer>> adj = new ArrayList<>();
//            for (int i = 0; i <= n; i++) {
//                adj.add(new ArrayList<>());
//            }
//            for (int i = 0; i < n - 1; i++) {
//                StringTokenizer st = new StringTokenizer(br.readLine());
//                int u = Integer.parseInt(st.nextToken());
//                int v = Integer.parseInt(st.nextToken());
//                adj.get(u).add(v);
//                adj.get(v).add(u);
//            }
//
//            if (n == 2) {
//                pw.println(2);
//                pw.println("1 1");
//                pw.println("1 2");
//                continue;
//            }
//            if (n == 3) {
//                int root = -1;
//                for(int i=1; i<=n; ++i) {
//                    if (adj.get(i).size() > 1) {
//                        root = i;
//                        break;
//                    }
//                }
//                if (root == -1) root = 1; // Path graph case
//
//                List<Integer> leaves = new ArrayList<>();
//                for(int i=1; i<=n; ++i) {
//                    if (i != root) {
//                        leaves.add(i);
//                    }
//                }
//                pw.println(3);
//                pw.println("1 " + leaves.get(0));
//                pw.println("1 " + leaves.get(1));
//                pw.println("1 " + root);
//                continue;
//            }
//
//
//            int[] color = new int[n + 1];
//            List<Integer> color0 = new ArrayList<>();
//            List<Integer> color1 = new ArrayList<>();
//
//            int[] q = new int[n];
//            int head = 0, tail = 0;
//
//            q[tail++] = 1;
//            color[1] = 0;
//            boolean[] visited = new boolean[n+1];
//            visited[1] = true;
//
//            while(head < tail){
//                int u = q[head++];
//                if(color[u] == 0) color0.add(u);
//                else color1.add(u);
//
//                for(int v : adj.get(u)){
//                    if(!visited[v]){
//                        visited[v] = true;
//                        color[v] = 1 - color[u];
//                        q[tail++] = v;
//                    }
//                }
//            }
//
//
//            List<Integer> smallerSet = (color0.size() < color1.size()) ? color0 : color1;
//            List<Integer> largerSet = (color0.size() < color1.size()) ? color1 : color0;
//
//            // For n >=4, pick the center of a star or a node and isolate it.
//            // This works in n+1 operations. n+1 <= 5/4 n -> 1 <= n/4 -> n>=4
//            int centerNode = 1; // Arbitrarily pick 1 as the node to clear around
//
//            List<String> ops = new ArrayList<>();
//            ops.add("1 " + centerNode);
//            ops.add("2 " + centerNode);
//            for (int i = 1; i <= n; i++) {
//                if (i != centerNode) {
//                    ops.add("1 " + i);
//                }
//            }
//
//            pw.println(ops.size());
//            for (String op : ops) {
//                pw.println(op);
//            }
//        }
//        pw.flush();
//    }
//}



//import java.util.*;
//public class Main {
//    public static void bubbleSort(int[] arr, int n) {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//            bubbleSort(arr, n);
//            for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
//        }
//}



//import java.util.Scanner;
//import java.io.PrintWriter;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        PrintWriter out = new PrintWriter(System.out);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int[] p = new int[n];
//            for (int i = 0; i < n; i++) {
//                p[i] = sc.nextInt();
//            }
//
//            for (int i = 0; i < n; i++) {
//                out.print((n + 1 - p[i]) + (i == n - 1 ? "" : " "));
//            }
//            out.println();
//        }
//        sc.close();
//        out.flush();
//    }
//}



//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            long a = sc.nextLong();
//            long b = sc.nextLong();
//
//            if (a % 2 != 0 && b % 2 != 0) {
//                System.out.println(a * b + 1);
//            } else if (a % 2 == 0 && b % 2 != 0) {
//                System.out.println(-1);
//            } else if (a % 2 != 0 && b % 2 == 0) {
//                if (b % 4 != 0) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(Math.max(2 * a + b / 2, a * (b / 2) + 2));
//                }
//            } else {
//                System.out.println(Math.max(a + b, a * (b / 2) + 2));
//            }
//        }
//    }
//}



//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        StringBuilder outputBuilder = new StringBuilder();
//
//        while (t-- > 0) {
//            int n = sc.nextInt();
//
//            List<Integer>[] groups = new ArrayList[n + 1];
//            for (int i = 0; i <= n; i++) {
//                groups[i] = new ArrayList<>();
//            }
//
//            for (int i = 0; i < n; i++) {
//                int bValue = sc.nextInt();
//                groups[bValue].add(i);
//            }
//
//            boolean possible = true;
//            for (int k = 1; k <= n; k++) {
//                if (groups[k].size() % k != 0) {
//                    possible = false;
//                    break;
//                }
//            }
//
//            if (!possible) {
//                outputBuilder.append(-1).append("\n");
//                continue;
//            }
//
//            int[] a = new int[n];
//            int valueToAssign = 1;
//
//            for (int k = 1; k <= n; k++) {
//                List<Integer> indices = groups[k];
//                for (int i = 0; i < indices.size(); i += k) {
//                    for (int j = 0; j < k; j++) {
//                        int originalIndex = indices.get(i + j);
//                        a[originalIndex] = valueToAssign;
//                    }
//                    valueToAssign++;
//                }
//            }
//
//            for (int i = 0; i < n; i++) {
//                outputBuilder.append(a[i]).append(i == n - 1 ? "" : " ");
//            }
//            outputBuilder.append("\n");
//        }
//
//        System.out.print(outputBuilder.toString());
//    }
//}




//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        StringBuilder sb = new StringBuilder();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            long k = sc.nextLong();
//            int[] a = new int[n];
//            long initialSum = 0;
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextInt();
//                initialSum += a[i];
//            }
//
//            boolean[] seen = new boolean[n];
//            boolean isPermutation = (a.length == n);
//            if (isPermutation) {
//                for (int x : a) {
//                    if (x >= n || seen[x]) {
//                        isPermutation = false;
//                        break;
//                    }
//                    seen[x] = true;
//                }
//            }
//
//            if (isPermutation) {
//                long sum = (long) n * (n - 1) / 2;
//                sb.append(sum).append("\n");
//                continue;
//            }
//
//            if (k == 0) {
//                sb.append(initialSum).append("\n");
//                continue;
//            }
//
//            int[] a1 = applyOp(a, n);
//            long sum1 = 0;
//            for (int val : a1) {
//                sum1 += val;
//            }
//
//            if (k == 1) {
//                sb.append(sum1).append("\n");
//                continue;
//            }
//
//            int[] a2 = applyOp(a1, n);
//
//            if (Arrays.equals(a1, a2)) {
//                sb.append(sum1).append("\n");
//            } else {
//                long sum2 = 0;
//                for (int val : a2) {
//                    sum2 += val;
//                }
//                if ((k - 1) % 2 == 0) {
//                    sb.append(sum1).append("\n");
//                } else {
//                    sb.append(sum2).append("\n");
//                }
//            }
//        }
//        System.out.print(sb.toString());
//        sc.close();
//    }
//
//    private static int[] applyOp(int[] a, int n) {
//        int[] counts = new int[n + 1];
//        for (int x : a) {
//            if (x < n + 1) {
//                counts[x]++;
//            }
//        }
//
//        int mex = 0;
//        while (mex < n + 1 && counts[mex] > 0) {
//            mex++;
//        }
//
//        int[] nextA = new int[n];
//        for (int i = 0; i < n; i++) {
//            int val = a[i];
//            boolean isUniqueAndSmall = (val < n + 1 && counts[val] == 1);
//
//            if (isUniqueAndSmall && val < mex) {
//                nextA[i] = val;
//            } else {
//                nextA[i] = mex;
//            }
//        }
//        return nextA;
//    }
//}



//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        FastReader fs = new FastReader();
//        PrintWriter pw = new PrintWriter(System.out);
//        int t = fs.nextInt();
//        while (t-- > 0) {
//            solve(fs, pw);
//        }
//        pw.flush();
//    }
//
//    public static void solve(FastReader fs, PrintWriter pw) throws IOException {
//        int n = fs.nextInt();
//        int m = fs.nextInt();
//        int q = fs.nextInt();
//
//        List<Integer>[] adj = new ArrayList[n + 1];
//        List<Integer>[] revAdj = new ArrayList[n + 1];
//        for (int i = 1; i <= n; i++) {
//            adj[i] = new ArrayList<>();
//            revAdj[i] = new ArrayList<>();
//        }
//
//        int[] outDegree = new int[n + 1];
//        for (int i = 0; i < m; i++) {
//            int u = fs.nextInt();
//            int v = fs.nextInt();
//            adj[u].add(v);
//            revAdj[v].add(u);
//            outDegree[u]++;
//        }
//
//        boolean[] isRed = new boolean[n + 1];
//        int[] goodChildren = new int[n + 1];
//        int[] nonCryWinChildren = new int[n + 1];
//        boolean[] isCryLoss = new boolean[n + 1];
//
//        for (int i = 1; i <= n; i++) {
//            goodChildren[i] = outDegree[i];
//        }
//
//        Queue<Integer> propagationQueue = new LinkedList<>();
//
//        for (int i = 0; i < q; i++) {
//            int type = fs.nextInt();
//            int u = fs.nextInt();
//
//            if (type == 1) {
//                if (isRed[u]) {
//                    continue;
//                }
//
//                boolean wasGoodChild = !isRed[u] && nonCryWinChildren[u] == 0;
//                isRed[u] = true;
//
//                if (wasGoodChild) {
//                    for (int p : revAdj[u]) {
//                        goodChildren[p]--;
//                        if (!isRed[p] && outDegree[p] > 0 && goodChildren[p] == 0 && !isCryLoss[p]) {
//                            isCryLoss[p] = true;
//                            propagationQueue.add(p);
//                        }
//                    }
//                }
//
//                if (!isCryLoss[u]) {
//                    isCryLoss[u] = true;
//                    propagationQueue.add(u);
//                }
//
//                while (!propagationQueue.isEmpty()) {
//                    int w = propagationQueue.poll();
//                    for (int v : revAdj[w]) {
//                        nonCryWinChildren[v]++;
//                        if (!isRed[v] && nonCryWinChildren[v] == 1) {
//                            for (int p : revAdj[v]) {
//                                goodChildren[p]--;
//                                if (!isRed[p] && outDegree[p] > 0 && goodChildren[p] == 0 && !isCryLoss[p]) {
//                                    isCryLoss[p] = true;
//                                    propagationQueue.add(p);
//                                }
//                            }
//                        }
//                    }
//                }
//            } else {
//                if (isCryLoss[u]) {
//                    pw.println("NO");
//                } else {
//                    pw.println("YES");
//                }
//            }
//        }
//    }
//
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastReader() {
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//        String next() {
//            while (st == null || !st.hasMoreElements()) {
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//    }
//}



//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        StringBuilder sb = new StringBuilder();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            long k = sc.nextLong();
//            int[] a = new int[n];
//            long initialSum = 0;
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextInt();
//                initialSum += a[i];
//            }
//
//            if (k == 0) {
//                sb.append(initialSum).append("\n");
//                continue;
//            }
//
//            boolean isP = true;
//            boolean[] seen = new boolean[n];
//            for (int x : a) {
//                if (x >= n || seen[x]) {
//                    isP = false;
//                    break;
//                }
//                seen[x] = true;
//            }
//            if (isP) {
//                for (int i = 0; i < n; i++) {
//                    if (!seen[i]) {
//                        isP = false;
//                        break;
//                    }
//                }
//            }
//
//            if (isP) {
//                long sum = (long) n * (n - 1) / 2;
//                sb.append(sum).append("\n");
//                continue;
//            }
//
//            int[] a1 = applyOp(a, n);
//            long sum1 = 0;
//            for (int val : a1) sum1 += val;
//            if (k == 1) {
//                sb.append(sum1).append("\n");
//                continue;
//            }
//
//            int[] a2 = applyOp(a1, n);
//            long sum2 = 0;
//            for (int val : a2) sum2 += val;
//            if (k == 2) {
//                sb.append(sum2).append("\n");
//                continue;
//            }
//
//            if (Arrays.equals(a1, a2)) {
//                sb.append(sum1).append("\n");
//            } else {
//                int[] a3 = applyOp(a2, n);
//                if (Arrays.equals(a2, a3)) {
//                    sb.append(sum2).append("\n");
//                } else {
//                    long sum3 = 0;
//                    for(int val : a3) sum3 += val;
//                    long rem_k = k - 2;
//                    if (rem_k % 2 == 1) {
//                        sb.append(sum3).append("\n");
//                    } else {
//                        sb.append(sum2).append("\n");
//                    }
//                }
//            }
//        }
//        System.out.print(sb.toString());
//        sc.close();
//    }
//
//    private static int[] applyOp(int[] a, int n) {
//        int[] counts = new int[n + 1];
//        for (int x : a) {
//            if (x <= n) {
//                counts[x]++;
//            }
//        }
//
//        int mex = 0;
//        while (mex <= n && counts[mex] > 0) {
//            mex++;
//        }
//
//        int[] nextA = new int[n];
//        for (int i = 0; i < n; i++) {
//            int val = a[i];
//            if ((val <= n && counts[val] > 1) || val >= mex) {
//                nextA[i] = mex;
//            } else {
//                nextA[i] = val;
//            }
//        }
//        return nextA;
//    }
//}



import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long[] tree;
    static int valueRange;
    static final long SENTINEL = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc, pw);
        }
        sc.close();
        pw.flush();
    }

    public static void solve(Scanner sc, PrintWriter pw) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            maxVal = Math.max(maxVal, a[i]);
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            maxVal = Math.max(maxVal, b[i]);
        }

        valueRange = maxVal + 1;
        tree = new long[4 * valueRange];
        Arrays.fill(tree, SENTINEL);

        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            long p_ge = query(1, 0, valueRange - 1, a[i], valueRange - 1);

            long currentContribution = 0;

            if (a[i] == b[i]) {
                long num_l = i - (p_ge + 1) + 1;
                currentContribution += num_l * (long)(n - i);
            }

            if (p_ge != -1) {
                long p_b = query(1, 0, valueRange - 1, b[i], valueRange - 1);
                if (p_b != -1) {
                    long num_l = Math.min(p_ge, p_b) + 1;
                    currentContribution += num_l * (long)(n - i);
                }
            }

            totalSum += currentContribution;
            update(1, 0, valueRange - 1, a[i], i);
        }

        pw.println(totalSum);
    }

    public static void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = Math.max(tree[node], (long)val);
            return;
        }
        int mid = start + (end - start) / 2;
        if (start <= idx && idx <= mid) {
            update(2 * node, start, mid, idx, val);
        } else {
            update(2 * node + 1, mid + 1, end, idx, val);
        }
        tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
    }

    public static long query(int node, int start, int end, int l, int r) {
        if (r < start || end < l || l > r) {
            return SENTINEL;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = start + (end - start) / 2;
        long p1 = query(2 * node, start, mid, l, r);
        long p2 = query(2 * node + 1, mid + 1, end, l, r);
        return Math.max(p1, p2);
    }
}