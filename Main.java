
package javaapplication21;

import java.util.Random;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		HashTableChaining hb = new HashTableChaining(10);
        Random rand = new Random();
        
        // Insert 20 random integer keys and values
        for (int i = 0; i < 20; i++) {
            int key = rand.nextInt(100);
            String value = "Value" + key;
            hb.Insert(key, value);
        }
        
        // Display the hash table
        System.out.println("Initial Hash Table:");
        hb.Display();
        
        // Remove two entries by key
        hb.Remove(15);
        hb.Remove(9);
        
        // Display the hash table after removal
        System.out.println("\nHash Table after removal:");
        hb.Display();
        
        // Search for two keys and show the search result
        int[] searchKeys = {5, 10};
        for (int key : searchKeys) {
            Node result = hb.Search(key);
            if (result != null) {
                System.out.println("Key " + key + " found with value: " + result);
            } else {
                System.out.println("Key " + key + " not found.");
            }
	}

}}

