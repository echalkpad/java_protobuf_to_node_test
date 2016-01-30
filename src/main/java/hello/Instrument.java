package hello;

import instrument.InstrumentProtos;

public class Instrument {

  private byte[] instrumentbytes;

  public Instrument(InstrumentProtos.Instrument instrument) {

    instrumentbytes = instrument.toByteArray();
  }

  public byte[] getBytes() {
      return instrumentbytes;
  }
}