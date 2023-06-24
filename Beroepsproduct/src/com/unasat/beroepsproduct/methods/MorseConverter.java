package com.unasat.beroepsproduct.methods;

import com.unasat.beroepsproduct.interfaces.IMorseConverter;

public class MorseConverter implements IMorseConverter {
    /**
    Define an array of Morse code symbols for each letter and digit
     */
    private static final String[] MORSE_CODE = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "...-..", "--...", "---..", "----."
    };

    /**
    Define an array of characters representing the alphabet and digits
     * */
    private static final char[] ALPHABET = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    // Implementation of the morseToText method from the IMorseConverter interface
    public String morseToText(String morse) {
        StringBuilder sb = new StringBuilder();  // Initialize a new StringBuilder object
        String[] words = morse.split(" / ");  // Split the input Morse code into individual words
        for (String word : words) {
            String[] letters = word.split(" ");  // Split each word into individual letters
            for (String letter : letters) {
                for (int i = 0; i < MORSE_CODE.length; i++) {  // Loop through each Morse code symbol
                    if (letter.equals(MORSE_CODE[i])) {  // If the current symbol matches the current letter
                        sb.append(ALPHABET[i]);  // Append the corresponding letter to the StringBuilder
                        break;
                    }
                }
            }
            sb.append(" ");  // Append a space between each word
        }
        return sb.toString().trim();  // Convert the StringBuilder to a String and trim any leading/trailing spaces
    }

    // Implementation of the textToMorse method from the IMorseConverter interface
    public String textToMorse(String text) {
        StringBuilder sb = new StringBuilder();  // Initialize a new StringBuilder object
        for (char c : text.toUpperCase().toCharArray()) {  // Convert the input text to uppercase and loop through each character
            for (int i = 0; i < ALPHABET.length; i++) {  // Loop through each letter in the alphabet/digits array
                if (c == ALPHABET[i]) {  // If the current character matches the current letter
                    sb.append(MORSE_CODE[i]).append(" ");  // Append the corresponding Morse code symbol to the StringBuilder
                    break;
                }
            }
        }
        return sb.toString().trim();  // Convert the StringBuilder to a String and trim any leading/trailing spaces
    }
}
