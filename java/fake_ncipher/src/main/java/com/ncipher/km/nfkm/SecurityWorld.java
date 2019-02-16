package com.ncipher.km.nfkm;

import com.ncipher.km.marshall.NFKM_CardSetIdent;
import com.ncipher.km.marshall.NFKM_WorldInfo;
import com.ncipher.nfast.NFException;
import com.ncipher.nfast.connect.NFConnection;

public class SecurityWorld {
  public boolean isInitialised() throws NFException {
    throw new RuntimeException();
  }

  public Module getModule(int id) throws NFException {
    throw new RuntimeException();
  }

  public Module[] getModules() throws NFException {
    throw new RuntimeException();
  }

  public Key getKey(String appname, String keyident) throws NFException {
    throw new RuntimeException();
  }

  public NFKM_WorldInfo getData() {
    throw new RuntimeException();
  }

  public CardSet[] getCardSets(NFKM_CardSetIdent ocsid) throws NFException {
    throw new RuntimeException();
  }

  public void changePP(Slot slot, CmdCallBack c) throws NFException {
    throw new RuntimeException();
  }

  public KeyGenerator getKeyGenerator() {
    throw new RuntimeException();
  }

  public NFConnection getConnection() {
    throw new RuntimeException();
  }

  public SoftCard[] getSoftCards() throws NFException {
    throw new RuntimeException();
  }
}
