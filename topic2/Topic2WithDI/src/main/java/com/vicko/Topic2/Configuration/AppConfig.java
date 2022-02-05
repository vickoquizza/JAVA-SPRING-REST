package com.vicko.Topic2.Configuration;

import com.vicko.Topic2.Repositories.BNPrinterImpl;
import com.vicko.Topic2.Repositories.Printer;
import com.vicko.Topic2.Repositories.PrinterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    PrinterFactory printerFactory(){
        return new PrinterFactory();
    }

    @Profile({"BN", "default"})
    @Bean
    Printer BNPrinterImpl(PrinterFactory printerFactory){
        return printerFactory.getPrinter("BN");
    }

    @Bean
    @Profile("BNC")
    Printer BNColorPrinterImpl(PrinterFactory printerFactory){
        return printerFactory.getPrinter("BNC");
    }


}
