// Generated with g9.

package zwave.os.devicedetail_os.generated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import me.zwave.vdev.Command;

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
 * The class representing the Command role in the object selection. This class
 * contains various methods for accessing domain objects represented by this role.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
class CommandRole extends AbstractOSRole<Command> {

    /**
     * Constructs a new OSRole.
     *
     * @param parent the parent role (if any)
     * @param relationType the type of relation
     * @param cardinality the relation cardinality
     */
    protected CommandRole(OSRole<?> parent,
            RelationType relationType, RelationCardinality cardinality) {

        super(parent, relationType, cardinality, DeviceDetail_osConst.OS.COMMAND);

    }

    public Command createNewInstance() {
        return new Command();
    }

    public Class<Command> getDomainClass() {
        return Command.class;
    }

    public AttributeConstant[] getAttributeConstants() {
        return DeviceDetail_osConst.COMMAND.values();
    }

    public List<Key> getKeys() {
        if (keys == null) {
            keys = new ArrayList<Key>();
            for (Key key : DeviceDetail_osConst.COMMAND.getKeys()) {
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
        if ("command".equals(attributeName))
            return DeviceDetail_osConst.COMMAND.COMMAND;
        if ("level".equals(attributeName))
            return DeviceDetail_osConst.COMMAND.LEVEL;
        return null;
    }

    public void setValue(Object domObj, AttributeConstant attribute, Object value) {
        Command domainObject = (Command) domObj;
        if (attribute instanceof DeviceDetail_osConst.COMMAND) {
            DeviceDetail_osConst.COMMAND attributeEnum = (DeviceDetail_osConst.COMMAND) attribute;
            switch (attributeEnum) {
                case COMMAND:
                    domainObject.setCommand((String) value);
                    return;
                case LEVEL:
                    domainObject.setLevel(value != null ? ((Integer) value).intValue() : 0);
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
                    ". Command is not on attribute path.");
        }

    }

    /* (non-Javadoc)
     * @see no.g9.os.OSRole#getValue(java.lang.Object, no.esito.util.AttributeConstant)
     */
    public Object getValue(Object domObj, AttributeConstant attribute) {
        Command domainObject = (Command) domObj;
        if (domainObject == null) {
            return null;
        }
        if (attribute instanceof DeviceDetail_osConst.COMMAND) {
            DeviceDetail_osConst.COMMAND attributeEnum = (DeviceDetail_osConst.COMMAND) attribute;
            switch (attributeEnum) {
                case COMMAND:
                    return domainObject.getCommand();
                case LEVEL:
                    return new Integer(domainObject.getLevel());
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
        Command domainObject = (Command) domObj;
        if (domainObject == null) {
            return null;
        }
        if (role instanceof DeviceDetail_osConst.OS) {
            DeviceDetail_osConst.OS roleEnum = (DeviceDetail_osConst.OS) role;
            throw new NoSuchRoleException("No such role: " + roleEnum +
                    " in class Command");
        }

        throw new IllegalArgumentException("Unknow enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

    public void updateRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof DeviceDetail_osConst.OS) {
            throw new NoSuchRoleException("No such role: " + role +
                    " in class Command");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

    public void setRelation(Object domObj, Object relation, RoleConstant role) {
        if (role instanceof DeviceDetail_osConst.OS) {
            throw new NoSuchRoleException("No such role: " + role +
                    " in class Command");
        }

        throw new IllegalArgumentException("Unknown enum: " + role +
                " should be of type DeviceDetail_osConst.OS");
    }

}
