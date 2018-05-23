#Alessandro
select * from Orders;
select * from Users;
select * from Carport;
select * from Materials;
select * from Line_item;
select * from `Type`;
select Materials.MaterialsID, Materials.Name, Materials.Length, Materials.Stock, Materials.Price, Materials.Description,Type.Name from Materials,Type where Materials.Type_idType=Type.idType;
select * from Materials,Type where Materials.Type_idType=Type.idType;