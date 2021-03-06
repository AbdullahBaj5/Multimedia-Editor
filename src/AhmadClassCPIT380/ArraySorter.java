package AhmadClassCPIT380;


/**
 * Class ArraySorter has an array and can do
 * different sorts on it
 * @author Barb Ericson
 */
public class ArraySorter
{
  /// fields ////////////
  
  /** the array to sort */
  private int[] a;
  
  /**
   * Constructor that takes the array to sort
   * @param theArray the array to sort
   */
  public ArraySorter(int[] theArray)
  {
    a = theArray;
  }
  
  /**
   * Get the last valid index in a
   */
  private int getLastIndex()
  {
    return (a.length - 1);
  }
  
  /**
   * Method to swap the values at two indices
   * in the array
   * @param i an index in the array
   * @param j another index in the array
   * i may be equal to j
   */
  private void swap(int i, int j)
  {
    if (i != j)
    {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }
  
  /**
   * Method to do a selection sort on the array
   */
  public void selectionSort()
  {
    int maxCompare = a.length - 1;
    int smallestIndex = 0;
    int numSteps = 0;
    
    // loop from 0 to one before last item
    for (int i = 0; i < maxCompare; i++)
    {
      // set smallest index to the one at i
      smallestIndex = i;
      numSteps = 0;
      
      // loop from i+1 to end of the array
      for (int j = i + 1; j < a.length; j++)
      {
        numSteps++;
        if (a[j] < a[smallestIndex])
        {
          smallestIndex = j;
        }
      }
      System.out.println("#steps:"+numSteps);
      
      // swap the one at i with the one at smallest index
      swap(i,smallestIndex);
      this.printArray("after loop body when i = " + i);
    }
  }
  
  /**
   * Method to print out the array elements
   * @param message the message to print first
   */
  private void printArray(String message)
  {
    System.out.println(message);
    for (int i : a)
      System.out.print(i + " ");
    System.out.println();
  }
    
  /**
   * Method to test selection sort
   */
  public static void testSelectionSort()
  {
    int[] testArray = {23, 14, 1, 89, 68, 32, 6};
    
    ArraySorter sorter = new ArraySorter(testArray);
    sorter.printArray("Before selection sort");
    sorter.selectionSort();
    sorter.printArray("After selection sort");
    
  } 
  
  /**
   * Method to do an insertion sort on the array
   */
  public void insertionSort()
  {
    int temp = 0;
    int pos = 0;
    
    // loop from second element on 
    for (int i = 1; i < a.length; i++)
    {
      // save current value at i and set position to i
      temp = a[i];
      pos = i;
      
      // shift right any larger elements
      while (0 < pos && temp < a[pos - 1])
      {
        a[pos] = a[pos - 1];
        pos--;
      }
      a[pos] = temp;
      this.printArray("after loop body when i = " + i);
    }
  }
  
  /**
   * Method to test insertion sort
   */
  public static void testInsertionSort()
  {
    int[] testArray = {23, 14, 1, 89, 68, 32, 6};
    
    ArraySorter sorter = new ArraySorter(testArray);
    sorter.printArray("Before insertion sort");
    sorter.insertionSort();
    sorter.printArray("After insertion sort");
    
  } 
  
  /**
   * Method to do a merge sort of the array
   */
  public void mergeSort()
  {
    // check if there is only 1 element return
    if (a.length == 1) return;
    
    // otherwise create two new arrays
    int[] left = new int[a.length / 2];
    for (int i = 0; i < left.length; i++)
      left[i] = a[i];
    int[] right = new int[a.length - left.length];
    for (int i = left.length, j=0; 
         i < a.length; i++, j++)
      right[j] = a[i];
    
    // create new ArraySorter objects
    ArraySorter sorter1 = new ArraySorter(left);
    sorter1.printArray("sorter1");
    ArraySorter sorter2 = new ArraySorter(right);
    sorter2.printArray("sorter2");
    
    // do the recursive call with the new sorters
    sorter1.mergeSort();
    sorter2.mergeSort();
    
    // merge the resulting arrays
    merge(left,right);
    this.printArray("After merge");
  }
  
  /**
   * Method to merge two sorted arrays
   * back into this object's array
   * @param left sorted left array
   * @param right the sorted right array
   */
  private void merge(int[] left, int[] right)
  {
    int leftIndex = 0; // current left index
    int rightIndex = 0; // current right index
    int i = 0; // current index in a
    
    // merge the left and right arrays into a
    while (leftIndex < left.length &&
           rightIndex < right.length)
    {
      if (left[leftIndex] < right[rightIndex])
      {
        a[i] = left[leftIndex];
        leftIndex++;
      }
      else
      {
        a[i] = right[rightIndex];
        rightIndex++;
      }
      i++;
    }
    
    // copy any remaining in left
    for (int j = leftIndex; j < left.length; j++)
    {
      a[i] = left[j];
      i++;
    }
    
    // copy any remaining in right
    for (int j = rightIndex; j < right.length; j++)
    {
      a[i] = right[j];
      i++;
    }
  }
  
  public static void testMergeSort()
  {
    int[] testArray = {23, 14, 1, 89, 68, 32, 6};
    
    ArraySorter sorter = new ArraySorter(testArray);
    sorter.printArray("Before merge sort");
    sorter.mergeSort();
    sorter.printArray("After merge sort");
  }
   
  public static void main(String[] args)
  {
    testSelectionSort();
    //testInsertionSort();
    //testMergeSort();
  }
}