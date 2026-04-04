/*
You are working as a junior developer for an education-tech company. The company provides digital tools for teachers to analyze students' test scores. A teacher enters the test scores of students into a grid (2D array), where each row represents a student and each column represents a test.

Your task is to write a Java program that helps the teacher quickly calculate:

The sum of all even test scores.

The sum of all odd test scores.

This helps the teacher understand score patterns more easily for planning further practice sessions.
*/

import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private int testScore;

    public Student(int  id, String name, int testScore){
      this.id = id;
      this.name = name;
      this.testScore = testScore;
    }

 }
class Ques1{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of student : ");
    int row = sc.nextInt();
    
    if(row <= 0){
      System.out.println("Input is invalid!");
    }
    
    System.out.print("Enter test give by student : ");
    int col = sc.nextInt();
    
    if(col <= 0){
      System.out.println("Input is invalid!");
    }
     
     int[][] student = new int[row][col];

     for(int i=0; i<row; i++){
      System.out.println("Student  : "+i); 
       for(int j=0; j<col; j++){
        System.out.print("Enter the test "+j+"  score : ");
         student[i][j] = sc.nextInt();
       } 
     
     }
      

     for(int i=0; i<row; i++){
       int evenSum = 0;
       int oddSum = 0;
        for(int j=0; j<col; j++){
          int num = student[i][j];
          System.out.print("TestScore "+j+" : "+student[i][j]+" ");
          if(num % 2 == 0){
              evenSum += num;
           }else{
             oddSum += num;
          }

        }
        System.out.println();
        System.out.print("Even Sum : "+evenSum );
        System.out.print(" OddSum : "+oddSum);
        System.out.println();
     }
   }
}
