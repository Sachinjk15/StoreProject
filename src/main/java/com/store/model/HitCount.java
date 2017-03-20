package com.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hitcount_table")
public class HitCount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	
	
	@Column(nullable = false,updatable = true,columnDefinition = "bigint(20) default 0")
	private int indexPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int mobileShopPage;
	

	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int computerShopPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int homeAppliancesPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int cinemasPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int gamesPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int playsPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int menFashionPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int womenFashionPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int kidsFashionPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int babyFashionPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int watcheFashionPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int luggageAndBagsFashionPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int beautyFashionPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int bakeryFoodPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int restaurantsFoodPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int pubsFoodPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int clinicHealthPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int hospitalHealthPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int pharmacyHealthPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int personalCareHealthPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int furnituresPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int groceryPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int kitchenAppliancesPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int mantriShoppingCenterPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int orionShoppingCenterPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int gopalanArchadeShoppingCenterPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int gandhiBazarShoppingStreetPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int malleshwaramShoppingStreetPage;
	
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int sportsApparealPage;

	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int sportsShoesPage;
	
	@Column(nullable = false,columnDefinition = "bigint(20) default 0")
	private int sportsAccessoriesPage;
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIndexPage() {
		return indexPage;
	}


	public void setIndexPage(int indexPage) {
		this.indexPage = indexPage;
	}


	public int getMobileShopPage() {
		return mobileShopPage;
	}


	public void setMobileShopPage(int mobileShopPage) {
		this.mobileShopPage = mobileShopPage;
	}


	public int getComputerShopPage() {
		return computerShopPage;
	}


	public void setComputerShopPage(int computerShopPage) {
		this.computerShopPage = computerShopPage;
	}


	public int getHomeAppliancesPage() {
		return homeAppliancesPage;
	}


	public void setHomeAppliancesPage(int homeAppliancesPage) {
		this.homeAppliancesPage = homeAppliancesPage;
	}


	public int getCinemasPage() {
		return cinemasPage;
	}


	public void setCinemasPage(int cinemasPage) {
		this.cinemasPage = cinemasPage;
	}


	public int getGamesPage() {
		return gamesPage;
	}


	public void setGamesPage(int gamesPage) {
		this.gamesPage = gamesPage;
	}


	public int getPlaysPage() {
		return playsPage;
	}


	public void setPlaysPage(int playsPage) {
		this.playsPage = playsPage;
	}


	public int getMenFashionPage() {
		return menFashionPage;
	}


	public void setMenFashionPage(int menFashionPage) {
		this.menFashionPage = menFashionPage;
	}


	public int getWomenFashionPage() {
		return womenFashionPage;
	}


	public void setWomenFashionPage(int womenFashionPage) {
		this.womenFashionPage = womenFashionPage;
	}


	public int getKidsFashionPage() {
		return kidsFashionPage;
	}


	public void setKidsFashionPage(int kidsFashionPage) {
		this.kidsFashionPage = kidsFashionPage;
	}


	public int getBabyFashionPage() {
		return babyFashionPage;
	}


	public void setBabyFashionPage(int babyFashionPage) {
		this.babyFashionPage = babyFashionPage;
	}


	public int getWatcheFashionPage() {
		return watcheFashionPage;
	}


	public void setWatcheFashionPage(int watcheFashionPage) {
		this.watcheFashionPage = watcheFashionPage;
	}


	public int getLuggageAndBagsFashionPage() {
		return luggageAndBagsFashionPage;
	}


	public void setLuggageAndBagsFashionPage(int luggageAndBagsFashionPage) {
		this.luggageAndBagsFashionPage = luggageAndBagsFashionPage;
	}


	public int getBeautyFashionPage() {
		return beautyFashionPage;
	}


	public void setBeautyFashionPage(int beautyFashionPage) {
		this.beautyFashionPage = beautyFashionPage;
	}


	public int getBakeryFoodPage() {
		return bakeryFoodPage;
	}


	public void setBakeryFoodPage(int bakeryFoodPage) {
		this.bakeryFoodPage = bakeryFoodPage;
	}


	public int getRestaurantsFoodPage() {
		return restaurantsFoodPage;
	}


	public void setRestaurantsFoodPage(int restaurantsFoodPage) {
		this.restaurantsFoodPage = restaurantsFoodPage;
	}


	public int getPubsFoodPage() {
		return pubsFoodPage;
	}


	public void setPubsFoodPage(int pubsFoodPage) {
		this.pubsFoodPage = pubsFoodPage;
	}


	public int getClinicHealthPage() {
		return clinicHealthPage;
	}


	public void setClinicHealthPage(int clinicHealthPage) {
		this.clinicHealthPage = clinicHealthPage;
	}


	public int getHospitalHealthPage() {
		return hospitalHealthPage;
	}


	public void setHospitalHealthPage(int hospitalHealthPage) {
		this.hospitalHealthPage = hospitalHealthPage;
	}


	public int getPharmacyHealthPage() {
		return pharmacyHealthPage;
	}


	public void setPharmacyHealthPage(int pharmacyHealthPage) {
		this.pharmacyHealthPage = pharmacyHealthPage;
	}


	public int getPersonalCareHealthPage() {
		return personalCareHealthPage;
	}


	public void setPersonalCareHealthPage(int personalCareHealthPage) {
		this.personalCareHealthPage = personalCareHealthPage;
	}


	public int getFurnituresPage() {
		return furnituresPage;
	}


	public void setFurnituresPage(int furnituresPage) {
		this.furnituresPage = furnituresPage;
	}


	public int getGroceryPage() {
		return groceryPage;
	}


	public void setGroceryPage(int groceryPage) {
		this.groceryPage = groceryPage;
	}


	public int getKitchenAppliancesPage() {
		return kitchenAppliancesPage;
	}


	public void setKitchenAppliancesPage(int kitchenAppliancesPage) {
		this.kitchenAppliancesPage = kitchenAppliancesPage;
	}


	public int getMantriShoppingCenterPage() {
		return mantriShoppingCenterPage;
	}


	public void setMantriShoppingCenterPage(int mantriShoppingCenterPage) {
		this.mantriShoppingCenterPage = mantriShoppingCenterPage;
	}


	public int getOrionShoppingCenterPage() {
		return orionShoppingCenterPage;
	}


	public void setOrionShoppingCenterPage(int orionShoppingCenterPage) {
		this.orionShoppingCenterPage = orionShoppingCenterPage;
	}


	public int getGopalanArchadeShoppingCenterPage() {
		return gopalanArchadeShoppingCenterPage;
	}


	public void setGopalanArchadeShoppingCenterPage(int gopalanArchadeShoppingCenterPage) {
		this.gopalanArchadeShoppingCenterPage = gopalanArchadeShoppingCenterPage;
	}


	public int getGandhiBazarShoppingStreetPage() {
		return gandhiBazarShoppingStreetPage;
	}


	public void setGandhiBazarShoppingStreetPage(int gandhiBazarShoppingStreetPage) {
		this.gandhiBazarShoppingStreetPage = gandhiBazarShoppingStreetPage;
	}


	public int getMalleshwaramShoppingStreetPage() {
		return malleshwaramShoppingStreetPage;
	}


	public void setMalleshwaramShoppingStreetPage(int malleshwaramShoppingStreetPage) {
		this.malleshwaramShoppingStreetPage = malleshwaramShoppingStreetPage;
	}


	public int getSportsApparealPage() {
		return sportsApparealPage;
	}


	public void setSportsApparealPage(int sportsApparealPage) {
		this.sportsApparealPage = sportsApparealPage;
	}


	public int getSportsShoesPage() {
		return sportsShoesPage;
	}


	public void setSportsShoesPage(int sportsShoesPage) {
		this.sportsShoesPage = sportsShoesPage;
	}


	public int getSportsAccessoriesPage() {
		return sportsAccessoriesPage;
	}


	public void setSportsAccessoriesPage(int sportsAccessoriesPage) {
		this.sportsAccessoriesPage = sportsAccessoriesPage;
	}
	
	
	
	
	

}
