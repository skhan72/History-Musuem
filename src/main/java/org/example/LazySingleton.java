package org.example;

/**
 * LazySingleton demonstrates the lazy initialization strategy of the Singleton design pattern.
 * <p>
 * Three possible singleton instances (with IDs 0, 1, and 2) are created only when first requested.
 * The class uses double-checked locking to ensure thread-safe instantiation.
 */
public class LazySingleton {

    // Array to store singleton instances; each slot can hold one instance corresponding to an ID
    private static final LazySingleton[] instances = new LazySingleton[3];

    // Lock object for thread-safe initialization
    private static final Object lock = new Object();

    // ID associated with the instance
    private int id;

    /**
     * Private constructor to prevent external instantiation.
     * Logs the instantiation to the console.
     *
     * @param id The identifier for this singleton instance.
     */
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    /**
     * Retrieves the singleton instance corresponding to the given index.
     * If the instance does not yet exist, it is lazily created in a thread-safe manner.
     *
     * @param i The index of the singleton instance to retrieve (must be 0, 1, or 2).
     * @return The corresponding LazySingleton instance.
     * @throws IllegalArgumentException if the index is not 0, 1, or 2.
     */
    public static LazySingleton getInstance(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }

        if (instances[i] == null) {
            synchronized (lock) {
                if (instances[i] == null) {
                    instances[i] = new LazySingleton(i);
                }
            }
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

