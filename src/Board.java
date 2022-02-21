import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Board implements KeyboardHandler {
    private Road road;
    private Obstacles obstacless;
    private Car car;
    private Sound sound;
    private Sound fartSound;
    private Sound beerSound;
    private Sound win;
    private Picture[] pics;
    private Picture[] pics2;
    private Picture[] pics3;
    private Picture[] pics4;
    private Picture starter;
    private boolean isStarted;

    public Board() {
        new Car.Pkeyboard(this);
        isStarted = false;
        sound = new Sound("/music.wav");
        road = new Road();
        car = new Car();
        obstacless = new Obstacles();
        fartSound = new Sound("/KetchupSFX.wav");
        beerSound = new Sound("/Woohoo Sound Effect.wav");
        win = new Sound("/win.wav");
    }

    public void start(){
        while(!isStarted) {
            starter = new Picture(0, 0, "/starMenu.png");
            starter.draw();
        }
        init();
    }

    public void init() {
        starter.delete();
        sound.play(true);
        while (car.isCrashed() == false) {
            try {
                road.init();
                pics = obstacless.init();
                pics2 = obstacless.init2();
                pics3 = obstacless.init3();
                pics4 = obstacless.init4();
                for (int i = 0; i < pics.length; i++) {
                    pics[i].draw();
                    pics[i].translate(0, 10);
                    colisionDetector(pics[i]);
                }
                for (int k = 0; k < pics3.length; k++) {
                    pics3[k].draw();
                    pics3[k].translate(0, 10);
                    colisionDetectorBeers(pics3[k]);
                }
                for (int l = 0; l < pics4.length; l++) {
                    pics4[l].draw();
                    pics4[l].translate(0, 10);
                }
                car.init();
                for (int j = 0; j < pics2.length; j++) {
                    pics2[j].draw();
                    pics2[j].translate(0, 10);
                    colisionDetectorFinish(pics2[j]);
                }
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void colisionDetector(Picture obstacles) throws InterruptedException {
        if (car.getX() <= obstacles.getX() + obstacles.getWidth() && car.getX() + car.getWidth() >= obstacles.getX()) {
            if (car.getY() <= obstacles.getY() + obstacles.getHeight() && car.getY() + car.getHeight() >= obstacles.getY()) {
                sound.stop();
                fartSound.play(true);
                car.setCrashed(true);
                car.carCrash();
                System.err.println(" PICHAAA ");
                fartSound.stop();
            }
        }
    }

    public void colisionDetectorBeers(Picture obstacles) throws InterruptedException {
        if (car.getX() <= obstacles.getX() + obstacles.getWidth() && car.getX() + car.getWidth() >= obstacles.getX()) {
            if (car.getY() <= obstacles.getY() + obstacles.getHeight() && car.getY() + car.getHeight() >= obstacles.getY()) {
                beerSound.play(true);
                car.setDrunk(true);
                car.drunk();
                obstacless.getBeers1().translate(0, -4800);
                System.out.println(" CERVEJA CARAI ");
            }
        }
    }

    public void colisionDetectorFinish(Picture obstacles) throws InterruptedException {
        if (car.getX() <= obstacles.getX() + obstacles.getWidth() && car.getX() + car.getWidth() >= obstacles.getX()) {
            if (car.getY() + car.getHeight() <= obstacles.getY()) {
                sound.stop();
                win.play(true);
                obstacless.getFinishLine().translate(0, -15000);
                obstacless.getBeers1().translate(0, -15000);
                car.setWin(true);
                car.win();
                System.err.println(" CLOSE THIS SHIT ");
                System.out.println(" CLOSE THIS SHIT ");
                System.err.println(" CLOSE THIS SHIT ");
            }
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                if (car.isDrunk() == false) {
                    if (car.isCrashed() == false) {
                        if (car.getX() < 460) {
                            car.translate1(20, 0);
                        } else
                            car.translate1(0, 0);
                    } else car.translate1(0, 0);
                } else if (car.getX() > 160) {
                    car.translate1(-20, 0);
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                if (car.isDrunk() == false) {
                    if (car.isCrashed() == false) {
                        if (car.getX() > 160) {
                            car.translate1(-20, 0);
                        } else
                            car.translate1(0, 0);
                    } else car.translate1(0, 0);
                } else if (car.getX() < 460) {
                    car.translate1(20, 0);
                }
                break;
            case KeyboardEvent.KEY_SPACE:
                isStarted = true;
                break;
            case KeyboardEvent.KEY_ESC:
                if (car.isCrashed() == true) {
                    System.exit(0);
                } else if (car.isWin() == true) {
                    System.exit(0);
                }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

