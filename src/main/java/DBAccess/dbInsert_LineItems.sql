#Alessandro
INSERT INTO `LineItems` VALUES
#Orders_idOrder, Materials_MaterialsID, Amount, pris
(1, 1, 4, 99),
(1, 2, 5, 49),
(1, 3, 8, 105),
(1, 29, 3, 199),
(1, 10, 8, 349),
(1, 13, 8, 98),
(1, 15, 8, 34),
(1, 16, 8, 87);

#Amount stykListe
select O.idOrder as idOrder, O.Width, O.Length, O.Shed, O.Status, M.MaterialsID, LI.Amount, LI.Price, M.Name, M.Description, Amount * LI.Price as LineTotalPrice
from Orders O 
inner join LineItems LI on O.idOrder = LI.Orders_idOrder 
inner join Materials M on LI.Materials_MaterialsID = M.MaterialsID;
