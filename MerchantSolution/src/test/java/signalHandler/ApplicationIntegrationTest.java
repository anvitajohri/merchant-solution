package signalHandler;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ApplicationIntegrationTest {

    @Test
    void testHandleSignalIntegration() {
        Algo mockAlgo = mock(Algo.class);
        Application application = new Application(mockAlgo);

        application.handleSignal(1);
        application.handleSignal(2);
        application.handleSignal(3);

        verify(mockAlgo, times(3)).doAlgo();
        verify(mockAlgo).setUp();
        verify(mockAlgo).setAlgoParam(1, 60);
        verify(mockAlgo,times(2)).performCalc();
        verify(mockAlgo,times(3)).submitToMarket();


        verify(mockAlgo).reverse();
        verify(mockAlgo).setAlgoParam(1, 80);
        
        verify(mockAlgo).setAlgoParam(1, 90);
        verify(mockAlgo).setAlgoParam(2, 15);
    }
}