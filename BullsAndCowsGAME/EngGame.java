package org.example.BullsAndCowsGAME;

import java.util.ArrayList;
import java.util.List;

public class EngGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            charList.add(String.valueOf((char)i));
        }
        return charList;
    }

    @Override
    public Integer getSizeOfWord() {
        return sizeWord;
    }
}
