package program;

import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    BufferedImage image;
    double x;
    double y;
    public Player(){
        image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        x = 300;
        y= 300;
    }
    public void render(Graphics g){
        g.drawImage(image,(int)x,(int)y,null);
    }
    public void run(){
        // player run
        double playerspeed = 5;
        double vx = 0;
        double vy = 0;
        if(GameWindow.isUpPress){
            vy-= playerspeed;
        }
        if(GameWindow.isRightPress){
            vx+= playerspeed;
        }
        if(GameWindow.isDownPress){
            vy+= playerspeed;
        }
        if(GameWindow.isLeftPress){
            vx-= playerspeed;
        }
        // TODO: RECALCULATE
        if(vx != 0 && vy != 0){
            double v = playerspeed / Math.sqrt(2);
            vx = Math.signum(vx)*v;  // 1*5*sqrt(2)
            vy = Math.signum(vy)*v;  // -1*5*sqrt(2)
        }
        x += vx;
        y += vy;
        x = Mathx.clamp(x,0,384-32);  // tru 32 la chieu ngang cua player (anh dua con gai)
        y = Mathx.clamp(y,0,600-48);  // tru 48 la  chieu cao ....


    }
}

