package com.merciless.gleaningserver;

import com.merciless.gleaningserver.service.Server;
import com.merciless.gleaningserver.service.thrift.BooksService;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GleaningServerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(GleaningServerApplication.class);

  	public static BooksService.Processor processor;

	public static void main(String[] args) {
		SpringApplication.run(GleaningServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(Server server) {
		return (args) -> {

			LOGGER.info("The application has started...");

			try {
				processor = new BooksService.Processor(server);

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

	public static void simple(BooksService.Processor processor) {
		
		try {
			TServerTransport serverTransport = new TServerSocket(9090);
			TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));

			LOGGER.info("the server has started...");
			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
