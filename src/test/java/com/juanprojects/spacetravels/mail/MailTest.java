package com.juanprojects.spacetravels.mail;

import org.junit.jupiter.api.Test;

public class MailTest {

    @Test
    public void testSendEmail(){
        MailSpaceTravels mailSpaceTravels = new MailSpaceTravels();
        mailSpaceTravels.sendMail("juandiegocagua@gmail.com");
    }
}
