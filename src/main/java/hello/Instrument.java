package hello;

import instrument.InstrumentProtos;

public class Instrument {

  private byte[] instrumentbytes;
  InstrumentProtos.Instrument instrument;

  public Instrument(InstrumentProtos.Instrument instrument) {
    this.instrument = instrument;
    instrumentbytes = instrument.toByteArray();
  }

  public byte[] getBytes() {
    return instrumentbytes;
  }
}