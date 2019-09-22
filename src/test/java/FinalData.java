
public class FinalData extends BaseClas {
public static void main(String[] args) {
	BrowserLaunch();
	goWebPage("http://adactin.com/HotelApp/");
	Adactin page1=new Adactin();
	textvalue(page1.getTxtUserName(),"sathiyamoorthiss");
	textvalue(page1.getTxtPassword(),"12345678");
	btnClick(page1.getResigter());
	
RegisterForm form=new RegisterForm();
textvalue(form.getLocation(),"Sydney");
textvalue(form.getHotel(),"Hotel Sunshine");
textvalue(form.getRoomType(),"Deluxe");
textvalue(form.getRoomNo(),"3 - Three");
textvalue(form.getChildroom(),"2 - Two");
btnClick(form.sumbit);

SelectHotel s=new SelectHotel();
btnClick(s.getsHotel());
btnClick(s.gethContinue());

BookHotel b=new BookHotel();
textvalue(b.getFname(),"sakthi");
textvalue(b.getLname(),"sathya");
textvalue(b.getAddress(),"chennai");
textvalue(b.getCardno(),"1234567891234567");
textvalue(b.getCardtype(),"Master Card");
textvalue(b.getExpirymonth(),"March");
textvalue(b.getExyear(),"2022");
textvalue(b.getCvv(),"999");
btnClick(b.getBooknow());



}
}
