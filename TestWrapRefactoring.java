
package org.apache.commons.text;

public class TestWrapRefactoring {
    public static void main(String[] args) {
        System.out.println("Testing WordUtils wrap function refactoring...");

        // Test case 1: Basic wrap
        String input1 = "Here is one line of text that is going to be wrapped after 20 columns.";
        String expected1 = "Here is one line of\ntext that is going\nto be wrapped after\n20 columns.";
        String actual1 = WordUtils.wrap(input1, 20, "\n", false);
        System.out.println("Test 1 - Basic wrap: " + (expected1.equals(actual1) ? "PASS" : "FAIL"));
        if (!expected1.equals(actual1)) {
            System.out.println("  Expected: " + expected1);
            System.out.println("  Actual:   " + actual1);
        }

        // Test case 2: Wrap long words
        String input2 = "Click here to jump to the commons website - https://commons.apache.org";
        String expected2 = "Click here to jump\nto the commons\nwebsite -\nhttps://commons.apach\ne.org";
        String actual2 = WordUtils.wrap(input2, 20, "\n", true);
        System.out.println("Test 2 - Wrap long words: " + (expected2.equals(actual2) ? "PASS" : "FAIL"));
        if (!expected2.equals(actual2)) {
            System.out.println("  Expected: " + expected2);
            System.out.println("  Actual:   " + actual2);
        }

        // Test case 3: Custom wrap on character
        String input3 = "flammable/inflammable";
        String expected3 = "flammable\ninflammable";
        String actual3 = WordUtils.wrap(input3, 2, "\n", false, "/");
        System.out.println("Test 3 - Custom wrap character: " + (expected3.equals(actual3) ? "PASS" : "FAIL"));
        if (!expected3.equals(actual3)) {
            System.out.println("  Expected: " + expected3);
            System.out.println("  Actual:   " + actual3);
        }

        System.out.println("All tests complete!");
    }
}
