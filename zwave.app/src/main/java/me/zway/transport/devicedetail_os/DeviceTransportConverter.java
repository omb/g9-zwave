// Generated with g9.

package me.zway.transport.devicedetail_os;

import javax.annotation.Resource;

import me.zwave.vdev.Device;

import no.g9.os.OSRole;
import no.g9.support.transport.DomainTransportTransfer;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import zwave.os.devicedetail_os.generated.DeviceDetail_osConst;

/**
 * This class is responsible for converting from
 * an object of type {@link Device} to the transport object of type
 * {@link DeviceTransport} in both directions.
 * <p/>
 * <strong>NOTE: </strong>This is a shallow copy!
 * This file will be overwritten the next time it is generated from g9.
 */
@Service("devicedetail_os_DeviceTransportConverter")
public class DeviceTransportConverter implements DomainTransportTransfer<Device, DeviceTransport> {

    @Resource
    private ConversionService domainTransportTypeConversionService;

    /* (non-Javadoc)
     * @see no.g9.support.transport.DomainTransportTransfer#transferToDomain(java.lang.Object, java.lang.Object)
     */
    @Override
    public void transferToDomain(DeviceTransport deviceTransport, Device device) {
        device.setId(deviceTransport.getId());
        device.setDeviceType(deviceTransport.getDeviceType());
        device.setUpdateTime(deviceTransport.getUpdateTime());
    }

    /* (non-Javadoc)
     * @see no.g9.support.transport.DomainTransportTransfer#transferToTransport(java.lang.Object, java.lang.Object)
     */
    @Override
    public void transferToTransport(Device device, DeviceTransport deviceTransport) {
        deviceTransport.setId(device.getId());
        deviceTransport.setDeviceType(device.getDeviceType());
        deviceTransport.setUpdateTime(device.getUpdateTime());
    }

    /*
     * (non-Javadoc)
     *
     * @see no.g9.support.transport.DomainTransportTransfer#getDomainType()
     */
    @Override
    public Class<Device> getDomainType() {
        return Device.class;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * no.g9.support.transport.DomainTransportTransfer#getTransportType()
     */
    @Override
    public Class<DeviceTransport> getTransportType() {
        return DeviceTransport.class;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * no.g9.support.transport.DomainTransportTransfer#getOSRole()
     */
    @Override
    public OSRole<?> getOSRole() {
        return OSHolder.getOSRole(DeviceDetail_osConst.OS.DEVICE);
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

