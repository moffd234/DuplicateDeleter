package com.zipcodewilmington.looplabs;

/** 
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] output = new Integer[0];
        // Iterate over the initial array
        for (Integer integer : array) {
            int count = 0;
            // Count how many times the integer at array[i] occurs
            for (Integer value : array) {
                if (integer.equals(value)) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                output = insertedInt(output, integer, output.length);
            }
        }
        return output;
    }

    public Integer[] insertedInt (Integer[] array, Integer insert, int index) {
        // Create a new array with one additional element
        Integer[] newArray = new Integer[array.length + 1];

        // Copy elements from the old array to the new array, inserting the new element at the specified index
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = insert;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] output = new Integer[0];
        // Iterate over the initial array
        for (Integer integer : array) {
            int count = 0;
            // Count how many times the integer at array[i] occurs
            for (Integer value : array) {
                if (integer.equals(value)) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                output = insertedInt(output, integer, output.length);
            }
        }
        return output;
    }
}
