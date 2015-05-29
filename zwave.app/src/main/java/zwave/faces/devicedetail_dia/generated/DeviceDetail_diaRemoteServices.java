// Generated with g9.

package zwave.faces.devicedetail_dia.generated;

import java.util.List;

import me.zwave.vdev.Device;
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
public final class DeviceDetail_diaRemoteServices {

    private final DialogController dialogController;

    /**
     * The methods invoked from the DeviceDetail_dia dialog.
     */
    public static enum SERVICE implements RemoteServiceConstant {
        /** The zAutomation.sendCommand service */
        Z_AUTOMATION_SEND_COMMAND("sendCommand"),
        /** The zAutomation.setExactLevel service */
        Z_AUTOMATION_SET_EXACT_LEVEL("setExactLevel"),
        /** The zAutomation.getDevice service */
        Z_AUTOMATION_GET_DEVICE("getDevice");

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
    public DeviceDetail_diaRemoteServices(DialogController dialogController) {
        this.dialogController = dialogController;
    }

    /**
     * Used when invoking the remote service sendCommand from
     * the dialog method sendCommand.
     * @return the target capable of invoking the service.
     */
    RemoteServiceTarget getSendCommandSendCommand_1() {
        final RemoteServiceImpl remote = new RemoteServiceImpl(SERVICE.Z_AUTOMATION_SEND_COMMAND);

        ActualParameter<Object> unbound_0 = new ActualParameter<Object>(dialogController, "unbound_0", ActualParameter.ParameterType.UNBOUND);
        ParameterBinding<Object> binding_0 = ParameterBindingImpl.getBinding("sendCommand", unbound_0, null, ParameterBinding.RETURN_VALUE);
        remote.addParameterBinding(binding_0);

        ActualParameter<String> id_1 = new ActualParameter<String>(dialogController, "id_1", ActualParameter.ParameterType.ATTRIBUTE);
        RoleConstant id_1Role = dialogController.getOSConst("Device");
        id_1.setRole(id_1Role);
        id_1.setAttribute(dialogController.getOSRole(id_1Role).getAttributeConstant("id"));
        ParameterBinding<String> binding_1 = ParameterBindingImpl.getBinding("deviceId", id_1, null);
        remote.addParameterBinding(binding_1);

        ActualParameter<String> command_2 = new ActualParameter<String>(dialogController, "command_2", ActualParameter.ParameterType.ATTRIBUTE);
        RoleConstant command_2Role = dialogController.getOSConst("Command");
        command_2.setRole(command_2Role);
        command_2.setAttribute(dialogController.getOSRole(command_2Role).getAttributeConstant("command"));
        ParameterBinding<String> binding_2 = ParameterBindingImpl.getBinding("command", command_2, null);
        remote.addParameterBinding(binding_2);

        ActionTask<Void> actionTask = new ActionTask<Void> () {

            @Override
            public Void call() throws Exception {
                List<ParameterBinding<?>> bindings = remote.getParameterBindings();
                String deviceId = bindings.get(0).getFormalParameterValue();
                String command = bindings.get(1).getFormalParameterValue();

                ZAutomation zAutomation = G9Spring.getBean(ZAutomation.class, "zAutomation");
                zAutomation.sendCommand(deviceId, command);

                setTaskObject(null);
                return null;
            }
        };

        remote.setActionTask(actionTask);
        return remote;
    }

    /**
     * Used when invoking the remote service setExactLevel from
     * the dialog method setLevel.
     * @return the target capable of invoking the service.
     */
    RemoteServiceTarget getSetLevelSetExactLevel_1() {
        final RemoteServiceImpl remote = new RemoteServiceImpl(SERVICE.Z_AUTOMATION_SET_EXACT_LEVEL);

        ActualParameter<Object> unbound_0 = new ActualParameter<Object>(dialogController, "unbound_0", ActualParameter.ParameterType.UNBOUND);
        ParameterBinding<Object> binding_0 = ParameterBindingImpl.getBinding("setExactLevel", unbound_0, null, ParameterBinding.RETURN_VALUE);
        remote.addParameterBinding(binding_0);

        ActualParameter<String> id_1 = new ActualParameter<String>(dialogController, "id_1", ActualParameter.ParameterType.ATTRIBUTE);
        RoleConstant id_1Role = dialogController.getOSConst("Device");
        id_1.setRole(id_1Role);
        id_1.setAttribute(dialogController.getOSRole(id_1Role).getAttributeConstant("id"));
        ParameterBinding<String> binding_1 = ParameterBindingImpl.getBinding("deviceId", id_1, null);
        remote.addParameterBinding(binding_1);

        ActualParameter<Integer> level_2 = new ActualParameter<Integer>(dialogController, "level_2", ActualParameter.ParameterType.ATTRIBUTE);
        RoleConstant level_2Role = dialogController.getOSConst("Command");
        level_2.setRole(level_2Role);
        level_2.setAttribute(dialogController.getOSRole(level_2Role).getAttributeConstant("level"));
        ParameterBinding<Integer> binding_2 = ParameterBindingImpl.getBinding("level", level_2, null);
        remote.addParameterBinding(binding_2);

        ActionTask<Void> actionTask = new ActionTask<Void> () {

            @Override
            public Void call() throws Exception {
                List<ParameterBinding<?>> bindings = remote.getParameterBindings();
                String deviceId = bindings.get(0).getFormalParameterValue();
                int level = ((Integer) bindings.get(1).getFormalParameterValue()).intValue();

                ZAutomation zAutomation = G9Spring.getBean(ZAutomation.class, "zAutomation");
                zAutomation.setExactLevel(deviceId, level);

                setTaskObject(null);
                return null;
            }
        };

        remote.setActionTask(actionTask);
        return remote;
    }

    /**
     * Used when invoking the remote service getDevice from
     * the dialog method getDevice.
     * @return the target capable of invoking the service.
     */
    RemoteServiceTarget getGetDeviceGetDevice_1() {
        final RemoteServiceImpl remote = new RemoteServiceImpl(SERVICE.Z_AUTOMATION_GET_DEVICE);

        ActualParameter<Device> Device_0 = new ActualParameter<Device>(dialogController, "Device_0", ActualParameter.ParameterType.ROLE);
        RoleConstant Device_0Role = dialogController.getOSConst("Device");
        Device_0.setRole(Device_0Role);
        ParameterBinding<Device> binding_0 = ParameterBindingImpl.getBinding("getDevice", Device_0, null, ParameterBinding.RETURN_VALUE);
        remote.addParameterBinding(binding_0);

        ActualParameter<String> id_1 = new ActualParameter<String>(dialogController, "id_1", ActualParameter.ParameterType.ATTRIBUTE);
        RoleConstant id_1Role = dialogController.getOSConst("Device");
        id_1.setRole(id_1Role);
        id_1.setAttribute(dialogController.getOSRole(id_1Role).getAttributeConstant("id"));
        ParameterBinding<String> binding_1 = ParameterBindingImpl.getBinding("deviceId", id_1, null);
        remote.addParameterBinding(binding_1);

        ActionTask<Device> actionTask = new ActionTask<Device> () {

            @Override
            public Device call() throws Exception {
                List<ParameterBinding<?>> bindings = remote.getParameterBindings();
                String deviceId = bindings.get(0).getFormalParameterValue();

                ZAutomation zAutomation = G9Spring.getBean(ZAutomation.class, "zAutomation");
                Device result = zAutomation.getDevice(deviceId);

                ParameterBinding<Device> returnParameter = remote.getReturnParameter();
                returnParameter.setFormalParameterValue(result);
                Device value = returnParameter.getActualParameter().getParameterValue();
                setTaskObject(value);
                return value;
            }
        };

        remote.setActionTask(actionTask);
        return remote;
    }

}
