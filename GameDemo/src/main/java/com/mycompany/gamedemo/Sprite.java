package com.mycompany.gamedemo;

import java.util.ArrayList;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;

/**
 *
 * @author sfolineo
 */
public class Sprite {
    private final String[] data;
    public PixelWriter pixelwriter;   

    // Class constructor
    public Sprite(String name, WritableImage writableImage) {
        this.pixelwriter = writableImage.getPixelWriter();
        this.data = selectData(name);
    }
    
    private String[] selectData(String name) {
        switch (name) {
            case "smiley": {
                String[] data = {
                    "0","3","3","3","0",
                    "3","1","3","1","3",
                    "3","3","3","3","3",
                    "3","1","1","1","3",  
                    "0","3","3","3","0"};
                return data;
            }
            case "smileyHD": {
                String[] data = {
                    "0","0","2","2","2","2","2","2","0","0",
                    "0","2","2","2","2","2","2","2","2","0",
                    "0","2","1","1","2","2","1","1","2","0",
                    "2","2","1","1","2","2","1","1","2","2",
                    "2","2","2","2","2","2","2","2","2","2",
                    "2","2","1","2","2","2","2","1","2","2",
                    "2","2","1","2","2","2","2","1","2","2",
                    "0","2","2","1","1","1","1","2","2","0",
                    "0","2","2","2","2","2","2","2","2","0",
                    "0","0","2","2","2","2","2","2","0","0"};
                return data;
            }
            case "smileyPixel": {
                String[] data = {
                    "0","0","0","0","0","0","0","2","2","2","2","2","2","2","2","2","2","2","0","0","0","0","0","0","0",
                    "0","0","0","0","0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0","0","0","0","0",
                    "0","0","0","0","0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0","0","0","0","0",
                    "0","0","0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0","0","0",
                    "0","0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0","0",
                    "0","0","2","2","2","1","1","1","1","2","2","2","2","2","2","2","1","1","1","1","2","2","2","0","0",
                    "0","2","2","2","2","1","1","1","1","2","2","2","2","2","2","2","1","1","1","1","2","2","2","2","0",
                    "0","2","2","2","2","1","1","1","1","2","2","2","2","2","2","2","1","1","1","1","2","2","2","2","0",
                    "0","2","2","2","2","1","1","1","1","2","2","2","2","2","2","2","1","1","1","1","2","2","2","2","0",
                    "2","2","2","2","2","2","2","2","2","2","2","2","3","2","2","2","2","2","2","2","2","2","2","2","2",
                    "2","2","2","2","2","2","2","2","2","2","2","2","3","3","2","2","2","2","2","2","2","2","2","2","2",
                    "2","2","2","2","2","2","2","2","2","2","2","2","3","3","3","2","2","2","2","2","2","2","2","2","2",
                    "2","2","2","2","2","2","2","2","2","2","2","2","3","2","2","2","2","2","2","2","2","2","2","2","2",
                    "2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2",
                    "2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2",
                    "2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2",
                    "0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0",
                    "0","2","2","2","2","2","1","1","2","2","2","2","2","2","2","2","2","1","1","2","2","2","2","2","0",
                    "0","2","2","2","2","2","1","1","1","1","1","1","1","1","1","1","1","1","1","2","2","2","2","2","0",
                    "0","0","2","2","2","2","1","1","1","1","1","1","1","1","1","1","1","1","1","2","2","2","2","0","0",
                    "0","0","2","2","2","2","2","1","1","1","1","1","1","1","1","1","1","1","2","2","2","2","2","0","0",
                    "0","0","0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0","0","0",
                    "0","0","0","0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0","0","0","0",
                    "0","0","0","0","0","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","0","0","0","0","0",
                    "0","0","0","0","0","0","0","2","2","2","2","2","2","2","2","2","2","2","0","0","0","0","0","0","0"};
                return data;
            }
            default: return null;
        }
    } 
    
    public String[] getData() {
        return this.data;
    }
    
    public void bigEdit(String[] data, WritableImage writableimage) {
        if (data != null) {
            int scale = (int) (500/Math.round(java.lang.Math.sqrt(data.length)));
            //System.out.println(scale);
            for (int y = 0; y < 500; y = y + scale) {
                for (int x = 0; x < 500; x = x + scale) {
                    String value = data[(x/scale + (y/scale*500/scale))];
                    switch (value) {
                        case "0": break;
                        case "1": {
                            drawMaxPixel(x, y, Color.BLACK, scale);
                            break;
                        }
                        case "2": {
                            drawMaxPixel(x, y, Color.CHOCOLATE, scale);
                            break;
                        }
                        case "3": {
                            drawMaxPixel(x, y, Color.BURLYWOOD, scale);
                            break;
                        }
                        case "4": {
                            drawMaxPixel(x, y, Color.GREEN, scale);
                            break;
                        }
                        case "5": {
                            drawMaxPixel(x, y, Color.DARKGREEN, scale);
                            break;
                        }
                        case "8": {
                            drawMaxPixel(x, y, Color.RED, scale);
                            break;
                        }
                        case "9": {
                            drawMaxPixel(x, y, Color.YELLOW, scale);
                            break;
                        }
                        default: System.out.println("ERROR");
                    }
                }
            }
        }
    }
    
    public void drawSprite(int xCoord, int yCoord, String[] data, WritableImage writableimage) {
        if (data != null) {
            if (data.length == 25) {
                for (int y = yCoord; y < yCoord + 50; y = y + 10) {
                    for (int x = xCoord; x < xCoord + 50; x = x + 10) {
                        String value = data[((x - xCoord)/10) + ((y - yCoord)/10)*5];
                        switch (value) {
                            case "0": break;
                            case "1": {
                                drawBigPixel(x, y, Color.BLACK);
                                break;
                            }
                            case "2": {
                                drawBigPixel(x, y, Color.CHOCOLATE);
                                break;
                            }
                            case "3": {
                                drawBigPixel(x, y, Color.BURLYWOOD);
                                break;
                            }
                            case "4": {
                                drawBigPixel(x, y, Color.GREEN);
                                break;
                            }
                            case "5": {
                                drawBigPixel(x, y, Color.DARKGREEN);
                                break;
                            }
                            case "8": {
                                drawBigPixel(x, y, Color.RED);
                                break;
                            }
                            case "9": {
                                drawBigPixel(x, y, Color.YELLOW);
                                break;
                            }
                            default: System.out.println("ERROR");
                        }
                    }
                }
            } else if (data.length == 100) {
                for (int y = yCoord; y < yCoord + 50; y = y + 5) {
                    for (int x = xCoord; x < xCoord + 50; x = x + 5) {
                        String value = data[((x - xCoord)/5) + ((y - yCoord)/5)*10];
                        switch (value) {
                            case "0": break;
                            case "1": {
                                drawSmallPixel(x, y, Color.BLACK);
                                break;
                            }
                            case "2": {
                                drawSmallPixel(x, y, Color.CHOCOLATE);
                                break;
                            }
                            case "3": {
                                drawSmallPixel(x, y, Color.BURLYWOOD);
                                break;
                            }
                            case "4": {
                                drawSmallPixel(x, y, Color.GREEN);
                                break;
                            }
                            case "5": {
                                drawSmallPixel(x, y, Color.DARKGREEN);
                                break;
                            }
                            case "8": {
                                drawSmallPixel(x, y, Color.RED);
                                break;
                            }
                            case "9": {
                                drawSmallPixel(x, y, Color.YELLOW);
                                break;
                            }
                            default: System.out.println("ERROR");
                        }
                    }
                }
            } else if (data.length == 625) {
                for (int y = yCoord; y < yCoord + 25; y++) {
                    for (int x = xCoord; x < xCoord + 25; x++) {
                        String value = data[(x - xCoord + (y - yCoord)*25)];
                        switch (value) {
                            case "0": break;
                            case "1": {
                                pixelwriter.setColor(x, y, Color.BLACK);
                                break;
                            }
                            case "2": {
                                pixelwriter.setColor(x, y, Color.CHOCOLATE);
                                break;
                            }
                            case "3": {
                                pixelwriter.setColor(x, y, Color.BURLYWOOD);
                                break;
                            }
                            case "4": {
                                pixelwriter.setColor(x, y, Color.GREEN);
                                break;
                            }
                            case "5": {
                                pixelwriter.setColor(x, y, Color.DARKGREEN);
                                break;
                            }
                            case "8": {
                                pixelwriter.setColor(x, y, Color.RED);
                                break;
                            }
                            case "9": {
                                pixelwriter.setColor(x, y, Color.YELLOW);
                                break;
                            }
                            default: System.out.println("ERROR");
                        }
                    }
                }
            } else {
                System.out.println("Incorrect data length!");
            }
        }
    } 
    
    private void drawSmallPixel(int axe, int why, Color color) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                pixelwriter.setColor(x + axe,y + why,color);
            }
        }
    }
    private void drawBigPixel(int axe, int why, Color color) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                pixelwriter.setColor(x + axe,y + why,color);
            }
        }
    }
    private void drawMaxPixel(int axe, int why, Color color, int scale) {
        for (int y = 0; y < scale; y++) {
            for (int x = 0; x < scale; x++) {
                pixelwriter.setColor(x + axe,y + why,color);
            }
        }
    }
}
