package camel.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CopiandoArquivoComCamel {
	public static void main(String args[]) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from("file:/home/yokoyama/camel/in?noop=true")
						.to("file:/home/yokoyama/camel/out");
			}
		});

		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}
