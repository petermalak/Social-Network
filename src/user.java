

public abstract class user {
	private String firstName  , lastName , userName , password , email , gender , date , country;
	private Boolean isPremiumAccount = false , logged_in = false;
	
	user(){
		setFirstName(setLastName(setPassword(setEmail(setGender(setDate(setCountry(null)))))));
	}

	public String getDate() {
		return date;
	}

	public String setDate(String date) {
		this.date = date;
		return date;
	}

	public String getGender() {
		return gender;
	}

	public String setGender(String gender) {
		this.gender = gender;
		return gender;
	}

	public String getPassword() {
		return password;
	}

	public String setPassword(String password) {
		this.password = password;
		return password;
	}

	public String getLastName() {
		return lastName;
	}

	public String setLastName(String lastName) {
		this.lastName = lastName;
		return lastName;
	}

	public String getCountry() {
		return country;
	}

	public String setCountry(String country) {
		this.country = country;
		return country;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public String setEmail(String email) {
		this.email = email;
		return email;
	}

	public Boolean getIsPremiumAccount() {
		return isPremiumAccount;
	}

	public void setIsPremiumAccount(Boolean isPremiumAccount) {
		this.isPremiumAccount = isPremiumAccount;
	}

	public Boolean getLogged_in() {
		return logged_in;
	}

	public void setLogged_in(Boolean logged_in) {
		this.logged_in = logged_in;
	}

}
