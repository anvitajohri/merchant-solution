package signalHandlerStrategy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import signalHandler.Algo;

public class SignalHandlerStrategyType2Test {

    private Algo mockAlgo;
    private SignalHandlerStrategyType2 strategy;

    @BeforeEach
    public void setUp() {
        mockAlgo = mock(Algo.class);
        strategy = new SignalHandlerStrategyType2();
    }

    @Test
    public void testHandleSignalType2() {
        strategy.handleSignal(mockAlgo);
        
        verify(mockAlgo, times(1)).reverse();
        verify(mockAlgo, times(1)).setAlgoParam(1, 80);
        verify(mockAlgo, times(1)).submitToMarket();
        
     }
}