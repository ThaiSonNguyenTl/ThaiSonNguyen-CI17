package program;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    BufferedImage image;
    double x;
    double y;
    public Background(){
        image = SpriteUtils.loadImage("assets/images/background/0.png");
    }
    public void run() {
        // cho background chay
        y += 10;
//        // gioi han di chuyen background
        if (y >= 0) {
            y = 0;
        }
    }

    public void render(Graphics g){
            g.drawImage(image,(int) x,(int) y,null);

    }
}
