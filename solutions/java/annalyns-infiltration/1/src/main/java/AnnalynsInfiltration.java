class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
                 return !knightIsAwake;

    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       return knightIsAwake||archerIsAwake||prisonerIsAwake;
    }

  public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // Signal works if prisoner is awake AND archer is sleeping
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // Condition 1: If she has the dog, she only needs the archer to be asleep
        // Condition 2: If no dog, prisoner must be awake AND both guards must be asleep
        return (petDogIsPresent && !archerIsAwake) || 
               (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake);
    }
}
