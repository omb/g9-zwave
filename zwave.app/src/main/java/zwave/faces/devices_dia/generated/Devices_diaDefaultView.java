// Generated with g9.

package zwave.faces.devices_dia.generated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import no.esito.jvine.controller.JVineController;
import no.esito.jvine.controller.OSNode;
import no.esito.jvine.view.ViewModelImpl;
import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.view.WindowEvent;
import no.g9.client.core.view.faces.FacesDialogView;
import no.g9.client.core.view.faces.FacesTableModel;
import no.g9.client.core.view.menu.Menu;
import no.g9.client.core.view.table.ListRowComparator;
import no.g9.client.core.view.table.TableModel;
import no.g9.os.AttributeConstant;
import no.g9.os.UsertypeRoleConstant;
import no.g9.support.ActionType;

import zwave.os.devices_os.generated.Devices_osConst;

/**
 * The default view class for the Devices_dia dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class Devices_diaDefaultView extends FacesDialogView {

    /**
     * Create a new Devices_diaDefaultView.
     */
    public Devices_diaDefaultView() {
        super(Devices_diaConst.DIALOG_NAME.DEVICES_DIA, Devices_diaConst.DIALOG.class);
    }

    @Override
    public final String getMessageBundleName() {
        return "zwave.faces.devices_dia.generated.messages";
    }

    @Override
    @SuppressWarnings("incomplete-switch")
    public void setAllFieldData(OSNode<?> role, Collection<?> instances) {
        if (log.isTraceEnabled()) {
            log.trace("Setting field data for: " + role);
        }
        Devices_osConst.OS roleEnum = (Devices_osConst.OS) role.getRoleConstant();
        switch(roleEnum) {
            case DEVICE_LIST:
                setDeviceListAndRelatedFields(role, instances);
                break;
            case DEVICES:
                setAllDevicesAndRelatedFields(role, instances);
                break;
            case METRICS:
                setMetricsAndRelatedFields(role, instances);
                break;
            default:
                break;
        }
    }

    /**
     * Get the devicesTable collection of DevicesTableRow rows.
     *
     * @return the devicesTable collection.
     */
    public List<DevicesTableRow> getDevicesTable() {
        return getViewModel().getDisplayList(Devices_osConst.OS.DEVICES);
    }

    /**
     * Set the devicesTable property. Calling this method will always
     * clear the collection, and then add all items in the given collection.
     *
     * @param devicesTable the items to add to the devicesTable collection.
     */
    public void setDevicesTable(List<DevicesTableRow> devicesTable) {
        TableModel<DevicesTableRow> tableModel = getViewModel().getTableModel(Devices_osConst.OS.DEVICES);
        tableModel.clear();
        if (devicesTable != null) {
            tableModel.add(devicesTable);
        }
    }

    private void setAllDevicesAndRelatedFields(OSNode<?> role, Collection<?> instances) {
        setAllDevicesTableData(role, instances);
    }

    private void setAllDevicesTableData(OSNode<?> role, Collection<?> instances) {
        if (role.getRoleConstant() == Devices_osConst.OS.DEVICES) {
            setDevicesAndRelatedFields(role, new ArrayList<Object>());
            List<DevicesTableRow> devicesTable;
            if (instances != null && !instances.isEmpty()) {
                boolean foundCurrent = false;
                devicesTable = new ArrayList<DevicesTableRow>();
                for (Object instance : instances) {
                    DevicesTableRow row = new DevicesTableRow(getDialogInstanceNumber());
                    for (DialogObjectConstant field : row.getFields()) {
                    	AttributeConstant attribute = field.getAttribute();
                    	if (!(attribute.getAttributeRole() instanceof UsertypeRoleConstant)) {
                            if (attribute instanceof Devices_osConst.DEVICES || role.isRelated(attribute)) {
                                Object modelValue = role.getValue(instance, attribute);
                                Object value = convertToView(field, modelValue);
                                row.setValue(field, value);
                            }
                        }
                    }
                    if (!foundCurrent && JVineController.getInstance(getDialogController()).isCurrent(instance, role)) {
                        row.setSelected(Boolean.TRUE);
                        ((ViewModelImpl)getViewModel()).setFieldValues(row);
                        foundCurrent = true;
                    }
                    if (log.isTraceEnabled()) {
                        log.trace("setAllDevicesTableData: " + row);
                    }
                    devicesTable.add(row);
                }
                setDevicesTable(devicesTable);
            } else {
                setDevicesTable(null);
            }
        }
    }

    private void setDeviceListAndRelatedFields(final OSNode<?> role, final Collection<?> instances) {
        if (role.getRoleConstant() == Devices_osConst.OS.DEVICE_LIST || role.isAncestorOf(Devices_osConst.OS.DEVICE_LIST)) {
            Object firstInstance = instances.isEmpty() ? null : instances.iterator().next();
            for (DialogObjectConstant field : getRoleFields(Devices_osConst.OS.DEVICE_LIST)) {
                if (firstInstance == null) {
                    setFieldValue(field, null);
                }
                else {
                    setFieldValue(field, role.getValue(firstInstance, field.getAttribute()));
                }
            }
        }
    }

    private void setDevicesAndRelatedFields(final OSNode<?> role, final Collection<?> instances) {
        if (role.getRoleConstant() == Devices_osConst.OS.DEVICES || role.isAncestorOf(Devices_osConst.OS.DEVICES)) {
            Object firstInstance = instances.isEmpty() ? null : instances.iterator().next();
            for (DialogObjectConstant field : getRoleFields(Devices_osConst.OS.DEVICES)) {
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
        if (role.getRoleConstant() == Devices_osConst.OS.METRICS || role.isAncestorOf(Devices_osConst.OS.METRICS)) {
            Object firstInstance = instances.isEmpty() ? null : instances.iterator().next();
            for (DialogObjectConstant field : getRoleFields(Devices_osConst.OS.METRICS)) {
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
        dcList.addAll(Arrays.asList(Devices_diaConst.DIALOG.values()));
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
        addRoleField(Devices_osConst.OS.DEVICE_LIST, Devices_diaConst.DIALOG.DEVICE_LIST_STRUCTURE_CHANGED);
        addRoleField(Devices_osConst.OS.DEVICE_LIST, Devices_diaConst.DIALOG.DEVICE_LIST_UPDATE_TIME);
        addRoleField(Devices_osConst.OS.DEVICES, Devices_diaConst.DIALOG.DEVICES_ID);
        addRoleField(Devices_osConst.OS.DEVICES, Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE);
        addRoleField(Devices_osConst.OS.METRICS, Devices_diaConst.DIALOG.METRICS_PROBE_TITLE);
        addRoleField(Devices_osConst.OS.METRICS, Devices_diaConst.DIALOG.METRICS_LEVEL);
        addRoleField(Devices_osConst.OS.DEVICES, Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME);
        addRoleList(Devices_osConst.OS.DEVICES, Devices_diaConst.DIALOG.DEVICES_TABLE, new FacesTableModel<DevicesTableRow>(DevicesTableRow.getColumnDefinitions(), getViewModel()));
        initDevicesTable();
        addMenus(setDialogInstanceNumberOnMenus(Devices_diaDefaultView.getDialogMenus()));
        performAction(ActionType.FOCUS, Devices_diaConst.DIALOG.DEVICE_FIND_ALL_BUTTON);
        super.initView();
    }

    public void initDevicesTable() {
        TableModel<DevicesTableRow> model = getViewModel().getTableModel(Devices_osConst.OS.DEVICES);
        model.setSelectionModel(TableModel.SelectionModel.SINGLE_SELECT);
        model.setListRowComparator(getDefaultComparatorsDevicesTable());
    };

    public List<ListRowComparator<DevicesTableRow>> getDefaultComparatorsDevicesTable() {
        List<ListRowComparator<DevicesTableRow>> comparators = new ArrayList<ListRowComparator<DevicesTableRow>>();
        if (Comparable.class.isAssignableFrom(Devices_diaConst.DIALOG.DEVICES_ID.getAttribute().getAttributeType())) {
            comparators.add(new ListRowComparator<DevicesTableRow>(Devices_diaConst.DIALOG.DEVICES_ID, 0, ListRowComparator.Sorting.NO_SORT));
        }
        if (Comparable.class.isAssignableFrom(Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE.getAttribute().getAttributeType())) {
            comparators.add(new ListRowComparator<DevicesTableRow>(Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE, 1, ListRowComparator.Sorting.NO_SORT));
        }
        if (Comparable.class.isAssignableFrom(Devices_diaConst.DIALOG.METRICS_PROBE_TITLE.getAttribute().getAttributeType())) {
            comparators.add(new ListRowComparator<DevicesTableRow>(Devices_diaConst.DIALOG.METRICS_PROBE_TITLE, 3, ListRowComparator.Sorting.NO_SORT));
        }
        if (Comparable.class.isAssignableFrom(Devices_diaConst.DIALOG.METRICS_LEVEL.getAttribute().getAttributeType())) {
            comparators.add(new ListRowComparator<DevicesTableRow>(Devices_diaConst.DIALOG.METRICS_LEVEL, 4, ListRowComparator.Sorting.NO_SORT));
        }
        if (Comparable.class.isAssignableFrom(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME.getAttribute().getAttributeType())) {
            comparators.add(new ListRowComparator<DevicesTableRow>(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME, 2, ListRowComparator.Sorting.NO_SORT));
        }
        Collections.sort(comparators);
        return comparators;
    };

}
