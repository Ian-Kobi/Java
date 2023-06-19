/*Created by Ian Kobi
CSC 210 W 4:00-6:45PM
Project 3
 */

public class SFMarathon {
    public static void main(String[] args){
        String[] studentNames = {"Stephanie","Caleb","Gavin","Simon","Martha","Cindy","Lola",
                "Terrel","Michael","Sara","Jared","Juan","Joseph"};
        int[] time2018 = {307,299,432,326,275,450,265,343,264,308,242,377,256};
        int[] time2019 = {299,307,328,283,274,359,256,343,269,308,249,340,240};

        fastestRunner(time2018,time2019,studentNames);

        System.out.println("\n"+"The list of students who improved their time from 2018 to 2019 are:");
        int[] newArray;
        newArray = compareTimes(time2019,time2018);
        for (int j = 0; j< newArray.length; j++){
            if (newArray[j]>0)
            System.out.println(studentNames[j]+": "+newArray[j]+" minutes");
        }
        int maxValues = 0;
        String name = "";
        for (int i=0; i<newArray.length;i++){
            if(newArray[i]>maxValues){
                maxValues = newArray[i];
                name = studentNames[i];
            }
        }
        System.out.println("\n"+name+ " is the most tenacious runner");
        System.out.println("\n"+"The average running time in 2018: "+meanTime(time2018)+" minutes");
        System.out.println("The average running time in 2019: "+meanTime(time2019)+" minutes");
        System.out.println("The median running time in 2018: "+median(time2018)+" minutes");
        System.out.println("The median running time in 2019: "+median(time2019)+" minutes");

    }

    public static void fastestRunner(int array[], int array2[], String array3[]){
        int[] arrCopy = new int[array.length];
        System.arraycopy(array, 0, arrCopy,0,array.length);
        int[] arrCopy2 = new int[array2.length];
        System.arraycopy(array2,0,arrCopy2,0,array2.length);
        String[] arrCopy3 = new String[array3.length];
        System.arraycopy(array3,0,arrCopy3,0,array3.length);
        String[] arrCopy4 = new String[array3.length];
        System.arraycopy(array3,0,arrCopy4,0,array3.length);

        swapFirst(arrCopy, arrCopy3);
        System.out.println("The three fastest runners in 2018 and their time in minutes are:");
        for (int k=0; k<3; k++){
            System.out.println(arrCopy3[k]+": "+arrCopy[k]);
        }

        swapFirst(arrCopy2, arrCopy4);
        System.out.println("\n"+"The three fastest runners in 2019 and their time in minutes are:");
        for (int k=0; k<3; k++){
            System.out.println(arrCopy4[k]+": "+arrCopy2[k]);
        }
    }

    public static void swapFirst(int[] arr, String[] arr2){
        for(int i =0; i <arr.length;i++){
            int min_idx = i;
            for(int j = i+1; j <arr.length; j++)
                if (arr[j]<arr[min_idx])
                    min_idx = j;
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;

                String temp2 = arr2[min_idx];
                arr2[min_idx]=arr2[i];
                arr2[i]=temp2;
        }

    }

    public static int [] compareTimes(int[]arr, int[]arr2){
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy,0,arr.length);
        int[] arrCopy2 = new int[arr2.length];
        System.arraycopy(arr2, 0, arrCopy2,0,arr2.length);
        int[] difference = new int[arr2.length];
        for (int i =0; i < arr2.length; i++)
            difference[i] = arrCopy2[i]-arrCopy[i];
        return difference;
    }

    public static int meanTime(int[] arr){
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy,0,arr.length);
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum+=arrCopy[i];
        }
        int mean = sum/arrCopy.length;
        return mean;
    }

    public static int median(int[] arr){
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr,0,arrCopy,0,arr.length);
        int i = (arrCopy.length-1)/2;
        int medio = arrCopy[i];
        return medio;
    }
}

