import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Road {
    private Picture background;

    public Road() {
        background = new Picture(0, -2160, "estrada.png");
    }

    public void init() throws InterruptedException {
        background.draw();
        if (background.getY() >= -1) {
            background.translate(0, -2160);
        } else {
            background.translate(0, 10);
        }
    }

    public Picture getBackground() {
        return background;
    }
}
