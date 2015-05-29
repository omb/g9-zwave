// Generated with g9.

package zwave.faces.applicationwindow.generated;

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

/**
 * Interface containing view constants for the ApplicationWindow dialog.
 * The interface contains two enumerations. DIALOG_NAME is the enumeration that
 * lists the name of the dialog. DIALOG is the enumeration that lists all dialog
 * objects in the ApplicationWindow dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public interface ApplicationWindowConst {

    /**
     * Constant denoting the ApplicationWindow dialog.
     */
	public static enum DIALOG_NAME implements DialogConstant {
	    /** The ApplicationWindow dialog. */
	    APPLICATION_WINDOW("ApplicationWindow", "applicationWindow", "ApplicationWindow", WindowType.APPLICATION_WINDOW, 0);

	    /**
	     * Get the generated DIALOG_NAME enum.
	     * @return the name of the dialog
	     */
	    public final static DIALOG_NAME getName() {
	        return APPLICATION_WINDOW;
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
     * Enum containing constants for all dialog objects in the ApplicationWindow dialog.
     */
    public static enum DIALOG implements DialogObjectConstant {
        /** The Window enum */
        WINDOW("Window", "ApplicationWindow_window", DialogObjectType.WindowBlock, null, null, DIALOG_NAME.APPLICATION_WINDOW, null, "dialog.ApplicationWindow.Window.title", 0),
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
