package signalHandler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ApplicationTest {

    private Algo mockAlgo;
    private Application application;

    @BeforeEach
    void setUp() {
        mockAlgo = mock(Algo.class);
        application = new Application(mockAlgo);
    }

    @Test
    void testHandleSignalType1() {
        application.handleSignal(1);

        verify(mockAlgo, times(1)).doAlgo();
    }

    @Test
    void testHandleSignalType2() {
        application.handleSignal(2);

        verify(mockAlgo, times(1)).doAlgo();
    }

    @Test
    void testHandleSignalType3() {
        application.handleSignal(3);

        verify(mockAlgo, times(1)).doAlgo();
    }

    @Test
    void testHandleSignalDefault() {
        application.handleSignal(99); // Assuming 99 is a default signal

        verify(mockAlgo, times(1)).doAlgo();
    }
}