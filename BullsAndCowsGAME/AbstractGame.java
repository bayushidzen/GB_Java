package org.example.BullsAndCowsGAME;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class AbstractGame implements Game{
    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    @Override
    public void start(Integer sizeOfWord, Integer attempts) {
        this.sizeWord = sizeOfWord;
        this.attempts = attempts;
        word = generateWord(); // слово загаданное ПК
        this.gameStatus = GameStatus.START;
    }

    public AbstractGame(Integer sizeWord) {
        this.sizeWord = sizeWord;
    }

    @Override
    public void stop() {
        this.gameStatus = GameStatus.LOSE;
    }

    @Override
    public void win() {
        this.gameStatus = GameStatus.WIN;
    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
        }
        return new Answer(value, cows, bulls);
    }
    @Override
    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    @Override
    public Integer getAttempts() {
        return attempts;
    }


    private String generateWord(){
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWord = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWord = resWord.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWord;
    }
    abstract List<String> generateCharList();
}
