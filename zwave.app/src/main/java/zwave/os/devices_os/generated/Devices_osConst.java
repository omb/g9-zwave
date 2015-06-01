// Generated with g9.

package zwave.os.devices_os.generated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import no.g9.os.AssociationRoleConstant;
import no.g9.os.AttributeConstant;
import no.g9.os.Key;
import no.g9.os.KeyTool;
import no.g9.os.OSRole;
import no.g9.os.RelationCardinality;
import no.g9.os.RelationType;
import no.g9.os.RoleConstant;

/**
 * Interface containing role and variable constants.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public interface Devices_osConst {

    /**
     * Enum of role names.
     */
    public static enum OS implements RoleConstant, AssociationRoleConstant {
        /** Constant denoting the Devices_os object selection*/
        DEVICES_OS("Devices_os", null, null),
        /** Constant denoting the role DeviceList (domain class: DeviceList) */
        DEVICE_LIST("DeviceList", "", ""),
        /** Constant denoting the role devices (domain class: Device) */
        DEVICES("devices", "", "devices"),
        /** Constant denoting the role metrics (domain class: DeviceMetrics) */
        METRICS("metrics", "metrics", "metrics"),
        ;

        /** Array of role names, lazy initialized */
        private static String[] roleNames;

        /** The role name */
        private String roleName;

        /** The association role name. If the role isn't modified in g9, this will be the same as <code>roleName</code> */
        private String associationRoleName;

        /** The path from the closest many-role */
        private List<RoleConstant> rolePath;

        /** The temporary role path as a string */
        private String rolePathTmp;

        /**
         * Constructor.
         *
         * @param roleName the role name
         * @param rolePath the role path
         * @param associationRoleName the String association role name
         */
        private OS(String roleName, String rolePath, String associationRoleName) {
            this.roleName = roleName;
            this.rolePathTmp = rolePath;
            this.associationRoleName = associationRoleName;
        }

        public boolean isObjectSelection() {
            return this == DEVICES_OS;
        }

        public String getAssociationRoleName() {
            return this.associationRoleName;
        }

        /**
         * Returns the role name of this enum constant.
         *
         * @return the role name of this enum constant
         */
        @Override
        public String toString() {
            return roleName;
        }

        /**
         * Returns the role path of this enum constant.
         *
         * @return the role path of this enum constant
         */
        public synchronized List<RoleConstant> getRolePath() {
            if (rolePath == null) {
                rolePath = new ArrayList<>();
                if (KeyTool.isDefined(rolePathTmp)) {
                    for (String roleName : rolePathTmp.split("[.]")) {
                        rolePath.add(getConst(roleName));
                    }
                    Collections.reverse(rolePath);
                }
                rolePath = Collections.unmodifiableList(rolePath);
            }
            return rolePath;
        }

        /**
         * Returns an array with role names.
         *
         * @return a String array with the role names
         */
        static synchronized String[] getRoleNames() {
            if (roleNames == null) {
                roleNames = no.esito.util.Const.getTitles(values());
            }
            return roleNames;
        }

        /**
         * Returns the enum whose role name equals <code>attributeName</code>.
         *
         * @param roleName the name of the role
         * @return the enum with the specified role name or <code>null</code>
         *         if no such enum exists
         */
        public static RoleConstant getConst(String roleName) {
            int ordinal = no.esito.util.Const.ordinalByTitle(values(), roleName);

            return ordinal != -1 ? values()[ordinal] : null;
        }
    }

    /**
     * Enum of DeviceList's attribute constants.
     */
    public static enum DEVICE_LIST implements AttributeConstant {
        /** The structureChanged constant */
        STRUCTURE_CHANGED("DeviceList.structureChanged", true, false,
          "", null, null, Boolean.class, null),
        /** The updateTime constant */
        UPDATE_TIME("DeviceList.updateTime", true, false,
          "", null, null, Integer.class, null),
        ;

        private static List<Key> uniqueKeys;

        /** Array of attribute names, lazy init */
        private static String[] attributeNames;

        /** The role name */
        private static String roleName = "Devices_os";

        /** The attribute name */
        private String title;

        /** The ID of the value converter bean */
        private String converterId;

        /** The ID of the validator bean */
        private String validatorId;

        /** The java primitive property */
        private boolean javaPrimitive;

        /** The foreign attribute property */
        private boolean foreignAttribute;

        /** The foreign attribute role property (lazy init) */
        private RoleConstant foreignAttributeRole;

        /** The foreign attribute role property as a string (used to init foreignAttributeRole */
        private String foreignAttributeRoleString;

        /** The display rule property */
        private String displayRule;

        /** The attribute class type */
        private Class<?> attributeType;

        /**
         * Constructor.
         *
         * @param title the attribute name
         * @param javaPrimitive true if this is a java primitive type
         * @param foreignAttribute true if this is a foreign attribute
         * @param displayRule the display rule
         * @param converterId the name of the converter
         * @param validatorId the name of the validator
         * @param attributeType the class of the attribute type
         * @param foreignAttributeRole the foreignAttributeRole as a String
         */
        private DEVICE_LIST(String title, boolean javaPrimitive,
                boolean foreignAttribute, String displayRule,
                String converterId, String validatorId, Class<?> attributeType, RoleConstant foreignAttributeRole) {

            this.title = title;
            this.javaPrimitive = javaPrimitive;
            this.foreignAttribute = foreignAttribute;
            this.displayRule = displayRule;
            this.converterId = converterId;
            this.validatorId = validatorId;
            this.attributeType = attributeType;
            this.foreignAttributeRole = foreignAttributeRole;
        }

        /**
         * Returns the attribute name, prefixed with the role name.
         *
         * @return the attribute name
         */
        @Override
        public String toString() {
            return title;
        }

        public boolean isJavaPrimitive() {
            return javaPrimitive;
        }

        public boolean isForeignAttribute() {
            return foreignAttribute;
        }

        public RoleConstant getForeignAttributeRole() {
            return foreignAttributeRole;
        }

        public String getDisplayRule() {
            return displayRule;
        }

        public RoleConstant getAttributeRole() {
            return OS.DEVICE_LIST;
        }

        public Class<?> getAttributeType() {
            return attributeType;
        }

        /**
         * Returns an array with attribute names. Attributes that
         * are excluded from the object selection is not present in the
         * returned array.
         *
         * @return a string array with the attribute names
         */
        public static synchronized String[] getAttributeNames() {
            if (attributeNames == null) {
                attributeNames = no.esito.util.Const.getTitles(values());
            }
            return attributeNames.clone();
        }

        /**
         * Returns an array with the role keys.
         *
         * @return an array with the role keys
         */
        public static synchronized List<Key> getKeys() {
            if (uniqueKeys == null) {
                List<Key> keys = new ArrayList<>();

                uniqueKeys = Collections.unmodifiableList(keys);
            }

            return uniqueKeys;
        }

        /**
         * Returns the enum whose attribute name equals
         * <code>attributeName</code>.
         *
         * The attribute name might be prefixed with the role name
         * (e.g. "person.name") or the role name might be skipped (e.g. "name").
         *
         * @param attributeName the name of the attribute
         * @return the enum with the specified attribute name or
         *         <code>null</code> if no such enum exists
         */
        public static Enum<DEVICE_LIST> constValue(String attributeName) {
            String attr;
            if (attributeName.indexOf('.') == -1) {
                attr = roleName + "." + attributeName;
            } else {
                attr = attributeName;
            }

            int ordinal = no.esito.util.Const.ordinalByTitle(values(), attr);

            return ordinal != - 1 ? values()[ordinal] : null;
        }

        public String getConverterId() {
            return converterId;
        }

        public String getValidatorId() {
            return validatorId;
        }
    }

    /**
     * Enum of devices's attribute constants.
     */
    public static enum DEVICES implements AttributeConstant {
        /** The id constant */
        ID("devices.id", false, false,
          "", null, null, String.class, null),
        /** The deviceType constant */
        DEVICE_TYPE("devices.deviceType", false, false,
          "", null, null, String.class, null),
        /** The updateTime constant */
        UPDATE_TIME("devices.updateTime", true, false,
          "", null, null, Integer.class, null),
        ;

        private static List<Key> uniqueKeys;

        /** Array of attribute names, lazy init */
        private static String[] attributeNames;

        /** The role name */
        private static String roleName = "DeviceList";

        /** The attribute name */
        private String title;

        /** The ID of the value converter bean */
        private String converterId;

        /** The ID of the validator bean */
        private String validatorId;

        /** The java primitive property */
        private boolean javaPrimitive;

        /** The foreign attribute property */
        private boolean foreignAttribute;

        /** The foreign attribute role property (lazy init) */
        private RoleConstant foreignAttributeRole;

        /** The foreign attribute role property as a string (used to init foreignAttributeRole */
        private String foreignAttributeRoleString;

        /** The display rule property */
        private String displayRule;

        /** The attribute class type */
        private Class<?> attributeType;

        /**
         * Constructor.
         *
         * @param title the attribute name
         * @param javaPrimitive true if this is a java primitive type
         * @param foreignAttribute true if this is a foreign attribute
         * @param displayRule the display rule
         * @param converterId the name of the converter
         * @param validatorId the name of the validator
         * @param attributeType the class of the attribute type
         * @param foreignAttributeRole the foreignAttributeRole as a String
         */
        private DEVICES(String title, boolean javaPrimitive,
                boolean foreignAttribute, String displayRule,
                String converterId, String validatorId, Class<?> attributeType, RoleConstant foreignAttributeRole) {

            this.title = title;
            this.javaPrimitive = javaPrimitive;
            this.foreignAttribute = foreignAttribute;
            this.displayRule = displayRule;
            this.converterId = converterId;
            this.validatorId = validatorId;
            this.attributeType = attributeType;
            this.foreignAttributeRole = foreignAttributeRole;
        }

        /**
         * Returns the attribute name, prefixed with the role name.
         *
         * @return the attribute name
         */
        @Override
        public String toString() {
            return title;
        }

        public boolean isJavaPrimitive() {
            return javaPrimitive;
        }

        public boolean isForeignAttribute() {
            return foreignAttribute;
        }

        public RoleConstant getForeignAttributeRole() {
            return foreignAttributeRole;
        }

        public String getDisplayRule() {
            return displayRule;
        }

        public RoleConstant getAttributeRole() {
            return OS.DEVICES;
        }

        public Class<?> getAttributeType() {
            return attributeType;
        }

        /**
         * Returns an array with attribute names. Attributes that
         * are excluded from the object selection is not present in the
         * returned array.
         *
         * @return a string array with the attribute names
         */
        public static synchronized String[] getAttributeNames() {
            if (attributeNames == null) {
                attributeNames = no.esito.util.Const.getTitles(values());
            }
            return attributeNames.clone();
        }

        /**
         * Returns an array with the role keys.
         *
         * @return an array with the role keys
         */
        public static synchronized List<Key> getKeys() {
            if (uniqueKeys == null) {
                List<Key> keys = new ArrayList<>();
                Key key;
                key = new Key(OS.DEVICES,
                        "id", // key name
                        new AttributeConstant[]
                            {
                                Devices_osConst.DEVICES.ID,
                            }
                    );
                // Above key is primary key.
                Key primaryKey = key;

                keys.add(key);
                // Sort primary key.
                keys.remove(primaryKey);
                keys.add(0, primaryKey);

                uniqueKeys = Collections.unmodifiableList(keys);
            }

            return uniqueKeys;
        }

        /**
         * Returns the enum whose attribute name equals
         * <code>attributeName</code>.
         *
         * The attribute name might be prefixed with the role name
         * (e.g. "person.name") or the role name might be skipped (e.g. "name").
         *
         * @param attributeName the name of the attribute
         * @return the enum with the specified attribute name or
         *         <code>null</code> if no such enum exists
         */
        public static Enum<DEVICES> constValue(String attributeName) {
            String attr;
            if (attributeName.indexOf('.') == -1) {
                attr = roleName + "." + attributeName;
            } else {
                attr = attributeName;
            }

            int ordinal = no.esito.util.Const.ordinalByTitle(values(), attr);

            return ordinal != - 1 ? values()[ordinal] : null;
        }

        public String getConverterId() {
            return converterId;
        }

        public String getValidatorId() {
            return validatorId;
        }
    }

    /**
     * Enum of metrics's attribute constants.
     */
    public static enum METRICS implements AttributeConstant {
        /** The probeTitle constant */
        PROBE_TITLE("metrics.probeTitle", false, false,
          "", null, null, String.class, null),
        /** The scaleTitle constant */
        SCALE_TITLE("metrics.scaleTitle", false, false,
          "", null, null, String.class, null),
        /** The level constant */
        LEVEL("metrics.level", false, false,
          "", null, null, String.class, null),
        /** The icon constant */
        ICON("metrics.icon", false, false,
          "", null, null, String.class, null),
        /** The title constant */
        TITLE("metrics.title", false, false,
          "", null, null, String.class, null),
        /** The mode constant */
        MODE("metrics.mode", false, false,
          "", null, null, String.class, null),
        ;

        private static List<Key> uniqueKeys;

        /** Array of attribute names, lazy init */
        private static String[] attributeNames;

        /** The role name */
        private static String roleName = "devices";

        /** The attribute name */
        private String title;

        /** The ID of the value converter bean */
        private String converterId;

        /** The ID of the validator bean */
        private String validatorId;

        /** The java primitive property */
        private boolean javaPrimitive;

        /** The foreign attribute property */
        private boolean foreignAttribute;

        /** The foreign attribute role property (lazy init) */
        private RoleConstant foreignAttributeRole;

        /** The foreign attribute role property as a string (used to init foreignAttributeRole */
        private String foreignAttributeRoleString;

        /** The display rule property */
        private String displayRule;

        /** The attribute class type */
        private Class<?> attributeType;

        /**
         * Constructor.
         *
         * @param title the attribute name
         * @param javaPrimitive true if this is a java primitive type
         * @param foreignAttribute true if this is a foreign attribute
         * @param displayRule the display rule
         * @param converterId the name of the converter
         * @param validatorId the name of the validator
         * @param attributeType the class of the attribute type
         * @param foreignAttributeRole the foreignAttributeRole as a String
         */
        private METRICS(String title, boolean javaPrimitive,
                boolean foreignAttribute, String displayRule,
                String converterId, String validatorId, Class<?> attributeType, RoleConstant foreignAttributeRole) {

            this.title = title;
            this.javaPrimitive = javaPrimitive;
            this.foreignAttribute = foreignAttribute;
            this.displayRule = displayRule;
            this.converterId = converterId;
            this.validatorId = validatorId;
            this.attributeType = attributeType;
            this.foreignAttributeRole = foreignAttributeRole;
        }

        /**
         * Returns the attribute name, prefixed with the role name.
         *
         * @return the attribute name
         */
        @Override
        public String toString() {
            return title;
        }

        public boolean isJavaPrimitive() {
            return javaPrimitive;
        }

        public boolean isForeignAttribute() {
            return foreignAttribute;
        }

        public RoleConstant getForeignAttributeRole() {
            return foreignAttributeRole;
        }

        public String getDisplayRule() {
            return displayRule;
        }

        public RoleConstant getAttributeRole() {
            return OS.METRICS;
        }

        public Class<?> getAttributeType() {
            return attributeType;
        }

        /**
         * Returns an array with attribute names. Attributes that
         * are excluded from the object selection is not present in the
         * returned array.
         *
         * @return a string array with the attribute names
         */
        public static synchronized String[] getAttributeNames() {
            if (attributeNames == null) {
                attributeNames = no.esito.util.Const.getTitles(values());
            }
            return attributeNames.clone();
        }

        /**
         * Returns an array with the role keys.
         *
         * @return an array with the role keys
         */
        public static synchronized List<Key> getKeys() {
            if (uniqueKeys == null) {
                List<Key> keys = new ArrayList<>();

                uniqueKeys = Collections.unmodifiableList(keys);
            }

            return uniqueKeys;
        }

        /**
         * Returns the enum whose attribute name equals
         * <code>attributeName</code>.
         *
         * The attribute name might be prefixed with the role name
         * (e.g. "person.name") or the role name might be skipped (e.g. "name").
         *
         * @param attributeName the name of the attribute
         * @return the enum with the specified attribute name or
         *         <code>null</code> if no such enum exists
         */
        public static Enum<METRICS> constValue(String attributeName) {
            String attr;
            if (attributeName.indexOf('.') == -1) {
                attr = roleName + "." + attributeName;
            } else {
                attr = attributeName;
            }

            int ordinal = no.esito.util.Const.ordinalByTitle(values(), attr);

            return ordinal != - 1 ? values()[ordinal] : null;
        }

        public String getConverterId() {
            return converterId;
        }

        public String getValidatorId() {
            return validatorId;
        }
    }

    /**
     * Used to create a map from RoleConstants and Roles.
     */
    public static class OSRoleFactory {

        /**
         * Creates a new map of role constants and object selection roles.
         *
         * @return a map from role constant to object selection role
         */
        public static Map<RoleConstant, OSRole<?>> getRoleMap() {
            Map<RoleConstant, OSRole<?>> roleMap =
                    new HashMap<RoleConstant, OSRole<?>>();
            OSRole<?> parent;
            OSRole<?> role;
            RelationType rt;
            RelationCardinality rc;

            // The DeviceList node
            parent = roleMap.get(null); // a root has no parent.
            rt = RelationType.ROOT;
            rc = RelationCardinality.ROOT;
            role = new DeviceListRole(parent, rt, rc);
            roleMap.put(role.getRoleConstant(), role);


            // The devices node
            parent = roleMap.get(Devices_osConst.OS.DEVICE_LIST);
            rc = RelationCardinality.MANY;
            rt = RelationType.DOWN_RELATED;
            role = new DevicesRole(parent, rt, rc);
            roleMap.put(role.getRoleConstant(), role);


            // The metrics node
            parent = roleMap.get(Devices_osConst.OS.DEVICES);
            rc = RelationCardinality.ONE;
            rt = RelationType.UP_RELATED;
            role = new MetricsRole(parent, rt, rc);
            roleMap.put(role.getRoleConstant(), role);


            return roleMap;
        }
    }

}
