package com.vicko.emailingServiceDemo.Repositories;

import com.vicko.emailingServiceDemo.Models.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Long> {
}
