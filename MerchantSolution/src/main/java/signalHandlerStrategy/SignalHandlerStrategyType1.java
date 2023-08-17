package signalHandlerStrategy;

import signalHandler.Algo;

public class SignalHandlerStrategyType1 implements SignalHandlerStrategy {
    @Override
    public void handleSignal(Algo algo) {
        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
    }
}