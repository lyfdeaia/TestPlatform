package com.liyongfeng.TestPlatform.utils;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

public class AutoGame {

    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();

        Random random = new Random();

        robot.delay(5000);

        while (true) {

            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

            double v = 0.2 + random.nextDouble()*(0.4-0.2);
            v = v * 1000;
            System.out.println(v);
            robot.delay((int)v);

            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            double v2 = 3 + random.nextDouble()*(6-3);
            v2 = v2 * 1000;
            System.out.println(v2);
            robot.delay((int)v2);

        }
    }
}
