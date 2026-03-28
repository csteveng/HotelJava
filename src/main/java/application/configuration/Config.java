package application.configuration;

import application.domain.Guest;
import application.repository.GuestRepository;
import application.service.GuestAdminService;
import application.service.GuestAdminServiceImpl;
import application.service.GuestService;
import application.service.GuestServiceImpl;
import application.userinterface.MenuApp;
import application.view.GuestView;

public class Config {

    public static MenuApp createMenuApp(){

        Guest guest = new Guest();
        GuestRepository guestRepository = new GuestRepository();
        GuestService guestService = new GuestServiceImpl(guestRepository);
        GuestAdminService guestAdminService = new GuestAdminServiceImpl(guestRepository);
        GuestView guestView = new GuestView(guestService, guest, guestAdminService );


        return new MenuApp(guestView);
    }






}
