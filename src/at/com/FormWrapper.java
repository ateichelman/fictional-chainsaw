/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.com;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author ateichelman
 */
public class FormWrapper {
    /**
     * EXAMPLE FORM HTML:
     * "result": 
     * "<label for=\"AssignedSection\">Assigned Section:&nbsp;</label><textarea name=\"AssignedSection\" class=\"form-control\" ></textarea><label for=\"AssignedAssignee\">Assignee:&nbsp;</label><textarea name=\"AssignedAssignee\" class=\"form-control\" ></textarea><label for=\"AssignedQAAssignee\">QA Assignee:&nbsp;</label><textarea name=\"AssignedQAAssignee\" class=\"form-control\" ></textarea><label for=\"AssignedComments\">Comments:&nbsp;</label><textarea name=\"AssignedComments\" class=\"form-control\" ></textarea>"
     * ...
     * Object actionResponse = action.execute(payload);
     * ...
     */
    
    // TODO: pass actionResponse to "addUserList" method.
    private String[] users = {"user1", "user2", "thirdUser"};
    
    private Object updatedResponse;
    
    FormWrapper(Object actionResponse) {
        // Commence the updates!
        addUserList(actionResponse);
    }
    
    /**
     * @description Applies user list from key cloak to any "user" related field.
     * @param actionResponse 
     */
    private void addUserList(Object actionResponse) {
        
        // Get list of users from keycloak
        String htmlString = actionResponse.toString();
        
        // TODO: Make sure the second value in the object is the html string.
        Document doc = Jsoup.parse(htmlString);
        
        // https://jsoup.org/cookbook/extracting-data/selector-syntax
        // find elements with "Assignee" in the name (assignees are users)
        Elements userField = doc.select("textarea[name*='Assignee']");
        
        // TODO: Okay, now change these textAreas into dropdowns and add the user lists!
        
    }
    
    /**
     * ...
     * return new ResponseEntity<Object>(
     * ResponseUtils.ok(actionResponse), HttpStatus.OK);
     */
}
