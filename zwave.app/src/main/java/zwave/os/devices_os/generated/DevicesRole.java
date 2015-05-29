// Generated with g9.

package zwave.os.devices_os.generated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import me.zwave.vdev.Device;

import no.g9.os.AbstractOSRole;
import no.g9.os.AttributeConstant;
import no.g9.os.Key;
import no.g9.os.NoSuchAttributeException;
import no.g9.os.NoSuchRoleException;
import no.g9.os.OSRole;
import no.g9.os.RelationCardinality;
import no.g9.os.RelationType;
import no.g9.os.RoleConstant;

/**
 * The class representing the devices role in the object selection. This class
 * contains various methods for accessing domain objects represented by this role.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
class DevicesRole extends AbstractOSRole<Device> {

    /**
     * Constructs a new OSRole.
     *
     * @param parent the parent role (if any)
     * @param relationType the type of relation
     * @param cardinality the relation cardinality
     */
    protected DevicesRole(OSRole<?> parent,
            RelationType relationType, RelationCardinality cardinality) {

        super(parent, relationType, cardinality, Devices_osConst.OS.DEVICES);

    }

    public Device createNewInstance() {
        return new Device();
    }

    public Class<Device> getDomainClass() {
        return Device.class;
    }

    public AttributeConstant[] getAttributeConstants() {
        return Devices_osConst.DEVICES.values();
    }

    public List<Key> getKeys() {
        if (keys == null) {
            keys = new ArrayList<Key>();
            for (Key key : Devices_osConst.DEVICES.getKeys()) {
                keys.add(key);
            }
        }
        return Collections.unmodifiableList(keys);
    }

    public boolean isNavigableToParent() {
        return false;
    }

    public boolean isUpRelated() {
        return false;
    }

    public boolean isParentMany() {
        return false;
    }

    public boolean isPersistent() {
        return false;
    }

    public AttributeConstant getAttributeConstant(String attributeName) {
        if ("id".equals(attributeName))
            return Devices_osConst.DEVICES.ID;
        if ("deviceType".equals(attributeName))
            return Devices_osConst.DEVICES.DEVICE_TYPE;
        if ("updateTime".equals(attributeName))
            return Devices_osConst.DEVICES.UPDATE_TIME;
        return null;
    }

    public void setValue(Object domObj, AttributeConstant attribute, Object value) {
        Device domainObject = (Device) domObj;
        if (attribute instanceof Devices_osConst.DEVICES) {
            Devices_osConst.DEVICES attributeEnum = (Devices_osConst.DEVICES) attribute;
            switch (attributeEnum) {
                case ID:
                    domainObject.setId((String) value);
                    return;
                case DEVICE_TYPE:
                    domainObject.setDeviceType((String) value);
                    return;
                case UPDATE_TIME:
                    domainObject.setUpdateTime(value != null ? ((Integer) value).intValue() : 0);
                    return;
                default:
                    throw new NoSuchAttributeException("Unknown attribute " +
                           attribute + " in role " + getRoleConstant() + ".");
            }
        }

        // Try one of the related attributes
        if (isRelated(attribute)) {
            setRelatedValue(domObj, attribute, value);
        } else {
            throw new NoSuchAttributeException("Unknown attribute " + attribute +
                    ". devices is not on attribute path.");
        }

    }

    /* (non-Javadoc)
     * @see no.g9.os.OSRole#getValue(java.lang.Object, no.esito.util.AttributeConstant)
     */
    public Object getValue(Object domObj, AttributeConstant attribute) {
        Device domainObject = (Device) domObj;
        if (domainObject == null) {
            return null;
        }
        if (attribute instanceof Devices_osConst.DEVICES) {
            Devices_osConst.DEVICES attributeEnum = (Devices_osConst.DEVICES) attribute;
            switch (attributeEnum) {
                case ID:
                    return domainObject.getId();
                case DEVICE_TYPE:
                    return domainObject.getDeviceType();
                case UPDATE_TIME:
                    return new Integer(domainObject.getUpdateTime());
               default:
                   throw new NoSuchAttributeException("Unknown attribute " +
                   attribute + " in role " + getRoleConstant() + ".");
            }
        }
        // Check if this is a related attribute
        if (isRelated(attribute)) {
            return getRelatedValue(domainObject, attribute);
        }
        throw new NoSuchAttributeException("Unknown attribute " + attribute +
                " in role " + getRoleConstant() + ".");
    }

    public Object getRelation(Object domObj, RoleConstant role) {
        Device domainObject = (Device) domObj;
        if (domainObject == null) {
            return null;
        }
        if (role instanceof Devices_osConst.OS) {
            Devices_osConst.OS roleEnum = (Devices_osConst.OS) role;
            throw new NoSuchRoleException("No such role: " + roleEnum +
                    " in class Device");
        }

        throw new IllegalArgumentException("Unknow enum: " + role +
                " should be of type Devices_osConst.OS");
    }

    public void updateRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof Devices_osConst.OS) {
            throw new NoSuchRoleException("No such role: " + role +
                    " in class Device");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type Devices_osConst.OS");
    }

    public void setRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof Devices_osConst.OS) {
            throw new NoSuchRoleException("No such role: " + role +
                    " in class Device");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type Devices_osConst.OS");
    }

}
