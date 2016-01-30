package hello;

import instrument.InstrumentGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();
  private final InstrumentGenerator instrumentGenerator = new InstrumentGenerator();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    return new Greeting(counter.incrementAndGet(),
      String.format(template, name));
  }

  @RequestMapping("/protobuf")
  public Instrument instrument() {
    return new Instrument(instrumentGenerator.getInstrument());
  }
}