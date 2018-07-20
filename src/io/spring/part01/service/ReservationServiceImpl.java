package io.spring.part01.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.spring.part01.domain.Player;
import io.spring.part01.domain.Reservation;
import io.spring.part01.domain.SportType;

@Service
public class ReservationServiceImpl implements ReservationService {
	public static final SportType TENNIS = new SportType(1, "Tennis");
	public static final SportType SOCCER = new SportType(2, "Soccer");

	private final List<Reservation> reservations = new ArrayList<>();

	public ReservationServiceImpl() {
		reservations.add(new Reservation("Tennis #1", LocalDate.now(), 16, new Player("Tutku", "N/A"), TENNIS));
		reservations.add(new Reservation("Tennis #2", LocalDate.now(), 20, new Player("Emin", "N/A"), TENNIS));
	}

	@Override
	public List<Reservation> query(String courtName) {
		return this.reservations.stream().filter(reservation -> Objects.equals(reservation.getCourtName(), courtName))
				.collect(Collectors.toList());
	}
}
