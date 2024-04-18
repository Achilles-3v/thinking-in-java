package chapter19.enumerated;

import static chapter19.enumerated.Outcome.*;

enum RoShamBo6 implements Competitor<RoShamBo6> {
    PAPER, SCISSORS, ROCK;
    private static Outcome[][] table = {
            { DRAW, LOSE, WIN }, // PAPER
            { WIN, DRAW, LOSE }, // SCISSORS
            { LOSE, WIN, DRAW }, // ROCK
    };
    public Outcome compete(RoShamBo6 other) {
        return table[this.ordinal()][other.ordinal()];
    }
}
