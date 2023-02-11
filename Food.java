package snakegame;

import java.util.Random;

public class Food {

    private final int posX;
    private final int posY;
	private int x;

    public Food() {
        posX = generatePos(Graphics.WIDTH);
        posY = generatePos(Graphics.HEIGHT);
    }

    private int generatePos(int size) {
        Random random = new Random();
        return random.nextInt(size / Graphics.TICK_SIZE) * Graphics.TICK_SIZE;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }


	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		int y = 0;
		return y;
	}

	public void setY(int y) {
		this.x = y;
	}
}
