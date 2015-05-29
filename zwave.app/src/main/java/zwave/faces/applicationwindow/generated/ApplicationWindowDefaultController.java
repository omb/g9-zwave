// Generated with g9.

package zwave.faces.applicationwindow.generated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import no.esito.jvine.action.ActionMethod;
import no.esito.jvine.controller.JVineController;
import no.esito.log.Logger;
import no.g9.client.core.action.ActionInfo;
import no.g9.client.core.action.EventContext;
import no.g9.client.core.controller.DialogController;
import no.g9.message.CRuntimeMsg;
import no.g9.message.Message;
import no.g9.message.MessageSystem;
import no.g9.os.OSRole;
import no.g9.os.RoleConstant;
import no.g9.support.ActionType;

/**
 * The default controller class for the ApplicationWindow dialog.
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class ApplicationWindowDefaultController extends DialogController {

    /**
     * The (generated) constant denoting this dialog.
     */
    public static final ApplicationWindowConst.DIALOG_NAME DIALOG_CONSTANT = ApplicationWindowConst.DIALOG_NAME.APPLICATION_WINDOW;

    /**
     * Default constructor, creates a new ApplicationWindow dialog control with
     * the specified name, and instantiates the object selection nodes.
     *
     * <p><strong>OBS:</strong> after construction the application controller
     * should be set, using the setApplicationController-method.
     */
    public ApplicationWindowDefaultController() {
        super("ApplicationWindow", null);
        initEventMethods();
        initListHooks();
    }

    @Override
    public final <T extends RoleConstant> T getOSConst(String roleName) {
        return null;
    }

    @Override
    public final ApplicationWindowConst.DIALOG_NAME getDialogConstant() {
        return ApplicationWindowDefaultController.DIALOG_CONSTANT;
    }

    @Override
    public final List<RoleConstant> getRoleConstants() {
        List<RoleConstant> rcList = new ArrayList<RoleConstant>();
        return rcList;
    }

    @Override
    public final String getObjectSelectionName() {
        return null;
    }

    @Override
    public Map<RoleConstant, OSRole<?>> getRoleMap() {
        return null;
    }

    /**
     * Initiates and registers the event methods that are defined in this dialog.
     */
    private void initEventMethods() {
        final JVineController jController = JVineController.getInstance(this);
        jController.registerEventMethod("exit", new ActionMethod() {
                public void run() {
                    try {
                        exit(getEvent());
                    } catch(Exception e) {
                        String msg = "Failed to execute action method exit";
                        Logger.getLogger(this.getClass()).error(msg, e);
                        Message message = MessageSystem.getMessageFactory().getMessage(CRuntimeMsg.CF_CAUGHT, msg);
                        message.setException(e);
                        message.setReplString("OK");
                        dispatchMessage(message);
                    } finally {
                        jController.releaseGui();
                    }
                }
            });
    }

    /**
     * Action method. Performs the following actions:
     * <ol>
     *   <li>Exit </li>
     * </ol>
     *
     * @param event the event context
     */
    public void exit(EventContext event) {
    }

   /**
    * Creates hooks for Selected/Unselected events.
    */
   private void initListHooks() {
   }

   /**
     * @return a list of action info for all methods
    */
    public static Map<String, List<ActionInfo>> getDialogActions() {
        Map<String, List<ActionInfo>> dialogActions = new HashMap<String, List<ActionInfo>>();
        List<ActionInfo> methodActions;

        methodActions = new ArrayList<ActionInfo>();
        methodActions.add(new ActionInfo(ActionType.EXIT, null, ""));
        dialogActions.put("exit", methodActions);

        return dialogActions;
    }

}
