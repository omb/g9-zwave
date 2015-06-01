// Generated with g9.

package me.zway.transport.devices_os;

import javax.annotation.Resource;

import me.zwave.vdev.DeviceMetrics;

import no.g9.os.OSRole;
import no.g9.support.transport.DomainTransportTransfer;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import zwave.os.devices_os.generated.Devices_osConst;

/**
 * This class is responsible for converting from
 * an object of type {@link DeviceMetrics} to the transport object of type
 * {@link MetricsTransport} in both directions.
 * <p/>
 * <strong>NOTE: </strong>This is a shallow copy!
 * This file will be overwritten the next time it is generated from g9.
 */
@Service("devices_os_MetricsTransportConverter")
public class MetricsTransportConverter implements DomainTransportTransfer<DeviceMetrics, MetricsTransport> {

    @Resource
    private ConversionService domainTransportTypeConversionService;

    /* (non-Javadoc)
     * @see no.g9.support.transport.DomainTransportTransfer#transferToDomain(java.lang.Object, java.lang.Object)
     */
    @Override
    public void transferToDomain(MetricsTransport metricsTransport, DeviceMetrics deviceMetrics) {
        deviceMetrics.setProbeTitle(metricsTransport.getProbeTitle());
        deviceMetrics.setScaleTitle(metricsTransport.getScaleTitle());
        deviceMetrics.setLevel(metricsTransport.getLevel());
        deviceMetrics.setIcon(metricsTransport.getIcon());
        deviceMetrics.setTitle(metricsTransport.getTitle());
        deviceMetrics.setMode(metricsTransport.getMode());
    }

    /* (non-Javadoc)
     * @see no.g9.support.transport.DomainTransportTransfer#transferToTransport(java.lang.Object, java.lang.Object)
     */
    @Override
    public void transferToTransport(DeviceMetrics deviceMetrics, MetricsTransport metricsTransport) {
        metricsTransport.setProbeTitle(deviceMetrics.getProbeTitle());
        metricsTransport.setScaleTitle(deviceMetrics.getScaleTitle());
        metricsTransport.setLevel(deviceMetrics.getLevel());
        metricsTransport.setIcon(deviceMetrics.getIcon());
        metricsTransport.setTitle(deviceMetrics.getTitle());
        metricsTransport.setMode(deviceMetrics.getMode());
    }

    /*
     * (non-Javadoc)
     *
     * @see no.g9.support.transport.DomainTransportTransfer#getDomainType()
     */
    @Override
    public Class<DeviceMetrics> getDomainType() {
        return DeviceMetrics.class;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * no.g9.support.transport.DomainTransportTransfer#getTransportType()
     */
    @Override
    public Class<MetricsTransport> getTransportType() {
        return MetricsTransport.class;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * no.g9.support.transport.DomainTransportTransfer#getOSRole()
     */
    @Override
    public OSRole<?> getOSRole() {
        return OSHolder.getOSRole(Devices_osConst.OS.METRICS);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * no.g9.support.transport.DomainTransportTransfer#getParentAssociationRoleName()
     */
    @Override
    public String getParentAssociationRoleName() {
        return null;
    }

    /**
     * Convenience method that converts the <code>source</code> to
     * <code>targetType</code> .
     *
     * @param <C>
     *            the generic target type
     * @param source
     *            the source to convert
     * @param targetType
     *            the target type to convert to
     * @return the converted object
     */
    @SuppressWarnings("unused")
    private <C> C convert(Object source, Class<C> targetType) {
        return domainTransportTypeConversionService.convert(source, targetType);
    }

}

