import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Obstacles {
    private Picture obstacle1;
    private Picture obstacle2;
    private Picture obstacle3;
    private Picture obstacle4;
    private Picture obstacle5;
    private Picture obstacle6;
    private Picture obstacle7;
    private Picture obstacle8;
    private Picture obstacle9;
    private Picture obstacle10;
    private Picture obstacle11;
    private Picture obstacle12;
    private Picture obstacle13;
    private Picture obstacle14;
    private Picture obstacle15;
    private Picture obstacle16;
    private Picture obstacle17;
    private Picture obstacle18;
    private Picture obstacle19;
    private Picture obstacle20;
    private Picture obstacle21;
    private Picture obstacle22;
    private Picture obstacle23;
    private Picture obstacle24;
    private Picture obstacle25;
    private Picture obstacle26;
    private Picture obstacle27;
    private Picture obstacle28;
    private Picture obstacle29;
    private Picture obstacle30;
    private Picture obstacle31;
    private Picture obstacle32;
    private Picture obstacle33;
    private Picture obstacle34;
    private Picture obstacle35;
    private Picture obstacle36;
    private Picture finishLine;
    private Picture beers1;
    private Picture paper;
    private Picture pamelaDoTim;
    private Picture picha;
    private Picture palha;
    private Picture farmer;
    private Picture cow;
    private Picture sideTractor;
    private Picture basket;
    private Picture johnySiens;

    private int obstacleX;
    private int obstacleY;
    private int obstacleWidth;
    private int obstacleHeight;

    public int getRandomArbitrary(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public Obstacles() {
        obstacle1 = new Picture(getRandomArbitrary(160, 500), -600, "/1.png");
        picha = new Picture(7, -700, "/picha.png");
        obstacle2 = new Picture(getRandomArbitrary(160, 500), -900, "/2.png");
        obstacle3 = new Picture(getRandomArbitrary(160, 500), -1200, "/3.png");
        obstacle4 = new Picture(getRandomArbitrary(160, 500), -1500, "/4.png");
        obstacle5 = new Picture(getRandomArbitrary(160, 500), -1800, "/5.png");
        pamelaDoTim = new Picture(587, -1900, "/pamelaTim.png");
        obstacle6 = new Picture(getRandomArbitrary(160, 500), -2100, "/6.png");
        obstacle7 = new Picture(getRandomArbitrary(160, 500), -2400, "/7.png");
        obstacle8 = new Picture(getRandomArbitrary(160, 500), -2700, "/8.png");
        obstacle9 = new Picture(getRandomArbitrary(160, 500), -3000, "/9.png");
        palha = new Picture(9, -3150, "/comidaValentim.png");
        obstacle10 = new Picture(getRandomArbitrary(160, 500), -3300, "/10.png");
        obstacle11 = new Picture(getRandomArbitrary(160, 500), -3600, "/11.png");
        obstacle12 = new Picture(getRandomArbitrary(160, 500), -3900, "/12.png");
        beers1 = new Picture(getRandomArbitrary(160, 500), -4200, "/37.png");
        sideTractor = new Picture(585, -4350, "/sideTractor.png");
        obstacle13 = new Picture(getRandomArbitrary(160, 500), -4500, "/13.png");
        obstacle14 = new Picture(getRandomArbitrary(160, 500), -4800, "/14.png");
        obstacle15 = new Picture(getRandomArbitrary(160, 500), -5100, "/15.png");
        obstacle16 = new Picture(getRandomArbitrary(160, 500), -5400, "/16.png");
        obstacle17 = new Picture(getRandomArbitrary(160, 500), -5700, "/17.png");
        farmer = new Picture(8, -5800, "/farmer.png");
        obstacle18 = new Picture(getRandomArbitrary(160, 500), -6000, "/18.png");
        obstacle19 = new Picture(getRandomArbitrary(160, 500), -6300, "/19.png");
        obstacle20 = new Picture(getRandomArbitrary(160, 500), -6600, "/20.png");
        obstacle21 = new Picture(getRandomArbitrary(160, 500), -6900, "/21.png");
        obstacle22 = new Picture(getRandomArbitrary(160, 500), -7200, "/22.png");
        obstacle23 = new Picture(getRandomArbitrary(160, 500), -7500, "/23.png");
        obstacle24 = new Picture(getRandomArbitrary(160, 500), -7800, "/24.png");
        paper = new Picture(586, -7900, "/papel.png");
        obstacle25 = new Picture(getRandomArbitrary(160, 500), -8100, "/25.png");
        obstacle26 = new Picture(getRandomArbitrary(160, 500), -8400, "/26.png");
        obstacle27 = new Picture(getRandomArbitrary(160, 500), -8700, "/27.png");
        basket = new Picture(11, -9150, "/basket.png");
        obstacle28 = new Picture(getRandomArbitrary(160, 500), -9300, "/28.png");
        obstacle29 = new Picture(getRandomArbitrary(160, 500), -9600, "/29.png");
        obstacle30 = new Picture(getRandomArbitrary(160, 500), -9900, "/30.png");
        obstacle31 = new Picture(getRandomArbitrary(160, 500), -10200, "/31.png");
        obstacle32 = new Picture(getRandomArbitrary(160, 500), -10500, "/32.png");
        cow = new Picture(586, -10650, "/cow.png");
        obstacle33 = new Picture(getRandomArbitrary(160, 500), -10800, "/33.png");
        obstacle34 = new Picture(getRandomArbitrary(160, 500), -11100, "/34.png");
        obstacle35 = new Picture(getRandomArbitrary(160, 500), -11400, "/35.png");
        obstacle36 = new Picture(getRandomArbitrary(160, 500), -11700, "/36.png");
        johnySiens = new Picture(7, -12387, "/johnySiens.png");
        finishLine = new Picture(100, -12400, "/finishLine.png");
    }

    public Picture[] init() throws InterruptedException {
        Picture[] pictures = {obstacle1, obstacle2, obstacle3, obstacle4, obstacle5, obstacle6, obstacle7, obstacle8, obstacle9, obstacle10, obstacle11, obstacle12, obstacle13,
                obstacle14, obstacle15, obstacle16, obstacle17, obstacle18, obstacle19, obstacle20, obstacle21, obstacle22, obstacle23, obstacle24, obstacle25, obstacle26, obstacle27, obstacle28, obstacle29, obstacle30, obstacle31,
                obstacle32, obstacle33, obstacle34, obstacle35, obstacle36};
        return pictures;
    }

    public Picture[] init2() throws InterruptedException {
        Picture[] pictures2 = {finishLine};
        return pictures2;
    }

    public Picture[] init3() throws InterruptedException {
        Picture[] pictures3 = {beers1};
        return pictures3;
    }

    public Picture[] init4() throws InterruptedException {
        Picture[] pictures4 = {picha, palha, pamelaDoTim, paper, farmer, cow, sideTractor, basket, johnySiens};
        return pictures4;
    }

    public Picture getBeers1() {
        return beers1;
    }

    public Picture getFinishLine() {
        return finishLine;
    }
}
