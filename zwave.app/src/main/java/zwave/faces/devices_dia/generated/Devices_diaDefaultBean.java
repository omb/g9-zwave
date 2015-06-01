// Generated with g9.

package zwave.faces.devices_dia.generated;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.view.ListRow;
import no.g9.client.core.view.faces.FacesDialogBean;
import no.g9.client.core.view.faces.NumberConverter;
import no.g9.client.core.view.table.TableModel.SelectionModel;

import org.icefaces.ace.event.CloseEvent;
import org.icefaces.ace.event.SelectEvent;
import org.icefaces.ace.event.UnselectEvent;
import org.icefaces.ace.model.table.RowStateMap;

import zwave.os.devices_os.generated.Devices_osConst;

/**
 * JSF managed bean for the Devices_dia dialog. This is the default (super)
 * class, inherited by the Devices_diaBean class.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class Devices_diaDefaultBean extends FacesDialogBean {

    private static final long serialVersionUID = 1L;

    /**
     * Create a new Devices_diaDefaultBean.
     */
    public Devices_diaDefaultBean() {
        super(Devices_diaConst.DIALOG_NAME.DEVICES_DIA);
    }

    /**
     * Get the deviceList_structureChanged property.
     *
     * @return the deviceList_structureChanged property
     */
    public Boolean getDeviceList_structureChanged() {
        return (Boolean) getField(Devices_diaConst.DIALOG.DEVICE_LIST_STRUCTURE_CHANGED);
    }

    /**
     * Set the deviceList_structureChanged property.
     *
     * @param deviceList_structureChanged the new value for the deviceList_structureChanged property
     */
    public void setDeviceList_structureChanged(Boolean deviceList_structureChanged) {
        setField(Devices_diaConst.DIALOG.DEVICE_LIST_STRUCTURE_CHANGED, deviceList_structureChanged);
    }

    private static final NumberConverter deviceList_updateTime_converter;
    static {
        deviceList_updateTime_converter = new NumberConverter();
        deviceList_updateTime_converter.setInputLength(11);
        deviceList_updateTime_converter.setStoredLength(0);
        deviceList_updateTime_converter.setScale(0);
        deviceList_updateTime_converter.setBlankWhenZero(false);
        deviceList_updateTime_converter.setDataType("longint");
        deviceList_updateTime_converter.setDisplayRule("");
    }

    /**
     * Get the converted deviceList_updateTime property.
     * The converted property is converted to/from String
     * according to the display rule and other type properties.
     *
     * @return the converted deviceList_updateTime property
     */
    protected Integer getDeviceList_updateTime_converted() {
        FacesContext context = FacesContext.getCurrentInstance();
        UIComponent component = getFacesComponent(null, getFacesId(Devices_diaConst.DIALOG.DEVICE_LIST_UPDATE_TIME));
        String stringVal = deviceList_updateTime_converter.getAsString(context, component, getField(Devices_diaConst.DIALOG.DEVICE_LIST_UPDATE_TIME));
        return (Integer) deviceList_updateTime_converter.getAsObject(context, component, stringVal);
    }

    /**
     * Get the deviceList_updateTime property.
     *
     * @return the deviceList_updateTime property
     */
    public Integer getDeviceList_updateTime() {
        return getDeviceList_updateTime_converted();
    }

    /**
     * Set the deviceList_updateTime property.
     *
     * @param deviceList_updateTime the new value for the deviceList_updateTime property
     */
    public void setDeviceList_updateTime(Integer deviceList_updateTime) {
        Integer oldVal = getDeviceList_updateTime_converted();
        if ((deviceList_updateTime != null && !deviceList_updateTime.equals(oldVal)) || deviceList_updateTime == null) {
            setField(Devices_diaConst.DIALOG.DEVICE_LIST_UPDATE_TIME, deviceList_updateTime);
        }
    }

    /**
     * Get the devices_id property.
     *
     * @return the devices_id property
     */
    public String getDevices_id() {
        return (String) getField(Devices_diaConst.DIALOG.DEVICES_ID);
    }

    /**
     * Set the devices_id property.
     *
     * @param devices_id the new value for the devices_id property
     */
    public void setDevices_id(String devices_id) {
        setField(Devices_diaConst.DIALOG.DEVICES_ID, devices_id);
    }

    /**
     * Get the devices_deviceType property.
     *
     * @return the devices_deviceType property
     */
    public String getDevices_deviceType() {
        return (String) getField(Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE);
    }

    /**
     * Set the devices_deviceType property.
     *
     * @param devices_deviceType the new value for the devices_deviceType property
     */
    public void setDevices_deviceType(String devices_deviceType) {
        setField(Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE, devices_deviceType);
    }

    /**
     * Get the metrics_probeTitle property.
     *
     * @return the metrics_probeTitle property
     */
    public String getMetrics_probeTitle() {
        return (String) getField(Devices_diaConst.DIALOG.METRICS_PROBE_TITLE);
    }

    /**
     * Set the metrics_probeTitle property.
     *
     * @param metrics_probeTitle the new value for the metrics_probeTitle property
     */
    public void setMetrics_probeTitle(String metrics_probeTitle) {
        setField(Devices_diaConst.DIALOG.METRICS_PROBE_TITLE, metrics_probeTitle);
    }

    private static final NumberConverter devices_updateTime_converter;
    static {
        devices_updateTime_converter = new NumberConverter();
        devices_updateTime_converter.setInputLength(11);
        devices_updateTime_converter.setStoredLength(0);
        devices_updateTime_converter.setScale(0);
        devices_updateTime_converter.setBlankWhenZero(false);
        devices_updateTime_converter.setDataType("longint");
        devices_updateTime_converter.setDisplayRule("");
    }

    /**
     * Get the converted devices_updateTime property.
     * The converted property is converted to/from String
     * according to the display rule and other type properties.
     *
     * @return the converted devices_updateTime property
     */
    protected Integer getDevices_updateTime_converted() {
        FacesContext context = FacesContext.getCurrentInstance();
        UIComponent component = getFacesComponent(null, getFacesId(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME));
        String stringVal = devices_updateTime_converter.getAsString(context, component, getField(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME));
        return (Integer) devices_updateTime_converter.getAsObject(context, component, stringVal);
    }

    /**
     * Get the devices_updateTime property.
     *
     * @return the devices_updateTime property
     */
    public Integer getDevices_updateTime() {
        return getDevices_updateTime_converted();
    }

    /**
     * Set the devices_updateTime property.
     *
     * @param devices_updateTime the new value for the devices_updateTime property
     */
    public void setDevices_updateTime(Integer devices_updateTime) {
        Integer oldVal = getDevices_updateTime_converted();
        if ((devices_updateTime != null && !devices_updateTime.equals(oldVal)) || devices_updateTime == null) {
            setField(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME, devices_updateTime);
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
     * A row is selected, notify the dialog controller.
     *
     * @param event the JSF event
     */
    public void devicesTable_Selected(SelectEvent event) {
        ListRow row = (ListRow) event.getObject();
        List<? extends ListRow> list = getViewModel().getDisplayList(Devices_osConst.OS.DEVICES);
        setListSelectionRowNum(list.indexOf(row));
        DialogObjectConstant field = Devices_diaConst.DIALOG.DEVICES_TABLE;
        dispatchEvent(field, "Selected", "selectDevicesTable");
    }

    /**
     * A row is unselected, notify the dialog controller.
     *
     * @param event the JSF event
     */
    public void devicesTable_Unselected(UnselectEvent event) {
        ListRow row = (ListRow) event.getObject();
        List<? extends ListRow> list = getViewModel().getDisplayList(Devices_osConst.OS.DEVICES);
        setListSelectionRowNum(list.indexOf(row));
        DialogObjectConstant field = Devices_diaConst.DIALOG.DEVICES_TABLE;
        dispatchEvent(field, "Unselected", "unselectDevicesTable");
    }

    /**
     * @return the row state map for DevicesTable
     */
    public RowStateMap getDevicesTableRowStateMap() {
        updateRowState(Devices_osConst.OS.DEVICES);
        return getRowStateMap(Devices_osConst.OS.DEVICES);
    }

    /**
     * Dummy method.
     *
     * @param devicesTableRowStateMap
     */
    public void setDevicesTableRowStateMap(RowStateMap devicesTableRowStateMap) {
        // Dummy
    }

    /**
     * @return the selection mode for DevicesTable
     */
    public String getDevicesTableSelectionMode() {
        SelectionModel selectionModel = getViewModel().getTableModel(Devices_osConst.OS.DEVICES).getSelectionModel();
        if (selectionModel == SelectionModel.MULTI_SELECT) {
            return "multiple";
        }
        return "single";
    }

    /**
     * The event handler for the WM Close event on the Window WindowBlock.
     *
     * @param event the JSF event
     */
    public void window_WMClose(CloseEvent event) {
        setAsActiveInstance();
        DialogObjectConstant field = Devices_diaConst.DIALOG.WINDOW;
        dispatchEvent(field, "WM Close", "closeDevices_dia");
    }

    /**
     * The event handler for the Clicked event on the DeviceFindAllButton Button.
     *
     * @param event the JSF event
     */
    public void deviceFindAllButton_Clicked(ActionEvent event) {
        DialogObjectConstant field = Devices_diaConst.DIALOG.DEVICE_FIND_ALL_BUTTON;
        dispatchEvent(field, "Clicked", "findAllDevice");
    }

    /**
     * The event handler for the Clicked event on the DeviceDetailButton Button.
     *
     * @param event the JSF event
     */
    public void deviceDetailButton_Clicked(ActionEvent event) {
        DialogObjectConstant field = Devices_diaConst.DIALOG.DEVICE_DETAIL_BUTTON;
        dispatchEvent(field, "Clicked", "openDeviceDetail");
    }

    /**
     * The event handler for the Selected event on the DevicesTable TableBlock.
     *
     * @param listRow the row that got the event
     */
    public void devicesTable_Selected(ListRow listRow) {
        DialogObjectConstant field = Devices_diaConst.DIALOG.DEVICES_TABLE;
        dispatchEvent(listRow, field, "Selected", "openDeviceDetail");
    }

    @Override
    public void initBean() {
        initPropertyMaps(Devices_diaConst.DIALOG.class);
    }

}
