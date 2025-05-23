public class P36 {
    public class Merge {
        public static void mergesort(int a[], int low, int high) {

            if (low < high) {

                int mid = (high + low) / 2;
                mergesort(a, low, mid);
                mergesort(a, mid + 1, high);
                merge(a, low, mid, high);
            }
        }

        public static void merge(int a[], int low, int mid, int high) {
            int b[] = new int[high + 1];
            int i = low, h = low, j = mid + 1;
            while (h <= mid && j <= high) {
                if (a[h] <= a[j]) {
                    b[i] = a[h];
                    h++;
                } else {
                    b[i] = a[j];
                    j++;
                }
                i++;

            }
            if (h > mid) {
                for (int k = j; k <= high; k++) {
                    b[i] = a[k];
                    i++;
                }
            } else {
                for (int k = h; k <= mid; k++) {
                    b[i] = a[k];
                    i++;
                }
            }
            for (int k = low; k <= high; k++) {
                a[k] = b[k];
            }
        }

        public static void main(String[] args) {
            int a[] = { 2, 1, 3, 4, 0 };
            mergesort(a, 0, a.length - 1);
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
    }

}
 