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
        commands.put( "order", new ViewOrder() );
        commands.put( "allOrders", new AllOrders() );
        commands.put( "carportdrawing", new carportdrawing());
        commands.put( "orderinput", new OrderInput());
        commands.put( "insertdata", new InsertData());
        commands.put( "getdata", new GetData());
    

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
