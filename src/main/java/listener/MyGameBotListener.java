package listener;

import game.listener.GameBotListener;
import game.playables.Board;

public class MyGameBotListener extends GameBotListener {

    /*
     * Use this function to determine how good a board state is based on various factors, such as piece position, game phase, etc.
     * Note that Integer.MAX_VALUE represents a victory state, Integer.MIN_VALUE represents a loss state, and 0 represents a tie
     */
    @Override
    protected int determineBoardValue(Board board) {
        return 0; // TODO: your custom logic goes here
    }

    /*
     * Optionally, you may modify this function to determine the initial depth value of your bot's search algorithm
     *
     * Higher levels will allow your bot to "think" more moves ahead initially,
     * but you risk running out of time before your bot can determine any good moves
     *
     * Lower levels will guarantee that your bot will at least have a decent move initially,
     * but will take longer to "think" more moves ahead, since it will determine the best move
     * at each level before moving onto the next level
     */
    @Override
    protected int getInitialDepth() {
        return super.getInitialDepth();
    }
}
