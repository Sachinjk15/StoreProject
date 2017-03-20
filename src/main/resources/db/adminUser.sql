DROP TABLE IF EXISTS user;

CREATE TABLE IF NOT EXISTS user (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
   `user_name` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `user_phone` varchar(10) NOT NULL,
  `user_pwd` varchar(20) NOT NULL,
  `user_role` varchar(10) not null default "user",
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;


insert into user(user_name,user_email,user_phone,user_pwd,user_role)
values('Sachin','jainsachin05@gmail.com','8710830213','sachin123','admin');


insert into user(user_name,user_email,user_phone,user_pwd,user_role)
values('Sagar','sagar.hundekar@gmail.com','9844559074','sagar123','admin');


DROP TABLE IF EXISTS hitcount_table;

CREATE TABLE IF NOT EXISTS hitcount_table (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `indexPage`  bigint(20) NOT NULL,
   `mobileShopPage`  bigint(20) NOT NULL,
   `computerShopPage`  bigint(20) NOT NULL,
   `homeAppliancesPage`  bigint(20) NOT NULL,
   `cinemasPage`  bigint(20) NOT NULL,
   `gamesPage`  bigint(20) NOT NULL,
   `playsPage`  bigint(20) NOT NULL,
   `menFashionPage`  bigint(20) NOT NULL,
   `womenFashionPage`  bigint(20) NOT NULL,
   `kidsFashionPage`  bigint(20) NOT NULL,
   `babyFashionPage`  bigint(20) NOT NULL,
   `watcheFashionPage`  bigint(20) NOT NULL,
   `luggageAndBagsFashionPage`  bigint(20) NOT NULL,
   `beautyFashionPage`  bigint(20) NOT NULL,
   `bakeryFoodPage`  bigint(20) NOT NULL,
   `restaurantsFoodPage`  bigint(20) NOT NULL,
   `pubsFoodPage`  bigint(20) NOT NULL,
   `clinicHealthPage`  bigint(20) NOT NULL,
   `hospitalHealthPage`  bigint(20) NOT NULL,
   `pharmacyHealthPage`  bigint(20) NOT NULL,
   `personalCareHealthPage`  bigint(20) NOT NULL,
   `furnituresPage`  bigint(20) NOT NULL,
   `groceryPage`  bigint(20) NOT NULL,
   `kitchenAppliancesPage`  bigint(20) NOT NULL,
   `mantriShoppingCenterPage`  bigint(20) NOT NULL,
   `orionShoppingCenterPage`  bigint(20) NOT NULL,
   `gopalanArchadeShoppingCenterPage`  bigint(20) NOT NULL,
   `gandhiBazarShoppingStreetPage`  bigint(20) NOT NULL,
   `malleshwaramShoppingStreetPage`  bigint(20) NOT NULL,
   `sportsApparealPage`  bigint(20) NOT NULL,
   `sportsShoesPage`  bigint(20) NOT NULL,
   `sportsAccessoriesPage`  bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;



insert into hitcount_table(indexPage,mobileShopPage,computerShopPage,homeAppliancesPage,cinemasPage,gamesPage,playsPage,menFashionPage,womenFashionPage,kidsFashionPage,babyFashionPage,watcheFashionPage,luggageAndBagsFashionPage,beautyFashionPage,bakeryFoodPage,restaurantsFoodPage,pubsFoodPage,clinicHealthPage,hospitalHealthPage,pharmacyHealthPage,personalCareHealthPage,furnituresPage,groceryPage,kitchenAppliancesPage,mantriShoppingCenterPage,orionShoppingCenterPage,gopalanArchadeShoppingCenterPage,gandhiBazarShoppingStreetPage,malleshwaramShoppingStreetPage,sportsApparealPage,sportsShoesPage,sportsAccessoriesPage)
values('0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0');

