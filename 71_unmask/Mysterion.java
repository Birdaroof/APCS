public class Mysterion {
    public static void doTing(int[] arr, int a, int b, int c) {
        System.out.println("Value of a = " + a);
        System.out.println("arr[a] " + arr[a]);
        System.out.println("Value of b = " + b);
        System.out.println("arr[b] " + arr[b]);
        System.out.println("Value of c = " + c);
        System.out.println("arr[c] " + arr[c]);
        var v = arr[c];
        swap(arr, c, b);
        var s = a;
        for (int i = a; i < (b - 1); i++) {
            System.out.println("v = " + v);
            if (arr[i] < v) {
                System.out.println("arr[i] = " + arr[i]);
                System.out.println("v = " + v);
                System.out.println("s = " + s);
                System.out.println("arr[s] = " + arr[s]);
                System.out.println("Entering the swap");
                swap(arr, s, i);
                s += 1;
                System.out.println("Exiting the swap");
                System.out.println("s = " + s);
                System.out.println("arr[s] = " + arr[s]);
            }
        }
        swap(arr, b, s);
        System.out.println("arr[a] " + arr[a]);
        System.out.println("arr[b] " + arr[b]);
        System.out.println("arr[c] " + arr[c]);
        System.out.println("s = " + s);
        System.out.println(print(arr));
    }

    public static int[] swap(int[] arr, int a, int b) {
        System.out.println("Array before swap: " + print(arr));
        System.out.println("Swapping " + arr[a] + " and "  + arr[b]);
        int place = arr[a];
        int[] holder = arr;
        holder[a] = arr[b];
        holder[b] = place;
        System.out.println("Array after swap: " + print(holder));
        return holder;
    }

    public static String print(int[] arr) {
        String holder = "{";
        for (int i : arr ) {
            holder +=  i + ", ";
        }
        holder += "}";
        return holder;
    }

    public static void main(String[] args) {
        int[] ting = {18, 9, 2, 19, 7};
        for (int i = 0; i < 4; i++ ){
            doTing(ting,0,4,i);
            System.out.println("\n");
        }
        //doTing(ting, 0, 4, 3);
        //doTing(ting, 0, 2, 1);
        System.out.println(print(ting));
    }
}
