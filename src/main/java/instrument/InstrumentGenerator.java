package instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InstrumentGenerator {

  private List<InstrumentProtos.Instrument> instruments = new ArrayList<>();
  Random rnd = new Random();

  public InstrumentGenerator() {
    InstrumentProtos.Instrument ibm= InstrumentProtos.Instrument.newBuilder()
      .setSymbol("IBM")
      .setCompany("International Business Machines Corp.")
      .setAvgVolume(5.69F)
      .setLastClose(124.72F)
      .build();
    instruments.add(ibm);

    InstrumentProtos.Instrument goog= InstrumentProtos.Instrument.newBuilder()
      .setSymbol("GOOG")
      .setCompany("Alphabet Inc")
      .setAvgVolume(2.12F)
      .setLastClose(742.95F)
      .build();
    instruments.add(goog);

    InstrumentProtos.Instrument fb= InstrumentProtos.Instrument.newBuilder()
      .setSymbol("FB")
      .setCompany("Facebook Inc")
      .setAvgVolume(31.69F)
      .setLastClose(112.21F)
      .build();
    instruments.add(fb);

    InstrumentProtos.Instrument amzn= InstrumentProtos.Instrument.newBuilder()
      .setSymbol("AMZN")
      .setCompany("Amazon.com Inc")
      .setAvgVolume(5.38F)
      .setLastClose(587F)
      .build();
    instruments.add(amzn);
  }

  public InstrumentProtos.Instrument getInstrument()
  {
    int i = rnd.nextInt(instruments.size());
    return instruments.get(i);
  }

  public static void main(String[] args) {
    InstrumentGenerator instrumentGenerator = new InstrumentGenerator();
    for (int i = 0; i < 20; i++)
    {
      System.out.println(instrumentGenerator.getInstrument().toString());
    }
  }
}


