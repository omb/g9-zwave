// Generated with g9.

package zwave.faces.devicedetail_dia;

import me.zwave.vdev.Device;
import no.g9.client.core.action.CheckType;
import no.g9.client.core.action.DisplayableHookAdapter;
import no.g9.client.core.action.EventContext;
import no.g9.client.core.controller.DialogSetupValue;
import no.g9.client.core.controller.Interceptor;
import no.g9.os.RoleConstant;
import no.g9.support.ActionType;
import zwave.faces.devicedetail_dia.generated.DeviceDetail_diaConst.DIALOG;
import zwave.faces.devicedetail_dia.generated.DeviceDetail_diaDefaultController;
import zwave.faces.devicedetail_dia.generated.DeviceDetail_diaRemoteServices;
import zwave.os.devicedetail_os.generated.DeviceDetail_osConst;

/**
 * The customizable controller for the DeviceDetail_dia dialog.
 */
public final class DeviceDetail_diaController extends DeviceDetail_diaDefaultController {

    /*
     * Invoked after the dialog controller has been fully initialized and
     * the dependency between controller and application has been realized.
     * Developers should prefer this method to a constructor.
     */
    @Override
    public void init() {
        registerHook(DeviceDetail_diaRemoteServices.SERVICE.Z_AUTOMATION_GET_DEVICE, ActionType.INVOKE, new FindHook());
        registerInterceptor(CheckType.INVOKE, new MyInterceptor(DeviceDetail_osConst.OS.DEVICE));
        registerInterceptor(CheckType.INVOKE, new MyInterceptor(DeviceDetail_osConst.OS.COMMAND));
        registerInterceptor(CheckType.CLOSE, new MyInterceptor(DeviceDetail_osConst.OS.DEVICE));
        registerInterceptor(CheckType.CLOSE, new MyInterceptor(DeviceDetail_osConst.OS.COMMAND));
    }

    @Override
    public void setup(DialogSetupValue<?> setupValue) {
        if(setupValue instanceof DeviceSetup) {
            String deviceId= (String) setupValue.getSetupValue();
            findDevice(deviceId);
        }
    }

    private void findDevice(String deviceId) {
        setFieldValue(DIALOG.DEVICE_ID, deviceId);
        final EventContext event= new EventContext("getDevice", DIALOG.DEVICE_ID, "Invoke");
        super.getDevice(event);
    }

    class MyInterceptor extends Interceptor {

        public MyInterceptor(RoleConstant role) {
            super(role);
        }

        @Override
        public DIRECTIVE intercept(RoleConstant actionTarget) {
            return DIRECTIVE.CONTINUE;
        }
        
    }

    public class DeviceSetup implements DialogSetupValue<String> {

        private String deviceId;

        public DeviceSetup(String deviceId) {
            super();
            this.deviceId = deviceId;
        }

        @Override
        public String getSetupValue() {
            return deviceId;
        }

    }

    class FindHook extends DisplayableHookAdapter<Device> {

        @Override
        public void performed(Device result) {
            if (result.getDeviceType().startsWith("switch")) {
                getDialogView().enable(DIALOG.COMMANDS);
            }
            else {
                getDialogView().disable(DIALOG.COMMANDS);
            }
            super.performed(result);
        }

    }

}
