package agents.adamStirtan;

public class PSO {
    public static final int NUM_PARTICLES = 30;
    private static final int NUM_ITERATIONS = 100;
    private Particle[] particles;
    private double[] globalBestPosition;
    private double globalBestFitness;

    public PSO() {
        particles = new Particle[NUM_PARTICLES];

        for (int i = 0; i < NUM_PARTICLES; i++) {
            particles[i] = new Particle();
        }

        globalBestPosition = new double[3];
        globalBestFitness = Double.NEGATIVE_INFINITY;
    }

    public double[] optimize(double[] state) {
        for (int iter = 0; iter < NUM_ITERATIONS; iter++) {
            for (Particle particle : particles) {

                double fitness = evaluateFitness(state, particle.getPosition());

                if (fitness > particle.getBestFitness()) {
                    particle.setBestFitness(fitness);
                    System.arraycopy(particle.getPosition(), 0, particle.getBestPosition(), 0, particle.getPosition().length);
                }
                if (fitness > globalBestFitness) {
                    globalBestFitness = fitness;
                    System.arraycopy(particle.getPosition(), 0, globalBestPosition, 0, particle.getPosition().length);
                }
            }

            for (Particle particle : particles) {
                particle.update(globalBestPosition);
            }
        }
        return globalBestPosition;
    }

    private double evaluateFitness(double[] state, double[] action) {
        // Define the fitness function to evaluate the action based on the state
        return 0.0;
    }
}
