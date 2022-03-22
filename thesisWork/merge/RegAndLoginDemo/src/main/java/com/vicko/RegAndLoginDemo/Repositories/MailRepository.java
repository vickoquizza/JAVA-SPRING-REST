package com.vicko.RegAndLoginDemo.Repositories;

import com.vicko.RegAndLoginDemo.Model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Long> {
}
