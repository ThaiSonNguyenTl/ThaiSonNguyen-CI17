package program;

import tklibs.Mathx;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
//    BufferedImage backgroundImage;
//    int playerX;
//    int playerY;
//    int backgroundX;
//    int backgroundY;
    Background background;
    BufferedImage playerImage;
    Player player;





    public GamePanel(){
        //ham tao
//        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
//        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
//        playerX = 300;
//        playerY = 300;

        // dat vi tri khoi tao cho background
//        backgroundX = 0;
//        backgroundY = 600 -3109;
        background = new Background();
        player = new Player();   //image ,x ,y

    }

    // override ham paint


    @Override
    public void paint(Graphics g) {
//        g.drawImage(backgroundImage,backgroundX,backgroundY,null);
//        g.drawImage(playerImage,playerX,playerY,null);
        background.render(g);
        player.render(g);

    }


    public void runAll(){
//        // cho background chay
//        backgroundY +=10 ;
//        // gioi han di chuyen background
//        if(backgroundY >= 0){
//            backgroundY = 0;
//        }
        // player run
//        double playerspeed = 5;
//        double vx = 0;
//        double vy = 0;
//        if(GameWindow.isUpPress){
//            vy-= playerspeed;
//        }
//        if(GameWindow.isRightPress){
//            vx+= playerspeed;
//        }
//        if(GameWindow.isDownPress){
//            vy+= playerspeed;
//        }
//        if(GameWindow.isLeftPress){
//            vx-= playerspeed;
//        }
//        // TODO: RECALCULATE
//        if(vx != 0 && vy != 0){
//            double v = playerspeed / Math.sqrt(2);
//            vx = Math.signum(vx)*v;  // 1*5*sqrt(2)
//            vy = Math.signum(vy)*v;  // -1*5*sqrt(2)
//        }
//        playerX += vx;
//        playerY += vy;
//        playerX = Mathx.clamp(playerX,0,384-32);  // tru 32 la chieu ngang cua player (anh dua con gai)
//        playerY = Mathx.clamp(playerY,0,600-48);  // tru 48 la  chieu cao ....
//
//
        player.run();
        background.run();

  }

    public void gameloop(){
        long lastTime = 0;
        while (true){
            long currentTime = System.currentTimeMillis();
            if(currentTime-lastTime >= 1000/60){

                this.repaint(); // render anh
                this.runAll(); // chay logic
                lastTime = currentTime;
            }

        }
     }

 }
