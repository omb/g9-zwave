// Generated with g9.

package zwave.faces.devices_dia.generated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceList;

import no.esito.jvine.action.ActionMethod;
import no.esito.jvine.controller.JVineController;
import no.esito.jvine.controller.OSNode;
import no.esito.log.Logger;
import no.g9.client.core.action.ActionHookAdapter;
import no.g9.client.core.action.ActionInfo;
import no.g9.client.core.action.EventContext;
import no.g9.client.core.controller.DialogConstant;
import no.g9.client.core.controller.DialogController;
import no.g9.message.CRuntimeMsg;
import no.g9.message.Message;
import no.g9.message.MessageSystem;
import no.g9.os.OSRole;
import no.g9.os.RoleConstant;
import no.g9.service.G9Spring;
import no.g9.support.ActionType;

import zwave.os.devices_os.generated.Devices_osConst;

/**
 * The default controller class for the Devices_dia dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class Devices_diaDefaultController extends DialogController {

    /**
     * The (generated) constant denoting this dialog.
     */
    public static final Devices_diaConst.DIALOG_NAME DIALOG_CONSTANT = Devices_diaConst.DIALOG_NAME.DEVICES_DIA;

    private Devices_diaRemoteServices remoteServices = new Devices_diaRemoteServices(this);

    /**
     * Default constructor, creates a new Devices_dia dialog control with
     * the specified name, and instantiates the object selection nodes.
     *
     * <p><strong>OBS:</strong> after construction the application controller
     * should be set, using the setApplicationController-method.
     */
    public Devices_diaDefaultController() {
        super("Devices_dia", null);
        initNodes();
        initEventMethods();
        initListHooks();
    }

    @Override
    @SuppressWarnings("unchecked")
    public final <T extends RoleConstant> T getOSConst(String roleName) {
        return (T) Devices_osConst.OS.getConst(roleName);
    }

    @Override
    public final Devices_diaConst.DIALOG_NAME getDialogConstant() {
        return Devices_diaDefaultController.DIALOG_CONSTANT;
    }

    @Override
    public final List<RoleConstant> getRoleConstants() {
        List<RoleConstant> rcList = new ArrayList<RoleConstant>();
        rcList.addAll(Arrays.asList(Devices_osConst.OS.values()));
        return rcList;
    }

    @Override
    public final String getObjectSelectionName() {
        return "Devices_os";
    }

    /**
     * Initiates the node of this dialog.
     */
    @SuppressWarnings("unchecked")
    private void initNodes() {
        Map<RoleConstant, OSRole<?>> osRoleMap = getRoleMap();
        OSNode<?> parent;
        OSNode<?> node;

        // The DeviceList node
        node = new OSNode<DeviceList>(null, this, (OSRole<DeviceList>) osRoleMap.get(Devices_osConst.OS.DEVICE_LIST));
        JVineController.getInstance(this).addOSNode(node);

        // The devices node
        parent = getOSRole(Devices_osConst.OS.DEVICE_LIST);
        node = new OSNode<Device>(parent, this, (OSRole<Device>) osRoleMap.get(Devices_osConst.OS.DEVICES));
        JVineController.getInstance(this).addOSNode(node);
    }

    @Override
    public Map<RoleConstant, OSRole<?>> getRoleMap() {
        return Devices_osConst.OSRoleFactory.getRoleMap();
    }

    /**
     * Initiates and registers the event methods that are defined in this dialog.
     */
    private void initEventMethods() {
        final JVineController jController = JVineController.getInstance(this);
        jController.registerEventMethod("findAllDevice", new ActionMethod() {
                public void run() {
                    try {
                        findAllDevice(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method findAllDevice";
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
        jController.registerEventMethod("openDeviceDetail", new ActionMethod() {
                public void run() {
                    try {
                        openDeviceDetail(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method openDeviceDetail";
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
        jController.registerEventMethod("closeDevices_dia", new ActionMethod() {
                public void run() {
                    try {
                        closeDevices_dia(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method closeDevices_dia";
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
        jController.registerEventMethod("selectDevicesTable", new ActionMethod() {
                public void run() {
                    try {
                        selectDevicesTable(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method selectDevicesTable";
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
        jController.registerEventMethod("unselectDevicesTable", new ActionMethod() {
                public void run() {
                    try {
                        unselectDevicesTable(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method unselectDevicesTable";
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
     *   <li>Invoke getDevices</li>
     * </ol>
     *
     * @param event the event context
     */
    public void findAllDevice(EventContext event) {
        performAction(ActionType.INVOKE, event, remoteServices.getFindAllDeviceGetDevices_1());
    }

    /**
     * Action method. Performs the following actions:
     * <ol>
     *   <li>Open DeviceDetail_dia</li>
     * </ol>
     *
     * @param event the event context
     */
    public void openDeviceDetail(EventContext event) {
        performAction(ActionType.OPEN, event, getApplicationController().getDialogConst("deviceDetail_dia"));
    }

    /**
     * Action method. Performs the following actions:
     * <ol>
     *   <li>Close Devices_dia</li>
     * </ol>
     *
     * @param event the event context
     */
    public void closeDevices_dia(EventContext event) {
        performAction(ActionType.CLOSE, event, getApplicationController().getDialogConst("devices_dia"));
    }
    /**
     * Action method. Performs the following actions:
     * <ol>
         *   <li>Select DevicesTable</li>
     * </ol>
     *
     * @param event the event context
     */
    public void selectDevicesTable(final EventContext event) {
        performAction(ActionType.SELECT, event, Devices_diaConst.DIALOG.DEVICES_TABLE);
    }
    /**
     * Action method. Performs the following actions:
     * <ol>
         *   <li>Unselect DevicesTable</li>
     * </ol>
     *
     * @param event the event context
     */
    public void unselectDevicesTable(final EventContext event) {
        performAction(ActionType.UNSELECT, event, Devices_diaConst.DIALOG.DEVICES_TABLE);
    }

   /**
    * Creates hooks for Selected/Unselected events.
    */
   private void initListHooks() {
       ActionHookAdapter<Object> selectedDevicesTableHook= new ActionHookAdapter<Object>() {

           @Override
           public void succeeded() {
               openDeviceDetail(getEvent());
           }
       };
       registerHook(Devices_diaConst.DIALOG.DEVICES_TABLE, ActionType.SELECT, selectedDevicesTableHook);

   }

   /**
     * @return a list of action info for all methods
    */
    public static Map<String, List<ActionInfo>> getDialogActions() {
        Map<String, List<ActionInfo>> dialogActions = new HashMap<String, List<ActionInfo>>();
        List<ActionInfo> methodActions;

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.INVOKE, Devices_diaRemoteServices.SERVICE.Z_AUTOMATION_GET_DEVICES, ""));
        dialogActions.put("findAllDevice", methodActions);

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.OPEN, (DialogConstant) G9Spring.getBean(DialogConstant.class, "deviceDetail_diaConstant"), ""));
        dialogActions.put("openDeviceDetail", methodActions);

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.CLOSE, Devices_diaConst.DIALOG_NAME.DEVICES_DIA, ""));
        dialogActions.put("closeDevices_dia", methodActions);

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.SELECT, Devices_diaConst.DIALOG.DEVICES_TABLE, ""));
        dialogActions.put("selectDevicesTable", methodActions);
        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.UNSELECT, Devices_diaConst.DIALOG.DEVICES_TABLE, ""));
        dialogActions.put("unselectDevicesTable", methodActions);

        return dialogActions;
    }

}
