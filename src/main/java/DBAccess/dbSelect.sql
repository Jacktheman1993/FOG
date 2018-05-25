#Alessandro
select * from Orders;
select * from Users;
select * from Carport;
select * from Materials;
select * from LineItems;
select * from `Type`;
select Materials.MaterialsID, Materials.Name, Materials.Length, Materials.Stock, Materials.Price, Materials.Description,Type.Name from Materials,Type where Materials.Type_idType=Type.idType Order by MaterialsID;
select * from Materials,Type where Materials.Type_idType=Type.idType;

select LineItems.Orders_idOrder, LineItems.Materials_MaterialsID, LineItems.Amount, LineItems.Price from LineItems;
select * from LineItems, Materials where LineItems.Materials_MaterialsID=Materials.MaterialsID;

select Materials.MaterialsID, Materials.Name, Materials.Length, Materials.Stock, Materials.Price, Materials.Description,Type.Name_T from Materials,Type where Materials.Type_idType=Type.idType;

select LineItems.Orders_idOrder,LineItems.Materials_MaterialsID , LineItems.Amount, LineItems.Price, Materials.Name, Materials.Description, Materials.Length from LineItems,Materials where LineItems.Materials_MaterialsID=Materials.MaterialsID;

select Materials.Price from Materials where Materials.MaterialsID=Materials.MaterialsID;