// Generated with g9.

package zwave.faces.devicedetail_dia.generated;

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

import zwave.os.devicedetail_os.generated.DeviceDetail_osConst;

/**
 * Interface containing view constants for the DeviceDetail_dia dialog.
 * The interface contains two enumerations. DIALOG_NAME is the enumeration that
 * lists the name of the dialog. DIALOG is the enumeration that lists all dialog
 * objects in the DeviceDetail_dia dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public interface DeviceDetail_diaConst {

    /**
     * Constant denoting the DeviceDetail_dia dialog.
     */
	public static enum DIALOG_NAME implements DialogConstant {
	    /** The DeviceDetail_dia dialog. */
	    DEVICE_DETAIL_DIA("DeviceDetail_dia", "deviceDetail_dia", "Device", WindowType.DOCUMENT_WINDOW, 0);

	    /**
	     * Get the generated DIALOG_NAME enum.
	     * @return the name of the dialog
	     */
	    public final static DIALOG_NAME getName() {
	        return DEVICE_DETAIL_DIA;
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
     * Enum containing constants for all dialog objects in the DeviceDetail_dia dialog.
     */
    public static enum DIALOG implements DialogObjectConstant {
        /** The Window enum */
        WINDOW("Window", "DeviceDetail_dia_window", DialogObjectType.WindowBlock, null, null, DIALOG_NAME.DEVICE_DETAIL_DIA, null, "dialog.DeviceDetail_dia.Window.title", 0),
        /** The Buttons enum */
        BUTTONS("Buttons", "DeviceDetail_dia_buttons", DialogObjectType.SimpleBlock, null, null, WINDOW, null, "dialog.DeviceDetail_dia.Buttons.title", 0),
        /** The DeviceClass enum */
        DEVICE_CLASS("DeviceClass", "DeviceDetail_dia_deviceClass", DialogObjectType.SimpleBlock, null, DeviceDetail_osConst.OS.DEVICE, WINDOW, null, "dialog.DeviceDetail_dia.DeviceClass.title", 0),
        /** The Commands enum */
        COMMANDS("Commands", "DeviceDetail_dia_commands", DialogObjectType.SimpleBlock, null, null, WINDOW, null, "dialog.DeviceDetail_dia.Commands.title", 0),
        /** The Close enum */
        CLOSE("Close", "DeviceDetail_dia_close", DialogObjectType.Button, null, null, BUTTONS, null, "dialog.DeviceDetail_dia.Close.title", 15),
        /** The Refresh enum */
        REFRESH("Refresh", "DeviceDetail_dia_refresh", DialogObjectType.Button, null, null, BUTTONS, null, "dialog.DeviceDetail_dia.Refresh.title", 16),
        /** The DeviceData enum */
        DEVICE_DATA("DeviceData", "DeviceDetail_dia_deviceData", DialogObjectType.SimpleBlock, null, DeviceDetail_osConst.OS.DEVICE, DEVICE_CLASS, null, "dialog.DeviceDetail_dia.DeviceData.title", 0),
        /** The DeviceIdLabel enum */
        DEVICE_ID_LABEL("DeviceIdLabel", "DeviceDetail_dia_deviceIdLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "DEVICE_ID_LABEL", "dialog.DeviceDetail_dia.DeviceIdLabel.title", 0),
        /** The Device.id enum */
        DEVICE_ID("Device.id", "DeviceDetail_dia_device_id", DialogObjectType.TextField, null, DeviceDetail_osConst.DEVICE.ID, DEVICE_DATA, "DEVICE_ID_LABEL", "dialog.DeviceDetail_dia.Device.id.title", 1),
        /** The DeviceDeviceTypeLabel enum */
        DEVICE_DEVICE_TYPE_LABEL("DeviceDeviceTypeLabel", "DeviceDetail_dia_deviceDeviceTypeLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "DEVICE_DEVICE_TYPE_LABEL", "dialog.DeviceDetail_dia.DeviceDeviceTypeLabel.title", 0),
        /** The Device.deviceType enum */
        DEVICE_DEVICE_TYPE("Device.deviceType", "DeviceDetail_dia_device_deviceType", DialogObjectType.TextField, null, DeviceDetail_osConst.DEVICE.DEVICE_TYPE, DEVICE_DATA, "DEVICE_DEVICE_TYPE_LABEL", "dialog.DeviceDetail_dia.Device.deviceType.title", 2),
        /** The DeviceUpdateTimeLabel enum */
        DEVICE_UPDATE_TIME_LABEL("DeviceUpdateTimeLabel", "DeviceDetail_dia_deviceUpdateTimeLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "DEVICE_UPDATE_TIME_LABEL", "dialog.DeviceDetail_dia.DeviceUpdateTimeLabel.title", 0),
        /** The Device.updateTime enum */
        DEVICE_UPDATE_TIME("Device.updateTime", "DeviceDetail_dia_device_updateTime", DialogObjectType.TextField, null, DeviceDetail_osConst.DEVICE.UPDATE_TIME, DEVICE_DATA, "DEVICE_UPDATE_TIME_LABEL", "dialog.DeviceDetail_dia.Device.updateTime.title", 3),
        /** The MetricsProbeTitleLabel enum */
        METRICS_PROBE_TITLE_LABEL("MetricsProbeTitleLabel", "DeviceDetail_dia_metricsProbeTitleLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "METRICS_PROBE_TITLE_LABEL", "dialog.DeviceDetail_dia.MetricsProbeTitleLabel.title", 0),
        /** The metrics.probeTitle enum */
        METRICS_PROBE_TITLE("metrics.probeTitle", "DeviceDetail_dia_metrics_probeTitle", DialogObjectType.TextField, null, DeviceDetail_osConst.METRICS.PROBE_TITLE, DEVICE_DATA, "METRICS_PROBE_TITLE_LABEL", "dialog.DeviceDetail_dia.metrics.probeTitle.title", 4),
        /** The MetricsScaleTitleLabel enum */
        METRICS_SCALE_TITLE_LABEL("MetricsScaleTitleLabel", "DeviceDetail_dia_metricsScaleTitleLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "METRICS_SCALE_TITLE_LABEL", "dialog.DeviceDetail_dia.MetricsScaleTitleLabel.title", 0),
        /** The metrics.scaleTitle enum */
        METRICS_SCALE_TITLE("metrics.scaleTitle", "DeviceDetail_dia_metrics_scaleTitle", DialogObjectType.TextField, null, DeviceDetail_osConst.METRICS.SCALE_TITLE, DEVICE_DATA, "METRICS_SCALE_TITLE_LABEL", "dialog.DeviceDetail_dia.metrics.scaleTitle.title", 5),
        /** The MetricsLevelLabel enum */
        METRICS_LEVEL_LABEL("MetricsLevelLabel", "DeviceDetail_dia_metricsLevelLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "METRICS_LEVEL_LABEL", "dialog.DeviceDetail_dia.MetricsLevelLabel.title", 0),
        /** The metrics.level enum */
        METRICS_LEVEL("metrics.level", "DeviceDetail_dia_metrics_level", DialogObjectType.TextField, null, DeviceDetail_osConst.METRICS.LEVEL, DEVICE_DATA, "METRICS_LEVEL_LABEL", "dialog.DeviceDetail_dia.metrics.level.title", 6),
        /** The MetricsIconLabel enum */
        METRICS_ICON_LABEL("MetricsIconLabel", "DeviceDetail_dia_metricsIconLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "METRICS_ICON_LABEL", "dialog.DeviceDetail_dia.MetricsIconLabel.title", 0),
        /** The metrics.icon enum */
        METRICS_ICON("metrics.icon", "DeviceDetail_dia_metrics_icon", DialogObjectType.TextField, null, DeviceDetail_osConst.METRICS.ICON, DEVICE_DATA, "METRICS_ICON_LABEL", "dialog.DeviceDetail_dia.metrics.icon.title", 7),
        /** The MetricsTitleLabel enum */
        METRICS_TITLE_LABEL("MetricsTitleLabel", "DeviceDetail_dia_metricsTitleLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "METRICS_TITLE_LABEL", "dialog.DeviceDetail_dia.MetricsTitleLabel.title", 0),
        /** The metrics.title enum */
        METRICS_TITLE("metrics.title", "DeviceDetail_dia_metrics_title", DialogObjectType.TextField, null, DeviceDetail_osConst.METRICS.TITLE, DEVICE_DATA, "METRICS_TITLE_LABEL", "dialog.DeviceDetail_dia.metrics.title.title", 8),
        /** The MetricsModeLabel enum */
        METRICS_MODE_LABEL("MetricsModeLabel", "DeviceDetail_dia_metricsModeLabel", DialogObjectType.Label, null, null, DEVICE_DATA, "METRICS_MODE_LABEL", "dialog.DeviceDetail_dia.MetricsModeLabel.title", 0),
        /** The metrics.mode enum */
        METRICS_MODE("metrics.mode", "DeviceDetail_dia_metrics_mode", DialogObjectType.TextField, null, DeviceDetail_osConst.METRICS.MODE, DEVICE_DATA, "METRICS_MODE_LABEL", "dialog.DeviceDetail_dia.metrics.mode.title", 9),
        /** The CommandCommandLabel enum */
        COMMAND_COMMAND_LABEL("CommandCommandLabel", "DeviceDetail_dia_commandCommandLabel", DialogObjectType.Label, null, null, COMMANDS, "COMMAND_COMMAND_LABEL", "dialog.DeviceDetail_dia.CommandCommandLabel.title", 0),
        /** The Command.command enum */
        COMMAND_COMMAND("Command.command", "DeviceDetail_dia_command_command", DialogObjectType.TextField, null, DeviceDetail_osConst.COMMAND.COMMAND, COMMANDS, "COMMAND_COMMAND_LABEL", "dialog.DeviceDetail_dia.Command.command.title", 10),
        /** The Send enum */
        SEND("Send", "DeviceDetail_dia_send", DialogObjectType.Button, null, null, COMMANDS, null, "dialog.DeviceDetail_dia.Send.title", 12),
        /** The CommandLevelLabel enum */
        COMMAND_LEVEL_LABEL("CommandLevelLabel", "DeviceDetail_dia_commandLevelLabel", DialogObjectType.Label, null, null, COMMANDS, "COMMAND_LEVEL_LABEL", "dialog.DeviceDetail_dia.CommandLevelLabel.title", 0),
        /** The Command.level enum */
        COMMAND_LEVEL("Command.level", "DeviceDetail_dia_command_level", DialogObjectType.TextField, null, DeviceDetail_osConst.COMMAND.LEVEL, COMMANDS, "COMMAND_LEVEL_LABEL", "dialog.DeviceDetail_dia.Command.level.title", 11),
        /** The Set enum */
        SET("Set", "DeviceDetail_dia_set", DialogObjectType.Button, null, null, COMMANDS, null, "dialog.DeviceDetail_dia.Set.title", 13),
        /** The CommandLevel2Label enum */
        COMMAND_LEVEL2_LABEL("CommandLevel2Label", "DeviceDetail_dia_commandLevel2Label", DialogObjectType.Label, null, null, COMMANDS, "COMMAND_LEVEL2_LABEL", "dialog.DeviceDetail_dia.CommandLevel2Label.title", 0),
        /** The Command.level.2 enum */
        COMMAND_LEVEL_2("Command.level.2", "DeviceDetail_dia_command_level_2", DialogObjectType.Scale, null, DeviceDetail_osConst.COMMAND.LEVEL, COMMANDS, "COMMAND_LEVEL2_LABEL", "dialog.DeviceDetail_dia.Command.level.2.title", 14),
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
