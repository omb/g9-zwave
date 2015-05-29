// Generated with g9.

package me.zway.transport.devices_os;

import javax.annotation.Resource;

import me.zwave.vdev.DeviceList;

import no.g9.os.OSRole;
import no.g9.support.transport.DomainTransportTransfer;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import zwave.os.devices_os.generated.Devices_osConst;

/**
 * This class is responsible for converting from
 * an object of type {@link DeviceList} to the transport object of type
 * {@link DeviceListTransport} in both directions.
 * <p/>
 * <strong>NOTE: </strong>This is a shallow copy!
 * This file will be overwritten the next time it is generated from g9.
 */
@Service("devices_os_DeviceListTransportConverter")
public class DeviceListTransportConverter implements DomainTransportTransfer<DeviceList, DeviceListTransport> {

    @Resource
    private ConversionService domainTransportTypeConversionService;

    /* (non-Javadoc)
     * @see no.g9.support.transport.DomainTransportTransfer#transferToDomain(java.lang.Object, java.lang.Object)
     */
    @Override
    public void transferToDomain(DeviceListTransport deviceListTransport, DeviceList deviceList) {
        deviceList.setStructureChanged(deviceListTransport.getStructureChanged());
        deviceList.setUpdateTime(deviceListTransport.getUpdateTime());
    }

    /* (non-Javadoc)
     * @see no.g9.support.transport.DomainTransportTransfer#transferToTransport(java.lang.Object, java.lang.Object)
     */
    @Override
    public void transferToTransport(DeviceList deviceList, DeviceListTransport deviceListTransport) {
        deviceListTransport.setStructureChanged(deviceList.getStructureChanged());
        deviceListTransport.setUpdateTime(deviceList.getUpdateTime());
    }

    /*
     * (non-Javadoc)
     *
     * @see no.g9.support.transport.DomainTransportTransfer#getDomainType()
     */
    @Override
    public Class<DeviceList> getDomainType() {
        return DeviceList.class;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * no.g9.support.transport.DomainTransportTransfer#getTransportType()
     */
    @Override
    public Class<DeviceListTransport> getTransportType() {
        return DeviceListTransport.class;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * no.g9.support.transport.DomainTransportTransfer#getOSRole()
     */
    @Override
    public OSRole<?> getOSRole() {
        return OSHolder.getOSRole(Devices_osConst.OS.DEVICE_LIST);
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

