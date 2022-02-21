import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Car {
    private Picture tractor1;
    private Picture explosion;
    private Picture blood;
    private Picture gameOver;
    private Picture fog;
    private Picture win;
    private boolean isCrashed;
    private boolean isDrunk;
    private boolean isWin;

    private int tractor1X;
    private int tractor1Y;
    private int tractor1Width;
    private int tractor1Height;

    public Car() {
        tractor1 = new Picture(309, 600, "/tractor.png");

        tractor1X = tractor1.getX();
        tractor1Y = tractor1.getY();
        tractor1Width = tractor1.getWidth();
        tractor1Height = tractor1.getHeight();
    }

    public int getX() {
        return tractor1.getX();
    }

    public int getY() {
        return tractor1.getY();
    }

    public int getWidth() {
        return tractor1.getWidth();
    }

    public int getHeight() {
        return tractor1.getHeight();
    }

    public void init() {
        if (!isCrashed) {
            tractor1.draw();
        }
    }

    public void translate1(int x, int y) {
        tractor1X = tractor1.getX();
        tractor1Y = tractor1.getY();
        tractor1.translate(x, y);
    }

    public void carCrash() throws InterruptedException {
        if (isCrashed = true) {
            explosion = new Picture(getX() - 20, getY(), "/explosion.png");
            blood = new Picture(getX() - 15, getY() - 100, "/blood.png");
            gameOver = new Picture(0, -150, "/gameOver.png");
            tractor1.delete();
            explosion.draw();
            blood.draw();
            Thread.sleep(1000);
            gameOver.draw();
        }
    }

    public void drunk() throws InterruptedException {
        if (isDrunk = true) {
            fog = new Picture(0, -150, "/fog.png");
            fog.draw();
        }
    }

    public void win() throws InterruptedException {
        if (isWin = true) {
            win = new Picture(0, -150, "/win.png");
            win.draw();
        }
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }

    public boolean isDrunk() {
        return isDrunk;
    }

    public void setDrunk(boolean drunk) {
        isDrunk = drunk;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;
    }

    public static class Pkeyboard extends Keyboard {
        public Pkeyboard(KeyboardHandler keyboardHandler) {
            super(keyboardHandler);

            KeyboardEvent right = new KeyboardEvent();
            right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            right.setKey(KeyboardEvent.KEY_RIGHT);
            this.addEventListener(right);

            KeyboardEvent left = new KeyboardEvent();
            left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            left.setKey(KeyboardEvent.KEY_LEFT);
            this.addEventListener(left);

            KeyboardEvent restart = new KeyboardEvent();
            restart.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            restart.setKey(KeyboardEvent.KEY_R);
            this.addEventListener(restart);

            KeyboardEvent exit = new KeyboardEvent();
            exit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            exit.setKey(KeyboardEvent.KEY_ESC);
            this.addEventListener(exit);

            KeyboardEvent start = new KeyboardEvent();
            start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            start.setKey(KeyboardEvent.KEY_SPACE);
            this.addEventListener(start);
        }
    }
}