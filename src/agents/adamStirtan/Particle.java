package agents.adamStirtan;

import java.util.Random;

public class Particle {
    private double[] position;
    private double[] velocity;
    private double[] bestPosition;
    private double bestFitness;
    private Random random;

    public Particle() {
        position = new double[3];
        velocity = new double[3];
        bestPosition = new double[3];
        bestFitness = Double.NEGATIVE_INFINITY;
        random = new Random();
        for (int i = 0; i < position.length; i++) {
            position[i] = random.nextDouble();
            velocity[i] = random.nextDouble() * 0.1 - 0.05;
        }
    }

    public void update(double[] globalBestPosition) {
        for (int i = 0; i < position.length; i++) {
            velocity[i] =
                0.7 * velocity[i] +
                1.4 * random.nextDouble() * (bestPosition[i] - position[i]) +
                1.4 * random.nextDouble() * (globalBestPosition[i] - position[i]);
            position[i] += velocity[i];
            position[i] = Math.max(0, Math.min(1, position[i]));
        }
    }

    public double[] getPosition() {
        return position;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public double[] getBestPosition() {
        return bestPosition;
    }

    public double getBestFitness() {
        return bestFitness;
    }

    public void setBestFitness(double bestFitness) {
        this.bestFitness = bestFitness;
    }
}
