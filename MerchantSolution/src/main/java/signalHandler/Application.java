package signalHandler;

import java.util.HashMap;
import java.util.Map;

import signalHandlerStrategy.SignalHandlerStrategy;
import signalHandlerStrategy.SignalHandlerStrategyDefault;
import signalHandlerStrategy.SignalHandlerStrategyType1;
import signalHandlerStrategy.SignalHandlerStrategyType2;
import signalHandlerStrategy.SignalHandlerStrategyType3;

public class Application implements SignalHandler {
    private final Algo algo;
    private final Map<Integer, SignalHandlerStrategy> signalStrategyMap;

    public Application(Algo algo) {
        this.algo = algo;
        this.signalStrategyMap = initializeSignalStrategyMap();
    }

    @Override
    public void handleSignal(int signal) {
        SignalHandlerStrategy strategy = signalStrategyMap.getOrDefault(signal, new SignalHandlerStrategyDefault());
        strategy.handleSignal(algo);
        algo.doAlgo();
    }

    Map<Integer, SignalHandlerStrategy> initializeSignalStrategyMap() {
        Map<Integer, SignalHandlerStrategy> map = new HashMap<>();
        
        map.put(1, new SignalHandlerStrategyType1());
        map.put(2, new SignalHandlerStrategyType2());
        map.put(3, new SignalHandlerStrategyType3());
        // Add more mappings for other signals
        
        return map;
    }

    public static void main(String[] args) {
        // Create an instance of Algo 
        Algo algo = new Algo();
        // Create an instance of Application
        Application tradingApp = new Application(algo);
        
        // Handle signals
        tradingApp.handleSignal(1);
        tradingApp.handleSignal(2);
        tradingApp.handleSignal(3);
    }

}
