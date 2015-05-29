// Generated with g9.

package me.zway.transport.devices_os;

import java.util.HashMap;
import java.util.Map;

import no.g9.os.OSRole;
import no.g9.os.RoleConstant;

import zwave.os.devices_os.generated.Devices_osConst;

/**
 * Creates a <code>Map</code> of <code>OSRole</code>s needed in this package.
 * This file will be overwritten the next time it is generated from g9.
 */
public class OSHolder {

    private static Map<RoleConstant, OSRole<?>> roleConstantToOSRole;

    static {
        roleConstantToOSRole = new HashMap<RoleConstant, OSRole<?>>();
        roleConstantToOSRole.putAll(Devices_osConst.OSRoleFactory.getRoleMap());
    }

    /**
     * @param roleConstant the role constant for the role to retreive
     * @return the {@link OSRole}
     */
    static OSRole<?> getOSRole(RoleConstant roleConstant) {
        return roleConstantToOSRole.get(roleConstant);
    }

}
