#Alessandro
INSERT INTO `LineItems` VALUES
#Orders_idOrder, Materials_MaterialsID, Amount, pris
(1, 1, 4, 1),
(1, 2, 5, 1),
(1, 3, 8, 1),
(1, 29, 3, 1),
(1, 10, 8, 1),
(1, 13, 8, 1),
(1, 15, 8, 1),
(1, 16, 8, 1),
(1, 5, 8, 1);


#Amount stykListe
select O.idOrder as idOrder, O.Width, O.Length, O.Shed, O.Status, M.MaterialsID, LI.Amount, M.Price, M.Name, M.Description, Amount * M.Price as LineTotalPrice
from Orders O 
inner join LineItems LI on O.idOrder = LI.Orders_idOrder 
inner join Materials M on LI.Materials_MaterialsID = M.MaterialsID;

#UPDATE Orders SET `Status` = false where idOrder= 1;


