// Generated with g9.

package zwave.faces.applicationwindow.generated;

import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.view.faces.FacesDialogBean;

import org.icefaces.ace.event.CloseEvent;

/**
 * JSF managed bean for the ApplicationWindow dialog. This is the default (super)
 * class, inherited by the ApplicationWindowBean class.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class ApplicationWindowDefaultBean extends FacesDialogBean {

    private static final long serialVersionUID = 1L;

    /**
     * Create a new ApplicationWindowDefaultBean.
     */
    public ApplicationWindowDefaultBean() {
        super(ApplicationWindowConst.DIALOG_NAME.APPLICATION_WINDOW);
    }

    /**
     * @return true if the application has dirty dialogs, else false
     */
    public String get_dirtyDialogs() {
        if (getApplicationBean().getApplicationView().hasDirtyDialogs()) {
            return "true";
        }
        return "false";
    }

    /**
     * Empty setter for the dirtyDialogs field.
     */
    public void set_dirtyDialogs(String _communicationInput) {
        // Do nothing.
    }

    /**
     * The event handler for the WM Close event on the Window WindowBlock.
     *
     * @param event the JSF event
     */
    public void window_WMClose(CloseEvent event) {
        setAsActiveInstance();
        DialogObjectConstant field = ApplicationWindowConst.DIALOG.WINDOW;
        dispatchEvent(field, "WM Close", "exit");
    }

    @Override
    public void initBean() {
        initPropertyMaps(ApplicationWindowConst.DIALOG.class);
    }

}
