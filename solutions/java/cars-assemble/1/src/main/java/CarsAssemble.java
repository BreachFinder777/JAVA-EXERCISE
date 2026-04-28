public class CarsAssemble {

    public double productionRatePerHour(int speed) {
      double rate = speed*221;
       if (speed <= 4) return rate;
        if (speed <= 8) return rate * 0.9;
        if (speed == 9) return rate * 0.8;
        return rate * 0.77; // speed == 10
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    
    }
}
