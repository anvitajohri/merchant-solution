package signalHandlerStrategy;

import signalHandler.Algo;

public class SignalHandlerStrategyType2 implements SignalHandlerStrategy {
    @Override
    public void handleSignal(Algo algo) {
        algo.reverse();
        algo.setAlgoParam(1, 80);
        algo.submitToMarket();
    }
}