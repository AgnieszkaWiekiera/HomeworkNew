package lekcja5.zadanie5;

public class EngineVehicle extends Vehicle{
    private boolean isStarted;

    private void startEngine() {
        if (!isStarted) {
            isStarted = true;
        }
    }

    private void stopEngine() {
        if (isStarted) {
            isStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return isStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.isStarted = engineStarted;
    }
}
