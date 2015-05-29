// Generated with g9.

package zwave.faces.applicationwindow.generated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import no.esito.jvine.controller.OSNode;
import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.view.WindowEvent;
import no.g9.client.core.view.faces.FacesDialogView;
import no.g9.client.core.view.menu.Menu;

/**
 * The default view class for the ApplicationWindow dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class ApplicationWindowDefaultView extends FacesDialogView {

    /**
     * Create a new ApplicationWindowDefaultView.
     */
    public ApplicationWindowDefaultView() {
        super(ApplicationWindowConst.DIALOG_NAME.APPLICATION_WINDOW, ApplicationWindowConst.DIALOG.class);
    }

    @Override
    public final String getMessageBundleName() {
        return "zwave.faces.applicationwindow.generated.messages";
    }

    @Override
    public void setAllFieldData(OSNode<?> role, Collection<?> instances) {
        // Empty
    }

    @SuppressWarnings("incomplete-switch")
    @Override
    protected void triggerWindowEvent(WindowEvent type) {
        switch (type) {
        case OPENED:
            setOpen(true);
            break;
        case CLOSED:
            setOpen(false);
            break;
        case SHOWN:
            setShown(true);
            break;
        case HIDDEN:
            setShown(false);
            break;
        default:
            break;
        }
    }

    @Override
    public final List<DialogObjectConstant> getDialogObjectConstants() {
        List<DialogObjectConstant> dcList = new ArrayList<DialogObjectConstant>();
        dcList.addAll(Arrays.asList(ApplicationWindowConst.DIALOG.values()));
        return dcList;
    }

    /**
     * @return a list of all menus for this dialog
     */
    public static List<Menu> getDialogMenus() {
        List<Menu> dialogMenus = new ArrayList<Menu>();

        return dialogMenus;
    }

    @Override
    public void initView() {
        setShown(true);
        getApplicationView().addMenus(setDialogInstanceNumberOnMenus(ApplicationWindowDefaultView.getDialogMenus()));
        super.initView();
    }

}
