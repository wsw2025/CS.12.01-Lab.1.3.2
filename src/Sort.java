import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {

        boolean swap;

        for (int i = 0; i < array.length; i++) {

            swap = false;

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j+1]) {
                    // Swap the two values
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;

                }

            }

            if (!swap) return array;

        }

        return array;

    }

    public static String[] bubbleSort(String[] array) {

        boolean swap;

        for (int i = 0; i < array.length; i++) {

            swap = false;

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j].toLowerCase().compareTo(array[j+1].toLowerCase()) > 0) {

                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;

                }

            }

            if (!swap) return array;
        }

        return array;

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {

        boolean swap;

        for (int i = 0; i < list.size(); i++) {

            swap = false;

            for (int j = 0; j < list.size() - i - 1; j++) {

                if (list.get(j) > list.get(j+1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);

                    swap = true;
                }

            }

            if (!swap) return list;

        }

        return list;
    }

    public static int[] selectionSort(int[] array) {

        int minIndex;

        for (int i = 0; i < array.length; i++) {

            minIndex = i;

            for (int j = i+1; j < array.length; j++) {

                if (array[j] < array[minIndex]) {

                    minIndex = j;

                }

            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    public static String[] selectionSort(String[] array) {

        int minIndex;

        for (int i = 0; i < array.length; i++) {

            minIndex = i;

            for (int j = i+1; j < array.length; j++) {

                if (array[j].toLowerCase().compareTo(array[minIndex].toLowerCase()) < 0) {

                    minIndex = j;

                }

            }

            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }

        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {

        int minIndex;

        for (int i = 0; i < list.size(); i++) {

            minIndex = i;

            for (int j = i+1; j < list.size(); j++) {

                if (list.get(j).toLowerCase().compareTo(list.get(minIndex).toLowerCase()) < 0) {

                    minIndex = j;

                }

            }

            String temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }

        return list;

    }
}
