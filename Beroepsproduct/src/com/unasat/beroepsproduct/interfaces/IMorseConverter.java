package com.unasat.beroepsproduct.interfaces;

public interface IMorseConverter {
    // This interface defines two methods for converting between Morse code and plain text:
    // morseToText: takes a String argument representing a message in Morse code, and returns a String representing the same message in plain text.
    String morseToText(String morseCode);
    // textToMorse: takes a String argument representing a message in plain text, and returns a String representing the same message in Morse code.
    String textToMorse(String text);
}
