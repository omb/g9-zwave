// Generated with g9.

package zwave.faces.devicedetail_dia.generated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.zwave.vdev.Command;
import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceMetrics;

import no.esito.jvine.action.ActionMethod;
import no.esito.jvine.controller.JVineController;
import no.esito.jvine.controller.OSNode;
import no.esito.log.Logger;
import no.g9.client.core.action.ActionInfo;
import no.g9.client.core.action.EventContext;
import no.g9.client.core.controller.DialogController;
import no.g9.message.CRuntimeMsg;
import no.g9.message.Message;
import no.g9.message.MessageSystem;
import no.g9.os.OSRole;
import no.g9.os.RoleConstant;
import no.g9.support.ActionType;

import zwave.os.devicedetail_os.generated.DeviceDetail_osConst;

/**
 * The default controller class for the DeviceDetail_dia dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class DeviceDetail_diaDefaultController extends DialogController {

    /**
     * The (generated) constant denoting this dialog.
     */
    public static final DeviceDetail_diaConst.DIALOG_NAME DIALOG_CONSTANT = DeviceDetail_diaConst.DIALOG_NAME.DEVICE_DETAIL_DIA;

    private DeviceDetail_diaRemoteServices remoteServices = new DeviceDetail_diaRemoteServices(this);

    /**
     * Default constructor, creates a new DeviceDetail_dia dialog control with
     * the specified name, and instantiates the object selection nodes.
     *
     * <p><strong>OBS:</strong> after construction the application controller
     * should be set, using the setApplicationController-method.
     */
    public DeviceDetail_diaDefaultController() {
        super("DeviceDetail_dia", null);
        initNodes();
        initEventMethods();
        initListHooks();
    }

    @Override
    @SuppressWarnings("unchecked")
    public final <T extends RoleConstant> T getOSConst(String roleName) {
        return (T) DeviceDetail_osConst.OS.getConst(roleName);
    }

    @Override
    public final DeviceDetail_diaConst.DIALOG_NAME getDialogConstant() {
        return DeviceDetail_diaDefaultController.DIALOG_CONSTANT;
    }

    @Override
    public final List<RoleConstant> getRoleConstants() {
        List<RoleConstant> rcList = new ArrayList<RoleConstant>();
        rcList.addAll(Arrays.asList(DeviceDetail_osConst.OS.values()));
        return rcList;
    }

    @Override
    public final String getObjectSelectionName() {
        return "DeviceDetail_os";
    }

    /**
     * Initiates the node of this dialog.
     */
    @SuppressWarnings("unchecked")
    private void initNodes() {
        Map<RoleConstant, OSRole<?>> osRoleMap = getRoleMap();
        OSNode<?> parent;
        OSNode<?> node;

        // The Device node
        node = new OSNode<Device>(null, this, (OSRole<Device>) osRoleMap.get(DeviceDetail_osConst.OS.DEVICE));
        JVineController.getInstance(this).addOSNode(node);

        // The metrics node
        parent = getOSRole(DeviceDetail_osConst.OS.DEVICE);
        node = new OSNode<DeviceMetrics>(parent, this, (OSRole<DeviceMetrics>) osRoleMap.get(DeviceDetail_osConst.OS.METRICS));
        JVineController.getInstance(this).addOSNode(node);

        // The Command node
        node = new OSNode<Command>(null, this, (OSRole<Command>) osRoleMap.get(DeviceDetail_osConst.OS.COMMAND));
        JVineController.getInstance(this).addOSNode(node);
    }

    @Override
    public Map<RoleConstant, OSRole<?>> getRoleMap() {
        return DeviceDetail_osConst.OSRoleFactory.getRoleMap();
    }

    /**
     * Initiates and registers the event methods that are defined in this dialog.
     */
    private void initEventMethods() {
        final JVineController jController = JVineController.getInstance(this);
        jController.registerEventMethod("closeDeviceDetail_dia", new ActionMethod() {
                public void run() {
                    try {
                        closeDeviceDetail_dia(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method closeDeviceDetail_dia";
                        Logger.getLogger(this.getClass()).error(msg, e);
                        Message message = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CAUGHT, msg);
                        message.setException(e);
                        message.setReplString("OK");
                        dispatchMessage(message);
                    } finally {
                        jController.releaseGui();
                    }
                }
            });
        jController.registerEventMethod("sendCommand", new ActionMethod() {
                public void run() {
                    try {
                        sendCommand(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method sendCommand";
                        Logger.getLogger(this.getClass()).error(msg, e);
                        Message message = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CAUGHT, msg);
                        message.setException(e);
                        message.setReplString("OK");
                        dispatchMessage(message);
                    } finally {
                        jController.releaseGui();
                    }
                }
            });
        jController.registerEventMethod("setLevel", new ActionMethod() {
                public void run() {
                    try {
                        setLevel(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method setLevel";
                        Logger.getLogger(this.getClass()).error(msg, e);
                        Message message = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CAUGHT, msg);
                        message.setException(e);
                        message.setReplString("OK");
                        dispatchMessage(message);
                    } finally {
                        jController.releaseGui();
                    }
                }
            });
        jController.registerEventMethod("getDevice", new ActionMethod() {
                public void run() {
                    try {
                        getDevice(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method getDevice";
                        Logger.getLogger(this.getClass()).error(msg, e);
                        Message message = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CAUGHT, msg);
                        message.setException(e);
                        message.setReplString("OK");
                        dispatchMessage(message);
                    } finally {
                        jController.releaseGui();
                    }
                }
            });
    }

    /**
     * Action method. Performs the following actions:
     * <ol>
     *   <li>Close DeviceDetail_dia</li>
     * </ol>
     *
     * @param event the event context
     */
    public void closeDeviceDetail_dia(EventContext event) {
        performAction(ActionType.CLOSE, event, getApplicationController().getDialogConst("deviceDetail_dia"));
    }

    /**
     * Action method. Performs the following actions:
     * <ol>
     *   <li>Invoke sendCommand</li>
     * </ol>
     *
     * @param event the event context
     */
    public void sendCommand(EventContext event) {
        performAction(ActionType.INVOKE, event, remoteServices.getSendCommandSendCommand_1());
    }

    /**
     * Action method. Performs the following actions:
     * <ol>
     *   <li>Invoke setExactLevel</li>
     * </ol>
     *
     * @param event the event context
     */
    public void setLevel(EventContext event) {
        performAction(ActionType.INVOKE, event, remoteServices.getSetLevelSetExactLevel_1());
    }

    /**
     * Action method. Performs the following actions:
     * <ol>
     *   <li>Invoke getDevice</li>
     * </ol>
     *
     * @param event the event context
     */
    public void getDevice(EventContext event) {
        performAction(ActionType.INVOKE, event, remoteServices.getGetDeviceGetDevice_1());
    }

   /**
    * Creates hooks for Selected/Unselected events.
    */
   private void initListHooks() {
   }

   /**
     * @return a list of action info for all methods
    */
    public static Map<String, List<ActionInfo>> getDialogActions() {
        Map<String, List<ActionInfo>> dialogActions = new HashMap<String, List<ActionInfo>>();
        List<ActionInfo> methodActions;

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.CLOSE, DeviceDetail_diaConst.DIALOG_NAME.DEVICE_DETAIL_DIA, ""));
        dialogActions.put("closeDeviceDetail_dia", methodActions);

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.INVOKE, DeviceDetail_diaRemoteServices.SERVICE.Z_AUTOMATION_SEND_COMMAND, ""));
        dialogActions.put("sendCommand", methodActions);

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.INVOKE, DeviceDetail_diaRemoteServices.SERVICE.Z_AUTOMATION_SET_EXACT_LEVEL, ""));
        dialogActions.put("setLevel", methodActions);

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.INVOKE, DeviceDetail_diaRemoteServices.SERVICE.Z_AUTOMATION_GET_DEVICE, ""));
        dialogActions.put("getDevice", methodActions);

        return dialogActions;
    }

}
