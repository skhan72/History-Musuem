package org.example;

/**
 * EagerSingleton demonstrates the eager initialization strategy of the Singleton design pattern.
 * <p>
 * Three singleton instances (with IDs 0, 1, and 2) are created at the time of class loading.
 * Each instance can be retrieved using its corresponding index via {@link #getInstance(int)}.
 */
public class EagerSingleton {

    // Array holding the three singleton instances
    private static final EagerSingleton[] instances = new EagerSingleton[3];

    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    // ID associated with each singleton instance
    private int id;

    /**
     * Private constructor to prevent instantiation from outside the class.
     *
     * @param id The identifier for this singleton instance.
     */
    private EagerSingleton(int id) {
        this.id = id;
    }

    /**
     * Retrieves one of the pre-instantiated singleton instances based on the provided index.
     *
     * @param i The index of the singleton instance to retrieve (must be 0, 1, or 2).
     * @return The corresponding EagerSingleton instance.
     * @throws IllegalArgumentException if the index is not 0, 1, or 2.
     */
    public static EagerSingleton getInstance(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }
        return instances[i];
    }

    /**
     * Returns the ID associated with this singleton instance.
     *
     * @return The instance ID.
     */
    public int getId() {
        return id;
    }
}
