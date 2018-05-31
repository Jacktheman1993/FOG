package DBAccess;

import FunctionLayer.LineItems;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Materials;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Unknown
 */
public class LineItemMapper {

    /**
     *
     * @param order
     * @param materials
     * @param Amount
     * @param Price
     * @throws LoginSampleException
     */
    public static int createLineItems(Order order, Materials materials, int Amount, double Price) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `LineItems` (Users_id, width, length, height ) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, order.getIDorder());
            ps.setInt( 2, materials.getMaterialsID());
            ps.setInt( 3, Amount);
            ps.setDouble( 4, Price );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            return ids.getInt( 1 );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

    /**
     *
     * @param MaterialsID
     * @return LineItem
     * @throws LoginSampleException
     */
    public static LineItems getLineItems(int MaterialsID) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `LineItems` where idOrder = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(2, MaterialsID);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {

                LineItems getLineItems = new LineItems(MaterialsID);
                getLineItems.setOrders_idOrder(rs.getInt("idOrder"));
                getLineItems.setMaterials_MaterialsID(MaterialsID);
                getLineItems.setAmount(rs.getInt("Amount"));
                getLineItems.setPrice(rs.getInt("Price"));
                return getLineItems;
            } else
            {
                throw new LoginSampleException("Something went wrong: idOrder or MaterialsID is not used yet");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }
// Simon & Sandro

    /**
     *
     * @return All LineItems
     * @throws LoginSampleException
     */
    public static ArrayList<LineItems> getLineItems() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select LineItems.Orders_idOrder,LineItems.Materials_MaterialsID , LineItems.Amount, LineItems.Price, Materials.Name, Materials.Description, Materials.Length from LineItems,Materials where LineItems.Materials_MaterialsID=Materials.MaterialsID Order by Materials_MaterialsID;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<LineItems> li = new ArrayList<>();
            while (rs.next())
            {
                li.add(new LineItems(rs.getInt("Orders_idOrder"), rs.getInt("Materials_MaterialsID"), rs.getString("Name"), rs.getString("Description"), rs.getInt("Length"), rs.getInt("Amount"), rs.getInt("Price")));
            }
            if (li.size() > 0)
            {
                return li;
            } else
            {
                throw new LoginSampleException("Something went wrong: list size is less than 1 (no LineItems yet)");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     *
     * @param idOrder
     * @return Order
     * @throws LoginSampleException
     */
    public static Order getUserOrder(int idOrder) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Orders` natraul join Users where Users_id = id";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {

                Order getorder = new Order(idOrder);
                getorder.setIDorder(idOrder);
                getorder.setWidth(rs.getInt("Width"));
                getorder.setLength(rs.getInt("Length"));
                getorder.setHeight(rs.getInt("Height"));
                return getorder;

            } else
            {
                throw new LoginSampleException("Something went wrong: OrderID is not used yet");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    
    /**
     *
     * @param materialID
     * @return LineItem
     * @throws LoginSampleException
     */
    public static LineItems getLineitem(int materialID) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `LineItems` where Materials_MaterialsID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, materialID);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {

                LineItems getLi = new LineItems(materialID);
                getLi.setOrders_idOrder(rs.getInt("Orders_idOrder"));
                getLi.setMaterials_MaterialsID(rs.getInt("Materials_MaterialsID"));
                getLi.setAmount(rs.getInt("Amount"));
                getLi.setPrice(rs.getInt("Price"));
                getLi.setName(rs.getString("Name"));
                getLi.setDescription(rs.getString("Description"));
                getLi.setLength(rs.getInt("Length"));
                return getLi;
            } else
            {
                throw new LoginSampleException("Something went wrong: LineItem doesn't exist");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

}


