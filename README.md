 # Sudoku-Solver in Java
 
 
 <p align="center">
<img src="https://img.shields.io/badge/Aarti Mattoo-pink">
<img src="https://badges.frapsoft.com/os/v1/open-source.svg?v=103">
<img src="https://img.shields.io/badge/Contributions-Welcome-brightgreen">
 </p>
 
 
 
<h3> TABLE OF CONTENTS </h3>
<ol type="I">
    <li><a href="#intro"> Introduction  </a></li>
    <li><a href="#rules"> Rules </a></li>
    <li><a href="#assump"> Data Structure </a></li>
    
   
  
  
 </ol> 
 
<h2 id="intro">Introduction</h2>
<p align="justify">
A problem involving the placing of numbers using logic is called sudoku. The goal of traditional Sudoku is to fill a 9 by 9 grid with numbers so that each column, row, and each of the nine 3 x 3 subgrids that make up the grid include all digits from 1 to 9.
 </p>
 
<p align="right">
  <img width="460" height="300" src="https://user-images.githubusercontent.com/116307514/218178730-a3c647e5-ed9b-4fd1-816d-332fbedeaff3.png">
</p>

<h2 id="rules">Constraints</h2>
<p align="justify">
 The difficulty comes from the constraints the player must adhere to in order to fill the grid. <br>
Rule 1: The digits 1 to 9 must appear exactly once in each row.  <br>
Rule 2: The numbers 1 to 9 must appear exactly once in each column. <br>
Rule 3: Each block can only have one instance of the digits <br>
 </p>


<h2 id="assump">Data Structures Used</h2>
<p align="justify">
 The soduko grid is represented using a two-dimensional array.The value 0 indicates a free cell whose value will be filled by the code.A 2D array is also known as a matrix (a table of rows and columns). To create a 2D array of integers, take a look at the following example: int matrix[2][3] = { {1, 4, 2}, {3, 6, 8} }; The first dimension represents the number of rows [2], while the second dimension represents the number of columns [3].
 </p>










