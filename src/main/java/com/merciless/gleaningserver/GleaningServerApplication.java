package com.merciless.gleaningserver;

import com.merciless.gleaningserver.service.Server;
import com.merciless.gleaningserver.service.thrift.ClientService;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class GleaningServerApplication {

  	public static ClientService.Processor processor;

	public static void main(String[] args) {
		SpringApplication.run(GleaningServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(Server server) {
		return (args) -> {

			log.info("The application has started...");

			try {
				processor = new ClientService.Processor(server);

				Runnable simple = new Runnable(){
				
					@Override
					public void run() {
						simple(processor);
					}
				};

				new Thread(simple).start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}

	public static void simple(ClientService.Processor processor) {
		
		try {
			TServerTransport serverTransport = new TServerSocket(9090);
			TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));

			log.info("the server has started...");
			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
