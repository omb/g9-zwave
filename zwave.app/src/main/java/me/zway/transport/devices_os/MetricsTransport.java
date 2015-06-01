// Generated with g9.

package me.zway.transport.devices_os;

import com.sun.xml.bind.CycleRecoverable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import no.g9.support.castor.XmlIdFieldHandler;

/**
 * This file will be overwritten the next time it is generated from g9.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class MetricsTransport implements CycleRecoverable {
    @XmlElement
    private String probeTitle;
    @XmlElement
    private String scaleTitle;
    @XmlElement
    private String level;
    @XmlElement
    private String icon;
    @XmlElement
    private String title;
    @XmlElement
    private String mode;

    /** Default constructor. */
    public MetricsTransport() {
        super();
    }

    /**
     * Access method for probeTitle.
     *
     * @return the current value of probeTitle
     */
    public String getProbeTitle() {
        return probeTitle;
    }

    /**
     * Access method for probeTitle.
     *
     * @param aProbeTitle the new value for probeTitle
     */
    public void setProbeTitle(final String aProbeTitle) {
        probeTitle = aProbeTitle;
    }

    /**
     * Access method for scaleTitle.
     *
     * @return the current value of scaleTitle
     */
    public String getScaleTitle() {
        return scaleTitle;
    }

    /**
     * Access method for scaleTitle.
     *
     * @param aScaleTitle the new value for scaleTitle
     */
    public void setScaleTitle(final String aScaleTitle) {
        scaleTitle = aScaleTitle;
    }

    /**
     * Access method for level.
     *
     * @return the current value of level
     */
    public String getLevel() {
        return level;
    }

    /**
     * Access method for level.
     *
     * @param aLevel the new value for level
     */
    public void setLevel(final String aLevel) {
        level = aLevel;
    }

    /**
     * Access method for icon.
     *
     * @return the current value of icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Access method for icon.
     *
     * @param aIcon the new value for icon
     */
    public void setIcon(final String aIcon) {
        icon = aIcon;
    }

    /**
     * Access method for title.
     *
     * @return the current value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Access method for title.
     *
     * @param aTitle the new value for title
     */
    public void setTitle(final String aTitle) {
        title = aTitle;
    }

    /**
     * Access method for mode.
     *
     * @return the current value of mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * Access method for mode.
     *
     * @param aMode the new value for mode
     */
    public void setMode(final String aMode) {
        mode = aMode;
    }


    /**
     * Generates an ID for this Transport object.
     *
     * @return the generated ID.
     */
    public String toString() {
    	return (String) new XmlIdFieldHandler().getValue(this);
    }

    /**
     * Returns the generated ID for this Transport object.
     *
     * @param arg0 the context that the cycle was detected in.
     * @return the generated ID.
     */
    @Override
    public Object onCycleDetected(Context arg0) {
    	return this.toString();
    }
}
