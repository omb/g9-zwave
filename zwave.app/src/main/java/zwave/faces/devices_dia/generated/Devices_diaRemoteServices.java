// Generated with g9.

package zwave.faces.devices_dia.generated;

import me.zwave.vdev.DeviceList;
import me.zwave.vdev.ZAutomation;

import no.esito.jvine.rpc.ActualParameter;
import no.esito.jvine.rpc.ParameterBindingImpl;
import no.esito.jvine.rpc.RemoteServiceImpl;
import no.g9.client.core.action.ActionTask;
import no.g9.client.core.action.ParameterBinding;
import no.g9.client.core.action.RemoteServiceTarget;
import no.g9.client.core.controller.DialogController;
import no.g9.os.RoleConstant;
import no.g9.service.G9Spring;
import no.g9.service.RemoteServiceConstant;

/**
 * Declares the various remote service targets used when invoking remote services.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public final class Devices_diaRemoteServices {

    private final DialogController dialogController;

    /**
     * The methods invoked from the Devices_dia dialog.
     */
    public static enum SERVICE implements RemoteServiceConstant {
        /** The zAutomation.getDevices service */
        Z_AUTOMATION_GET_DEVICES("getDevices");

        private String name;

        private SERVICE(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /**
     * Construct a new remote service target
     * @param dialogController the dialog that uses this service.
     */
    public Devices_diaRemoteServices(DialogController dialogController) {
        this.dialogController = dialogController;
    }

    /**
     * Used when invoking the remote service getDevices from
     * the dialog method findAllDevice.
     * @return the target capable of invoking the service.
     */
    RemoteServiceTarget getFindAllDeviceGetDevices_1() {
        final RemoteServiceImpl remote = new RemoteServiceImpl(SERVICE.Z_AUTOMATION_GET_DEVICES);

        ActualParameter<DeviceList> DeviceList_0 = new ActualParameter<DeviceList>(dialogController, "DeviceList_0", ActualParameter.ParameterType.ROLE);
        RoleConstant DeviceList_0Role = dialogController.getOSConst("DeviceList");
        DeviceList_0.setRole(DeviceList_0Role);
        ParameterBinding<DeviceList> binding_0 = ParameterBindingImpl.getBinding("getDevices", DeviceList_0, null, ParameterBinding.RETURN_VALUE);
        remote.addParameterBinding(binding_0);

        ActionTask<DeviceList> actionTask = new ActionTask<DeviceList> () {

            @Override
            public DeviceList call() throws Exception {

                ZAutomation zAutomation = G9Spring.getBean(ZAutomation.class, "zAutomation");
                DeviceList result = zAutomation.getDevices();

                ParameterBinding<DeviceList> returnParameter = remote.getReturnParameter();
                returnParameter.setFormalParameterValue(result);
                DeviceList value = returnParameter.getActualParameter().getParameterValue();
                setTaskObject(value);
                return value;
            }
        };

        remote.setActionTask(actionTask);
        return remote;
    }

}
