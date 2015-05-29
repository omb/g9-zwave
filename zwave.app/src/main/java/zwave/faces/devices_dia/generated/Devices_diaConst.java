// Generated with g9.

package zwave.faces.devices_dia.generated;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import no.g9.client.core.controller.DialogConstant;
import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.controller.DialogObjectType;
import no.g9.client.core.controller.ViewConstant;
import no.g9.os.AttributeConstant;
import no.g9.os.OSConstant;
import no.g9.os.RoleConstant;

import zwave.os.devices_os.generated.Devices_osConst;

/**
 * Interface containing view constants for the Devices_dia dialog.
 * The interface contains two enumerations. DIALOG_NAME is the enumeration that
 * lists the name of the dialog. DIALOG is the enumeration that lists all dialog
 * objects in the Devices_dia dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public interface Devices_diaConst {

    /**
     * Constant denoting the Devices_dia dialog.
     */
	public static enum DIALOG_NAME implements DialogConstant {
	    /** The Devices_dia dialog. */
	    DEVICES_DIA("Devices_dia", "devices_dia", "Device", WindowType.DOCUMENT_WINDOW, 0);

	    /**
	     * Get the generated DIALOG_NAME enum.
	     * @return the name of the dialog
	     */
	    public final static DIALOG_NAME getName() {
	        return DEVICES_DIA;
	    }

        /** The name of the dialog object as defined in the g9 dialog model. */
        private String g9Name;

        /** The internal name, used in generated code. */
        private String internalName;

        /** The dialog title (from the first window block). */
        private String title;

        /** The window type (from the first window block). */
        private WindowType windowType;

        /** The maximum number of instances for this dialog model. */
        private int maximumNumberOfInstances;

        private DIALOG_NAME(String g9Name, String internalName, String title, WindowType windowType, int maximumNumberOfInstances) {
            this.g9Name = g9Name;
            this.internalName = internalName;
            this.title = title;
            this.windowType = windowType;
            if (maximumNumberOfInstances > 0) {
                this.maximumNumberOfInstances = maximumNumberOfInstances;
            }
            else {
                this.maximumNumberOfInstances = -1;
            }
        }

        /**
         * Returns the internal string representation of the dialog object enum.
         * @return the internal string representation of this dialog object
         */
        @Override
        public String toString() {
            return internalName;
        }

        public String getG9Name() {
            return g9Name;
        }

        public String getInternalName() {
            return internalName;
        }

        public String getTitle() {
            return title;
        }

        public WindowType getWindowType() {
            return windowType;
        }

        public int getMaximumNumberOfInstances() {
            return maximumNumberOfInstances;
        }

        public ViewConstant getParent() {
            return null;
        }

        public Collection<ViewConstant> getAll() {
            ViewConstant[] dc = values();
            ViewConstant[] doc = DIALOG.values();
            Set<ViewConstant> collection = new HashSet<ViewConstant>();
            collection.addAll(Arrays.asList(doc));
            collection.addAll(Arrays.asList(dc));
            return collection;
        }

    }

    /**
     * Enum containing constants for all dialog objects in the Devices_dia dialog.
     */
    public static enum DIALOG implements DialogObjectConstant {
        /** The Window enum */
        WINDOW("Window", "Devices_dia_window", DialogObjectType.WindowBlock, null, null, DIALOG_NAME.DEVICES_DIA, null, "dialog.Devices_dia.Window.title", 0),
        /** The NewBasicContainer enum */
        NEW_BASIC_CONTAINER("NewBasicContainer", "Devices_dia_newBasicContainer", DialogObjectType.SimpleBlock, null, null, WINDOW, null, "dialog.Devices_dia.NewBasicContainer.title", 0),
        /** The DeviceListClass enum */
        DEVICE_LIST_CLASS("DeviceListClass", "Devices_dia_deviceListClass", DialogObjectType.SimpleBlock, null, Devices_osConst.OS.DEVICE_LIST, WINDOW, null, "dialog.Devices_dia.DeviceListClass.title", 0),
        /** The DevicesClass enum */
        DEVICES_CLASS("DevicesClass", "Devices_dia_devicesClass", DialogObjectType.SimpleBlock, null, Devices_osConst.OS.DEVICES, WINDOW, null, "dialog.Devices_dia.DevicesClass.title", 0),
        /** The DeviceListData enum */
        DEVICE_LIST_DATA("DeviceListData", "Devices_dia_deviceListData", DialogObjectType.SimpleBlock, null, Devices_osConst.OS.DEVICE_LIST, DEVICE_LIST_CLASS, null, "dialog.Devices_dia.DeviceListData.title", 0),
        /** The DeviceListButtons enum */
        DEVICE_LIST_BUTTONS("DeviceListButtons", "Devices_dia_deviceListButtons", DialogObjectType.SimpleBlock, null, Devices_osConst.OS.DEVICE_LIST, DEVICE_LIST_CLASS, null, "dialog.Devices_dia.DeviceListButtons.title", 0),
        /** The DeviceList.structureChanged enum */
        DEVICE_LIST_STRUCTURE_CHANGED("DeviceList.structureChanged", "Devices_dia_deviceList_structureChanged", DialogObjectType.CheckButton, null, Devices_osConst.DEVICE_LIST.STRUCTURE_CHANGED, DEVICE_LIST_DATA, null, "dialog.Devices_dia.DeviceList.structureChanged.title", 3),
        /** The DeviceListUpdateTimeLabel enum */
        DEVICE_LIST_UPDATE_TIME_LABEL("DeviceListUpdateTimeLabel", "Devices_dia_deviceListUpdateTimeLabel", DialogObjectType.Label, null, null, DEVICE_LIST_DATA, "DEVICE_LIST_UPDATE_TIME_LABEL", "dialog.Devices_dia.DeviceListUpdateTimeLabel.title", 0),
        /** The DeviceList.updateTime enum */
        DEVICE_LIST_UPDATE_TIME("DeviceList.updateTime", "Devices_dia_deviceList_updateTime", DialogObjectType.TextField, null, Devices_osConst.DEVICE_LIST.UPDATE_TIME, DEVICE_LIST_DATA, "DEVICE_LIST_UPDATE_TIME_LABEL", "dialog.Devices_dia.DeviceList.updateTime.title", 4),
        /** The DeviceFindAllButton enum */
        DEVICE_FIND_ALL_BUTTON("DeviceFindAllButton", "Devices_dia_deviceFindAllButton", DialogObjectType.Button, null, null, DEVICE_LIST_BUTTONS, null, "dialog.Devices_dia.DeviceFindAllButton.title", 1),
        /** The DeviceDetailButton enum */
        DEVICE_DETAIL_BUTTON("DeviceDetailButton", "Devices_dia_deviceDetailButton", DialogObjectType.Button, null, null, DEVICE_LIST_BUTTONS, null, "dialog.Devices_dia.DeviceDetailButton.title", 2),
        /** The DevicesTable enum */
        DEVICES_TABLE("DevicesTable", "Devices_dia_devicesTable", DialogObjectType.TableBlock, null, Devices_osConst.OS.DEVICES, DEVICES_CLASS, null, "dialog.Devices_dia.DevicesTable.title", 5),
        /** The DevicesIdLabel enum */
        DEVICES_ID_LABEL("DevicesIdLabel", "Devices_dia_devicesIdLabel", DialogObjectType.Label, null, null, DEVICES_TABLE, "DEVICES_ID_LABEL", "dialog.Devices_dia.DevicesIdLabel.title", 0),
        /** The devices.id enum */
        DEVICES_ID("devices.id", "Devices_dia_devices_id", DialogObjectType.TextField, null, Devices_osConst.DEVICES.ID, DEVICES_TABLE, "DEVICES_ID_LABEL", "dialog.Devices_dia.devices.id.title", 0),
        /** The DevicesDeviceTypeLabel enum */
        DEVICES_DEVICE_TYPE_LABEL("DevicesDeviceTypeLabel", "Devices_dia_devicesDeviceTypeLabel", DialogObjectType.Label, null, null, DEVICES_TABLE, "DEVICES_DEVICE_TYPE_LABEL", "dialog.Devices_dia.DevicesDeviceTypeLabel.title", 0),
        /** The devices.deviceType enum */
        DEVICES_DEVICE_TYPE("devices.deviceType", "Devices_dia_devices_deviceType", DialogObjectType.TextField, null, Devices_osConst.DEVICES.DEVICE_TYPE, DEVICES_TABLE, "DEVICES_DEVICE_TYPE_LABEL", "dialog.Devices_dia.devices.deviceType.title", 0),
        /** The DevicesUpdateTimeLabel enum */
        DEVICES_UPDATE_TIME_LABEL("DevicesUpdateTimeLabel", "Devices_dia_devicesUpdateTimeLabel", DialogObjectType.Label, null, null, DEVICES_TABLE, "DEVICES_UPDATE_TIME_LABEL", "dialog.Devices_dia.DevicesUpdateTimeLabel.title", 0),
        /** The devices.updateTime enum */
        DEVICES_UPDATE_TIME("devices.updateTime", "Devices_dia_devices_updateTime", DialogObjectType.TextField, null, Devices_osConst.DEVICES.UPDATE_TIME, DEVICES_TABLE, "DEVICES_UPDATE_TIME_LABEL", "dialog.Devices_dia.devices.updateTime.title", 0),
        ;

        /** The name of the dialog object as defined in the g9 dialog model. */
        private String g9Name;

        /** The internal name, used in generated code. */
        private String internalName;

        /** The type of the dialog object. */
        private DialogObjectType type;

        /** The component type of the dialog object. */
        private String componentType;

        /** The attribute for data items, used in generated code. */
        private AttributeConstant attribute;

        /** The role for repeating containers. */
        private RoleConstant role;

        /** The parent component. */
        private ViewConstant parent;

        /** String used to identify label (if any). */
        private String label;

        /** String used to identify message title. */
        private String messageID;

        /** The index in the Tab Order for this component. */
        private int tabIndex;

        /**
         * Constructs a new DIALOG enum.
         *
         * @param g9Name the g9 name of the dialog object
         * @param internalName the internal name of the dialog object
         * @param type the dialog object type
         * @param componentType the component type for Component or DataComponent, otherwise null
         * @param osConst the constant for a data item attribute or container role, otherwise null
         * @param parent the constant for the parent component (or dialog)
         * @param label the label component name if applicable, otherwise null
         * @param messageId the bundle key to get the title for this component
         */
        private DIALOG(String g9Name, String internalName, DialogObjectType type, String componentType,
                OSConstant osConst, ViewConstant parent, String label, String messageID, int tabIndex) {
            this.g9Name = g9Name;
            this.internalName = internalName;
            this.type = type;
            this.componentType = componentType;
            if (osConst instanceof AttributeConstant) {
                this.attribute = (AttributeConstant) osConst;
            }
            else {
                this.role = (RoleConstant) osConst;
            }
            this.parent = parent;
            this.label = label;
            this.messageID = messageID;
            this.tabIndex = tabIndex;
        }

        /**
         * Returns the corresponding constant enum.
         * @param g9Name the g9 dialog object name
         * @return the enum denoting the dialog object
         */
        static DialogObjectConstant getConst(String g9Name) {
            int ordinal = no.esito.util.Const.ordinalByTitle(values(), g9Name);
            return ordinal != -1 ? values()[ordinal] : null;
        }

        /**
         * Returns the internal string representation of the dialog object enum.
         * @return the internal string representation of this dialog object
         */
        @Override
        public String toString() {
            return internalName;
        }

        public String getG9Name() {
            return g9Name;
        }

        public String getInternalName() {
            return internalName;
        }

        public DialogObjectType getType() {
            return type;
        }

        public String getComponentType() {
            return componentType;
        }

        /**
         * Returns the attribute of the data item.
         * @return the attribute of the data item
         */
        public AttributeConstant getAttribute() {
            return attribute;
        }

        /**
         * Returns the role of the table, list or repeating basic container.
         * @return the role of the table, list or repeating basic container
         */
        public RoleConstant getRole() {
            return role;
        }

        public ViewConstant getParent() {
            return parent;
        }

        public Collection<ViewConstant> getAll() {
            ViewConstant[] dc = DIALOG_NAME.values();
            ViewConstant[] doc = values();
            Set<ViewConstant> collection = new HashSet<ViewConstant>();
            collection.addAll(Arrays.asList(doc));
            collection.addAll(Arrays.asList(dc));
            return collection;
        }

        public DialogObjectConstant getLabelComponent() {
            return label != null ? valueOf(label) : null;
        }

        public String getMessageID() {
            return messageID;
        }

        public int getTabIndex() {
            return tabIndex;
        }

    }
}
