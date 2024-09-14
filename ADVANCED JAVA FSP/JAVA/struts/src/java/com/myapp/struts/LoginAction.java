package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm formbean = (LoginForm) form; //it is connecting the action bean with form bean
        
        String name = formbean.getName();
        String email = formbean.getEmail();
        
        // perform validation
        
        if((name==null) || //name parameter does not exist
                email ==null || //email parameter does not exist
                name.equals("") || //name parameter is empty
                email.indexOf("@") == -1){ //email lacks '@'
            // pw.println("Hello");
            return mapping.findForward(FAILURE);  
        }
        return mapping.findForward(SUCCESS);
    }
}
