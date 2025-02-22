/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    Set<Integer> setC = new TreeSet<>(setA); //creats a new treeSet with all the elemts from setA

    setC.addAll(setB); //adds the elements of setB to setC

    Set<Integer> similar = new TreeSet<>(setA); //creats a new set called similar to store the simialr elments

    similar.retainAll(setB); //adds all the common elements into similar

    setC.removeAll(similar); // removes all the similar elemtns from setC leaving only the elements that are different from both setA and setB

    return setC;  
    
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    List<Integer> remove = new ArrayList<>(); //creates a new array list to hold the even keys

   //for loop that goes through the keys in teh tree and checks for the even ones and adds them to the remove arrayList
   for (Integer key : treeMap.keySet()) {
    if (key % 2 == 0) {
        remove.add(key);
    }
  }
    //for loop that works on the removal of the elements inside the remove arrayList which are the even keys
    for (int i = 0; i < remove.size(); i++) {
      treeMap.remove(remove.get(i));
  }

    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE
    return tree1.equals(tree2); //uses the .equal() method to check if the trees are equal

  }

} // end treeProblems class
