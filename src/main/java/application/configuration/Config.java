package application.configuration;

import application.repository.BedRoomRepository;
import application.repository.BedRoomTypeRepository;
import application.repository.EmployeeRepository;
import application.repository.GuestRepository;
import application.service.BedRoomServiceImpl;
import application.service.EmployeeServiceImpl;
import application.service.GuestAdminServiceImpl;
import application.service.GuestServiceImpl;
import application.service.outputs.BedRoomService;
import application.service.outputs.EmployeeService;
import application.service.outputs.GuestAdminService;
import application.service.outputs.GuestService;
import application.service.ports.*;
import application.userinterface.MenuApp;
import application.userinterface.MenuBedRoom;
import application.userinterface.MenuEmployee;
import application.userinterface.MenuGuest;
import application.view.BedRoomView;
import application.view.EmployeeView;
import application.view.GuestView;

public class Config {
    public static MenuApp createMenuApp() {

        BedRoomRepositoryPort roomRepo = new BedRoomRepository();
        BedRoomTypeRepositoryPort typeRepo = new BedRoomTypeRepository();

        GuestRepository guestRepository = new GuestRepository();

        GuestRepositoryPort guestRepoPort = guestRepository;
        GuestAdminRepositoryPort guestAdminRepoPort = guestRepository;

        EmployeeRepositoryPort empRepoPort = new EmployeeRepository();

        GuestService guestService = new GuestServiceImpl(guestRepoPort);
        GuestAdminService guestAdminService = new GuestAdminServiceImpl(guestAdminRepoPort);
        EmployeeService empService = new EmployeeServiceImpl(empRepoPort);
        BedRoomService roomService = new BedRoomServiceImpl(roomRepo, typeRepo);

        GuestView guestView = new GuestView(guestService, guestAdminService);
        EmployeeView empView = new EmployeeView(empService);
        BedRoomView roomView = new BedRoomView(roomService);

        MenuGuest menuGuest = new MenuGuest(guestView);
        MenuEmployee menuEmployee = new MenuEmployee(empView);
        MenuBedRoom menuBedRoom = new MenuBedRoom(roomView);

        return new MenuApp(menuGuest, menuBedRoom, menuEmployee);
    }
    }
