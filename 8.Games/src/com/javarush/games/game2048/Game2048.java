package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import java.util.Arrays;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                // setCellColor(i, j, Color.PURPLE);
                setCellColoredNumber(i, j, gameField[j][i]);
            }
        }

    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        if (gameField[x][y] == 0) {
            int n = getRandomNumber(10);
            gameField[x][y] = n < 9 ? 2 : 4;
        } else createNewNumber();
    }

    private void setCellColoredNumber(int x, int y, int value) {
        setCellValueEx(x, y, getColorByValue(value), value == 0 ? "" : value + "");
    }

    private Color getColorByValue(int value) {
        if (value == 0) {
            return Color.SALMON;
        } else if (value == 2) {
            return Color.SNOW;
        } else if (value == 4) {
            return Color.LIGHTCORAL;
        } else if (value == 8) {
            return Color.PALEGOLDENROD;
        } else if (value == 16) {
            return Color.POWDERBLUE;
        } else if (value == 32) {
            return Color.PALETURQUOISE;
        } else if (value == 64) {
            return Color.PLUM;
        } else if (value == 128) {
            return Color.NAVAJOWHITE;
        } else if (value == 256) {
            return Color.TAN;
        } else if (value == 512) {
            return Color.ALICEBLUE;
        } else if (value == 1024) {
            return Color.OLDLACE;
        } else if (value == 2048) {
            return Color.LEMONCHIFFON;
        } else {
            return Color.NONE;
        }

    }

    private boolean compressRow(int[] row) {
        boolean answer = false;
        int j = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) {
                if (i != j) {
                    row[j] = row[i];
                    row[i]=0;
                    answer = true;
                }
                j++;
            }
        }
       return  answer;
    }

}

