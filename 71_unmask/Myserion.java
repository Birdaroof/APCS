public class Myserion {
    public static void doTing(int[] arr, int a, int b, int c) {
        var v = arr[c];
        swap(arr, c, b);
        var s = a;
        for (int i = a; i < (b - 1); i++) {
            if (arr[i] < v) {
                swap(arr, s, i);
                s += 1;
            }
        }
        swap(arr, b, s);

    }

    public static int[] swap(int[] arr, int a, int b) {
        int place = arr[a];
        int[] holder = arr;
        holder[a] = arr[b];
        holder[b] = place;
        return holder;
    }

    public static String print(int[] arr) {
        String holder = "{";
        for (int i : arr ) {
            holder +=  i + ", ";
        }
        return holder;
    }

    public static void main(String[] args) {
        int[] ting = {7, 1, 5, 12, 3};
        doTing(ting, 0, 4, 2);
        System.out.println(print(ting));
    }
}