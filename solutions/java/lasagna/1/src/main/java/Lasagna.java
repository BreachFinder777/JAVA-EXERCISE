public class Lasagna {
    
    // Returns the expected cooking time
    public int expectedMinutesInOven() {
        return 40;
    }
    
    // Returns remaining minutes based on actual time already in oven
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    
    // Returns preparation time based on number of layers (2 mins per layer)
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    
    // Returns total time (preparation + cooking time)
    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}