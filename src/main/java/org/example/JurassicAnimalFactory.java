package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * JurassicAnimalFactory is a concrete factory that creates land, sea, and sky animals
 * specific to the Jurassic era. Implements the {@link AnimalAbstractFactory} interface.
 */
public class JurassicAnimalFactory implements AnimalAbstractFactory {

    /**
     * Returns the name of the era this factory represents.
     * @return A string "Jurassic".
     */
    @Override
    public String getEra() {
        return "Jurassic";
    }

    /**
     * Creates a list of Jurassic land animals.
     * @return List of {@link LandAnimal} including Allosaurus and Stegosaurus.
     */
    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(
                new Allosaurus(),
                new Stegosaurus()
        );
    }

    /**
     * Creates a list of Jurassic sea animals.
     * @return List of {@link SeaAnimal} including Plesiosaurus and Ichthyosaurus.
     */
    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(
                new Plesiosaurus(),
                new Ichthyosaurus()
        );
    }

    /**
     * Creates a list of Jurassic sky animals.
     * @return List of {@link SkyAnimal} including Pterodactylus.
     */
    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(
                new Pterodactylus()
        );
    }

    // ---------------------
    // Concrete Land Animals
    // ---------------------

    /**
     * Represents the land animal Allosaurus.
     */
    static class Allosaurus implements LandAnimal {
        /** @return The name "Allosaurus". */
        public String getName() { return "Allosaurus"; }

        /** @return The walking behavior "stalking". */
        public String getWalking() { return "stalking"; }
    }

    /**
     * Represents the land animal Stegosaurus.
     */
    static class Stegosaurus implements LandAnimal {
        /** @return The name "Stegosaurus". */
        public String getName() { return "Stegosaurus"; }

        /** @return The walking behavior "trudging". */
        public String getWalking() { return "trudging"; }
    }

    // -------------------
    // Concrete Sea Animals
    // -------------------

    /**
     * Represents the sea animal Plesiosaurus.
     */
    static class Plesiosaurus implements SeaAnimal {
        /** @return The name "Plesiosaurus". */
        public String getName() { return "Plesiosaurus"; }

        /** @return The swimming behavior "gliding". */
        public String getSwimming() { return "gliding"; }
    }

    /**
     * Represents the sea animal Ichthyosaurus.
     */
    static class Ichthyosaurus implements SeaAnimal {
        /** @return The name "Ichthyosaurus". */
        public String getName() { return "Ichthyosaurus"; }

        /** @return The swimming behavior "darting". */
        public String getSwimming() { return "darting"; }
    }

    // -------------------
    // Concrete Sky Animal
    // -------------------

    /**
     * Represents the sky animal Pterodactylus.
     */
    static class Pterodactylus implements SkyAnimal {
        /** @return The name "Pterodactylus". */
        public String getName() { return "Pterodactylus"; }

        /** @return The flying behavior "soaring". */
        public String getFlying() { return "soaring"; }
    }
}
