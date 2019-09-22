import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterForm extends BaseClas {
	public RegisterForm() {
		PageFactory.initElements(driver,this);
			}
@FindBy(id="location")
WebElement location;

@FindBy(id="hotels")
WebElement hotel;
	
@FindBy(id="room_type")
WebElement roomType;
	
@FindBy(id="room_nos")
WebElement roomNo;

@FindBy(id="datepick_in")
WebElement date;

@FindBy(id="datepick_out")
WebElement dateout;

@FindBy(id="adult_room")
WebElement aRoom;

@FindBy(id="child_room")
	WebElement childroom;

@FindBy(id="Submit")
WebElement sumbit;

public WebElement getSumbit() {
	return sumbit;
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getRoomNo() {
	return roomNo;
}

public WebElement getDate() {
	return date;
}

public WebElement getDateout() {
	return dateout;
}

public WebElement getaRoom() {
	return aRoom;
}

public WebElement getChildroom() {
	return childroom;
}
	
	
	
	
	
}
