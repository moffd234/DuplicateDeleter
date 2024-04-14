package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] output = new String[0];
        // Iterate over the initial array
        for(int i = 0; i < array.length; i++){
            int count = 0;
            // Count how many times the integer at array[i] occurs
            for(int j = 0; j < array.length; j++){
                if(array[i].equals(array[j])){
                    count ++;
                }
            }
            if(count < maxNumberOfDuplications){
                output = insertedString(output, array[i], output.length);
            }
        }
        return output;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new String[0];
    }
    public String[] insertedString (String[] array, String insert, int index) {
        // Create a new array with one additional element
        String[] newArray = new String[array.length + 1];

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
}
