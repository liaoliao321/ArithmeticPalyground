public class Main {


    public static void main(String[] args) {
//        int[] array = {2,0,2,1,1,0};
//        quickSort(array, 0, array.length - 1);
//        for (int i : array)
//            System.out.print(i + ",");


        System.out.println(tryCatch());

    }

    private static String tryCatch() {
        try{
            System.out.println("try");
            return "return from try";
        }catch (Exception e){
            System.out.println("exp");
        }finally {
            System.out.println("finally");
        }
        return "";
    }

    private static String fa(String a){
        a = "Rose Dawson";
        return a;
    }
    private static void quickSort(int[] array, int left, int right) {

        if (left < right) {
            int l = left;
            int r = right;
            int divider = array[left];
            while (l < r) {
                while (l < r && array[r] > divider)
                    r--;

                if (l < r)
                    array[l++] = array[r];

                while (l < r && array[l] < divider)
                    l++;

                if (l < r)
                    array[r--] = array[l];
            }
            array[l] = divider;
            quickSort(array, left, l - 1);
            quickSort(array, l + 1, right);
        }
    }


}
