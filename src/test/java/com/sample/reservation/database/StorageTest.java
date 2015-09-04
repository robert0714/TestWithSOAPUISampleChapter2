package com.sample.reservation.database;
 

import com.sample.reservation.dto.Guest;
import com.sample.reservation.dto.Reservation;
import com.sample.reservation.dto.Room;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith; 
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StorageTest {
	
	private Storage component;
	 

	@Before
	public void setUp() throws Exception {
		component = new Storage();
	}
 
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddGuest() throws Exception {
		final Guest guest = new Guest();
		guest.setName("guest001");
		guest.setAge(12);
		guest.setAddress("2200 Mission College Blvd. Santa Clara, CA 95054-1549 USA");
		component.addGuest(guest); 
		
	}

	@Test
	public void testAddRoom() throws Exception {
		Room room = new Room();
		room.setRoomNumber(1);
		room.setRoomSize("AAA");
		room.setRoomType("TYPEA");		
//		component.addRoom(room) ; 
	}

	@Test
	public void testAddReservation() throws Exception {
		Reservation reservation = new Reservation();
		reservation.setGuestName("guestName");
		reservation.setReservationID(2);
		reservation.setReserved_from(new Date());
		reservation.setReserved_to(new Date());
		reservation.setRoomNumber(3);
//		component.addReservation(reservation); 
	}

	@Test
	public void testProceedReservation() throws Exception {		
//		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetRoomDetails() throws Exception {
//		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetReservationDetails() throws Exception {
//		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetGuestDetails() throws Exception {
//		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeleteGuest() throws Exception {
//		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeleteRoom() throws Exception {
//		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testRemoveReservation() throws Exception {
//		throw new RuntimeException("not yet implemented");
	}
}
