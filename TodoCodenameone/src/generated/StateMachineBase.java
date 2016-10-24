/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Login";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Login");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Component findAdd(Component root) {
        return (com.codename1.ui.Component)findByName("Add", root);
    }

    public com.codename1.ui.Component findAdd() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Add", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Add", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTask(Component root) {
        return (com.codename1.ui.TextField)findByName("Task", root);
    }

    public com.codename1.ui.TextField findTask() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Task", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Task", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUsername(Component root) {
        return (com.codename1.ui.TextField)findByName("Username", root);
    }

    public com.codename1.ui.TextField findUsername() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Username", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Username", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findRegister(Component root) {
        return (com.codename1.ui.Button)findByName("Register", root);
    }

    public com.codename1.ui.Button findRegister() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Register", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Register", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findLogin(Component root) {
        return (com.codename1.ui.Component)findByName("Login", root);
    }

    public com.codename1.ui.Component findLogin() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Login", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Login", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findMyTodos(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("MyTodos", root);
    }

    public com.codename1.ui.list.MultiList findMyTodos() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("MyTodos", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("MyTodos", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("Password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_HomeAdd = 1;

    protected boolean onHomeAdd() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_HomeAdd:
                if(onHomeAdd()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("Add".equals(f.getName())) {
            exitAdd(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            exitLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            exitHome(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitAdd(Form f) {
    }


    protected void exitLogin(Form f) {
    }


    protected void exitHome(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Add".equals(f.getName())) {
            beforeAdd(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            beforeLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            beforeHome(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeAdd(Form f) {
    }


    protected void beforeLogin(Form f) {
    }


    protected void beforeHome(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Add".equals(c.getName())) {
            beforeContainerAdd(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(c.getName())) {
            beforeContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            beforeContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerAdd(Container c) {
    }


    protected void beforeContainerLogin(Container c) {
    }


    protected void beforeContainerHome(Container c) {
    }

    protected void postShow(Form f) {
        if("Add".equals(f.getName())) {
            postAdd(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            postLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            postHome(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postAdd(Form f) {
    }


    protected void postLogin(Form f) {
    }


    protected void postHome(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Add".equals(c.getName())) {
            postContainerAdd(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(c.getName())) {
            postContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            postContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerAdd(Container c) {
    }


    protected void postContainerLogin(Container c) {
    }


    protected void postContainerHome(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Add".equals(rootName)) {
            onCreateAdd();
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(rootName)) {
            onCreateLogin();
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(rootName)) {
            onCreateHome();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateAdd() {
    }


    protected void onCreateLogin() {
    }


    protected void onCreateHome() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Add".equals(f.getName())) {
            getStateAdd(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Login".equals(f.getName())) {
            getStateLogin(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Home".equals(f.getName())) {
            getStateHome(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateAdd(Form f, Hashtable h) {
    }


    protected void getStateLogin(Form f, Hashtable h) {
    }


    protected void getStateHome(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Add".equals(f.getName())) {
            setStateAdd(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            setStateLogin(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            setStateHome(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateAdd(Form f, Hashtable state) {
    }


    protected void setStateLogin(Form f, Hashtable state) {
    }


    protected void setStateHome(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("MyTodos".equals(listName)) {
            return initListModelMyTodos(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelMyTodos(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Add")) {
            if("Task".equals(c.getName())) {
                onAdd_TaskAction(c, event);
                return;
            }
            if("Add".equals(c.getName())) {
                onAdd_AddAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Login")) {
            if("Username".equals(c.getName())) {
                onLogin_UsernameAction(c, event);
                return;
            }
            if("Password".equals(c.getName())) {
                onLogin_PasswordAction(c, event);
                return;
            }
            if("Login".equals(c.getName())) {
                onLogin_LoginAction(c, event);
                return;
            }
            if("Register".equals(c.getName())) {
                onLogin_RegisterAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Home")) {
            if("MyTodos".equals(c.getName())) {
                onHome_MyTodosAction(c, event);
                return;
            }
            if("Add".equals(c.getName())) {
                onHome_AddAction(c, event);
                return;
            }
        }
    }

      protected void onAdd_TaskAction(Component c, ActionEvent event) {
      }

      protected void onAdd_AddAction(Component c, ActionEvent event) {
      }

      protected void onLogin_UsernameAction(Component c, ActionEvent event) {
      }

      protected void onLogin_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onLogin_LoginAction(Component c, ActionEvent event) {
      }

      protected void onLogin_RegisterAction(Component c, ActionEvent event) {
      }

      protected void onHome_MyTodosAction(Component c, ActionEvent event) {
      }

      protected void onHome_AddAction(Component c, ActionEvent event) {
      }

}
