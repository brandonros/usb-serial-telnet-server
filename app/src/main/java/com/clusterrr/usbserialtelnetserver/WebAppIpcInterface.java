package com.clusterrr.usbserialtelnetserver;

import android.webkit.JavascriptInterface;
import com.hoho.android.usbserial.driver.UsbSerialPort;

public class WebAppIpcInterface {
  UsbSerialPort mUsbSerialPort;

  WebAppIpcInterface(UsbSerialPort usbSerialPort) {
      mUsbSerialPort = usbSerialPort;
  }

  @JavascriptInterface
  public void write(String messageHex) {
    byte[] messageBytes = Utilities.hexStringToByteArray(messageHex);
    int timeout = 1000;
    mSerialPort.write(data, timeout);
  }

  @JavascriptInterface
  public String read(String messageHex) {
    byte buffer[] = new byte[1024];
    int lengthRead = mSerialPort.read(buffer, 0);
    if (l <= 0) {
      return null;
    }
    String byteHex = Utilities.byteArrayToHexString(buffer, 0, lengthRead);
    return byteHex;
  }
}
