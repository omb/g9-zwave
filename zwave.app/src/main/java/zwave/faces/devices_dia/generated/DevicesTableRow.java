// Generated with g9.

package zwave.faces.devices_dia.generated;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.faces.context.FacesContext;

import no.g9.client.core.controller.DialogObjectConstant;
import no.g9.client.core.view.BooleanProperty;
import no.g9.client.core.view.ListRow;

import zwave.faces.devices_dia.Devices_diaBean;

/**
 * Holds data for one row in a list, and also the selected state of the row.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public class DevicesTableRow extends ListRow {

    private static Collection<DialogObjectConstant> fields;

    static {
        Collection<DialogObjectConstant> tmp = new HashSet<DialogObjectConstant>();
        tmp.add(Devices_diaConst.DIALOG.DEVICES_ID);
        tmp.add(Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE);
        tmp.add(Devices_diaConst.DIALOG.METRICS_PROBE_TITLE);
        tmp.add(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME);
        fields = Collections.unmodifiableCollection(tmp);
    }

    /**
     * Get column definition for this list row.
     * @return array of DialogObjectConstant
     */
    static DialogObjectConstant[] getColumnDefinitions() {
        return fields.toArray(new DialogObjectConstant[fields.size()]);
    }

    /**
     * Create a new DevicesTableRow with the given selection state.
     *
     * @param dialogInstanceNumber the instance number for the owner
     * @param selected the selection state for the row.
     */
    public DevicesTableRow(int dialogInstanceNumber, boolean selected) {
        super(dialogInstanceNumber, selected);
    }

    /**
     * Create a new, unselected, DevicesTableRow.
     *
     * @param dialogInstanceNumber the instance number for the owner
     */
    public DevicesTableRow(int dialogInstanceNumber) {
        super(dialogInstanceNumber, false);
    }

    @Override
    public Collection<DialogObjectConstant> getFields() {
        return fields;
    }

    /**
     * Get the value for the devices_id property.
     *
     * @return the value for the devices_id property.
     */
    public String getDevices_id() {
        return (String) getValue(Devices_diaConst.DIALOG.DEVICES_ID);
    }

    /**
     * Set the value for the devices_id property.
     *
     * @param devices_id the new value for the devices_id property.
     */
    public void setDevices_id(String devices_id) {
        setValue(Devices_diaConst.DIALOG.DEVICES_ID, devices_id);
    }

    /**
     * Get the value for the devices_deviceType property.
     *
     * @return the value for the devices_deviceType property.
     */
    public String getDevices_deviceType() {
        return (String) getValue(Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE);
    }

    /**
     * Set the value for the devices_deviceType property.
     *
     * @param devices_deviceType the new value for the devices_deviceType property.
     */
    public void setDevices_deviceType(String devices_deviceType) {
        setValue(Devices_diaConst.DIALOG.DEVICES_DEVICE_TYPE, devices_deviceType);
    }

    /**
     * Get the value for the metrics_probeTitle property.
     *
     * @return the value for the metrics_probeTitle property.
     */
    public String getMetrics_probeTitle() {
        return (String) getValue(Devices_diaConst.DIALOG.METRICS_PROBE_TITLE);
    }

    /**
     * Set the value for the metrics_probeTitle property.
     *
     * @param metrics_probeTitle the new value for the metrics_probeTitle property.
     */
    public void setMetrics_probeTitle(String metrics_probeTitle) {
        setValue(Devices_diaConst.DIALOG.METRICS_PROBE_TITLE, metrics_probeTitle);
    }

    /**
     * Get the value for the devices_updateTime property.
     *
     * @return the value for the devices_updateTime property.
     */
    public Integer getDevices_updateTime() {
        return (Integer) getValue(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME);
    }

    /**
     * Set the value for the devices_updateTime property.
     *
     * @param devices_updateTime the new value for the devices_updateTime property.
     */
    public void setDevices_updateTime(Integer devices_updateTime) {
        setValue(Devices_diaConst.DIALOG.DEVICES_UPDATE_TIME, devices_updateTime);
    }

    /**
     * Return the dialog backing bean for the dialog.
     *
     * @return the found backing bean.
     */
	@SuppressWarnings("deprecation")
	private Devices_diaBean getDialogBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String expr = createBeanRef("devices_dia");
        return (Devices_diaBean) facesContext.getApplication().createValueBinding(expr).getValue(facesContext);
    }

    /**
	 * Checks if the ENABLED property is set for a dialog object.
	 * The property is checked in ListRow's PropertyManager and,
	 * if not found, in the dialog bean's property map.
	 *
	 * @param dialogObjectName the dialog's internal name
	 * @return A boolean denoting whether the dialog object is enabled or not
	 */
    public boolean isEnabled(String dialogObjectName) {
		boolean retval = true;
		DialogObjectConstant dialogObject = Devices_diaConst.DIALOG.getConst(dialogObjectName);

		boolean propertySet = false;
		try {
			propertySet = isPropertySet(dialogObject, BooleanProperty.ENABLED);
		} catch (NoSuchElementException e) {
			propertySet = false;
		}

		if(propertySet) {
			retval = getProperty(dialogObject, BooleanProperty.ENABLED);
		} else {
			Devices_diaBean dialogBean = getDialogBean();
			@SuppressWarnings("unchecked")
			Map<String, Boolean> enabledMap = (Map<String, Boolean>) dialogBean.getEnabled();
			retval = enabledMap.get(dialogObjectName);
		}

		return retval;
	}

}
