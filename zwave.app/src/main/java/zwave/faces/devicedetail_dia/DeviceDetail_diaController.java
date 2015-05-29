// Generated with g9.

package zwave.faces.devicedetail_dia;

import no.g9.client.core.action.CheckType;
import no.g9.client.core.controller.Interceptor;
import no.g9.os.RoleConstant;
import zwave.faces.devicedetail_dia.generated.DeviceDetail_diaDefaultController;
import zwave.os.devicedetail_os.generated.DeviceDetail_osConst;

/**
 * The customizable controller for the DeviceDetail_dia dialog.
 */
public final class DeviceDetail_diaController extends DeviceDetail_diaDefaultController {

    /*
     * Invoked after the dialog controller has been fully initialized and
     * the dependency between controller and application has been realized.
     * Developers should prefer this method to a constructor.
     */
    @Override
    public void init() {
        registerInterceptor(CheckType.INVOKE, new MyInterceptor(DeviceDetail_osConst.OS.DEVICE));
    }

    @SuppressWarnings("javadoc")
    class MyInterceptor extends Interceptor {

        public MyInterceptor(RoleConstant role) {
            super(role);
        }

        @Override
        public DIRECTIVE intercept(RoleConstant actionTarget) {
            return DIRECTIVE.CONTINUE;
        }
        
    }

}
