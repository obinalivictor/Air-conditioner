import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirCoditionerTest {

    @Test
    public void TestThatAirConditionerIsOffAtTheBeginning(){

        AirCoditioner Ac = new AirCoditioner();

        Ac.turnOn();
        assertTrue(Ac.isOn());
    }
    @Test
    public void TestThatWhenIOffAcItIsOff(){
        AirCoditioner Ac = new AirCoditioner();

        Ac.turnOn();
        Ac.turnOff();
        assertFalse(Ac.isOn());
    }


    @Test
    public void TestThatTemperatureIsSixteenByDefault(){
        AirCoditioner ac = new AirCoditioner();
        assertEquals(16, ac.getTemperature());
    }

    @Test
    public void TestThatTemperatureIsSixteenByDefault_IncreasedAndItBecameSeventen(){
        AirCoditioner ac = new AirCoditioner();
        assertEquals(20, ac.getTemperature());
        ac.IncreaseTemperature();
        assertEquals(17, ac.getTemperature());
    }

    @Test
    public void TestThatTemperatureDoesNotExceedThirty(){
        AirCoditioner ac = new AirCoditioner();

        for(int count = 1 ; count < 19 ; count++){
            ac.IncreaseTemperature();
        }
        assertEquals(30,ac.getTemperature());
    }

    @Test
    public void TestThatTemperatureCanbeReduced(){
        AirCoditioner ac = new AirCoditioner();
        ac.getdecreaseTemperature();
    assertEquals(19,ac.getTemperature());
    }

    @Test
    public void TestThatTemperatureDoesNotReduceBeyondSixteen(){
        AirCoditioner ac = new AirCoditioner();
        for(int count = 0 ; count < 4;count++){
            AirCoditioner ac = new AirCoditioner();

            ac.getdecreaseTemperature();
        }
            ac.getdecreaseTemperature();
            assertEquals(16,ac.getTemperature());
    }
}