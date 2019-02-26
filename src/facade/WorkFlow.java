/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author nodira
 */
public class WorkFlow {
     Developer developer = new Developer();
     Job job = new Job();
     BugTracker bugTracker = new BugTracker();
     
     public void solveProblems(){
         job.doJob();
         bugTracker.startSprint();
         developer.doJobBeforeDeadline(bugTracker);
         
     }
    
}
