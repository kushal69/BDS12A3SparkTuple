package com

object TupleOperation {
  def main(args : Array[String]){
    // Declaring the array List
    var argList = List[(Int, String)]();
    
    // Populating the list
    argList = argList :+ (1, "alpha");
    argList = argList :+ (2, "beta");
    argList = argList :+ (3, "gamma");
    argList = argList :+ (4, "zeta");
    argList = argList :+ (5, "omega");
    
    // Loop to check if the string length is 4
    println("List of numbers where the string length is 4 :");
    for(value <- argList if value._2.length() == 4){
      println(value._1);
    }
    
    var count = 0;
    var sum = 0;
    
    for(avgValue <- argList if(avgValue._2.indexOf("m") != -1 || 
        avgValue._2.indexOf("z") != -1)) {
        count = count + 1;
        sum = sum + avgValue._1;
    }
    
    println("Average value of Sum of all the integers where string contains m/z is : " 
        + (sum/count));
  }
}