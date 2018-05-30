package PresentationLayer;

import FunctionLayer.LoginSampleException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "allOrders", new AllOrders() );
        commands.put( "allUsers", new AllUsers() );
        commands.put( "orderinput", new Orderinput());
        commands.put( "neworder", new NewOrder());
        commands.put( "stock", new Stock());
        commands.put( "allUserOrder", new AllUserOrder());
        commands.put( "stykListe", new StykListe());
        commands.put( "orders", new SearchOrder());
        commands.put( "updateMaterial", new UpdateMaterial());
        commands.put( "matUpdated", new MatUpdated());
        commands.put( "UpdateStatus", new UpdateStatus());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }


    abstract String execute( HttpServletRequest request, HttpServletResponse response) 
            throws LoginSampleException;

}
