/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCont;

/**
 *
 * @author Gary
 */
public class ApplicationController {
    private Dispatch dispatcher;

  public ApplicationController()
  {
    dispatcher = new Dispatch();
  }

  private boolean isAuthenticUser()
  {
    //here you have to write Authentication logic
    System.out.println("User is authenticated successfully.");
    return true;
  }

  private void trackRequest( String request )
  {
    System.out.println("Page requested: " + request);
  }

  public void dispatchRequest( String request )
  {
    // log each request
    trackRequest(request);
    // authenticate the user
    if( isAuthenticUser() )
    {
      dispatcher.dispatch(request);
    }
  }
}
