// Generated with g9.

package zwave.faces.devicedetail_dia.generated;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.ValueChangeEvent;

import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.view.faces.FacesDialogBean;
import no.g9.client.core.view.faces.NumberConverter;

/**
 * JSF managed bean for the DeviceDetail_dia dialog. This is the default (super)
 * class, inherited by the DeviceDetail_diaBean class.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class DeviceDetail_diaDefaultBean extends FacesDialogBean {

    private static final long serialVersionUID = 1L;

    /**
     * Create a new DeviceDetail_diaDefaultBean.
     */
    public DeviceDetail_diaDefaultBean() {
        super(DeviceDetail_diaConst.DIALOG_NAME.DEVICE_DETAIL_DIA);
    }

    /**
     * Get the device_id property.
     *
     * @return the device_id property
     */
    public String getDevice_id() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.DEVICE_ID);
    }

    /**
     * Set the device_id property.
     *
     * @param device_id the new value for the device_id property
     */
    public void setDevice_id(String device_id) {
        setField(DeviceDetail_diaConst.DIALOG.DEVICE_ID, device_id);
    }

    /**
     * Get the device_deviceType property.
     *
     * @return the device_deviceType property
     */
    public String getDevice_deviceType() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.DEVICE_DEVICE_TYPE);
    }

    /**
     * Set the device_deviceType property.
     *
     * @param device_deviceType the new value for the device_deviceType property
     */
    public void setDevice_deviceType(String device_deviceType) {
        setField(DeviceDetail_diaConst.DIALOG.DEVICE_DEVICE_TYPE, device_deviceType);
    }

    private static final NumberConverter device_updateTime_converter;
    static {
        device_updateTime_converter = new NumberConverter();
        device_updateTime_converter.setInputLength(11);
        device_updateTime_converter.setStoredLength(0);
        device_updateTime_converter.setScale(0);
        device_updateTime_converter.setBlankWhenZero(false);
        device_updateTime_converter.setDataType("longint");
        device_updateTime_converter.setDisplayRule("");
    }

    /**
     * Get the converted device_updateTime property.
     * The converted property is converted to/from String
     * according to the display rule and other type properties.
     *
     * @return the converted device_updateTime property
     */
    protected Integer getDevice_updateTime_converted() {
        FacesContext context = FacesContext.getCurrentInstance();
        UIComponent component = getFacesComponent(null, getFacesId(DeviceDetail_diaConst.DIALOG.DEVICE_UPDATE_TIME));
        String stringVal = device_updateTime_converter.getAsString(context, component, getField(DeviceDetail_diaConst.DIALOG.DEVICE_UPDATE_TIME));
        return (Integer) device_updateTime_converter.getAsObject(context, component, stringVal);
    }

    /**
     * Get the device_updateTime property.
     *
     * @return the device_updateTime property
     */
    public Integer getDevice_updateTime() {
        return getDevice_updateTime_converted();
    }

    /**
     * Set the device_updateTime property.
     *
     * @param device_updateTime the new value for the device_updateTime property
     */
    public void setDevice_updateTime(Integer device_updateTime) {
        Integer oldVal = getDevice_updateTime_converted();
        if ((device_updateTime != null && !device_updateTime.equals(oldVal)) || device_updateTime == null) {
            setField(DeviceDetail_diaConst.DIALOG.DEVICE_UPDATE_TIME, device_updateTime);
        }
    }

    /**
     * Get the metrics_probeTitle property.
     *
     * @return the metrics_probeTitle property
     */
    public String getMetrics_probeTitle() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.METRICS_PROBE_TITLE);
    }

    /**
     * Set the metrics_probeTitle property.
     *
     * @param metrics_probeTitle the new value for the metrics_probeTitle property
     */
    public void setMetrics_probeTitle(String metrics_probeTitle) {
        setField(DeviceDetail_diaConst.DIALOG.METRICS_PROBE_TITLE, metrics_probeTitle);
    }

    /**
     * Get the metrics_scaleTitle property.
     *
     * @return the metrics_scaleTitle property
     */
    public String getMetrics_scaleTitle() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.METRICS_SCALE_TITLE);
    }

    /**
     * Set the metrics_scaleTitle property.
     *
     * @param metrics_scaleTitle the new value for the metrics_scaleTitle property
     */
    public void setMetrics_scaleTitle(String metrics_scaleTitle) {
        setField(DeviceDetail_diaConst.DIALOG.METRICS_SCALE_TITLE, metrics_scaleTitle);
    }

    /**
     * Get the metrics_level property.
     *
     * @return the metrics_level property
     */
    public String getMetrics_level() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.METRICS_LEVEL);
    }

    /**
     * Set the metrics_level property.
     *
     * @param metrics_level the new value for the metrics_level property
     */
    public void setMetrics_level(String metrics_level) {
        setField(DeviceDetail_diaConst.DIALOG.METRICS_LEVEL, metrics_level);
    }

    /**
     * Get the metrics_icon property.
     *
     * @return the metrics_icon property
     */
    public String getMetrics_icon() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.METRICS_ICON);
    }

    /**
     * Set the metrics_icon property.
     *
     * @param metrics_icon the new value for the metrics_icon property
     */
    public void setMetrics_icon(String metrics_icon) {
        setField(DeviceDetail_diaConst.DIALOG.METRICS_ICON, metrics_icon);
    }

    /**
     * Get the metrics_title property.
     *
     * @return the metrics_title property
     */
    public String getMetrics_title() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.METRICS_TITLE);
    }

    /**
     * Set the metrics_title property.
     *
     * @param metrics_title the new value for the metrics_title property
     */
    public void setMetrics_title(String metrics_title) {
        setField(DeviceDetail_diaConst.DIALOG.METRICS_TITLE, metrics_title);
    }

    /**
     * Get the metrics_mode property.
     *
     * @return the metrics_mode property
     */
    public String getMetrics_mode() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.METRICS_MODE);
    }

    /**
     * Set the metrics_mode property.
     *
     * @param metrics_mode the new value for the metrics_mode property
     */
    public void setMetrics_mode(String metrics_mode) {
        setField(DeviceDetail_diaConst.DIALOG.METRICS_MODE, metrics_mode);
    }

    /**
     * Get the command_command property.
     *
     * @return the command_command property
     */
    public String getCommand_command() {
        return (String) getField(DeviceDetail_diaConst.DIALOG.COMMAND_COMMAND);
    }

    /**
     * Set the command_command property.
     *
     * @param command_command the new value for the command_command property
     */
    public void setCommand_command(String command_command) {
        setField(DeviceDetail_diaConst.DIALOG.COMMAND_COMMAND, command_command);
    }

    private static final NumberConverter command_level_converter;
    static {
        command_level_converter = new NumberConverter();
        command_level_converter.setInputLength(11);
        command_level_converter.setStoredLength(0);
        command_level_converter.setScale(0);
        command_level_converter.setBlankWhenZero(false);
        command_level_converter.setDataType("longint");
        command_level_converter.setDisplayRule("");
    }

    /**
     * Get the converted command_level property.
     * The converted property is converted to/from String
     * according to the display rule and other type properties.
     *
     * @return the converted command_level property
     */
    protected Integer getCommand_level_converted() {
        FacesContext context = FacesContext.getCurrentInstance();
        UIComponent component = getFacesComponent(null, getFacesId(DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL));
        String stringVal = command_level_converter.getAsString(context, component, getField(DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL));
        return (Integer) command_level_converter.getAsObject(context, component, stringVal);
    }

    /**
     * Get the command_level property.
     *
     * @return the command_level property
     */
    public Integer getCommand_level() {
        return getCommand_level_converted();
    }

    /**
     * Set the command_level property.
     *
     * @param command_level the new value for the command_level property
     */
    public void setCommand_level(Integer command_level) {
        Integer oldVal = getCommand_level_converted();
        if ((command_level != null && !command_level.equals(oldVal)) || command_level == null) {
            setField(DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL, command_level);
        }
    }

    /**
     * Get the command_level_2 property.
     *
     * @return the command_level_2 property
     */
    public Integer getCommand_level_2() {
        return (Integer) getField(DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL_2);
    }

    /**
     * Set the command_level_2 property.
     *
     * @param command_level_2 the new value for the command_level_2 property
     */
    public void setCommand_level_2(Integer command_level_2) {
        setField(DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL_2, command_level_2);
    }

    /**
     * The event handler for the Clicked event on the Close Button.
     *
     * @param event the JSF event
     */
    public void close_Clicked(ActionEvent event) {
        DialogObjectConstant field = DeviceDetail_diaConst.DIALOG.CLOSE;
        dispatchEvent(field, "Clicked", "closeDeviceDetail_dia");
    }

    /**
     * The event handler for the Value Changed event on the Device.id TextField.
     *
     * @param event the JSF event
     */
    public void deviceId_ValueChanged(ValueChangeEvent event) {
        if( event.getPhaseId() != PhaseId.INVOKE_APPLICATION ) {
            event.setPhaseId( PhaseId.INVOKE_APPLICATION );
            event.queue();
        } else {
            DialogObjectConstant field = DeviceDetail_diaConst.DIALOG.DEVICE_ID;
            dispatchEvent(field, "Value Changed", "getDevice");
        }
    }

    /**
     * The event handler for the Clicked event on the Send Button.
     *
     * @param event the JSF event
     */
    public void send_Clicked(ActionEvent event) {
        DialogObjectConstant field = DeviceDetail_diaConst.DIALOG.SEND;
        dispatchEvent(field, "Clicked", "sendCommand");
    }

    /**
     * The event handler for the Value Changed event on the Command.level TextField.
     * NB! This method only handles field copy and validation checks.
     *
     * @param event the JSF event
     */
    public void commandLevel_ValueChanged(ValueChangeEvent event) {
        if( event.getPhaseId() != PhaseId.INVOKE_APPLICATION ) {
            event.setPhaseId( PhaseId.INVOKE_APPLICATION );
            event.queue();
        } else {
            DialogObjectConstant field = DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL;
            copyToEquivalentFields(field, event.getNewValue());
        }
    }

    /**
     * The event handler for the Clicked event on the Set Button.
     *
     * @param event the JSF event
     */
    public void set_Clicked(ActionEvent event) {
        DialogObjectConstant field = DeviceDetail_diaConst.DIALOG.SET;
        dispatchEvent(field, "Clicked", "setLevel");
    }

    /**
     * The event handler for the Value Changed event on the Command.level.2 Scale.
     *
     * @param event the JSF event
     */
    public void commandLevel2_ValueChanged(ValueChangeEvent event) {
        if( event.getPhaseId() != PhaseId.INVOKE_APPLICATION ) {
            event.setPhaseId( PhaseId.INVOKE_APPLICATION );
            event.queue();
        } else {
            DialogObjectConstant field = DeviceDetail_diaConst.DIALOG.COMMAND_LEVEL_2;
            copyToEquivalentFields(field, event.getNewValue());
            dispatchEvent(field, "Value Changed", "setLevel");
        }
    }

    @Override
    public void initBean() {
        initPropertyMaps(DeviceDetail_diaConst.DIALOG.class);
    }

}
