// Generated with g9.

package zwave.faces.devices_dia;

import java.util.List;

import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceList;
import no.g9.client.core.action.DisplayableHookAdapter;
import no.g9.support.ActionType;
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

}
