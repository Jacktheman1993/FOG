#Alessandro
INSERT INTO `Materials` VALUES
#ID, navn, length, stock, pris, beskrivelse, type_idType
#Træ & Tagplader
(1, '25x200	mm.	trykimp. Brædt', 360, 400,199,'understernbrædder	til	for	&	bag	ende', 18),
(2, '25x200	mm.	trykimp. Brædt', 540, 400,199,'understernbrædder	til	siderne', 19),
(3, '25x125mm.	trykimp. Brædt', 360, 400,199,'oversternbrædder	til	forenden', 9),
(4, '25x125mm.	trykimp. Brædt', 540, 400,199,'oversternbrædder	til	siderne', 10),
(5, '38x73mm. Lægte ubh.', 420, 1000, 99,'til z på bagside af dør', 25),
(6, '45x95	mm.	Reglar	ub.', 270, 1000, 99,'løsholter	til	skur	gavle', 26),
(7, '45x95	mm.	Reglar	ub..', 240, 1000, 99,'løsholter	til	skur	sider', 27),
(8, '45x195	mm.	spærtræ	ubh.', 600, 1000, 99,'Remme	i	sider,	sadles	ned	i	stolper', 11),
(9, '45x195	mm.	spærtræ	ubh.', 480, 1000, 99,'Remme	i sider, sadles ned	i stolper ( skur del, deles)', 11),
(10, '45x195	mm.	spærtræ	ubh.', 600, 1000, 99,'Spær,	monteres	på	rem	', 12),
(11, '97x97	mm.	trykimp.	Stolpe', 300, 1000, 99,'Stolper	nedgraves	90	cm.	i	jord', 15),
(12, '19x100	mm.	trykimp.	Brædt	', 210, 1000, 99,'til	beklædning	af	skur	1	på	2	', 21),
(13, '19x100	mm.	trykimp.	Brædt', 540, 1000, 99,'vandbrædt	på	stern	i	sider', 19),
(14, '19x100	mm.	trykimp.	Brædt	', 360, 1000, 99,'vandbrædt	på	stern	i	forende', 20),
(15, 'Plastmo	Ecolite	blåtonet', 600, 1000, 99,'tagplader	monteres	på	spær', 17),
(16, 'Plastmo	Ecolite	blåtonet', 360, 1000, 99,'tagplader	monteres	på	spær', 16),

#Beslag & Skruer
(17, 'plastmo	bundskruer	200	stk.', 0, 1000, 99,'Skruer	til	tagplader', 6),
(18, 'hulbånd	1x20	mm.	10	mtr', 0, 1000, 99,'Til	vindkryds	på	spær', 8),
(19, 'universal	190	mm	højre', 0, 1000, 99,'Til	montering	af	spær	på	rem', 13),
(20, 'universal	190	mm	venstre', 0, 1000, 99,'Til	montering	af	spær	på	rem', 14),
(21, '4,5	x	60	mm.	skruer	200	stk.', 0, 1000, 99,'Til	montering	af	stern&vandbrædt', 3),
(22, '4,0	x	50	mm.	beslagskruer	250 stk.', 0, 1000, 99,'Til	montering	af	universalbeslag	+	hulbånd', 4),
(23, 'bræddebolt	10	x	120	mm.	', 0, 1000, 99,'Til	montering	af	rem	på	stolper', 5),
(24, 'firkantskiver	40x40x11mm', 0, 1000, 99,'Til montering	af	rem	på	stolper', 7),
(25, '4,5	x	70	mm.	Skruer	400	stk.', 0, 1000, 99,'til	montering	af	yderste	beklædning', 2),
(26, '4,5	x	50	mm.	Skruer	300	stk.', 0, 1000, 99,'til	montering	af	inderste	beklædning', 1),
(27, 'stalddørsgreb	50x75.', 0, 1000, 99,'Til	lås	på	dør	i	skur', 24),
(28, 't	hængsel	390	mm.', 0, 1000, 99,'Til	skurdør', 23),
(29, 'vinkelbeslag	35.', 0, 1000, 99,'Til	montering	af	løsholter	i	skur', 22);


insert into `Type` values
(1,'4dot5x50'),
(2,'4dot5x70'),
(3,'4dot5x60Skruer'),
(4,'4x50BesSkruer'),
(5,'BræddeBolt'),
(6,'BundskruerPakke'),
(7,'Firkantsskiver'),
(8,'Hulbånd'),
(9,'OverSternbrædderForenden'),
(10,'OverSternbrædderSiderne'),
(11,'RemmeISider'),
(12,'SpærMontPåRem'),
(13,'SpærpåRemUniversalHøjre'),
(14,'SpærpåRemUniversalVenstre'),
(15,'Stolper'),
(16,'TagpladerMontPåSpær360'),
(17,'TagpladerMontPåSpær600'),
(18,'UnderSternbrædderForBag'),
(19,'UnderSternbrædderSide'),
(20,'VandbrædtSternForende'),
(21,'VandbrædtSternSider'),
(22,'VinkelBeslag'),
(23,'Hængsler'),
(24,'StaldDørsGreb'),
(25,'LægteBagsideDør'),
(26,'ReglarGavl'),
(27,'ReglarSide');

#UPDATE `Materials` SET Name='lol',Stock = 500, Price = 250 where MaterialsID=1;

#UPDATE `Materials` SET `Name`='testupdate', Length=300, Stock=1000, Price=99, Description='hej' where MaterialsID = 2;
#UPDATE `Materials` SET MaterialsID=2, `Name`='test test', Length=360, Stock=128, Price=199, Description='hejhej simon' where MaterialsID = 2;
#UPDATE Materials from Materials where MaterialsID = MaterialsID setName = 'test test', Length = 360, Stock = 234, Price = 199, Description = 'hej simon';
