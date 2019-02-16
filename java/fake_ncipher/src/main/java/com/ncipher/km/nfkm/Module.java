package com.ncipher.km.nfkm;

import com.ncipher.km.marshall.NFKM_ModuleInfo;

public class Module {
  public boolean isUsable() {
    throw new RuntimeException();
  }

  public Slot getSlot(int slotID) {
    throw new RuntimeException();
  }

  public NFKM_ModuleInfo getData() {
    throw new RuntimeException();
  }
}
