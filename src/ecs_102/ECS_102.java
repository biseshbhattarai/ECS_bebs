/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_102;

/**
 *
 * @author xploiter
 */
public class ECS_102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Db db = new Db();
        db.connect();
        Login l = new Login();
        l.start();
    }
    
}
