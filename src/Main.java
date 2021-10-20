import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        new LinearSearch();

//
        int userLastNum;
        int attempt =0;
        // -------  USER INITIAL DISPLAY --------
        String input1= " WELCOME++++++++ \nPlease choose the sort number you " +
                "want to perform" +
                "\n 1. Selection Sort \n 2. Insertion Sort\n3. Bubble Sort \n4. Merge Sort\n 5. Linear Search";
//
        System.out.println(input1);
        // -------  STORE USER SELECTION --------
        int userInput = sc.nextInt();
        // ------- DISPLAY USER SELECTION --------
        // -------  USE SWITCH TO DETERMINE THE TYPE OF SORT TO PERFORM --------
        switch(userInput) {
            case 1:
                // ------- ASK USER TO ENTER THE LAST ELEMENT IN THE LIST AND RECORD IT --------
                System.out.println("Great! You want to perform SELECTION SORT");
                System.out.println("How many elements do you want to sort? Just tell me the total number");
                userLastNum = sc.nextInt();
                // ------- DISPLAY INSTRUCTION TO THE USER  --------
                System.out.println("Now enter all the elements on which you want to perform SELECTION SORT");
                // ------- LOOP OVER USER ENTRY  --------

                int [] arr1 = new int[userLastNum];
                for(int k=0;k<userLastNum;k++){
                    arr1[k] = sc.nextInt();
                }
                System.out.print ("You typed \n ");
                for(int i:arr1){
                    System.out.print(i+" ");
                }
                System.out.println();
                SelectionSort selesort = new SelectionSort();
                selesort.selectionSort(arr1);
                System.out.println("The sorted element performed by selection sort are");
                for(int i:arr1){
                    System.out.print(i+" ");
                }
                // ------- END OF SELECTION SORT  --------
                break;
            case 2:
                // ------- ASK USER TO ENTER THE LAST ELEMENT IN THE LIST AND RECORD IT --------
                System.out.println("Great! You want to perform INSERTION SORT");
                System.out.println("How many elements do you want to sort? Give me the figure");
                userLastNum = sc.nextInt();
                // ------- DISPLAY INSTRUCTION TO THE USER  --------
                System.out.println("Now enter all the elements on which you want to perform INSERTION SORT");
                // ------- LOOP OVER USER ENTRY  --------

                int [] arr2 = new int[userLastNum];
                for(int k=0;k<userLastNum;k++){
                    arr2[k] = sc.nextInt();
                }
                System.out.print ("You typed \n ");
                for(int i:arr2){
                    System.out.print(i+" ");
                }
                System.out.println();
                InsertionSort inSort  = new InsertionSort();
                inSort.insertionSort(arr2);
                System.out.println("The sorted element performed by insertion sort are");
                for(int i:arr2){
                    System.out.print(i+" ");
                }
                // ------- END OF INSERTION SORT  --------
                break;
            case 3:
                // ------- ASK USER TO ENTER THE LAST ELEMENT IN THE LIST AND RECORD IT --------
                System.out.println("Great! You want to perform BUBBLING SORT");
                System.out.println("How many elements do you want to sort? Just tell me the total number");
                userLastNum = sc.nextInt();
                // ------- DISPLAY INSTRUCTION TO THE USER  --------
                System.out.println("Now enter all the elements on which you want to perform BUBBLING SORT");
                // ------- LOOP OVER USER ENTRY  --------

                int [] arr3 = new int[userLastNum];
                for(int k=0;k<userLastNum;k++){
                    arr3[k] = sc.nextInt();
                }
                System.out.print ("You typed \n ");
                for(int i:arr3){
                    System.out.print(i+" ");
                }
                System.out.println();
                BubbleSort bubSort = new BubbleSort();
                bubSort.bubbleSort(arr3);
                System.out.println("The sorted element performed by bubble sort are");
                for(int i:arr3){
                    System.out.print(i+" ");
                }
                // ------- END OF BUBBLE SORT  --------
                break;
            case 4:
                // ------- ASK USER TO ENTER THE LAST ELEMENT IN THE LIST AND RECORD IT --------
                System.out.println("Great! You want to perform MERGE SORT");
                System.out.println("How many elements do you want to sort? Just tell me the total number");
                userLastNum = sc.nextInt();
                // ------- DISPLAY INSTRUCTION TO THE USER  --------
                System.out.println("Now enter all the elements on which you want to perform MERGE SORT");
                // ------- LOOP OVER USER ENTRY  --------

                int [] arr4 = new int[userLastNum];
                for(int k=0;k<userLastNum;k++){
                    arr4[k] = sc.nextInt();
                }
                System.out.print ("You typed \n ");
                for(int i:arr4){
                    System.out.print(i+" ");
                }
                System.out.println();
                MergeSort merge = new MergeSort();
                merge.sortSet(arr4,0,arr4.length-1);
                System.out.println("The sorted element performed by merge sort are");
                for(int i:arr4){
                    System.out.print(i+" ");
                }
                // ------- END OF MERGE SORT  --------
                break;

                // ------- Linear search  --------
            case 5:
                // ------- ASK USER TO ENTER THE LAST ELEMENT IN THE LIST AND RECORD IT --------
                System.out.println("Great! You want to perform LINEAR SORT");
                System.out.println("Tell me the total number in the list you want to search");
                    int userChoice= sc.nextInt();

                System.out.println("Enter the "+userChoice+" numbers you want");


                int [] arr5 = new int[userChoice];
                for(int k=0;k<userChoice;k++){
                    arr5[k] = sc.nextInt();
                }
                System.out.print ("You typed \n ");
                for(int i:arr5){
                    System.out.print(i+" ");
                }
                System.out.println();
                System.out.println("Now what number do you want to search?");
                int userKey = sc.nextInt();
               LinearSearch search = new LinearSearch();
                search.linearSearch(arr5,userKey);
                System.out.println("The value "+userKey+" is found");




            default:
                // -------DEFAULT MESSAGE --------










    }
}}
