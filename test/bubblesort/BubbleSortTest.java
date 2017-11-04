/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sans
 */
public class BubbleSortTest {
    private BubbleSort testClass;
    public BubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testClass = new BubbleSort();
    }
    
    @After
    public void tearDown() {
    }

    
    
    @Test
    public void bubbleSortEx1TestSuccess() {
        int[] numbers = new int[] { 96,  32,  50 , 58  ,38 , 43,  99,  72 , 61 , 66 , 16 , 63 , 77  ,52  ,20  ,23  ,70 , 74 , 59 , 76  ,33  ,37  ,98 , 1  ,4  ,45,  93,  55,  67,  24,  97 , 56 , 95 , 22,  82 , 11 , 81 , 48 , 21 , 94 , 90 , 30 , 3 , 46,  15 , 54 , 34 , 87,  92 , 65 , 13  ,84  ,86 , 51,  28,  60,  7 , 12 , 6 , 89,  5,  2,  69 , 10 , 47 , 14 , 19 , 71 , 80 , 40 , 18 , 26 , 85 , 31 , 53 , 62,  78,  41 , 17 , 83 , 9 , 29 , 42,  25  ,64 , 49 , 73 , 35,  39,  91,  68,  79,  75,  36 , 44,  8 , 88 , 100 , 57 , 27 };
        testClass.bubbleSort(numbers);

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 }, numbers);
    }
    
     @Test
    public void bubbleSortEx2TestSuccess() {
        int[] numbers = new int[] { 8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5 };
        testClass.bubbleSort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }, numbers);
    }
    @Test
    public void bubbleSortEx3TestSuccess() {
        int[] numbers = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        testClass.bubbleSort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, numbers);
    }
}

