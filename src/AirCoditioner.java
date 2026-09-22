public class AirCoditioner {
    private boolean isOn = false;
    private int temperature = 20;

    public void turnOn(){
        isOn = true;
    }

    public boolean isOn(){
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public void IncreaseTemperature(){

        if(temperature < 30){

            temperature = temperature +1;
        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void getdecreaseTemperature() {
        if(temperature > 16){

            temperature--;
        }
    }
}
