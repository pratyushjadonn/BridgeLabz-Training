package stream_api;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Member {
	String name;
	LocalDate expiryDate;

	Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}
}

public class ExpiringMemberships {
	public static void main(String[] args) {

		List<Member> members = Arrays.asList(new Member("Amit", LocalDate.now().plusDays(10)),
				new Member("Riya", LocalDate.now().plusDays(40)), new Member("John", LocalDate.now().plusDays(25)));

		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);

		List<Member> expiringSoon = members.stream().filter(m -> !m.getExpiryDate().isAfter(next30Days))
				.collect(Collectors.toList());

		expiringSoon.forEach(m -> System.out.println(m.getName() + " expires on " + m.getExpiryDate()));
	}
}
