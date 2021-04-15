package com.mycompany.app;

import java.util.*;

public class App 
{
    public static int userChoice = 5;

    public static void main( String[] args )
    {
        menu();  
    }

    public static void menu(){
      while(userChoice != 0){

          System.out.println("-----Main-----");

          System.out.println("[1] Person");
          System.out.println("[2] Contact");
          System.out.println("[3] Roles");
          System.out.println("[0] Exit");

          Scanner scanInput = new Scanner(System.in);
          userChoice = scanInput.nextInt();

          switch(userChoice){
            case 1:
              person();
              break;
            case 2:
              contact();
              break;
            case 3:
              role();
              break;
            case 0:
              break;
            default:
              System.out.println("Invalid input.");
          }
        }
    }
    public static void person(){

      while(userChoice != 0){

          System.out.println("");
          System.out.println("--------Person--------");
          System.out.println("[1] Create person");
          System.out.println("[2] Delete person");
          System.out.println("[3] Update person");
          System.out.println("[4] List person");
          System.out.println("[5] Add person role");
          System.out.println("[6] Delete person role");
          System.out.println("[7] Back to Main");
          System.out.println("[0] Exit");

          Scanner scanInput = new Scanner(System.in);
          userChoice = scanInput.nextInt();

          switch(userChoice){
            case 1:
              PersonService.createPerson();
              break;
            case 2:
              PersonService.deletePerson();
              break;
            case 3:
              PersonService.updatePerson();
              break;
            case 4:
              listPerson();
              break;
            case 5:
              PersonService.addPersonRole();
              break;
            case 6:
              PersonService.deletePersonRole();
              break;
            case 7:
              menu();
            case 0:
              break;
            default:
              System.out.println("Invalid input.");
          }
      }
    }

    public static void listPerson(){
      while(userChoice != 0){

          System.out.println("");
          System.out.println("------List Person------");
          System.out.println("[1] List person by GWA [Ascending]");
          System.out.println("[2] List person by GWA [Descending]");
          System.out.println("[3] List person by Date hired [Ascending]");
          System.out.println("[4] List person by Date hired [Descending]");
          System.out.println("[5] List person by Last name [Ascending]");
          System.out.println("[6] List person by Last name [Descending]");
          System.out.println("[7] Back to Person");
          System.out.println("[0] Exit");

          Scanner scanInput = new Scanner(System.in);
          userChoice = scanInput.nextInt();

          switch(userChoice){
            case 1:
              PersonService.listPersonBy("general_weighted_average","ASC");
              break;
            case 2:
              PersonService.listPersonBy("general_weighted_average","DESC");
              break;
            case 3:
              PersonService.listPersonBy("date_hired","ASC");
              break;
            case 4:
              PersonService.listPersonBy("date_hired","DESC");
              break;
            case 5:
              PersonService.listPersonBy("last_name","ASC");
              break;
            case 6:
              PersonService.listPersonBy("last_name","DESC");
              break;
            case 7:
              person();
            case 0:
              break;
            default:
              System.out.println("Invalid input.");
          }
      }
    }
    public static void contact(){
      while(userChoice != 0){

          System.out.println("");
          System.out.println("------Contact------");
          System.out.println("[1] Add Contact");
          System.out.println("[2] Update Contact");
          System.out.println("[3] Delete Contact");
          System.out.println("[4] Back to Main");
          System.out.println("[0] Exit");

          Scanner scanInput = new Scanner(System.in);
          userChoice = scanInput.nextInt();

          switch(userChoice){
            case 1:
              PersonService.addContact();
              break;
            case 2:
              PersonService.updateContact();
              break;
            case 3:
              PersonService.deleteContact();
              break;
            case 4:
              menu();
            case 0:
              break;
            default:
              System.out.println("Invalid input.");
          }
      }
    }

    public static void role(){
      while(userChoice != 0){

          System.out.println("");
          System.out.println("------Role------");
          System.out.println("[1] Create role");
          System.out.println("[2] Update role");
          System.out.println("[3] Delete role");
          System.out.println("[4] List role");
          System.out.println("[5] Back to Main");
          System.out.println("[0] Exit");

          Scanner scanInput = new Scanner(System.in);
          userChoice = scanInput.nextInt();

          switch(userChoice){
            case 1:
              RoleService.addRole();
              break;
            case 2:
              RoleService.updateRole();
              break;
            case 3:
              RoleService.deleteRole();
              break;
            case 4:
              RoleService.listRole();
              break;
            case 5:
              menu();
            case 0:
              break;
            default:
              System.out.println("Invalid input.");
          }
      }
    }
}
