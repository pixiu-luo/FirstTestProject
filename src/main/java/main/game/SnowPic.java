package main.game;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

//public class SnowPic extends Applet implements Runnable {
/*
    Thread mainThread;
    Image offScreen, gAlc[];
    Random rand;
    int stopFlag, snows, wind, threadSleep, snowSize;
    int[] snowX, snowY;
    long stopTime = 0;
    Dimension dim;
    MediaTracker mt;

    public SnowPic() {
    }

    int getParameter(String s1, int s2) {
        String s = getParameter(s1);
        return (s != null) ? Integer.parseInt(s) : s2;
    }

    int getParameter(String s1, int s2, int max, int min) {
        String s = getParameter(s1);
        if (s != null) {
            if ((s2 = Integer.parseInt(s)) > max) return max;
            else if (s2 < min) return min;
            else return s2;

        } else return s2;
    }

    String getParameter(String s1, String s2) {
        String s = getParameter(s1);
        return (s != null) ? s : s2;
    }

    public void init() {
        rand = new Random();
        dim = getSize();
        offScreen = createImage(dim.width, dim.height);
        snows = getParameter("snows", 100, 500, 0);
        snowSize = getParameter("snowSize", 3, 10, 3);
        threadSleep = getParameter("threadSleep", 80, 1000, 10);
        snowX = new int[snows];
        snowY = new int[snows];
        for (int i = 0; i < snows; i++) {
            snowX = rand.nextInt() % (dim.width / 2) + dim.width / 2;
            snowY = rand.nextInt() % (dim.height / 2) + dim.height / 2;
        }
        mt = new MediaTracker(this);
        gAlc = new Image[1];
        gAlc[0] = getImage(getDocumentBase(), getParameter("graphic", "BLLClass.gif"));
        mt.addImage(gAlc[0], 0);
        try {
            mt.waitForID(0);
        } catch (InterruptedException ex) {
            return;
        }
        stopFlag = 0;
    }

    public void start() {
        if (mainThread == null) {
            mainThread = new Thread(this);
            mainThread.start();
        }
    }

    public void stop() {
        mainThread = null;
    }

    public void run() {
        while (mainThread != null) {
            try {
                Thread.sleep(threadSleep);
            } catch (InterruptedException ex) {
                return;
            }
            repaint();
        }
    }

    public void drawBackSnow(Graphics g) {
        g.setColor(Color.white);
        for (int i = 0; i < snows; i++) {
            g.fillOval(snowX, snowY, snowSize, snowSize);
            snowX += rand.nextInt() % 2 + wind;
            snowY += (rand.nextInt() % 6 + 5) / 5 + 1;
            if (snowX >= dim.width) snowX = 0;
            if (snowX < 0) snowX = dim.width - 1;
            if (snowY >= dim.height || snowY < 0) {
                snowX = Math.abs(rand.nextInt() % dim.width);
                snowY = 0;
            }
        }
        wind = rand.nextInt() % 5 - 2;
    }

    public void paint(Graphics g) {
        offScreen.getGraphics().setColor(Color.black);
        offScreen.getGraphics().fillRect(0, 0, dim.width, dim.height);
        offScreen.getGraphics().drawImage(gAlc[0], 0, 0, this);
        drawBackSnow(offScreen.getGraphics());
        g.drawImage(offScreen, 0, 0, null);
    }

    public void update(Graphics g) {
        paint(g);

    }*/
//}
