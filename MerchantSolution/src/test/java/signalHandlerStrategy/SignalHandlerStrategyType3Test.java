package signalHandlerStrategy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import signalHandler.Algo;

public class SignalHandlerStrategyType3Test {

    private Algo mockAlgo;
    private SignalHandlerStrategyType3 strategy;

    @BeforeEach
    public void setUp() {
        mockAlgo = mock(Algo.class);
        strategy = new SignalHandlerStrategyType3();
    }

    @Test
    public void testHandleSignalType3() {
        strategy.handleSignal(mockAlgo);
       
        verify(mockAlgo, times(1)).setAlgoParam(1, 90);
        verify(mockAlgo, times(1)).setAlgoParam(2, 15);
        verify(mockAlgo, times(1)).performCalc();
        verify(mockAlgo, times(1)).submitToMarket();
        
     }
}
