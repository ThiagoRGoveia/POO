package Tools;

import java.util.Random;

public class RandomSingleton
{
    private static final int seed = 42;
    private static RandomSingleton instance;
    private final Random random;

    private RandomSingleton()
    {
        random = new Random(seed);
    }

    private RandomSingleton(int seed)
    {
        random = new Random(seed);
    }

    public static RandomSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new RandomSingleton();
        }
        return instance;
    }

    public int nextInt(int max)
    {
        return random.nextInt(max);
    }
}