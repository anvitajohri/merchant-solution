package signalHandlerStrategy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import signalHandler.Algo;

public class SignalHandlerStrategyDefaultTest {

    private Algo mockAlgo;
    private SignalHandlerStrategyDefault strategy;

    @BeforeEach
    public void setUp() {
        mockAlgo = mock(Algo.class);
        strategy = new SignalHandlerStrategyDefault();
    }

    @Test
    public void testHandleSignalDefault() {
        strategy.handleSignal(mockAlgo);
        
        verify(mockAlgo, times(1)).cancelTrades();
    
        
     }
}
