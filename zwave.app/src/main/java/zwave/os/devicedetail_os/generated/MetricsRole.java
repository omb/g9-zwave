// Generated with g9.

package zwave.os.devicedetail_os.generated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
 * The class representing the metrics role in the object selection. This class
 * contains various methods for accessing domain objects represented by this role.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
class MetricsRole extends AbstractOSRole<DeviceMetrics> {

    /**
     * Constructs a new OSRole.
     *
     * @param parent the parent role (if any)
     * @param relationType the type of relation
     * @param cardinality the relation cardinality
     */
    protected MetricsRole(OSRole<?> parent,
            RelationType relationType, RelationCardinality cardinality) {

        super(parent, relationType, cardinality, DeviceDetail_osConst.OS.METRICS);

    }

    public DeviceMetrics createNewInstance() {
        return new DeviceMetrics();
    }

    public Class<DeviceMetrics> getDomainClass() {
        return DeviceMetrics.class;
    }

    public AttributeConstant[] getAttributeConstants() {
        return DeviceDetail_osConst.METRICS.values();
    }

    public List<Key> getKeys() {
        if (keys == null) {
            keys = new ArrayList<Key>();
            for (Key key : DeviceDetail_osConst.METRICS.getKeys()) {
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
        if ("probeTitle".equals(attributeName))
            return DeviceDetail_osConst.METRICS.PROBE_TITLE;
        if ("scaleTitle".equals(attributeName))
            return DeviceDetail_osConst.METRICS.SCALE_TITLE;
        if ("level".equals(attributeName))
            return DeviceDetail_osConst.METRICS.LEVEL;
        if ("icon".equals(attributeName))
            return DeviceDetail_osConst.METRICS.ICON;
        if ("title".equals(attributeName))
            return DeviceDetail_osConst.METRICS.TITLE;
        if ("mode".equals(attributeName))
            return DeviceDetail_osConst.METRICS.MODE;
        return null;
    }

    public void setValue(Object domObj, AttributeConstant attribute, Object value) {
        DeviceMetrics domainObject = (DeviceMetrics) domObj;
        if (attribute instanceof DeviceDetail_osConst.METRICS) {
            DeviceDetail_osConst.METRICS attributeEnum = (DeviceDetail_osConst.METRICS) attribute;
            switch (attributeEnum) {
                case PROBE_TITLE:
                    domainObject.setProbeTitle((String) value);
                    return;
                case SCALE_TITLE:
                    domainObject.setScaleTitle((String) value);
                    return;
                case LEVEL:
                    domainObject.setLevel((String) value);
                    return;
                case ICON:
                    domainObject.setIcon((String) value);
                    return;
                case TITLE:
                    domainObject.setTitle((String) value);
                    return;
                case MODE:
                    domainObject.setMode((String) value);
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
                    ". metrics is not on attribute path.");
        }

    }

    /* (non-Javadoc)
     * @see no.g9.os.OSRole#getValue(java.lang.Object, no.esito.util.AttributeConstant)
     */
    public Object getValue(Object domObj, AttributeConstant attribute) {
        DeviceMetrics domainObject = (DeviceMetrics) domObj;
        if (domainObject == null) {
            return null;
        }
        if (attribute instanceof DeviceDetail_osConst.METRICS) {
            DeviceDetail_osConst.METRICS attributeEnum = (DeviceDetail_osConst.METRICS) attribute;
            switch (attributeEnum) {
                case PROBE_TITLE:
                    return domainObject.getProbeTitle();
                case SCALE_TITLE:
                    return domainObject.getScaleTitle();
                case LEVEL:
                    return domainObject.getLevel();
                case ICON:
                    return domainObject.getIcon();
                case TITLE:
                    return domainObject.getTitle();
                case MODE:
                    return domainObject.getMode();
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
        DeviceMetrics domainObject = (DeviceMetrics) domObj;
        if (domainObject == null) {
            return null;
        }
        if (role instanceof DeviceDetail_osConst.OS) {
            DeviceDetail_osConst.OS roleEnum = (DeviceDetail_osConst.OS) role;
            throw new NoSuchRoleException("No such role: " + roleEnum +
                    " in class DeviceMetrics");
        }

        throw new IllegalArgumentException("Unknow enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

    public void updateRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof DeviceDetail_osConst.OS) {
            throw new NoSuchRoleException("No such role: " + role +
                    " in class DeviceMetrics");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

    public void setRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof DeviceDetail_osConst.OS) {
            throw new NoSuchRoleException("No such role: " + role +
                    " in class DeviceMetrics");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

}
