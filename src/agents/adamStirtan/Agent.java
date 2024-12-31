package agents.adamStirtan;

import engine.core.MarioAgent;
import engine.core.MarioForwardModel;
import engine.core.MarioTimer;
import engine.helper.MarioActions;

public class Agent implements MarioAgent {

    private boolean[] action;
    private PSO pso;

    @Override
    public void initialize(MarioForwardModel model, MarioTimer timer) {
        this.action = new boolean[MarioActions.numberOfActions()];
        this.pso = new PSO();
    }

    @Override
    public boolean[] getActions(MarioForwardModel model, MarioTimer timer) {
        double[] state = encodeState(model);
        double[] bestAction = pso.optimize(state);
        decodeAction(bestAction);
        return action;
    }

    @Override
    public String getAgentName() {
        return "PSOAgent-AdamStirtan";
    }

    private double[] encodeState(MarioForwardModel model) {
        // Encode the game state into a feature vector
        // Example: [Mario's X position, Mario's Y position, Enemy positions, etc.]
        // ...existing code...
        return new double[]{/* encoded state */};
    }

    private void decodeAction(double[] bestAction) {
        // Decode the best action vector into the action array
        // Example: [Move Right, Jump, Speed]
        // ...existing code...
        action[MarioActions.RIGHT.getValue()] = bestAction[0] > 0.5;
        action[MarioActions.JUMP.getValue()] = bestAction[1] > 0.5;
        action[MarioActions.SPEED.getValue()] = bestAction[2] > 0.5;
    }
}
