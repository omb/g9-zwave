// Generated with g9.

package zwave.faces.generated;

import no.g9.client.core.controller.ApplicationController;
import no.g9.client.core.controller.DialogConstant;

/**
 * The default ZwayApp application controller.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public class ZwayAppDefaultController extends ApplicationController {

    /**
     * Constructs a new Application controller for the ZwayApp application.
     */
    public ZwayAppDefaultController() {
        super("ZwayApp");
    }

    @Override
    public <T extends DialogConstant> T getApplicationDialogConstant() {
        return this.<T>getDialogConst("applicationWindow");
    }

}
