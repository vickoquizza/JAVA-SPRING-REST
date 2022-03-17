package com.vicko.emailingServiceDemo.Repositories;

import com.vicko.emailingServiceDemo.Models.MailUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailUserRepository extends JpaRepository<MailUser, Long> {
}
