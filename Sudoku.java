import java.util.Scanner;
public class Sudoku{
  
  public static void main(String[] args){
    int[][]grid=readAPuzzle();
    
    if(!isValid(grid)){
      System.out.println("Invalid input");
    }
    else if(search(grid)){
      System.out.println("The solution is found");
      printGrid(grid);
    }
    else{
      System.out.println("No solution");
    }
  }
    
  
    //Reading a puzzle from input
    
      
    
