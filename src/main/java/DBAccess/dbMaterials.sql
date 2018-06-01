#Alessandro
INSERT INTO `Materials` VALUES
#ID, name, length, stock, price, description, type_idType
(1, '25x200	mm.	trykimp. Brædt', 360, 400,199.95,'understernbrædder	til	for	&	bag	ende', 1),
(2, '25x200	mm.	trykimp. Brædt', 540, 400,299.95,'understernbrædder	til	siderne', 2),
(3, '25x125mm.	trykimp. Brædt', 360, 400,99.95,'oversternbrædder	til	forenden', 3),
(4, '25x125mm.	trykimp. Brædt', 540, 400,149,'oversternbrædder	til	siderne', 4),
(5, '45x195	mm.	spærtræ	ubh.', 600, 1000, 89,'Remme	i	sider,	sadles	ned	i	stolper', 5),
(6, '45x195	mm.	spærtræ	ubh.', 600, 1000, 129,'Spær,	monteres	på	rem	', 6),
(7, '97x97	mm.	trykimp.	Stolpe', 300, 1000, 399,'Stolper	nedgraves	90	cm.	i	jord', 7),
(8, '19x100	mm.	trykimp.	Brædt	', 360, 1000, 249,'vandbrædt	på	stern	i	forende', 8),
(9, '19x100	mm.	trykimp.	Brædt', 540, 1000, 179,'vandbrædt	på	stern	i	sider', 9),
(10, 'Plastmo	Ecolite	blåtonet', 600, 1000, 49,'tagplader	monteres	på	spær', 10),
(11, 'Plastmo	Ecolite	blåtonet', 360, 1000, 49,'tagplader	monteres	på	spær', 11),

#Beslag & Skruer & skur
(12, 'plastmo	bundskruer	200	stk.', 0, 1000, 49.99,'Skruer	til	tagplader', 12),
(13, 'hulbånd	1x20	mm.	10	mtr', 0, 1000, 30,'Til	vindkryds	på	spær', 13),
(14, 'universal	190	mm	højre', 0, 1000, 50,'Til	montering	af	spær	på	rem', 14),
(15, 'universal	190	mm	venstre', 0, 1000, 50,'Til	montering	af	spær	på	rem', 15),
(16, '4,5	x	60	mm.	skruer	200	stk.', 0, 1000, 49,'Til	montering	af	stern&vandbrædt', 16),
(17, '4,0	x	50	mm.	beslagskruer	250 stk.', 0, 1000, 79,'Til	montering	af	universalbeslag	+	hulbånd', 17),
(18, 'bræddebolt	10	x	120	mm.	', 0, 1000, 39,'Til	montering	af	rem	på	stolper', 18),
(19, 'firkantskiver	40x40x11mm', 0, 1000, 69,'Til montering	af	rem	på	stolper', 19),
(20, '4,5	x	70	mm.	Skruer	400	stk.', 0, 1000, 99,'til	montering	af	yderste	beklædning', 20),
(21, '4,5	x	50	mm.	Skruer	300	stk.', 0, 1000, 89,'til	montering	af	inderste	beklædning', 21),
(22, 'vinkelbeslag	35.', 0, 1000, 39.99,'Til	montering	af	løsholter	i	skur', 22),
(23, '38x73	mm.	Lægte	ubh.', 420, 1000, 43.50,'til	z	på	bagside	af	dør', 23),
(24, '45x95	mm.	Reglar	ub.', 240, 1000, 43.50,'løsholter	til	skur	sider', 24),
(25, 'stalddørsgreb	50x75.', 0, 1000, 43.50,'Til	lås	på	dør	i	skur', 25),
(26, 't	hængsel	390	mm.', 0, 1000, 30,'Til	skurdør', 26);
insert into `Type` values
(1,'UnderSternbrædderForBag'),
(2,'UnderSternbrædderSide'),
(3,'OverSternbrædderForenden'),
(4,'OverSternbrædderSiderne'),
(5,'RemmeISider'),
(6,'SpærMontPåRem'),
(7,'Stolper'),
(8,'VandbrædtSternForende'),
(9,'VandbrædtSternSider'),
(10,'TagpladerMontPåSpær600'),
(11,'TagpladerMontPåSpær360'),
(12,'BundskruerPakke'),
(13,'Hulbånd'),
(14,'SpærpåRemUniversalHøjre'),
(15,'SpærpåRemUniversalVenstre'),
(16,'4dot5x60Skruer'),
(17,'4x50BesSkruer'),
(18,'BræddeBolt'),
(19,'Firkantsskiver'),
(20,'4dot5x70'),
(21,'4dot5x50'),
(22,'VinkelBeslag'),
(23,'LægteBagsideDør'),
(24,'løsholtSkurSider'),
(25,'StaldDørsGreb'),
(26,'StaldHængsler');




#UPDATE `Materials` SET Name='lol',Stock = 500, Price = 250 where MaterialsID=1;

#UPDATE `Materials` SET `Name`='testupdate', Length=300, Stock=1000, Price=99, Description='hej' where MaterialsID = 2;
#UPDATE `Materials` SET MaterialsID=2, `Name`='test test', Length=360, Stock=128, Price=199, Description='hejhej simon' where MaterialsID = 2;
#UPDATE Materials from Materials where MaterialsID = MaterialsID setName = 'test test', Length = 360, Stock = 234, Price = 199, Description = 'hej simon';
