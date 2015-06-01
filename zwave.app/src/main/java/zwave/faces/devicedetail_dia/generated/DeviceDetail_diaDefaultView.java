// Generated with g9.

package zwave.faces.devicedetail_dia.generated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import no.esito.jvine.controller.OSNode;
import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.view.WindowEvent;
import no.g9.client.core.view.faces.FacesDialogView;
import no.g9.client.core.view.menu.Menu;
import no.g9.support.ActionType;

import zwave.os.devicedetail_os.generated.DeviceDetail_osConst;

/**
 * The default view class for the DeviceDetail_dia dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class DeviceDetail_diaDefaultView extends FacesDialogView {

    /**
     * Create a new DeviceDetail_diaDefaultView.
     */
    public DeviceDetail_diaDefaultView() {
        super(DeviceDetail_diaConst.DIALOG_NAME.DEVICE_DETAIL_DIA, DeviceDetail_diaConst.DIALOG.class);
    }

    @Override
    public final String getMessageBundleName() {
        return "zwave.faces.devicedetail_dia.generated.messages";
    }

    @Override
    @SuppressWarnings("incomplete-switch")
    public void setAllFieldData(OSNode<?> role, Collection<?> instances) {
        if (log.isTraceEnabled()) {
            log.trace("Setting field data for: " + role);
        }
        DeviceDetail_osConst.OS roleEnum = (DeviceDetail_osConst.OS) role.getRoleConstant();
        switch(roleEnum) {
            case DEVICE:
                setDeviceAndRelatedFields(role, instances);
                break;
            case METRICS:
                setMetricsAndRelatedFields(role, instances);
                break;
            case COMMAND:
                setCommandAndRelatedFields(role, instances);
                break;
            default:
                break;
        }
    }

    private void setDeviceAndRelatedFields(final OSNode<?> role, final Collection<?> instances) {
        if (role.getRoleConstant() == DeviceDetail_osConst.OS.DEVICE || role.isAncestorOf(DeviceDetail_osConst.OS.DEVICE)) {
            Object firstInstance = instances.isEmpty() ? null : instances.iterator().next();
            for (DialogObjectConstant field : getRoleFields(DeviceDetail_osConst.OS.DEVICE)) {
                if (firstInstance == null) {
                    setFieldValue(field, null);
                }
                else {
                    setFieldValue(field, role.getValue(firstInstance, field.getAttribute()));
                }
            }
            setMetricsAndRelatedFields(role, instances);
        }
    }

    private void setMetricsAndRelatedFields(final OSNode<?> role, final Collection<?> instances) {
        if (role.getRoleConstant() == DeviceDetail_osConst.OS.METRICS || role.isAncestorOf(DeviceDetail_osConst.OS.METRICS)) {
            Object firstInstance = instances.isEmpty() ? null : instances.iterator().next();
            for (DialogObjectConstant field : getRoleFields(DeviceDetail_osConst.OS.METRICS)) {
                if (firstInstance == null) {
                    setFieldValue(field, null);
                }
                else {
                    setFieldValue(field, role.getValue(firstInstance, field.getAttribute()));
                }
            }
        }
    }

    private void setCommandAndRelatedFields(final OSNode<?> role, final Collection<?> instances) {
        if (role.getRoleConstant() == DeviceDetail_osConst.OS.COMMAND || role.isAncestorOf(DeviceDetail_osConst.OS.COMMAND)) {
            Object firstInstance = instances.isEmpty() ? null : instances.iterator().next();
            for (DialogObjectConstant field : getRoleFields(DeviceDetail_osConst.OS.COMMAND)) {
                if (firstInstance == null) {
                    setFieldValue(field, null);
                }
                else {
                    setFieldValue(field, role.getValue(firstInstance, field.getAttribute()));
                }
            }
        }
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
        dcList.addAll(Arrays.asList(DeviceDetail_diaConst.DIALOG.values()));
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
        setEditable(DeviceDetail_diaConst.DIALOG.DEVICE_DEVICE_TYPE, false);
        setEditable(DeviceDetail_diaConst.DIALOG.DEVICE_UPDATE_TIME, false);
        setEditable(DeviceDetail_diaConst.DIALOG.METRICS_PROBE_TITLE, false);
        setEditable(DeviceDetail_diaConst.DIALOG.METRICS_SCALE_TITLE, false);
        setEditable(DeviceDetail_diaConst.DIALOG.METRICS_LEVEL, false);
        setEditable(DeviceDetail_diaConst.DIALOG.METRICS_ICON, false);
        setEditable(DeviceDetail_diaConst.DIALOG.METRICS_TITLE, false);
        setEditable(DeviceDetail_diaConst.DIALOG.METRICS_MODE, false);
        addRoleField(DeviceDetail_osConst.OS.DEVICE, DeviceDetail_diaConst.DIALOG.DEVICE_ID);
        addRoleField(DeviceDetail_osConst.OS.DEVICE, DeviceDetail_diaConst.DIALOG.DEVICE_DEVICE_TYPE);
        addRoleField(DeviceDetail_osConst.OS.DEVICE, DeviceDetail_diaConst.DIALOG.DEVICE_UPDATE_TIME);
        addRoleField(DeviceDetail_osConst.OS.METRICS, DeviceDetail_diaConst.DIALOG.METRICS_PROBE_TITLE);
        addRoleField(DeviceDetail_osConst.OS.METRICS, DeviceDetail_diaConst.DIALOG.METRICS_SCALE_TITLE);
        addRoleField(DeviceDetail_osConst.OS.METRICS, DeviceDetail_diaConst.DIALOG.METRICS_LEVEL);
        addRoleField(DeviceDetail_osConst.OS.METRICS, DeviceDetail_diaConst.DIALOG.METRICS_ICON);
        addRoleField(DeviceDetail_osConst.OS.METRICS, DeviceDetail_diaConst.DIALOG.METRICS_TITLE);
        addRoleField(DeviceDetail_osConst.OS.METRICS, DeviceDetail_diaConst.DIALOG.METRICS_MODE);
        addRoleField(DeviceDetail_osConst.OS.COMMAND, DeviceDetail_diaConst.DIALOG.COMMAND_COMMAND);
        addRoleField(DeviceDetail_osConst.OS.COMMAND, DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL);
        addRoleField(DeviceDetail_osConst.OS.COMMAND, DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL_2);
        addMenus(setDialogInstanceNumberOnMenus(DeviceDetail_diaDefaultView.getDialogMenus()));
        performAction(ActionType.FOCUS, DeviceDetail_diaConst.DIALOG.DEVICE_ID);
        super.initView();
    }

}
