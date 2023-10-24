import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        boolean swap;
        for (int i = 1; i < array.length; i++){
            swap = false;
            for (int j = 1; j < array.length; j++){
                if(array[j-1]>array[j]){
                    int tmp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                    swap=true;
                }
            }
            if(!swap) return array;
        }
        return array;

    }

    public static String[] bubbleSort(String[] array) {
        boolean swap;
        for (int i = 1; i < array.length; i++){
            swap = false;
            for (int j = 1; j < array.length; j++){
                if(array[j-1].compareToIgnoreCase(array[j])>0){
                    String tmp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                    swap=true;
                }
            }
            if(!swap) return array;
        }
        return array;

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        boolean swap;
        for (int i = 1; i < list.size(); i++){
            swap = false;
            for (int j = 1; j < list.size(); j++){
                if(list.get(j-1)>list.get(j)){
                    int tmp = list.get(j);
                    list.set(j, list.get(j-1));
                    list.set(j-1, tmp);
                    swap=true;
                }
            }
            if(!swap) return list;
        }
        return list;

    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i+1; j < array.length; j++){
                if(array[j]<array[min]) min = j;
            }
            int tmp = array[min];
            array[min]=array[i];
            array[i]=tmp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i+1; j < array.length; j++){
                if(array[j].compareToIgnoreCase(array[min])<0) min = j;
            }
            String tmp = array[min];
            array[min]=array[i];
            array[i]=tmp;
        }
        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++){
            int min = i;
            for (int j = i+1; j < list.size(); j++){
                if(list.get(j).compareToIgnoreCase(list.get(min))<0) min = j;
            }
            String tmp = list.get(min);
            list.set(min, list.get(i));
            list.set(i, tmp);
        }
        return list;

    }

}
