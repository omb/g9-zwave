// Generated with g9.

package me.zwave.vdev;

/**
 * This file will be overwritten the next time it is generated from g9.
 */
public enum DeviceType {

    /** The battery enum value */
    BATTERY(1, "battery"),

    /** The doorlock enum value */
    DOORLOCK(2, "doorlock"),

    /** The thermostat enum value */
    THERMOSTAT(3, "thermostat"),

    /** The switchBinary enum value */
    SWITCHBINARY(4, "switchBinary"),

    /** The switchMultilevel enum value */
    SWITCHMULTILEVEL(5, "switchMultilevel"),

    /** The sensorBinary enum value */
    SENSORBINARY(6, "sensorBinary"),

    /** The sensorMultilevel enum value */
    SENSORMULTILEVEL(7, "sensorMultilevel"),

    /** The switchToggle enum value */
    SWITCHTOGGLE(8, "switchToggle");

    private final int value;
    private final String literal;

    /**
     * Creates an enum with the given literal, name and ordinal value.
     */
    private DeviceType(int value, String literal) {
        this.value = value;
        this.literal = literal;
    }

    /**
     * Returns the literal of this enum.
     *
     * @return the literal of this enum
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the value of this enum.
     *
     * @return the value of this enum
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns the enum value corresponding to the given value.
     *
     * @param value the value to look up
     * @return the enum value corresponding to the given value
     */
    public static DeviceType get(int value) {
        for (DeviceType someDeviceType : values()) {
            if (someDeviceType.value == value) {
                return someDeviceType;
            }
        }
        throw new IllegalArgumentException("No such value: " + value);
    }

    /**
     * Returns the enum value corresponding to the given literal.
     *
     * @param literal the literal to look up
     * @return the enum value corresponding to the given literal
     */
    public static DeviceType get(String literal) {
        for (DeviceType someDeviceType : values()) {
            if (someDeviceType.literal.equals(literal)) {
                return someDeviceType;
            }
        }
        throw new IllegalArgumentException("No such literal: " + literal);
    }

    /**
     * Returns the enum value corresponding to the given name.
     *
     * @param name the name to look up
     * @return the enum value corresponding to the given name
     */
    public static DeviceType getByName(String name) {
        for (DeviceType someDeviceType : values()) {
            if (someDeviceType.name().equals(name)) {
                return someDeviceType;
            }
        }
        throw new IllegalArgumentException("No such name: " + name);
    }

    @Override
    public String toString() {
        return getLiteral();
    }

}
