package com.mycompany.gamedemo;

import java.util.ArrayList;
import javafx.scene.image.WritableImage;

/**
 *
 * @author sfolineo
 */
public class Map {
    
    int x = 0;
    int y = 0;
    Level level;
    WritableImage writableimage;
    
    public Map(Level level, WritableImage writableimage) {
        this.level = level;
        this.writableimage = writableimage;
    }
    
    public void drawMap() {
        
    }
    
    public void scrollMap(String direction) {
        switch (direction) {
            case "up": {
                
                break;
            }
            case "down": {
                
                break;
            }
            case "left": {
                
                break;
            }
            case "right": {
                
                break;
            }
            default: {
                
                break;
            }
        }
    }
}
