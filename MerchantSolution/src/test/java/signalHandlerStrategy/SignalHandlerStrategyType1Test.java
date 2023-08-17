package signalHandlerStrategy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import signalHandler.Algo;

public class SignalHandlerStrategyType1Test {

    private Algo mockAlgo;
    private SignalHandlerStrategyType1 strategy;

    @BeforeEach
    public void setUp() {
        mockAlgo = mock(Algo.class);
        strategy = new SignalHandlerStrategyType1();
    }

    @Test
    public void testHandleSignalType1() {
        strategy.handleSignal(mockAlgo);
        
        verify(mockAlgo, times(1)).setUp();
        verify(mockAlgo, times(1)).setAlgoParam(1, 60);
        verify(mockAlgo, times(1)).performCalc();
        verify(mockAlgo, times(1)).submitToMarket();
        
     }
}