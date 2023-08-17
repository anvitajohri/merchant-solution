package signalHandlerStrategy;

import signalHandler.Algo;

public class SignalHandlerStrategyType3 implements SignalHandlerStrategy {
    @Override
    public void handleSignal(Algo algo) {
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
    }
}
