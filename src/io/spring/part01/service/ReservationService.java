package io.spring.part01.service;

import java.util.List;

import io.spring.part01.domain.Reservation;

public interface ReservationService {
	public List<Reservation> query(String courtName);
}
