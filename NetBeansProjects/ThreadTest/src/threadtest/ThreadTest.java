package threadtest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PrintChar printA = new PrintChar('a', 100);
        PrintChar printB = new PrintChar('b', 100);
        PrintNum print100 = new PrintNum(100);

        printA.start();
        printB.start();
        print100.start();
        try {
            printA.join();
            printB.join();
            print100.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Main terminated");
    }
}

class PrintNum extends Thread {

    private int lastNum;

    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 1; i < lastNum; i++) {
            System.out.print(" " + i);
        }
    }
}

class PrintChar extends Thread {

    private char ch;
    private int timesPrinted;

    public PrintChar(char ch, int timesPrinted) {
        this.ch = ch;
        this.timesPrinted = timesPrinted;
    }

    @Override
    public void run() {
        for (int i = 0; i < timesPrinted; i++) {
            System.out.print(ch + " ");
        }
    }
}
