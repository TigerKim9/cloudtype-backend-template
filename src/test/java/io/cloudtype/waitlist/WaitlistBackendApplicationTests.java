package io.cloudtype.waitlist;

import io.cloudtype.waitlist.exception.ResourceNotFoundException;
import io.cloudtype.waitlist.model.Guest;
import io.cloudtype.waitlist.repository.GuestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WaitlistBackendApplicationTests {

	GuestRepository guestRepository;
	@Test
	void contextLoads(Long id) {
		Guest guest  = guestRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Guest not found."));
		//컴퓨터 변화 테스트
		assert();
	}

}
