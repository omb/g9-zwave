// Generated with g9.

package zwave.faces.generated;

import no.g9.client.core.controller.DialogConstant;
import no.g9.client.core.view.faces.FacesApplicationView;

/**
 * This is the super class for the application view.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public class ZwayAppDefaultView extends FacesApplicationView {

    /**
     * Create a new ZwayAppDefaultView().
     */
    public ZwayAppDefaultView() {
        super(new zwave.faces.ZwayAppController());
    }

    @Override
    protected DialogConstant getFirstDialog() {
        return zwave.faces.devices_dia.generated.Devices_diaConst.DIALOG_NAME.DEVICES_DIA;
    }

    @Override
    public String getEmptyDialogName() {
        return "dummy-empty";
    }

    @Override
    public void sendPushMessage() {
        // We do not want to send push messages when in standalone mode.
    }

    @Override
    public void sendElevateMessage() {
        // We do not want to send elevate messages when in standalone mode.
    }

    @Override
    public void sendPopMessage() {
        // We do not want to send pop messages when in standalone mode.
    }

}
