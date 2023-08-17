package signalHandlerStrategy;

import signalHandler.Algo;

public class SignalHandlerStrategyDefault implements SignalHandlerStrategy {
    @Override
    public void handleSignal(Algo algo) {
        algo.cancelTrades();
    }
}