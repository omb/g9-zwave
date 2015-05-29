// Generated with g9.

package zwave.os.devices_os.generated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceList;

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
 * The class representing the DeviceList role in the object selection. This class
 * contains various methods for accessing domain objects represented by this role.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
class DeviceListRole extends AbstractOSRole<DeviceList> {

    /**
     * Constructs a new OSRole.
     *
     * @param parent the parent role (if any)
     * @param relationType the type of relation
     * @param cardinality the relation cardinality
     */
    protected DeviceListRole(OSRole<?> parent,
            RelationType relationType, RelationCardinality cardinality) {

        super(parent, relationType, cardinality, Devices_osConst.OS.DEVICE_LIST);

    }

    public DeviceList createNewInstance() {
        return new DeviceList();
    }

    public Class<DeviceList> getDomainClass() {
        return DeviceList.class;
    }

    public AttributeConstant[] getAttributeConstants() {
        return Devices_osConst.DEVICE_LIST.values();
    }

    public List<Key> getKeys() {
        if (keys == null) {
            keys = new ArrayList<Key>();
            for (Key key : Devices_osConst.DEVICE_LIST.getKeys()) {
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
        if ("structureChanged".equals(attributeName))
            return Devices_osConst.DEVICE_LIST.STRUCTURE_CHANGED;
        if ("updateTime".equals(attributeName))
            return Devices_osConst.DEVICE_LIST.UPDATE_TIME;
        return null;
    }

    public void setValue(Object domObj, AttributeConstant attribute, Object value) {
        DeviceList domainObject = (DeviceList) domObj;
        if (attribute instanceof Devices_osConst.DEVICE_LIST) {
            Devices_osConst.DEVICE_LIST attributeEnum = (Devices_osConst.DEVICE_LIST) attribute;
            switch (attributeEnum) {
                case STRUCTURE_CHANGED:
                    domainObject.setStructureChanged(value != null ? ((Boolean) value).booleanValue() : false);
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
                    ". DeviceList is not on attribute path.");
        }

    }

    /* (non-Javadoc)
     * @see no.g9.os.OSRole#getValue(java.lang.Object, no.esito.util.AttributeConstant)
     */
    public Object getValue(Object domObj, AttributeConstant attribute) {
        DeviceList domainObject = (DeviceList) domObj;
        if (domainObject == null) {
            return null;
        }
        if (attribute instanceof Devices_osConst.DEVICE_LIST) {
            Devices_osConst.DEVICE_LIST attributeEnum = (Devices_osConst.DEVICE_LIST) attribute;
            switch (attributeEnum) {
                case STRUCTURE_CHANGED:
                    return new Boolean(domainObject.getStructureChanged());
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
        DeviceList domainObject = (DeviceList) domObj;
        if (domainObject == null) {
            return null;
        }
        if (role instanceof Devices_osConst.OS) {
            Devices_osConst.OS roleEnum = (Devices_osConst.OS) role;
            switch (roleEnum) {
                case DEVICES:
                    return domainObject.getDevices();
            }
            throw new NoSuchRoleException("No such role: " + roleEnum +
                    " in class DeviceList");
        }

        throw new IllegalArgumentException("Unknow enum: " + role +
                " should be of type Devices_osConst.OS");
    }

    @SuppressWarnings({"unchecked", "incomplete-switch"})
    public void updateRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof Devices_osConst.OS) {
            DeviceList domainObject = (DeviceList) domObj;
            Devices_osConst.OS roleEnum = (Devices_osConst.OS) role;
            switch (roleEnum) {
                case DEVICES:
                    java.util.Set<Device> tmpdevices = domainObject.getDevices();
                    if (tmpdevices == null) {
                        tmpdevices = new java.util.HashSet<Device>();
                        domainObject.setDevices(tmpdevices);
                    }
                    if (relation instanceof java.util.Collection) {
                        tmpdevices.addAll((java.util.Collection<Device>) relation);
                    } else {
                       tmpdevices.add((Device) relation);
                    }
                    return;
            }
            throw new NoSuchRoleException("No such role: " + role +
                    " in class DeviceList");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type Devices_osConst.OS");
    }

    @SuppressWarnings({"unchecked", "incomplete-switch"})
    public void setRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof Devices_osConst.OS) {
            DeviceList domainObject = (DeviceList) domObj;
            Devices_osConst.OS roleEnum = (Devices_osConst.OS) role;
            switch (roleEnum) {
                case DEVICES:
                    domainObject.setDevices((java.util.Set<Device>) relation);
                    return;
            }
            throw new NoSuchRoleException("No such role: " + role +
                    " in class DeviceList");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type Devices_osConst.OS");
    }

}
