// Generated with g9.

package zwave.faces.devices_dia;

import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceList;
import no.g9.client.core.action.ActionHookAdapter;
import no.g9.client.core.action.DisplayableHookAdapter;
import no.g9.client.core.controller.DialogConstant;
import no.g9.support.ActionType;
import zwave.faces.devicedetail_dia.DeviceDetail_diaController;
import zwave.faces.devicedetail_dia.generated.DeviceDetail_diaConst;
import zwave.faces.devices_dia.generated.Devices_diaConst.DIALOG;
import zwave.faces.devices_dia.generated.Devices_diaDefaultController;
import zwave.faces.devices_dia.generated.Devices_diaRemoteServices;

/**
 * The customizable controller for the Devices_dia dialog.
 */
public final class Devices_diaController extends Devices_diaDefaultController {

    /*
     * Invoked after the dialog controller has been fully initialized and
     * the dependency between controller and application has been realized.
     * Developers should prefer this method to a constructor.
     */
    @Override
    public void init() {
        registerHook(Devices_diaRemoteServices.SERVICE.Z_AUTOMATION_GET_DEVICES, ActionType.INVOKE, new InvokeHook());
        registerHook(DeviceDetail_diaConst.DIALOG_NAME.DEVICE_DETAIL_DIA, ActionType.OPEN, new OpenHook());
    }

    class InvokeHook extends DisplayableHookAdapter<DeviceList> {

        /**
         * @param result .
         */
        @Override
        public void performed(DeviceList result) {
            if (result != null) {
                DeviceList dl = result;
                System.out.println("Available devices since: " + dl.getUpdateTime());
                for (Device d : dl.getDevices()) {
                    System.out.println(d);
                }
            }
        }

    }

    class OpenHook extends ActionHookAdapter<DialogConstant> {

        @Override
        public void initialized() {
            final String deviceId = getFieldValue(DIALOG.DEVICES_ID);
            final DeviceDetail_diaController ctrl = getApplicationController().getDialogController(DeviceDetail_diaConst.DIALOG_NAME.DEVICE_DETAIL_DIA);
            getCurrentAction().setActionSetupValue(ctrl.new DeviceSetup(deviceId));
            super.initialized();
        }

    }
}
