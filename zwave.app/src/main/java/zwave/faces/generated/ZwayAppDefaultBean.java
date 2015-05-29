// Generated with g9.

package zwave.faces.generated;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import no.g9.client.core.controller.DialogInstance;
import no.g9.client.core.view.faces.FacesApplicationBean;

import zwave.faces.ZwayAppView;

/**
 * The JSF managed bean responsible for the navigation. This is the super class.
 * This file will be overwritten the next time it is generated from g9.
 */
public class ZwayAppDefaultBean extends FacesApplicationBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Create a new ZwayAppDefaultBean().
     */
    public ZwayAppDefaultBean() {
        super("zwayapp", new ZwayAppView());
    }

    @Override
    protected String buildDialogIncludePath() {
        return "/WEB-INF/includes/dialogs/" + getApplicationView().getCurrentDialogInstanceName(true) + ".xhtml";
    }

    @Override
    protected String[] buildDialogBoxIncludePaths() {
        List<String> dialogBoxPaths = new LinkedList<String>();
        for (DialogInstance instance : getApplicationView().getOpenDialogBoxes()) {
            String path = "/WEB-INF/includes/dialogs/" + getApplicationView().getDialogInstanceName(instance) + ".xhtml";
            dialogBoxPaths.add(path);
        }
        return dialogBoxPaths.toArray(new String[0]);
    }

    @Override
    protected String buildDialogToolbarIncludePath() {
        String toolbarExt = "";
        if (!getApplicationView().getCurrentDialogInstanceName(false).equals(getApplicationView().getEmptyDialogName())) {
            toolbarExt = "-toolbar";
        }
        return "/WEB-INF/includes/dialogs/" + getApplicationView().getCurrentDialogInstanceName(false) + toolbarExt + ".xhtml";
    }

}
