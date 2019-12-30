/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPack;

import UtilitiesPackage.FormUtilities;

/**
 *
 * @author ateichelman
 */
public class testbed {
    
        public static void main(String[] args) {
        // TODO code application logic here
        // String test = "<div>Testing<textarea name=\"usernames\"></textarea></div>";
        
        String test = "<label for=\"AssignedSection\">Assigned Section:&nbsp;</label><textarea name=\"AssignedSection\" class=\"form-control\" ></textarea><label for=\"AssignedAssignee\">Assignee:&nbsp;</label><textarea name=\"AssignedAssignee\" class=\"form-control\" ></textarea><label for=\"AssignedQAAssignee\">QA Assignee:&nbsp;</label><textarea name=\"AssignedQAAssignee\" class=\"form-control\" ></textarea><label for=\"AssignedComments\">Comments:&nbsp;</label><textarea name=\"AssignedComments\" class=\"form-control\" ></textarea>";
        
        //String test = "ugh";
        
        System.out.println(test);
        
        String users[] = {"bob", "tom", "ted", "bill"};
        // String fieldName = "user";
        String fieldName = "assignee";
        
        
        String updated = FormUtilities.addDatalist(test, fieldName, users);
        
        System.out.println(updated);
        
    }
    
}
