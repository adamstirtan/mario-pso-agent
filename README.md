# Mario PSO Agent

This project implements an AI agent using Particle Swarm Optimization (PSO) to autonomously play Super Mario Bros. The agent observes the game state and optimizes its actions to achieve the best possible performance.

## Project Structure

- `src/agents/adamStirtan/Agent.java`: The main PSO-based agent implementation.
- `src/PlayLevel.java`: A utility to run the game and test the agent.
- `levels/original/`: Directory containing the level files.

## How It Works

The PSO agent encodes the game state into a feature vector and uses the PSO algorithm to optimize the actions (e.g., move right, jump, speed). The fitness function evaluates the effectiveness of actions based on the game state, rewarding actions that avoid enemies and obstacles and penalizing actions that lead to Mario's death.

## Mario-AI-Framework

This project uses the [Mario-AI-Framework](https://github.com/amidos2006/Mario-AI-Framework) to simulate the Super Mario Bros. environment. The framework provides the necessary classes and methods to interact with the game.

## Building the Project

To build the project, you need to have Java installed. Follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/mario-pso-agent.git
    cd mario-pso-agent
    ```

2. Compile the project:
    ```sh
    javac -d bin -sourcepath src src/PlayLevel.java
    ```

## Running the Agent

To run the PSO agent on a specific level, use the following command:

```sh
java -cp bin PlayLevel
```

This will execute the `PlayLevel` class, which runs the game using the PSO agent and prints the results.

## Example Output

```
****************************************************************
Game Status: WIN Percentage Completion: 100.0
Lives: 3 Coins: 10 Remaining Time: 200
Mario State: 2 (Mushrooms: 1 Fire Flowers: 1)
Total Kills: 5 (Stomps: 2 Fireballs: 2 Shells: 1 Falls: 0)
Bricks: 10 Jumps: 15 Max X Jump: 5 Max Air Time: 2
****************************************************************
```

This output shows the game status, completion percentage, lives, coins, remaining time, Mario's state, total kills, and other statistics.

## Contributing

Feel free to fork the repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License.
