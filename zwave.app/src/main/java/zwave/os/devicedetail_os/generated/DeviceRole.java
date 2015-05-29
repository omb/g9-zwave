// Generated with g9.

package zwave.os.devicedetail_os.generated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceMetrics;

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
 * The class representing the Device role in the object selection. This class
 * contains various methods for accessing domain objects represented by this role.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
class DeviceRole extends AbstractOSRole<Device> {

    /**
     * Constructs a new OSRole.
     *
     * @param parent the parent role (if any)
     * @param relationType the type of relation
     * @param cardinality the relation cardinality
     */
    protected DeviceRole(OSRole<?> parent,
            RelationType relationType, RelationCardinality cardinality) {

        super(parent, relationType, cardinality, DeviceDetail_osConst.OS.DEVICE);

    }

    public Device createNewInstance() {
        return new Device();
    }

    public Class<Device> getDomainClass() {
        return Device.class;
    }

    public AttributeConstant[] getAttributeConstants() {
        return DeviceDetail_osConst.DEVICE.values();
    }

    public List<Key> getKeys() {
        if (keys == null) {
            keys = new ArrayList<Key>();
            for (Key key : DeviceDetail_osConst.DEVICE.getKeys()) {
                keys.add(key);
            }
        }
        return Collections.unmodifiableList(keys);
    }

    public boolean isNavigableToParent() {
        return false;
    }

    public boolean isUpRelated() {
        return true;
    }

    public boolean isParentMany() {
        return false;
    }

    public boolean isPersistent() {
        return false;
    }

    public AttributeConstant getAttributeConstant(String attributeName) {
        if ("id".equals(attributeName))
            return DeviceDetail_osConst.DEVICE.ID;
        if ("deviceType".equals(attributeName))
            return DeviceDetail_osConst.DEVICE.DEVICE_TYPE;
        if ("updateTime".equals(attributeName))
            return DeviceDetail_osConst.DEVICE.UPDATE_TIME;
        return null;
    }

    public void setValue(Object domObj, AttributeConstant attribute, Object value) {
        Device domainObject = (Device) domObj;
        if (attribute instanceof DeviceDetail_osConst.DEVICE) {
            DeviceDetail_osConst.DEVICE attributeEnum = (DeviceDetail_osConst.DEVICE) attribute;
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
                    ". Device is not on attribute path.");
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
        if (attribute instanceof DeviceDetail_osConst.DEVICE) {
            DeviceDetail_osConst.DEVICE attributeEnum = (DeviceDetail_osConst.DEVICE) attribute;
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

    @SuppressWarnings("incomplete-switch")
    public Object getRelation(Object domObj, RoleConstant role) {
        Device domainObject = (Device) domObj;
        if (domainObject == null) {
            return null;
        }
        if (role instanceof DeviceDetail_osConst.OS) {
            DeviceDetail_osConst.OS roleEnum = (DeviceDetail_osConst.OS) role;
            switch (roleEnum) {
                case METRICS:
                    return domainObject.getMetrics();
            }
            throw new NoSuchRoleException("No such role: " + roleEnum +
                    " in class Device");
        }

        throw new IllegalArgumentException("Unknow enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

    @SuppressWarnings("incomplete-switch")
    public void updateRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof DeviceDetail_osConst.OS) {
            Device domainObject = (Device) domObj;
            DeviceDetail_osConst.OS roleEnum = (DeviceDetail_osConst.OS) role;
            switch (roleEnum) {
                case METRICS:
                    domainObject.setMetrics((DeviceMetrics) relation);
                    return;
            }
            throw new NoSuchRoleException("No such role: " + role +
                    " in class Device");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

    @SuppressWarnings("incomplete-switch")
    public void setRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof DeviceDetail_osConst.OS) {
            Device domainObject = (Device) domObj;
            DeviceDetail_osConst.OS roleEnum = (DeviceDetail_osConst.OS) role;
            switch (roleEnum) {
                case METRICS:
                    domainObject.setMetrics((DeviceMetrics) relation);
                    return;
            }
            throw new NoSuchRoleException("No such role: " + role +
                    " in class Device");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

}
